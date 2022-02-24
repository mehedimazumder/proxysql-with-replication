package com.poc.proxysql.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Builder
public class UserDTO implements Serializable {
    private long id;
    private String name;
}
