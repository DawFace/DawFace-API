package com.daw.face.model;

import lombok.Data;

@Data
public class User {
    private String name;
    private String firstname;
    private String email;
    private String password;
    private String pictureUrl;
}
