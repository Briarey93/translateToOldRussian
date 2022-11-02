package ru.liga;

public class FormatDictionaryF {

    public static final String DICTIONARY_WORDS = "Агаѳья, Анѳимъ, Аѳанасій, Аѳина, Варѳоломей, " +
            "Голіаѳъ, Евѳимій, Марѳа, Матѳей, Меѳодій, Наѳанаилъ, Парѳенонъ, Пиѳагоръ, Руѳь, Саваоѳъ, " +
            "Тимоѳей, Эсѳирь, Іудиѳь, Ѳаддей, Ѳекла, Ѳемида, Ѳемистоклъ, Ѳеодоръ (Ѳёдоръ, Ѳедя), " +
            "Ѳеодосій (Ѳедосій), Ѳеодосія, Ѳеодотъ (Ѳедотъ), Ѳеофанъ, Ѳеофилъ, Ѳерапонтъ, Ѳома, Ѳоминична";

    private static void formatStr(String str) {
        str = str.replaceAll("\n", " ");
        str = str.replaceAll(",", " ");
        str = str.replaceAll(" {5}", " ");
        str = str.replaceAll(" {4}", " ");
        str = str.replaceAll(" {3}", " ");
        str = str.replaceAll(" {2}", " ");
        String[] array = str.split(" ");
        System.out.println();
        for (String tmp : array) {
            if (!tmp.contains("Ѳ")&&!tmp.contains("ѳ")) {
                continue;
            }
            tmp = String.format("put(\"%s\",\"%s\");",
                    tmp.replaceAll("Ѳ", "Ф").replaceAll("ѳ", "ф"),
                    tmp);
            System.out.println(tmp);
        }
    }

    public static void main(String[] args) {
        formatStr(DICTIONARY_WORDS);
    }
}
