package ru.liga.translateService.rules;

import ru.liga.translateService.dictionary.DictionaryI;

public class ReplaceCharacterRuleI extends RuleDecorator {

    private final DictionaryI dictionaryI = new DictionaryI();

    public ReplaceCharacterRuleI(ReplaceCharacterRule rule) {
        super(rule);
    }

    @Override
    public String replaceCharacterBasedOnDictionary(final String resource) {
        return rule.replaceCharacterBasedOnDictionary(rule(resource));
    }

    public String rule(final String resource) {
        String result = resource;
        for (String key : dictionaryI.getVOWELS()) {
            result = SwapSubstrings.swap(result, "и" + key, "i" + key);
        }
        return result;
    }
}
