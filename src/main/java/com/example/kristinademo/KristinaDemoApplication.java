package com.example.kristinademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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