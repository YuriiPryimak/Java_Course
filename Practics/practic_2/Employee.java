package Practics.practic_2;

public class Employee {
    private String name;
    private float rate;
    private int hours;
    private static float totalSum;
    private static float totalSumWithBonuses;

    public Employee(String name, float rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public float calculateSalary() {
        float salary = rate * hours;
        totalSum += salary;
        return salary;
    }

    public float calculateBonus(float salary) {
        float bonus = salary * 0.1f;
        totalSumWithBonuses += (salary + bonus);
        return bonus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name = '" + name + '\'' +
                ", rate = " + rate +
                ", hours work = " + hours +
                '}';
    }

    public static void main(String[] args) {
        Employee em1 = new Employee("John", 100, 8);
        Employee em2 = new Employee("Ann", 100, 6);
        Employee em3 = new Employee("Marcus", 200, 10);

        System.out.println(em1);
        System.out.println(em2);
        System.out.println(em3);

        System.out.println("//////////////////");

        float salaryEm1 = em1.calculateSalary();
        System.out.println("Salary em1 = " + salaryEm1);
        System.out.println("Bonus em1 = " + em1.calculateBonus(salaryEm1));
        System.out.println("---------------------");

        float salaryEm2 = em2.calculateSalary();
        System.out.println("Salary em2 = " + salaryEm2);
        System.out.println("Bonus em2 = " + em2.calculateBonus(salaryEm2));
        System.out.println("---------------------");

        float salaryEm3 = em3.calculateSalary();
        System.out.println("Salary em3 = " + salaryEm3);
        System.out.println("Bonus em3 = " + em3.calculateBonus(salaryEm3));

        System.out.println("//////////////////");

        System.out.println("Total salary of all workers = " + totalSum);
        System.out.println("Total salary of all workers with bonuses = " + totalSumWithBonuses);
    }
}
