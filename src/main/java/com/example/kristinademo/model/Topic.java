package com.example.kristinademo.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "topics_covered")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //  @HashCodeExclude
    private Long id;

    @Column(name = "name_themes")
    private String nameThemes;

    @Column(name = "client_id")
    private Long clientsId;


}
