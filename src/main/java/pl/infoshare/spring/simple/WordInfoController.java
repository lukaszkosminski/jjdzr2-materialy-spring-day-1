package pl.infoshare.spring.simple;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class WordInfoController {

    @GetMapping("/word/{givenWord}/info")
    @ResponseBody
    public WordInfo getWordInfo(@PathVariable String givenWord,
                                @RequestParam(required = false, defaultValue = "") String letter) {
        int numberOfLetters = givenWord.length();
        boolean startsWithUppercaseLetter = Character.isUpperCase(givenWord.charAt(0));
        boolean containsLetter = givenWord.contains(letter);

        return new WordInfo(numberOfLetters, startsWithUppercaseLetter, containsLetter);
    }
}
