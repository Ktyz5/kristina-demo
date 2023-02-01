package com.example.kristinademo.mapper;

import com.example.kristinademo.dto.TopicDto;
import com.example.kristinademo.model.Topic;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface TopicMapper extends MapperAll<TopicDto, Topic> {

}
//    TopicDto mapperDTO(Topic type);
//    Topic mapperType(TopicDto dto);
//    List<TopicDto> mapperListDto(List<Topic> type);
//
//    List<Topic> mapperListType(List<TopicDto> dto);