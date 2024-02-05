package com.daw.face.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
@Entity(name = "User")
public class User {
    @Id
    @Column
    private String uuid;
    private String name;
    private String firstname;
    private String email;
    private String password;
    private String pictureUrl;
}
