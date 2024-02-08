package com.daw.face.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table(name = "\"user\"")
@Entity
public class User {
    @Id
    @Column(name = "id_user")
    private String userId;
    @Column(name = "last_name")
    private String Name;
    @Column(name = "first_name")
    private String FirstName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "picture")
    private String pictureUrl;
}
