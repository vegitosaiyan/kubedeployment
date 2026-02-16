package com.example.kubedeploy.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="registration")
@Getter
@Setter
public class Registration {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long registrationId;

    private String name;
    private String email;
}
