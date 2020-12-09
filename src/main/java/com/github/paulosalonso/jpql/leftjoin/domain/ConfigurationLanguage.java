package com.github.paulosalonso.jpql.leftjoin.domain;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "TBL_CONFIG_LANG")
public class ConfigurationLanguage {

    @EmbeddedId
    private ConfigurationLanguageId id;

    private String description;
}
