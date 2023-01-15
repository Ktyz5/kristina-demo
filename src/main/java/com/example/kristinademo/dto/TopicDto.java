package com.example.kristinademo.dto;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TopicDto {

    private Long id;
    private String nameThemes;
    private Long clientsId;
}
