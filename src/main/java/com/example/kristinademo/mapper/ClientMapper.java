package com.example.kristinademo.mapper;

import com.example.kristinademo.dto.ClientDto;
import com.example.kristinademo.model.Client;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper extends MapperAll<ClientDto,Client> {
//    ClientDto mapperDTO(Client type);
//    Client mapperType(ClientDto dto);
//    List<ClientDto> mapperListDto(List<Client> type);
//
//    List<Client> mapperListType(List<ClientDto> dto);
}
