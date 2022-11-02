package ru.liga.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.liga.service.TranslateService;


@RestController
@RequiredArgsConstructor
@RequestMapping("/translate")
public class TranslateController {

    private final TranslateService translateService;

    @GetMapping
    public ResponseEntity<String> translate(@RequestParam String resource){
        return ResponseEntity.ok(translateService.translateString(resource));
    }
}
