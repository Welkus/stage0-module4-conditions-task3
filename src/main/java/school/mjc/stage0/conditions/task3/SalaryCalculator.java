package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double afterTax;
        if (salary < 0) System.out.println("wrong input!");
        else {
            afterTax =
                    (salary <= 10000) ? (salary * 0.85) :
                            (salary <= 20000) ?(salary * 0.82) :
                                    (salary * 0.8);
            System.out.println(afterTax);
        }

    }
}
