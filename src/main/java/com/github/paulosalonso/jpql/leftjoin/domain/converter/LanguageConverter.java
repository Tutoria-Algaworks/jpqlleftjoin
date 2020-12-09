package com.github.paulosalonso.jpql.leftjoin.domain.converter;

import com.github.paulosalonso.jpql.leftjoin.domain.Language;

import javax.persistence.AttributeConverter;

public class LanguageConverter implements AttributeConverter<Language, String> {
    @Override
    public String convertToDatabaseColumn(Language language) {
        return language.getCode();
    }

    @Override
    public Language convertToEntityAttribute(String s) {
        return Language.getByCode(s);
    }
}
