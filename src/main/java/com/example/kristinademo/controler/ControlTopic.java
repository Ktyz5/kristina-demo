package com.example.kristinademo.controler;

import com.example.kristinademo.dto.TopicDto;
import com.example.kristinademo.model.Topic;
import com.example.kristinademo.repository.TopicRepository;
import com.example.kristinademo.service.TopicService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
public class ControlTopic {
    private final TopicService topicService;

    @GetMapping(value = "/topicAll")
    public List<TopicDto> getTopicAll() {

        return topicService.readAll();
    }

    @GetMapping(value = "/nameThemes/{themes}")
    public List<TopicDto> getNameThemes(@PathVariable("themes") String themes) {
        return topicService.findThemes(themes);
    }

    @GetMapping(value = "/topic/{id}")
    public ResponseEntity<TopicDto> getEntity(@PathVariable("id") Long id) {
        var topic = topicService.readId(id);
        return ResponseEntity.ok().body(topic);
    }

    @PostMapping(value = "/topics")
    public ResponseEntity<TopicDto> create(@NonNull @RequestBody TopicDto topicDto) {
        topicService.create(topicDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    ;

    @PutMapping(value = "/topic/{id}")
    public ResponseEntity<TopicDto> update(@PathVariable("id") Long id) {
        topicService.update(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @DeleteMapping(value = "topic/{id}")
    public ResponseEntity<TopicDto> delete(@PathVariable("id") Long id) {
        topicService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
