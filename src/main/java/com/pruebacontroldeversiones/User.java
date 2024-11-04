package com.pruebacontroldeversiones;

import lombok.Setter;

import java.time.LocalDateTime;

public class User {
    private Integer id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String cellphone;
    @Setter
    private String password;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;
}
