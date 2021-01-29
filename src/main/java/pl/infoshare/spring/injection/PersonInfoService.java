package pl.infoshare.spring.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class PersonInfoService {

    private final PersonSalaryService personSalaryService;

    @Autowired
    public PersonInfoService(PersonSalaryService personSalaryService) {
        this.personSalaryService = personSalaryService;
    }


    public PersonInfo findPersonInfoByName(String name) {
        BigDecimal salary = personSalaryService.findSalaryByName(name);

        return new PersonInfo(name, salary);
    }
}
