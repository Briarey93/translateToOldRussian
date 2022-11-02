package ru.liga.translateService.rules;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class RuleDecorator implements ReplaceCharacterRule {

    protected ReplaceCharacterRule rule;

    public RuleDecorator(ReplaceCharacterRule rule) {
        this.rule = rule;
    }

    @Override
    public String replaceCharacterBasedOnDictionary(final String resource) {
        log.debug("Replace rule decorator.");
        return rule.replaceCharacterBasedOnDictionary(resource);
    }
}
