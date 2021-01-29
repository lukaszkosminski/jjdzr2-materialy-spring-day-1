package pl.infoshare.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.infoshare.spring.injection.PersonInfo;
import pl.infoshare.spring.injection.PersonInfoService;
import pl.infoshare.spring.injection.PersonSalaryService;
import pl.infoshare.spring.injection.SalaryIncreaseService;

import java.math.BigDecimal;

@SpringBootApplication
public class MyFirstSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyFirstSpringApplication.class, args);


    }
}
