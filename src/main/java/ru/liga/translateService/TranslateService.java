package ru.liga.translateService;


import lombok.extern.slf4j.Slf4j;
import ru.liga.translateService.rules.ReplaceCharacterRule;

/**
 * Сервис перевода русского текста на древне русский.
 */
@Slf4j
public class TranslateService {
    /**
     * Метод преобразования русского текста на древне русский.
     *
     * @param resource - исходный текст.
     * @return - возвращает текст, преобразованный на древне русский.
     */
    public String translateString(final String resource) {
        log.debug(String.format("Start translate string:\"%s\"", resource));

        String result = ReplaceCharacterRule.factory(resource);

        log.debug(String.format("Finish translate string:\"%s\"", result));
        return result;
    }
}
