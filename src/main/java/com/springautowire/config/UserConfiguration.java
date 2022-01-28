package com.springautowire.config;

import com.springautowire.model.*;
import com.springautowire.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {

    @Bean
    @Qualifier("student")
    public Person createStudent() {

        return new Student();
    }

    @Bean
    @Qualifier("manager")
    public Person createManager() {

        return new Manager();
    }

    @Bean
    public UserService userService() {
        return new UserService();
    }

    @Bean
    @Qualifier("add1")
    public Address addressOne() {
        return new Address("hyd",null);
    }


    @Bean
    @Qualifier("add2")
    public Address addressTwo() {
        return new Address("DXB","Diera");
    }


    @Bean
    public User user(@Qualifier("add1") Address address) {
        return new User(address);
    }
}
