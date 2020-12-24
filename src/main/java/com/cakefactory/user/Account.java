package com.cakefactory.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account {
    final String email;
    final String password;
}
