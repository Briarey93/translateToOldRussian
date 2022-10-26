package ru.liga.translateService.dictionary;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

public class DictionaryI {
    @Getter
    private final List<String> VOWELS =
            Arrays.asList("а", "е", "ё", "и", "й",
                    "о", "у", "ы", "э", "ю",
                    "я", "ѣ");
}
