package ru.liga.translateService.rules;

import ru.liga.translateService.dictionary.DictionaryOngeer;

public class ReplaceCharacterRuleOngeer implements ReplaceCharacterRule {

    private final DictionaryOngeer dictionaryOngeer = new DictionaryOngeer();

    @Override
    public String replaceCharacterBasedOnDictionary(final String resource) {
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
