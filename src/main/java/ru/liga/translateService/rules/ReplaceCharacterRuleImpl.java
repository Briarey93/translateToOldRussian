package ru.liga.translateService.rules;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReplaceCharacterRuleImpl implements ReplaceCharacterRule {
    @Override
    public String replaceCharacterBasedOnDictionary(String resource) {
        log.debug("Replace rule IMPL.");
        return resource;
    }
}
