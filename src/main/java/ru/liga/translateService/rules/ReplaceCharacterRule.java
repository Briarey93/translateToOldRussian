package ru.liga.translateService.rules;

public interface ReplaceCharacterRule {
    static String factory(String resource) {
        ReplaceCharacterRule ruleDecorator =
                new ReplaceCharacterRuleOngeer(
                        new ReplaceCharacterRuleI(
                                new ReplaceCharacterRuleE(
                                        new ReplaceCharacterRuleF(
                                                new ReplaceCharacterRuleImpl()))));

        return ruleDecorator.replaceCharacterBasedOnDictionary(resource);

    }

    String replaceCharacterBasedOnDictionary(final String resource);
}
