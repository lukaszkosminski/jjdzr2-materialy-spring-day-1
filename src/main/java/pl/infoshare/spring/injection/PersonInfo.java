package pl.infoshare.spring.injection;

import java.math.BigDecimal;

public class PersonInfo {

    private final String name;
    private final BigDecimal salary;

    public PersonInfo(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "PersonInfo{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
