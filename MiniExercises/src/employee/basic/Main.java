package employee.basic;

public class Main {
    public static void main(String[] args) {
        Employee john = new Employee(1, "John", "Smith", 2000);
        System.out.println(john.toString());
        System.out.println(john.getAnnualSalary());
        System.out.println(john.raiseSalary(10));
        System.out.println(john.getAnnualSalary());
        System.out.println(john.toString());

    }


}
