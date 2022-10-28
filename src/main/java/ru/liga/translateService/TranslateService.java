package ru.liga.translateService;


import lombok.extern.slf4j.Slf4j;
import ru.liga.translateService.rules.*;

@Slf4j
public class TranslateService {
    private final String DEFAULT_PARAMETER = "text";

    public String translateString(final String resource, final String param) {
        log.debug(String.format("Start translate parameter: %s string:\"%s\"", param, resource));

        String result = ReplaceCharacterRule.factory(resource, param);

        log.debug(String.format("Finish translate parameter: %s string:\"%s\"", param, result));
        return result;
    }

    public String translateString(final String resource) {
        return translateString(resource, DEFAULT_PARAMETER);
    }
}
