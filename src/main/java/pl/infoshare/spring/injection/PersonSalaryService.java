package pl.infoshare.spring.injection;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Map;

@Component
public class PersonSalaryService {

    private final Map<String, BigDecimal> personToSalary = Map.of(
            "Maciek", BigDecimal.ONE,
            "Anastazja", BigDecimal.TEN,
            "Mikolaj", BigDecimal.valueOf(20)
    );

    public BigDecimal findSalaryByName(String name) {
        return personToSalary.get(name);
    }
}
