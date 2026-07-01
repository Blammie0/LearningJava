package hw5;

public class Stud1 {

    int id;
    String name;
    String secName;
    int year;
    double aveMath;
    double aveEco;
    double aveLan;

    Stud1 (int id, String name, String secName, int year, double aveMath, double aveEco, double aveLan) {
        this.id = id;
        this.name = name;
        this.secName = secName;
        this.year = year;
        this.aveMath = aveMath;
        this.aveEco = aveEco;
        this.aveLan = aveLan;
    }

    Stud1 (int id, String name, String secName, int year) {
        this.id = id;
        this.name = name;
        this.secName = secName;
        this.year = year;
    }

    Stud1 () {}

}

class Main1 {
    public static void main(String[] args) {

        Stud1 Biba = new Stud1();
        Stud1 Boba = new Stud1(234, "Ьибош", "Объебош", 2);
        Stud1 Poopa = new Stud1(2354, "Пупа", "Ритп", 4, 4.5, 2.9, 8);


    }
}
