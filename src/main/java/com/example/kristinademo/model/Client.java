package com.example.kristinademo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;


@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "customers")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //  @HashCodeExclude
    private Long id;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "date_of_birth")
    private Date date;

    @Column(name = "place_of_birth")
    private String placeOfBirth;

    @Column(name = "mail")
    private String mail;

    @Column(name = "social_networks")
    private String placeOfCity;

    @Column(name = "telephone")
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private Set<Topic> topic;


}
