package ru.liga.translateService.rules;

import ru.liga.translateService.dictionary.DictionaryE;

public class ReplaceCharacterRuleE extends RuleDecorator {

    private final DictionaryE dictionaryE = new DictionaryE();

    public ReplaceCharacterRuleE(ReplaceCharacterRule rule) {
        super(rule);
    }

    @Override
    public String replaceCharacterBasedOnDictionary(final String resource) {
        return rule.replaceCharacterBasedOnDictionary(rule(resource));
    }

    private String rule(final String resource) {
        String result = resource;
        for (String key : dictionaryE.getE_CHANGE_MAP().keySet()) {
            result = SwapSubstrings.swap(result, key, dictionaryE.getE_CHANGE_MAP().get(key));
        }
        return result;
    }
}
