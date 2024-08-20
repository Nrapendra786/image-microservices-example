package com.nrapendra.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
@ToString
public class FtpContent {

    private String serverAddress;

    private String username;

    private String password;
}
