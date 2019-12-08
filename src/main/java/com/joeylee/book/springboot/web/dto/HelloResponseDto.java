package com.joeylee.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor //final 이 없는 필드는 생성자에 포함 안됨
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
