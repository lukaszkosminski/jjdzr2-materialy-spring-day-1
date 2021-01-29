package pl.infoshare.spring.simple;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//  /users/1/favourite-movies
// /favourite-movies?userId=1

@Controller
public class WelcomeController {

    @GetMapping("/hello-name")
    @ResponseBody
    public String getHelloMessage(@RequestParam(value = "name", required = false, defaultValue = "Nothing") String name,
                                  @RequestParam("ageOfPerson") int age) {
        return "Hello, " + name + "! You have " + age + "years.";
    }

    @GetMapping("/transformed-sentence")
    @ResponseBody
    public List<String> getTransformedSentence(@RequestParam String sentence) {
        String[] words = sentence.split(" ");
        List<String> transformedWords = new ArrayList<>();

        for(String word: words) {
            if (word.length() > 3) {
                transformedWords.add(word.toUpperCase());
            }
        }

        return transformedWords;
    }

    @GetMapping("/current-date")
    @ResponseBody
    public String getFormattedDate(@RequestParam(defaultValue = "yyyy-MM-dd") String dateFormat) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);

        return currentDate.format(formatter);
    }

    @GetMapping("/users/{userId}/favourite-movies")
    @ResponseBody
    public String getFavouriteMovies(@PathVariable String userId) {
        return "Favourite movies for user with id: " + userId;
    }


}
