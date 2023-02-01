package com.example.kristinademo.service;

import com.example.kristinademo.dto.TopicDto;
import com.example.kristinademo.mapper.TopicMapper;
import com.example.kristinademo.model.Topic;
import com.example.kristinademo.repository.TopicRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TopicServiceImpl implements TopicService {
    private final TopicRepository topicRepository;
    private final TopicMapper topicMapper;

    @Override
    public void create(TopicDto topicDto) {
        var topic = topicMapper.mapperType(topicDto);
        var topic1 = topicRepository.findAll();
        for (Topic topic2 : topic1) {
            if (topic2.getNameThemes().equals(topic.getNameThemes())) {
                throw new ResourceNotFoundException("Topic not found");
            } else topicRepository.save(topic);
            System.out.println(topic);

        }
    }

    @Override
    public List<TopicDto> readAll() {
        var topic = topicRepository.findAll();
        return topicMapper.mapperListDto(topic);
    }

    @Override
    public TopicDto readId(long id) {
        var topic = topicRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Topic not found for this id :: " + id));
        System.out.println(topic.getNameThemes());
        return topicMapper.mapperDTO(topic);
    }

    @Override
    public boolean update(long topicId) {
        var topic = topicRepository.findById(topicId).orElseThrow(() -> new ResourceNotFoundException("Topic not found for this id :: " + topicId));
        topic.setNameThemes(topic.getNameThemes());
        topic.setClientsId(topic.getClientsId());

        topicRepository.save(topic);

        return true;
    }

    @Override
    public boolean delete(long id) {
        var topic = topicRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Topic not found for this id :: " + id));
        topicRepository.delete(topic);
        return true;
    }

    @Override
    public List<TopicDto> findThemes(String find) {
        var topic = topicRepository.findAll().stream().filter(clie -> clie.getNameThemes().equals(find)).collect(Collectors.toList());
        return topicMapper.mapperListDto(topic);

    }
}
