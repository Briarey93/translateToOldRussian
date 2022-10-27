package ru.liga.translateService.rules;

public interface ReplaceCharacterRule {
    static String factory(String resource, String param) {
        if (param.equalsIgnoreCase("text")){
            return new ReplaceCharacterRuleOngeer().replaceCharacterBasedOnDictionary(
                    new ReplaceCharacterRuleI().replaceCharacterBasedOnDictionary(
                            new ReplaceCharacterRuleE().replaceCharacterBasedOnDictionary(resource)));
        } else if (param.equalsIgnoreCase("name")){
            return new ReplaceCharacterRuleOngeer().replaceCharacterBasedOnDictionary(
                    new ReplaceCharacterRuleI().replaceCharacterBasedOnDictionary(
                            new ReplaceCharacterRuleE().replaceCharacterBasedOnDictionary(
                                    new ReplaceCharacterRuleF().replaceCharacterBasedOnDictionary(resource))));
        }
        throw new IllegalArgumentException("Wrong parameter.");
    }

    String replaceCharacterBasedOnDictionary(final String resource);
}
