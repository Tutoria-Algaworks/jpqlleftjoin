package com.github.paulosalonso.jpql.leftjoin.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "TBL_CONFIG")
public class Configuration {

    @NotBlank
    @Id
    @JoinColumn(name = "config_name")
    private String name;

    @NotBlank
    @JoinColumn(name = "config_value")
    private String value;
}
