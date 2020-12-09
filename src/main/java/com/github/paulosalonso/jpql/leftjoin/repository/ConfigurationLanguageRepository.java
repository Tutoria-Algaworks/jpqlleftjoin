package com.github.paulosalonso.jpql.leftjoin.repository;

import com.github.paulosalonso.jpql.leftjoin.domain.ConfigurationLanguage;
import com.github.paulosalonso.jpql.leftjoin.domain.ConfigurationLanguageId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigurationLanguageRepository extends JpaRepository<ConfigurationLanguage, ConfigurationLanguageId> {}
