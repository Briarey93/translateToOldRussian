package ru.liga.translateService.rules;

public abstract class RuleDecorator implements ReplaceCharacterRule {

    protected ReplaceCharacterRule rule;

    public RuleDecorator(ReplaceCharacterRule rule) {
        this.rule = rule;
    }

    @Override
    public String replaceCharacterBasedOnDictionary(final String resource) {
        return rule.replaceCharacterBasedOnDictionary(resource);
    }
}
