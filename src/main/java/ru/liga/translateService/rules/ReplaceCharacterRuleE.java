package ru.liga.translateService.rules;

import ru.liga.translateService.dictionary.DictionaryE;

public class ReplaceCharacterRuleE implements ReplaceCharacterRule {

    private final DictionaryE dictionaryE = new DictionaryE();

    @Override
    public String replaceCharacterBasedOnDictionary(final String resource) {
        String result = resource;
        for (String key : dictionaryE.getE_CHANGE_MAP().keySet()) {
            result = SwapSubstrings.swap(result, key, dictionaryE.getE_CHANGE_MAP().get(key));
        }
        return result;
    }
}
