package ru.liga.translateService.rules;

public interface ReplaceCharacterRule {
    static String factory(String resource, String param) {
        if (param.equalsIgnoreCase("text")) {
            ReplaceCharacterRule ruleDecorator =
                    new ReplaceCharacterRuleOngeer(
                            new ReplaceCharacterRuleI(
                                    new ReplaceCharacterRuleE(
                                            new ReplaceCharacterRuleImpl())));

            return ruleDecorator.replaceCharacterBasedOnDictionary(resource);
        } else if (param.equalsIgnoreCase("name")) {
            ReplaceCharacterRule ruleDecorator =
                    new ReplaceCharacterRuleF(
                            new ReplaceCharacterRuleImpl());

            return ruleDecorator.replaceCharacterBasedOnDictionary(ReplaceCharacterRule.factory(resource, "text"));
        }
        throw new IllegalArgumentException("Wrong parameter.");
    }

    String replaceCharacterBasedOnDictionary(final String resource);
}
