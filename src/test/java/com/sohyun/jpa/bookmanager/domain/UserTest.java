package com.sohyun.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class UserTest {
    @Test
    void test(){
        // User class 생성
        User user = new User();
        user.setEmail("sohyun@test.com");
        user.setName("sohyun");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        User user1 = new User("sohyun","sohyun@test1.com", LocalDateTime.now(), LocalDateTime.now());

        User user2 = new User ("sohyun", "sohyun@test2.com");

        User user3 = User.builder().name("sohyun").email("sohyun@test3.com").build();

        System.out.println(">>> " + user);
    }

}