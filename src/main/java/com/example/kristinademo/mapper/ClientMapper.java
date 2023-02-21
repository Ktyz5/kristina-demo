package com.example.kristinademo.mapper;

import com.example.kristinademo.dto.ClientDto;
import com.example.kristinademo.model.Client;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface ClientMapper extends MapperAll<ClientDto,Client> {

}
