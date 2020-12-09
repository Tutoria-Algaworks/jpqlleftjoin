package com.github.paulosalonso.jpql.leftjoin.controller.dto;

import com.github.paulosalonso.jpql.leftjoin.domain.Language;
import com.sun.istack.NotNull;
import lombok.*;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ConfigurationLanguageInputDTO {

    @NotNull
    private Language language;

    @NotBlank
    public String description;
}
