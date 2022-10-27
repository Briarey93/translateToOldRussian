package ru.liga.translateService.rules;

public class ReplaceCharacterRuleF implements ReplaceCharacterRule {

    @Override
    public String replaceCharacterBasedOnDictionary(String resource) {
        if (resource.charAt(0) == 'Ф') {
            return resource.replaceFirst("Ф", "Ѳ");
        }
        return resource.replaceFirst("ф", "ѳ");
    }
}
