package com.github.paulosalonso.jpql.leftjoin.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.stream.Stream;

@RequiredArgsConstructor
@Getter
public enum Language {
    PT_BR("pt-BR"),
    EN_US("en-US");

    private final String code;

    public static Language getByCode(String code) {
        return Stream.of(values())
                .filter(language -> language.getCode().equals(code))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
