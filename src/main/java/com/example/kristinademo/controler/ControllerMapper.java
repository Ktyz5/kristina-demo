package com.example.kristinademo.controler;

import com.example.kristinademo.dto.ClientDto;
import com.example.kristinademo.mapper.ClientMapper;
import com.example.kristinademo.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/map")
@RequiredArgsConstructor
public class ControllerMapper {
    private final ClientService clientService;
    private final ClientMapper clientMapper;

    @GetMapping("/mapper/{id}")
    public ClientDto getClientMap(@PathVariable("id") Long id) {
        return clientService.readId(id);

    }
}