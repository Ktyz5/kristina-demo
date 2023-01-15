package com.example.kristinademo.service;


import com.example.kristinademo.dto.ClientDto;
import com.example.kristinademo.mapper.ClientMapper;
import com.example.kristinademo.model.Client;

import com.example.kristinademo.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;


    @Override
    public void create(ClientDto clientDto) {
        var client = clientMapper.mapperType(clientDto);
        var client1 = clientRepository.findAll();
        for (Client clien : client1) {
            if (clien.getDate().equals(client.getDate())) {
                throw new ResourceNotFoundException("Client not found");
            } else clientRepository.save(client);
            System.out.println(clien);

        }}

    @Override
    public List<ClientDto> readAll() {
        var client = clientRepository.findAll();
        return clientMapper.mapperListDto(client);
    }

    @Override
    public ClientDto readId(long id) {
        var client = clientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Client not found for this id :: " + id));
        System.out.println(client.getTopic());
        return clientMapper.mapperDTO(client);
    }

    @Override
    public boolean update( long clientId) {
        var client = clientRepository.findById(clientId).orElseThrow(() -> new ResourceNotFoundException("Client not found for this id :: " + clientId));
        client.setLastName(client.getLastName());
        client.setFirstName(client.getFirstName());
        client.setPatronymic(client.getPatronymic());
        client.setDate(client.getDate());
        client.setPlaceOfBirth(client.getPlaceOfBirth());
        client.setMail(client.getMail());
        client.setPlaceOfCity(client.getPlaceOfCity());
        client.setTelephone(client.getTelephone());
        client.setTopic(client.getTopic());
        clientRepository.save(client);

        return true;
    }

    @Override
    public boolean delete(long id) {
        var client = clientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Client not found for this id :: " + id));
        clientRepository.delete(client);
        return true;
    }

    @Override
    public List<ClientDto> sorted(String findName) {
        var client =clientRepository.findAll().stream().filter(x-> x.getLastName().equals(findName)).collect(Collectors.toList());

        return clientMapper.mapperListDto(client);
    }
}



