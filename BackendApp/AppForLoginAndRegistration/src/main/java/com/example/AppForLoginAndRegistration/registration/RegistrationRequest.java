package com.example.AppForLoginAndRegistration.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@AllArgsConstructor
@ToString

public class RegistrationRequest
{
    private final String firstname;
    private final String lastname;
    private final String email;
    private final String password;

}
