package ru.liga.translateService.rules;

public class ReplaceCharacterRuleF extends RuleDecorator {

    public ReplaceCharacterRuleF(ReplaceCharacterRule rule) {
        super(rule);
    }

    @Override
    public String replaceCharacterBasedOnDictionary(final String resource) {
        return rule.replaceCharacterBasedOnDictionary(rule(resource));
    }

    public String rule(String resource) {
        if (resource.charAt(0) == 'Ф') {
            return resource.replaceFirst("Ф", "Ѳ");
        }
        return resource.replaceFirst("ф", "ѳ");
    }
}
