package pl.infoshare.spring.simple;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

@Controller
public class SimpleController {

    @GetMapping("/my-name")
    @ResponseBody
    public Person getName(String word) {
        int numberOfLetters = word.length();
        boolean startsWithUppercase = Character.isUpperCase(word.charAt(0));

        return null;
    }

    @GetMapping("/day-of-week")
    @ResponseBody
    public DayOfWeek getDayOfWeek() {
        return LocalDate.now().getDayOfWeek();
    }

    @GetMapping("/number-of-days")
    @ResponseBody
    public Long getNumberOfDays() {
        return ChronoUnit.DAYS.between(LocalDate.of(1992, Month.AUGUST, 25), LocalDate.now());
    }
}
