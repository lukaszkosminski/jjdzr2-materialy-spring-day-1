package pl.infoshare.spring.injection;

import java.math.BigDecimal;

public class SalaryIncreaseService {

    private final PersonSalaryService personSalaryService;

    public SalaryIncreaseService(PersonSalaryService personSalaryService) {
        this.personSalaryService = personSalaryService;
    }

    public BigDecimal calculateNewSalary(String name) {
        BigDecimal currentSalary = personSalaryService.findSalaryByName(name);
        BigDecimal newSalary = currentSalary.multiply(BigDecimal.valueOf(2));

        return newSalary;
    }

}
