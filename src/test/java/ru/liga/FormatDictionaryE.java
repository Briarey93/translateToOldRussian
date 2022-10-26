package ru.liga;

public class FormatDictionaryE {
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
            if (!tmp.contains("ѣ")) {
                continue;
            }
            tmp = String.format("put(\"%s\",\"%s\");", tmp.replaceAll("ѣ", "е"), tmp);
            System.out.println(tmp);
        }
    }

    public static void main(String[] args) {
        String str = "ѣда, ѣм, ѣсть, обѣд, обѣдня, сыроѣжка, сыроѣга, медвѣдь, снѣдь, ѣдкий\n" +
                "ѣхать, ѣзда, уѣзд, ѣду, ѣздить, поѣзд\n" +
                "\n" +
                "бѣг, бѣглец, бѣженец, забѣгаловка, избѣгать, избѣжать, набѣг, перебѣжчик, пробѣг, разбѣг, убѣжище, центробѣжная\n" +
                "бѣда, бѣдный, побѣдить, убѣдить, убѣждение \n" +
                "бѣлый, бѣльё, бѣлка, бѣльмо, бѣлуга \n" +
                "бѣс, бѣшеный \n" +
                "обѣт, обѣщать\n" +
                "\n" +
                "вѣять, вѣер, вѣтер, вѣтвь, вѣха \n" +
                "вѣдать, вѣди, вѣсть, повѣсть , вѣ́дѣние, вѣжливый, невѣжда, вѣжды \n" +
                "вѣжа \n" +
                "вѣк, вѣчный, увѣчить\n" +
                "вѣко \n" +
                "вѣнок, вѣнец, вѣниквѣнок, вѣнец, вѣник\n" +
                "вѣно  \n" +
                "вѣра, вѣроятно, суевѣрие \n" +
                "вѣс, вѣшать, повѣса, равновѣсие \n" +
                "звѣзда \n" +
                "звѣрь \n" +
                "невѣста\n" +
                "отвѣт, совѣт, привѣт, завѣт, вѣщать, вѣче \n" +
                "свѣжий, свѣжѣть\n" +
                "свѣт, свѣча, просвѣщение, свѣтец, свѣтёлка, Свѣтлана\n" +
                "цвѣт, цвѣты, цвѣсти\n" +
                "человѣк, человѣческий\n" +
                "\n" +
                "дѣть, дѣвать, одѣть, одѣвать, одѣяло, одѣяние, дѣло, дѣлать, дѣйствие, недѣля, надѣяться, свидѣтель \n" +
                "дѣва, дѣвочка  \n" +
                "дѣд \n" +
                "дѣлить, предѣл \n" +
                "дѣти, дѣтёныш, дѣтка, дѣтство\n" +
                "\n" +
                "зѣвать, зѣв, ротозѣй\n" +
                "зѣло \n" +
                "зѣница, зѣнки \n" +
                "\n" +
                "лѣвый, лѣвша \n" +
                "лѣзть, лѣстница, облѣзлый \n" +
                "лѣкарь, лѣчить, лѣкарство \n" +
                "лѣнь,, лѣнивец, лѣнивый, лѣнтяй\n" +
                "лѣпота, великолѣпный, лѣпить, нелѣпый, слѣпок \n" +
                "лѣс, лѣсник, лѣсничий, лѣсопилка, лѣший \n" +
                "лѣто, долголѣтие, Лѣтов, лѣтоисчисление, лѣтописец, лѣтопись, малолѣтка, однолѣтка, пятилѣтка, совершеннолѣтие\n" +
                "лѣха́\n" +
                "блѣдный \n" +
                "желѣзо, желѣзняк  \n" +
                "калѣка, калѣчить\n" +
                "клѣть, клѣтка  \n" +
                "колѣно, наколѣнник, поколѣние \n" +
                "лелѣять\n" +
                "млѣть \n" +
                "плѣн, плѣнённый, плѣнить, плѣнник \n" +
                "плѣсень \n" +
                "плѣшь, Плѣханов\n" +
                "полѣно \n" +
                "слѣд, послѣдователь, послѣдствие, преслѣдовать, слѣдить, слѣдопыт\n" +
                "слѣпой\n" +
                "телѣга, телѣжный\n" +
                "тлѣн, тлѣние, тлѣнный\n" +
                "хлѣб \n" +
                "хлѣв\n" +
                "\n" +
                "мѣдь, мѣдный \n" +
                "мѣл  \n" +
                "мѣнять, измѣнник, непремѣнно \n" +
                "мѣра, намѣрение, лицемѣр  \n" +
                "мѣсяц \n" +
                "мѣсить, мѣшать, помѣха\n" +
                "мѣсто, мѣщанин, помѣщик, намѣстник\n" +
                "мѣтить, замѣчать, примѣчание, смѣтить, смѣта \n" +
                "мѣх, мѣшок\n" +
                "змѣй, змѣя\n" +
                "смѣть, смѣлый, смѣяться, смѣх  \n" +
                "\n" +
                "нѣга, нѣжный, нѣжить  \n" +
                "нѣдра, внѣдрить\n" +
                "нѣмой, нѣмец  \n" +
                "нѣт, отнѣкаться \n" +
                "гнѣв\n" +
                "гнѣдой\n" +
                "гнѣздо \n" +
                "загнѣтка  \n" +
                "снѣг, снѣжный\n" +
                "мнѣние, сомнѣние, сомнѣваться  \n" +
                "\n" +
                "пѣть, пѣсня, пѣтух \n" +
                "пѣгий \n" +
                "пѣна \n" +
                "пѣнязь\n" +
                "пѣстовать, пѣстун \n" +
                "пѣхота, пѣший, опѣшить \n" +
                "спѣть, спѣх, спѣшить, успѣх \n" +
                "\n" +
                "рѣять, рѣка \n" +
                "рѣчь, нарѣчие \n" +
                "рѣдкий \n" +
                "рѣдька \n" +
                "рѣзать, рѣзвый\n" +
                "рѣпа, рѣпица \n" +
                "рѣсница\n" +
                "обрѣтать, обрѣсти, срѣтение, встрѣчать \n" +
                "прорѣха, рѣшето, рѣшётка \n" +
                "рѣшать, рѣшить \n" +
                "грѣх, грѣшный \n" +
                "зрѣть, созрѣть, зрѣлый, зрѣние\n" +
                "крѣпкий, крѣпиться\n" +
                "орѣх \n" +
                "прѣть, прѣлый, прѣние \n" +
                "прѣсный\n" +
                "свирѣпый\n" +
                "свирѣль \n" +
                "стрѣла, стрѣлять\n" +
                "стрѣха, застрѣха \n" +
                "хрѣн\n" +
                "\n" +
                "сусѣк\n" +
                "сѣять, сѣмя  \n" +
                "сѣвер  \n" +
                "сѣдло, сѣсть, бесѣда, сосѣд  \n" +
                "сѣдой, сѣдѣть  \n" +
                "сѣку, сѣчь, сѣча, сѣчение, просѣка, насѣкомое \n" +
                "сѣнь, осѣнять, сѣни \n" +
                "сѣно \n" +
                "сѣрый, сѣра  \n" +
                "посѣтить, посѣщать\n" +
                "сѣтовать \n" +
                "сѣть, сѣтка \n" +
                "\n" +
                "стѣна, застѣнок, застѣнчивый, стѣнгазета \n" +
                "тѣло, мягкотѣлость, растѣлешиться, тѣльняшка \n" +
                "тѣнь, оттѣнок, тѣнёк.\n" +
                "тѣсто \n" +
                "тѣсный, стѣснять, стѣсняться, тѣснить, тѣсниться \n" +
                "затѣять, затѣя \n" +
                "утѣха, потѣха, тѣшить, утѣшение\n" +
                "\n" +
                "хѣр, похѣрить \n" +
                "\n" +
                "цѣвка, цѣвье\n" +
                "цѣвница \n" +
                "цѣдить\n" +
                "цѣлый, исцѣлять, цѣловать, поцѣлуй \n" +
                "цѣль, цѣлиться\n" +
                "цѣна \n" +
                "цѣпь, цѣплять, цѣп\n" +
                "\n";
        formatStr(str);
    }
}
