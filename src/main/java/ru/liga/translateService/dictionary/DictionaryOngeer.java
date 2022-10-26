package ru.liga.translateService.dictionary;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

public class DictionaryOngeer {
    @Getter
    private final List<String> CONSONANTS =
            Arrays.asList("б", "в", "г", "д", "ж",
                    "з", "к", "л", "м", "н",
                    "п", "р", "с", "т", "ф",
                    "х", "ц", "ч", "ш", "щ");
}
