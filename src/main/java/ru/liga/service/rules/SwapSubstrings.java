package ru.liga.service.rules;

public class SwapSubstrings {
    public static String swap(String source, String target, String replacement) {
        StringBuilder sbSource = new StringBuilder(source);
        StringBuilder sbSourceLower = new StringBuilder(source.toLowerCase());
        String searchString = target.toLowerCase();
        String replacementFirstCharUpperCase =
                replacement.toUpperCase().charAt(0) + replacement.substring(1);

        int index = 0;
        while ((index = sbSourceLower.indexOf(searchString, index)) != -1) {
            if (Character.isUpperCase(sbSource.charAt(index))) {
                sbSource.replace(index, index + searchString.length(), replacementFirstCharUpperCase);
            } else {
                sbSource.replace(index, index + searchString.length(), replacement);
            }
            sbSourceLower.replace(index, index + searchString.length(), replacement);
            index += replacement.length();
        }
        sbSourceLower.setLength(0);
        sbSourceLower.trimToSize();

        return sbSource.toString();
    }
}
