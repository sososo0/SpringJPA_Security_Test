package com.sohyun.jpa.bookmanager.domain;

import lombok.*;

import java.time.LocalDateTime;


@NoArgsConstructor(force = true)
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
public class User {
    // 필요한 필드들 만들기
    @NonNull
    private String name;
    @NonNull
    private String email;
    // 생성시간과 수정시간은 일반적으로 JPA domain 객체에 포함되게 되어있다.
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // 각 필드에 접근하기 위해서는 객체 지향의 기본적인 캡슐화 원칙을 지키기 위해서
    // Getter와 Setter를 만들어줘야한다.
    // 이는 lombok의 어노테이션으로 대체

    // toString() override 하기
    // lombok 어노테이션으로 대체

}
