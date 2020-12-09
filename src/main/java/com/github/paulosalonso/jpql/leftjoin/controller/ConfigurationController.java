package com.github.paulosalonso.jpql.leftjoin.controller;

import com.github.paulosalonso.jpql.leftjoin.controller.dto.ConfigurationLanguageInputDTO;
import com.github.paulosalonso.jpql.leftjoin.domain.Configuration;
import com.github.paulosalonso.jpql.leftjoin.domain.ConfigurationLanguage;
import com.github.paulosalonso.jpql.leftjoin.domain.ConfigurationLanguageId;
import com.github.paulosalonso.jpql.leftjoin.domain.Language;
import com.github.paulosalonso.jpql.leftjoin.repository.ConfigurationLanguageRepository;
import com.github.paulosalonso.jpql.leftjoin.repository.ConfigurationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/configurations")
public class ConfigurationController {

    private final ConfigurationRepository configurationRepository;
    private final ConfigurationLanguageRepository configurationLanguageRepository;

    @GetMapping("/{id}")
    public Configuration getByIdAndLanguage(@PathVariable String id, @RequestParam Language language) {
        return configurationRepository.findByNameAndLanguage(id, language)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public Configuration create(@RequestBody @Valid Configuration configuration) {
        return configurationRepository.save(configuration);
    }

    @PostMapping("/{id}/languages")
    public ConfigurationLanguage addLanguage(@PathVariable String id, @RequestBody @Valid ConfigurationLanguageInputDTO input) {
        var configuration = configurationRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        var language = ConfigurationLanguage.builder()
                .id(ConfigurationLanguageId.builder()
                        .configuration(configuration)
                        .language(input.getLanguage())
                        .build())
                .description(input.getDescription())
                .build();

        return configurationLanguageRepository.save(language);
    }

}
