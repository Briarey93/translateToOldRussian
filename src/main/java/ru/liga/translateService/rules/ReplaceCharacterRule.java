package ru.liga.translateService.rules;

public interface ReplaceCharacterRule {
    /**
     * Фабрика генерирует декоратор сообщения.
     * Описание фабрики:
     * -первым должено вызываться правило замены буквы Ф в именах, т.к. словарь строгий.
     * -вторым должено вызываться правило замены буквы Е в корнях опрределенных слов, т.к. словарь строгий.
     * дальнейшие параметры опциональны.
     *
     * @param resource - текст предназначенный для перевода на древне русский.
     * @return - текст, переведенный на древне русский.
     */
    static String factory(String resource) {
        ReplaceCharacterRule ruleDecorator =
                new ReplaceCharacterRuleF(
                        new ReplaceCharacterRuleE(
                                new ReplaceCharacterRuleI(
                                        new ReplaceCharacterRuleOngeer(
                                                new ReplaceCharacterRuleImpl()))));

        return ruleDecorator.replaceCharacterBasedOnDictionary(resource);

    }

    String replaceCharacterBasedOnDictionary(final String resource);
}
