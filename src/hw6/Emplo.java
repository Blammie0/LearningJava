package hw6;

public class Emplo {

    int id;
    public String surname;
    int age;
    private int salary;
    String department;

    public Emplo (String surname) {
        this.surname = surname;
    }
    Emplo (int id, int age, String department) {
        this.id = id;
        this.age = age;
        this.department = department;
    }
    private Emplo(int salary) {
        this.salary = salary;
    }

    public void showSal() {
        System.out.println("зарплат: " + salary);
    }

    public void showSur() {
        System.out.println("фамелее: " + surname);
    }

    public void showId() {
        System.out.println("уйди: " + id);
    }
}



class EtstEmplo {
    public static void main(String[] args) {

        Emplo Biba = new Emplo("Объебош");
        Emplo Boba = new Emplo(923, 67, "писяпинатель");

        Biba.showSur();
        Boba.showId();
        Biba.showSal();



    }
}
