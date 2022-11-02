package ru.liga;

import ru.liga.translateService.TranslateService;

public class App {

    public static final String TEST_STRING_TEXT = "        put(\"еда\", \"ѣда\");\n" +
            "        put(\"ем\", \"ѣм\");\n" +
            "        put(\"есть\", \"ѣсть\");\n" +
            "        put(\"обед\", \"обѣд\");\n" +
            "        put(\"обедня\", \"обѣдня\");\n" +
            "        put(\"сыроежка\", \"сыроѣжка\");\n" +
            "        put(\"сыроега\", \"сыроѣга\");\n" +
            "        put(\"медведь\", \"медвѣдь\");\n" +
            "        put(\"снедь\", \"снѣдь\");\n" +
            "        put(\"едкий\", \"ѣдкий\");\n" +
            "        put(\"ехать\", \"ѣхать\");\n" +
            "        put(\"езда\", \"ѣзда\");\n" +
            "        put(\"уезд\", \"уѣзд\");\n" +
            "        put(\"еду\", \"ѣду\");\n" +
            "        put(\"ездить\", \"ѣздить\");\n" +
            "        put(\"поезд\", \"поѣзд\");\n" +
            "        put(\"бег\", \"бѣг\");\n" +
            "        put(\"беглец\", \"бѣглец\");\n" +
            "        put(\"беженец\", \"бѣженец\");\n" +
            "        put(\"забегаловка\", \"забѣгаловка\");\n" +
            "        put(\"избегать\", \"избѣгать\");\n" +
            "        put(\"избежать\", \"избѣжать\");\n" +
            "        put(\"набег\", \"набѣг\");\n" +
            "        put(\"перебежчик\", \"перебѣжчик\");\n" +
            "        put(\"пробег\", \"пробѣг\");\n" +
            "        put(\"разбег\", \"разбѣг\");\n" +
            "        put(\"убежище\", \"убѣжище\");\n" +
            "        put(\"центробежная сила\", \"центробѣжная сила\");\n" +
            "        put(\"беда\", \"бѣда\");\n" +
            "        put(\"бедный\", \"бѣдный\");\n" +
            "        put(\"победить\", \"побѣдить\");\n" +
            "        put(\"убедить\", \"убѣдить\");\n" +
            "        put(\"убеждение\", \"убѣждение\");\n" +
            "        put(\"белый\", \"бѣлый\");\n" +
            "        put(\"бельё\", \"бѣльё\");\n" +
            "        put(\"белка\", \"бѣлка\");\n" +
            "        put(\"бельмо\", \"бѣльмо\");\n" +
            "        put(\"белуга\", \"бѣлуга\");\n" +
            "        put(\"бес\", \"бѣс\");\n" +
            "        put(\"бешеный\", \"бѣшеный\");\n" +
            "        put(\"обет\", \"обѣт\");\n" +
            "        put(\"обещать\", \"обѣщать\");\n" +
            "        put(\"веять\", \"вѣять\");\n" +
            "        put(\"веер\", \"вѣер\");\n" +
            "        put(\"ветер\", \"вѣтер\");\n" +
            "        put(\"ветвь\", \"вѣтвь\");\n" +
            "        put(\"веха\", \"вѣха\");\n" +
            "        put(\"ведать\", \"вѣдать\");\n" +
            "        put(\"веди\", \"вѣди\");\n" +
            "        put(\"весть\", \"вѣсть\");\n" +
            "        put(\"повесть\", \"повѣсть\");\n" +
            "        put(\"ве́дение\", \"вѣ́дѣние\");\n" +
            "        put(\"вежливый\", \"вѣжливый\");\n" +
            "        put(\"невежда\", \"невѣжда\");\n" +
            "        put(\"вежды\", \"вѣжды\");\n" +
            "        put(\"вежа\", \"вѣжа\");\n" +
            "        put(\"век\", \"вѣк\");\n" +
            "        put(\"вечный\", \"вѣчный\");\n" +
            "        put(\"увечить\", \"увѣчить\");\n" +
            "        put(\"веко\", \"вѣко\");\n" +
            "        put(\"венок\", \"вѣнок\");\n" +
            "        put(\"вениквенок\", \"вѣниквѣнок\");\n" +
            "        put(\"венец\", \"вѣнец\");\n" +
            "        put(\"веник\", \"вѣник\");\n" +
            "        put(\"вено\", \"вѣно\");\n" +
            "        put(\"вера\", \"вѣра\");\n" +
            "        put(\"вероятно\", \"вѣроятно\");\n" +
            "        put(\"суеверие\", \"суевѣрие\");\n" +
            "        put(\"вес\", \"вѣс\");\n" +
            "        put(\"вешать\", \"вѣшать\");\n" +
            "        put(\"повеса\", \"повѣса\");\n" +
            "        put(\"равновесие\", \"равновѣсие\");\n" +
            "        put(\"звезда\", \"звѣзда\");\n" +
            "        put(\"зверь\", \"звѣрь\");\n" +
            "        put(\"невеста\", \"невѣста\");\n" +
            "        put(\"ответ\", \"отвѣт\");\n" +
            "        put(\"совет\", \"совѣт\");\n" +
            "        put(\"привет\", \"привѣт\");\n" +
            "        put(\"завет\", \"завѣт\");\n" +
            "        put(\"вещать\", \"вѣщать\");\n" +
            "        put(\"вече\", \"вѣче\");\n" +
            "        put(\"свежий\", \"свѣжий\");\n" +
            "        put(\"свежеть\", \"свѣжѣть\");\n" +
            "        put(\"свет\", \"свѣт\");\n" +
            "        put(\"свеча\", \"свѣча\");\n" +
            "        put(\"просвещение\", \"просвѣщение\");\n" +
            "        put(\"светец\", \"свѣтец\");\n" +
            "        put(\"светёлка\", \"свѣтёлка\");\n" +
            "        put(\"Светлана\", \"Свѣтлана\");\n" +
            "        put(\"цвет\", \"цвѣт\");\n" +
            "        put(\"цветы\", \"цвѣты\");\n" +
            "        put(\"цвести\", \"цвѣсти\");\n" +
            "        put(\"человек\", \"человѣк\");\n" +
            "        put(\"человеческий\", \"человѣческий\");\n" +
            "        put(\"деть\", \"дѣть\");\n" +
            "        put(\"девать\", \"дѣвать\");\n" +
            "        put(\"одеть\", \"одѣть\");\n" +
            "        put(\"одевать\", \"одѣвать\");\n" +
            "        put(\"одеяло\", \"одѣяло\");\n" +
            "        put(\"одеяние\", \"одѣяние\");\n" +
            "        put(\"дело\", \"дѣло\");\n" +
            "        put(\"делать\", \"дѣлать\");\n" +
            "        put(\"действие\", \"дѣйствие\");\n" +
            "        put(\"неделя\", \"недѣля\");\n" +
            "        put(\"надеяться\", \"надѣяться\");\n" +
            "        put(\"свидетель\", \"свидѣтель\");\n" +
            "        put(\"дева\", \"дѣва\");\n" +
            "        put(\"девочка\", \"дѣвочка\");\n" +
            "        put(\"дед\", \"дѣд\");\n" +
            "        put(\"делить\", \"дѣлить\");\n" +
            "        put(\"предел\", \"предѣл\");\n" +
            "        put(\"дети\", \"дѣти\");\n" +
            "        put(\"детёныш\", \"дѣтёныш\");\n" +
            "        put(\"детка\", \"дѣтка\");\n" +
            "        put(\"детство\", \"дѣтство\");\n" +
            "        put(\"зевать\", \"зѣвать\");\n" +
            "        put(\"зев\", \"зѣв\");\n" +
            "        put(\"ротозей\", \"ротозѣй\");\n" +
            "        put(\"зело\", \"зѣло\");\n" +
            "        put(\"зеница\", \"зѣница\");\n" +
            "        put(\"зенки\", \"зѣнки\");\n" +
            "        put(\"левый\", \"лѣвый\");\n" +
            "        put(\"левша\", \"лѣвша\");\n" +
            "        put(\"лезть\", \"лѣзть\");\n" +
            "        put(\"лестница\", \"лѣстница\");\n" +
            "        put(\"облезлый\", \"облѣзлый\");\n" +
            "        put(\"лекарь\", \"лѣкарь\");\n" +
            "        put(\"лечить\", \"лѣчить\");\n" +
            "        put(\"лекарство\", \"лѣкарство\");\n" +
            "        put(\"лень\", \"лѣнь\");\n" +
            "        put(\"ленивец\", \"лѣнивец\");\n" +
            "        put(\"ленивый\", \"лѣнивый\");\n" +
            "        put(\"лентяй\", \"лѣнтяй\");\n" +
            "        put(\"лепота\", \"лѣпота\");\n" +
            "        put(\"великолепный\", \"великолѣпный\");\n" +
            "        put(\"лепить\", \"лѣпить\");\n" +
            "        put(\"нелепый\", \"нелѣпый\");\n" +
            "        put(\"слепок\", \"слѣпок\");\n" +
            "        put(\"лес\", \"лѣс\");\n" +
            "        put(\"лесник\", \"лѣсник\");\n" +
            "        put(\"лесничий\", \"лѣсничий\");\n" +
            "        put(\"лесопилка\", \"лѣсопилка\");\n" +
            "        put(\"леший\", \"лѣший\");\n" +
            "        put(\"лето\", \"лѣто\");\n" +
            "        put(\"долголетие\", \"долголѣтие\");\n" +
            "        put(\"Летов\", \"Лѣтов\");\n" +
            "        put(\"летоисчисление\", \"лѣтоисчисление\");\n" +
            "        put(\"летописец\", \"лѣтописец\");\n" +
            "        put(\"летопись\", \"лѣтопись\");\n" +
            "        put(\"малолетка\", \"малолѣтка\");\n" +
            "        put(\"однолетка\", \"однолѣтка\");\n" +
            "        put(\"пятилетка\", \"пятилѣтка\");\n" +
            "        put(\"совершеннолетие\", \"совершеннолѣтие\");\n" +
            "        put(\"леха́\", \"лѣха́\");\n" +
            "        put(\"бледный\", \"блѣдный\");\n" +
            "        put(\"железо\", \"желѣзо\");\n" +
            "        put(\"железняк\", \"желѣзняк\");\n" +
            "        put(\"калека\", \"калѣка\");\n" +
            "        put(\"калечить\", \"калѣчить\");\n" +
            "        put(\"клеть\", \"клѣть\");\n" +
            "        put(\"клетка\", \"клѣтка\");\n" +
            "        put(\"колено\", \"колѣно\");\n" +
            "        put(\"наколенник\", \"наколѣнник\");\n" +
            "        put(\"поколение\", \"поколѣние\");\n" +
            "        put(\"лелеять\", \"лелѣять\");\n" +
            "        put(\"млеть\", \"млѣть\");\n" +
            "        put(\"плен\", \"плѣн\");\n" +
            "        put(\"пленённый\", \"плѣнённый\");\n" +
            "        put(\"пленить\", \"плѣнить\");\n" +
            "        put(\"пленник\", \"плѣнник\");\n" +
            "        put(\"плесень\", \"плѣсень\");\n" +
            "        put(\"плешь\", \"плѣшь\");\n" +
            "        put(\"Плеханов\", \"Плѣханов\");\n" +
            "        put(\"полено\", \"полѣно\");\n" +
            "        put(\"след\", \"слѣд\");\n" +
            "        put(\"последователь\", \"послѣдователь\");\n" +
            "        put(\"последствие\", \"послѣдствие\");\n" +
            "        put(\"преследовать\", \"преслѣдовать\");\n" +
            "        put(\"следить\", \"слѣдить\");\n" +
            "        put(\"следопыт\", \"слѣдопыт\");\n" +
            "        put(\"слепой\", \"слѣпой\");\n" +
            "        put(\"телега\", \"телѣга\");\n" +
            "        put(\"тележный\", \"телѣжный\");\n" +
            "        put(\"тлен\", \"тлѣн\");\n" +
            "        put(\"тление\", \"тлѣние\");\n" +
            "        put(\"тленный\", \"тлѣнный\");\n" +
            "        put(\"хлеб\", \"хлѣб\");\n" +
            "        put(\"хлев\", \"хлѣв\");\n" +
            "        put(\"медь\", \"мѣдь\");\n" +
            "        put(\"медный\", \"мѣдный\");\n" +
            "        put(\"мел\", \"мѣл\");\n" +
            "        put(\"менять\", \"мѣнять\");\n" +
            "        put(\"изменник\", \"измѣнник\");\n" +
            "        put(\"непременно\", \"непремѣнно\");\n" +
            "        put(\"мера\", \"мѣра\");\n" +
            "        put(\"намерение\", \"намѣрение\");\n" +
            "        put(\"лицемер\", \"лицемѣр\");\n" +
            "        put(\"месяц\", \"мѣсяц\");\n" +
            "        put(\"месить\", \"мѣсить\");\n" +
            "        put(\"мешать\", \"мѣшать\");\n" +
            "        put(\"помеха\", \"помѣха\");\n" +
            "        put(\"место\", \"мѣсто\");\n" +
            "        put(\"мещанин\", \"мѣщанин\");\n" +
            "        put(\"помещик\", \"помѣщик\");\n" +
            "        put(\"наместник\", \"намѣстник\");\n" +
            "        put(\"метить\", \"мѣтить\");\n" +
            "        put(\"замечать\", \"замѣчать\");\n" +
            "        put(\"примечание\", \"примѣчание\");\n" +
            "        put(\"сметить\", \"смѣтить\");\n" +
            "        put(\"смета\", \"смѣта\");\n" +
            "        put(\"мех\", \"мѣх\");\n" +
            "        put(\"мешок\", \"мѣшок\");\n" +
            "        put(\"змей\", \"змѣй\");\n" +
            "        put(\"змея\", \"змѣя\");\n" +
            "        put(\"сметь\", \"смѣть\");\n" +
            "        put(\"смелый\", \"смѣлый\");\n" +
            "        put(\"смеяться\", \"смѣяться\");\n" +
            "        put(\"смех\", \"смѣх\");\n" +
            "        put(\"нега\", \"нѣга\");\n" +
            "        put(\"нежный\", \"нѣжный\");\n" +
            "        put(\"нежить\", \"нѣжить\");\n" +
            "        put(\"недра\", \"нѣдра\");\n" +
            "        put(\"внедрить\", \"внѣдрить\");\n" +
            "        put(\"немой\", \"нѣмой\");\n" +
            "        put(\"немец\", \"нѣмец\");\n" +
            "        put(\"нет\", \"нѣт\");\n" +
            "        put(\"отнекаться\", \"отнѣкаться\");\n" +
            "        put(\"гнев\", \"гнѣв\");\n" +
            "        put(\"гнедой\", \"гнѣдой\");\n" +
            "        put(\"гнездо\", \"гнѣздо\");\n" +
            "        put(\"загнетка\", \"загнѣтка\");\n" +
            "        put(\"снег\", \"снѣг\");\n" +
            "        put(\"снежный\", \"снѣжный\");\n" +
            "        put(\"мнение\", \"мнѣние\");\n" +
            "        put(\"сомнение\", \"сомнѣние\");\n" +
            "        put(\"сомневаться\", \"сомнѣваться\");\n" +
            "        put(\"петь\", \"пѣть\");\n" +
            "        put(\"песня\", \"пѣсня\");\n" +
            "        put(\"петух\", \"пѣтух\");\n" +
            "        put(\"пегий\", \"пѣгий\");\n" +
            "        put(\"пена\", \"пѣна\");\n" +
            "        put(\"пенязь\", \"пѣнязь\");\n" +
            "        put(\"пестовать\", \"пѣстовать\");\n" +
            "        put(\"пестун\", \"пѣстун\");\n" +
            "        put(\"пехота\", \"пѣхота\");\n" +
            "        put(\"пеший\", \"пѣший\");\n" +
            "        put(\"опешить\", \"опѣшить\");\n" +
            "        put(\"спеть\", \"спѣть\");\n" +
            "        put(\"спех\", \"спѣх\");\n" +
            "        put(\"спешить\", \"спѣшить\");\n" +
            "        put(\"успех\", \"успѣх\");\n" +
            "        put(\"реять\", \"рѣять\");\n" +
            "        put(\"река\", \"рѣка\");\n" +
            "        put(\"речь\", \"рѣчь\");\n" +
            "        put(\"наречие\", \"нарѣчие\");\n" +
            "        put(\"редкий\", \"рѣдкий\");\n" +
            "        put(\"редька\", \"рѣдька\");\n" +
            "        put(\"резать\", \"рѣзать\");\n" +
            "        put(\"резвый\", \"рѣзвый\");\n" +
            "        put(\"репа\", \"рѣпа\");\n" +
            "        put(\"репица\", \"рѣпица\");\n" +
            "        put(\"ресница\", \"рѣсница\");\n" +
            "        put(\"обретать\", \"обрѣтать\");\n" +
            "        put(\"обрести\", \"обрѣсти\");\n" +
            "        put(\"сретение\", \"срѣтение\");\n" +
            "        put(\"встречать\", \"встрѣчать\");\n" +
            "        put(\"прореха\", \"прорѣха\");\n" +
            "        put(\"решето\", \"рѣшето\");\n" +
            "        put(\"решётка\", \"рѣшётка\");\n" +
            "        put(\"решать\", \"рѣшать\");\n" +
            "        put(\"решить\", \"рѣшить\");\n" +
            "        put(\"грех\", \"грѣх\");\n" +
            "        put(\"грешный\", \"грѣшный\");\n" +
            "        put(\"зреть\", \"зрѣть\");\n" +
            "        put(\"созреть\", \"созрѣть\");\n" +
            "        put(\"зрелый\", \"зрѣлый\");\n" +
            "        put(\"зрение\", \"зрѣние\");\n" +
            "        put(\"крепкий\", \"крѣпкий\");\n" +
            "        put(\"крепиться\", \"крѣпиться\");\n" +
            "        put(\"орех\", \"орѣх\");\n" +
            "        put(\"преть\", \"прѣть\");\n" +
            "        put(\"прелый\", \"прѣлый\");\n" +
            "        put(\"прение\", \"прѣние\");\n" +
            "        put(\"пресный\", \"прѣсный\");\n" +
            "        put(\"свирепый\", \"свирѣпый\");\n" +
            "        put(\"свирель\", \"свирѣль\");\n" +
            "        put(\"стрела\", \"стрѣла\");\n" +
            "        put(\"стрелять\", \"стрѣлять\");\n" +
            "        put(\"стреха\", \"стрѣха\");\n" +
            "        put(\"застреха\", \"застрѣха\");\n" +
            "        put(\"хрен\", \"хрѣн\");\n" +
            "        put(\"сусек\", \"сусѣк\");\n" +
            "        put(\"сеять\", \"сѣять\");\n" +
            "        put(\"семя\", \"сѣмя\");\n" +
            "        put(\"север\", \"сѣвер\");\n" +
            "        put(\"седло\", \"сѣдло\");\n" +
            "        put(\"сесть\", \"сѣсть\");\n" +
            "        put(\"беседа\", \"бесѣда\");\n" +
            "        put(\"сосед\", \"сосѣд\");\n" +
            "        put(\"седой\", \"сѣдой\");\n" +
            "        put(\"седеть\", \"сѣдѣть\");\n" +
            "        put(\"секу\", \"сѣку\");\n" +
            "        put(\"сечь\", \"сѣчь\");\n" +
            "        put(\"сеча\", \"сѣча\");\n" +
            "        put(\"сечение\", \"сѣчение\");\n" +
            "        put(\"просека\", \"просѣка\");\n" +
            "        put(\"насекомое\", \"насѣкомое\");\n" +
            "        put(\"сень\", \"сѣнь\");\n" +
            "        put(\"осенять\", \"осѣнять\");\n" +
            "        put(\"сени\", \"сѣни\");\n" +
            "        put(\"сено\", \"сѣно\");\n" +
            "        put(\"серый\", \"сѣрый\");\n" +
            "        put(\"сера\", \"сѣра\");\n" +
            "        put(\"посетить\", \"посѣтить\");\n" +
            "        put(\"посещать\", \"посѣщать\");\n" +
            "        put(\"сетовать\", \"сѣтовать\");\n" +
            "        put(\"сеть\", \"сѣть\");\n" +
            "        put(\"сетка\", \"сѣтка\");\n" +
            "        put(\"стена\", \"стѣна\");\n" +
            "        put(\"застенок\", \"застѣнок\");\n" +
            "        put(\"застенчивый\", \"застѣнчивый\");\n" +
            "        put(\"стенгазета\", \"стѣнгазета\");\n" +
            "        put(\"тело\", \"тѣло\");\n" +
            "        put(\"мягкотелость\", \"мягкотѣлость\");\n" +
            "        put(\"растелешиться\", \"растѣлешиться\");\n" +
            "        put(\"тельняшка\", \"тѣльняшка\");\n" +
            "        put(\"тень\", \"тѣнь\");\n" +
            "        put(\"оттенок\", \"оттѣнок\");\n" +
            "        put(\"тенёк.\", \"тѣнёк.\");\n" +
            "        put(\"тесто\", \"тѣсто\");\n" +
            "        put(\"тесный\", \"тѣсный\");\n" +
            "        put(\"стеснять\", \"стѣснять\");\n" +
            "        put(\"стесняться\", \"стѣсняться\");\n" +
            "        put(\"теснить\", \"тѣснить\");\n" +
            "        put(\"тесниться\", \"тѣсниться\");\n" +
            "        put(\"затеять\", \"затѣять\");\n" +
            "        put(\"затея\", \"затѣя\");\n" +
            "        put(\"утеха\", \"утѣха\");\n" +
            "        put(\"потеха\", \"потѣха\");\n" +
            "        put(\"тешить\", \"тѣшить\");\n" +
            "        put(\"утешение\", \"утѣшение\");\n" +
            "        put(\"хер\", \"хѣр\");\n" +
            "        put(\"похерить\", \"похѣрить\");\n" +
            "        put(\"цевка\", \"цѣвка\");\n" +
            "        put(\"цевье\", \"цѣвье\");\n" +
            "        put(\"цевница\", \"цѣвница\");\n" +
            "        put(\"цедить\", \"цѣдить\");\n" +
            "        put(\"целый\", \"цѣлый\");\n" +
            "        put(\"исцелять\", \"исцѣлять\");\n" +
            "        put(\"целовать\", \"цѣловать\");\n" +
            "        put(\"поцелуй\", \"поцѣлуй\");\n" +
            "        put(\"цель\", \"цѣль\");\n" +
            "        put(\"Целиться\", \"цѣлиться\");\n" +
            "        put(\"Цена\", \"цѣна\");\n" +
            "        put(\"Цепь\", \"цѣпь\");\n" +
            "        put(\"Цеплять\", \"цѣплять\");\n" +
            "        put(\"Цеп\", \"цѣп\");\n" +
            "иеиоиуИеИоИук";

    public static final String TEST_STRING_NAME = "Агафья, Анфим, Афанасий, Афина, Варфоломей, Голиаф, Евфимий, Марфа, Матфей, Мефодий, Нафанаил, Парфенон, Пифагор, Руфь, Саваоф, Тимофей, Эсфирь, Иудифь, Фаддей, Фекла, Фемида, Фемистокл, Феодор (Фёдор, Федя), Феодосий (Федосий), Феодосия, Феодот (Федот), Феофан, Феофил, Ферапонт, Фома, Фоминична";


    public static void main(String[] args) {
        String tmp = TEST_STRING_TEXT;

        new TranslateService().translateString(tmp);

        tmp = TEST_STRING_NAME;

        String[] arrTmp = tmp.split(" ");
        for (String asd : arrTmp) {
            asd = new TranslateService().translateString(asd);
            System.out.println(asd);
        }
    }
}
