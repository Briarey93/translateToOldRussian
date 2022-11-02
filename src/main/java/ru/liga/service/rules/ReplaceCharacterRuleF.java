package ru.liga.service.rules;

import lombok.extern.slf4j.Slf4j;
import ru.liga.service.dictionary.DictionaryF;

@Slf4j
public class ReplaceCharacterRuleF extends RuleDecorator {

    private final DictionaryF dictionaryF = new DictionaryF();


    public ReplaceCharacterRuleF(ReplaceCharacterRule rule) {
        super(rule);
    }

    @Override
    public String replaceCharacterBasedOnDictionary(final String resource) {
        log.debug("Replace rule F.");
        return rule.replaceCharacterBasedOnDictionary(rule(resource));
    }

    private String rule(final String resource) {
        String result = resource;
        for (String key : dictionaryF.getF_CHANGE_MAP().keySet()) {
            result = SwapSubstrings.swap(result, key, dictionaryF.getF_CHANGE_MAP().get(key));
        }
        return result;
    }
}
