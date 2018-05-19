package io.github.deutschesschweizermesser.dictionaryservice.model.repository

import org.springframework.data.annotation.Id

data class Word(
    @Id
    var definition: String?,
    var mainTranslation: String?,
    var language: String?
)
