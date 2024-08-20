package com.nrapendra.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FtpContent {

    private String serverAddress;

    private String username;

    private String password;
}
