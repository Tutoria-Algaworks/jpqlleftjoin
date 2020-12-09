package com.github.paulosalonso.jpql.leftjoin.domain;

import com.github.paulosalonso.jpql.leftjoin.domain.converter.LanguageConverter;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Embeddable
public class ConfigurationLanguageId implements Serializable {

    @OneToOne
    @JoinColumn(name = "config_name")
    private Configuration configuration;

    @Convert(converter = LanguageConverter.class)
    @Column(name = "lang_id")
    private Language language;
}
