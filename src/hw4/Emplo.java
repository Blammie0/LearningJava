package hw4;

public class Emplo {

    int id;
    String surname;
    int age;
    int salary;
    String department;

    Emplo (int id, String surname, int age, int salary, String department) {
        this.id = id; this.surname = surname; this.age = age; this.salary = salary; this.department = department;
    }

    int increaseSalary () {
        return salary *= 2;
    }

}

class EmploTest{
    public static void main (String[] args) {

        Emplo Biba = new Emplo(67, "Biba", 12, 1488, "bibilы");
        System.out.println("Зарплата Бибы увеличена. Зарплата Бибы: " + Biba.increaseSalary());
        Emplo Boba = new Emplo(69, "Boba", 4, 228, "popa");
        System.out.println("Зарплата Бобы увеличена. Зарплата Бибы: " + Boba.increaseSalary());

    }
}