package ru.liga.service.rules;

import lombok.extern.slf4j.Slf4j;
import ru.liga.service.dictionary.DictionaryI;

@Slf4j
public class ReplaceCharacterRuleI extends RuleDecorator {

    private final DictionaryI dictionaryI = new DictionaryI();

    public ReplaceCharacterRuleI(ReplaceCharacterRule rule) {
        super(rule);
    }

    @Override
    public String replaceCharacterBasedOnDictionary(final String resource) {
        log.debug("Replace rule I.");
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
