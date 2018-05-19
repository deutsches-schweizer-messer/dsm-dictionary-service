package io.github.deutschesschweizermesser.dictionaryservice.model.repository

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface WordRepository: MongoRepository<Word, String>