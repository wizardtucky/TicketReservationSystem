package com.example.reservationSystem.user.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserDto {

    String email;
    String name;
    String surname;
    String password;
}
