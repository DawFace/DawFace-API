package com.daw.face.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
@Table(name = "\"user\"")
@Entity
public class User {
    @Id
    private String userId;

    @Column(name = "name")
    private String Name;
    @Column(name = "firstname")
    private String FirstName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "picture")
    private String pictureUrl;

    public User() {

    }
}
