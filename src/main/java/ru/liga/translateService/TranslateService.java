package ru.liga.translateService;

import lombok.extern.slf4j.Slf4j;
import ru.liga.translateService.rules.ReplaceCharacterRule;
import ru.liga.translateService.rules.ReplaceCharacterRuleE;
import ru.liga.translateService.rules.ReplaceCharacterRuleI;
import ru.liga.translateService.rules.ReplaceCharacterRuleOngeer;

@Slf4j
public class TranslateService {
    private ReplaceCharacterRule replaceCharacterRule;

    public String translateString(final String resource) {
        log.debug(String.format("Start translate string:\"%s\"", resource));
        String result = resource;

        replaceCharacterRule = new ReplaceCharacterRuleE();
        result = replaceCharacterRule.replaceCharacterBasedOnDictionary(result);

        replaceCharacterRule = new ReplaceCharacterRuleI();
        result = replaceCharacterRule.replaceCharacterBasedOnDictionary(result);

        replaceCharacterRule = new ReplaceCharacterRuleOngeer();
        result = replaceCharacterRule.replaceCharacterBasedOnDictionary(result);

        log.debug(String.format("Finish translate string:\"%s\"", result));
        return result;
    }

    public String translateName(final String resource) {
        log.debug(String.format("Start translate name:\"%s\"", resource));
        String result = resource;

        replaceCharacterRule = new ReplaceCharacterRuleI();
        result = replaceCharacterRule.replaceCharacterBasedOnDictionary(result);

        replaceCharacterRule = new ReplaceCharacterRuleOngeer();
        result = replaceCharacterRule.replaceCharacterBasedOnDictionary(result);

        replaceCharacterRule = new ReplaceCharacterRuleF();
        result = replaceCharacterRule.replaceCharacterBasedOnDictionary(result);

        log.debug(String.format("Finish translate name:\"%s\"", result));
        return result;
    }
}
