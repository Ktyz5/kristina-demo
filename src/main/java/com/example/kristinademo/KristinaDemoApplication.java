package com.example.kristinademo;

import com.example.kristinademo.model.Client;
import com.example.kristinademo.model.Topic;
import com.example.kristinademo.repository.ClientRepository;
import com.example.kristinademo.service.ClientService;
import com.example.kristinademo.service.ClientServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@SpringBootApplication
public class KristinaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KristinaDemoApplication.class, args);



	}

}
//		var client =Client.builder().id(2l).lastName("Aleks")
//				.firstName("Sorokin")
//				.localDateTime(LocalDateTime.now())
//				.mail("iuyh@lj/ru")
//				.patronymic("Simferopol")
//				.telephone("7685589")
//				.placeOfCity("VK")
//				.topics(Topic.builder().nameThemes("fjjtj").build()).
//				build();
//		ClientServiceImpl clientService = new ClientServiceImpl( );
//
//		clientService.create(client);