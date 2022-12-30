package ru.netology.testmode.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class RegistrationUserInfo {
    private final String login;
    private final String password;
    private final String status;
}