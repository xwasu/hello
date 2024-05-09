package io.github.xwasu.lang;

import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
class LangService {
    private LangRepository repository;

    public LangService(LangRepository repository) {
        this.repository = repository;
    }

    List<LangDTO> findAll() {
        return repository
                .findAll()
                .stream()
                .map(LangDTO::new)
                .collect(toList());
    }
}
