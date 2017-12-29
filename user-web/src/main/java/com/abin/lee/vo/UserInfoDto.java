package com.abin.lee.vo;

import com.abin.lee.enums.Channel;
import com.abin.lee.enums.UserType;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserInfoDto {

    private String userName;

    private String age;

    private String mobile;



}
