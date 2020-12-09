package com.github.paulosalonso.jpql.leftjoin.repository;

import com.github.paulosalonso.jpql.leftjoin.domain.Configuration;
import com.github.paulosalonso.jpql.leftjoin.domain.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConfigurationRepository extends JpaRepository<Configuration, String> {

    @Query("select c from Configuration c " +
            "left join ConfigurationLanguage l on l.id.configuration = c and l.id.language = :language " +
            "where c.name = :name")
    Optional<Configuration> findByNameAndLanguage(String name, Language language);
}
