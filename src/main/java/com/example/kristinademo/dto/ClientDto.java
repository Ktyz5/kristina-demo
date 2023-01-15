package com.example.kristinademo.dto;

import com.example.kristinademo.model.Topic;
import lombok.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ClientDto {

    private Long id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private Date date;
    private String placeOfBirth;
    private String mail;
    private String placeOfCity;
    private String telephone;
    private Set<Topic> topic;

}
