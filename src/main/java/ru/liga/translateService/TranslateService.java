package ru.liga.translateService;


import lombok.extern.slf4j.Slf4j;
import ru.liga.translateService.rules.*;

/**
 * Сервис перевода русского текста в древне русский.
 */
@Slf4j
public class TranslateService {
    private final String DEFAULT_PARAMETER = "text";

    /**
     * Метод преобразования русского текста в древне русский.
     *
     * @param resource - исходный текст.
     * @param param - параметр, определяющий стилистику преобразования
     *              "text" - преобразует текст в древне русский, используя все стандартные правила преобразования.
     *              "name" - преобразует имя в друвне русский, используя все стандартные правила преобразования, а также правило преобразования имени.
     *              (преобразует первую букву 'Ф' в имени в 'Ѳ')
     *              В данном случае ресурс должен состоять из одного имени. составные имена необходимо преобразовывать по отдельности.
     * @return - возвращает текст, преобразованный по правилам заложенным в параметре.
     */
    public String translateString(final String resource, final String param) {
        log.debug(String.format("Start translate parameter: %s string:\"%s\"", param, resource));

        String result = ReplaceCharacterRule.factory(resource, param);

        log.debug(String.format("Finish translate parameter: %s string:\"%s\"", param, result));
        return result;
    }

    /**
     * Метод преобразования русского текста в древне русский.
     * параметр используется по умолчанию "text"
     *
     * @param resource - исходный текст.
     * @return - возвращает текст, преобразованный по правилам заложенным в параметре.
     */
    public String translateString(final String resource) {
        return translateString(resource, DEFAULT_PARAMETER);
    }
}
