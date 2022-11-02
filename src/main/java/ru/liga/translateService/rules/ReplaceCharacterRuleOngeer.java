package ru.liga.translateService.rules;

import lombok.extern.slf4j.Slf4j;
import ru.liga.translateService.dictionary.DictionaryOngeer;

@Slf4j
public class ReplaceCharacterRuleOngeer extends RuleDecorator {

    private final DictionaryOngeer dictionaryOngeer = new DictionaryOngeer();

    public ReplaceCharacterRuleOngeer(ReplaceCharacterRule rule) {
        super(rule);
    }

    @Override
    public String replaceCharacterBasedOnDictionary(final String resource) {
        log.debug("Replace rule Ongeer.");
        return rule.replaceCharacterBasedOnDictionary(rule(resource));
    }

    public String rule(final String resource) {
        String result = resource;
        for (String key : dictionaryOngeer.getCONSONANTS()) {
            result = swap(result, key, key + "ъ");
        }
        return result;
    }

    private String swap(String source, String target, String replacement) {
        StringBuilder sbSource = new StringBuilder(source);
        StringBuilder sbSourceLower = new StringBuilder(source.toLowerCase());
        String searchString = target.toLowerCase();

        int index = 0;
        while ((index = sbSourceLower.indexOf(searchString, index)) != -1) {
            boolean isNotLetter = true;
            try {
                isNotLetter = !Character.isLetter(sbSource.charAt(index + 1));
            } catch (Exception ignored) {
            }

            if (isNotLetter) {
                sbSource.replace(index, index + searchString.length(), replacement);
                sbSourceLower.replace(index, index + searchString.length(), replacement);
                index += replacement.length();
                continue;
            }
            index++;
        }
        sbSourceLower.setLength(0);
        sbSourceLower.trimToSize();

        return sbSource.toString();
    }
}
