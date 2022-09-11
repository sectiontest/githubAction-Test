package com.example.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Member {

    @GeneratedValue
    @Id
    private Long id;

    private String name;
}
