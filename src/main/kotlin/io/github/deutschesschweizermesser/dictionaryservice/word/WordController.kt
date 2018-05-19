package io.github.deutschesschweizermesser.dictionaryservice.word

import io.github.deutschesschweizermesser.dictionaryservice.model.repository.Word
import io.github.deutschesschweizermesser.dictionaryservice.model.repository.WordRepository
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/word")
class WordController(val wordRepository: WordRepository) {

    @PostMapping
    fun saveWord(@RequestBody word: Word): Word = wordRepository.save(word)


    @GetMapping
    fun getWords(): List<Word> {
        return wordRepository.findAll()
    }

}