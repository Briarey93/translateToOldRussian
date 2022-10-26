package ru.liga.translateService.rules;

import ru.liga.translateService.dictionary.DictionaryI;

public class ReplaceCharacterRuleI implements ReplaceCharacterRule {

    private final DictionaryI dictionaryI = new DictionaryI();

    @Override
    public String replaceCharacterBasedOnDictionary(final String resource) {
        String result = resource;
        for (String key : dictionaryI.getVOWELS()) {
            result = SwapSubstrings.swap(result, "и" + key, "i" + key);
        }
        return result;
    }
}
