package hw3;

public class Student {

        int studNum;
        String name;
        String secName;
        int year;
        double aveMath;
        double aveEco;
        double aveLan;

    //public double getAveGrd() {
    //    return (this.aveMath + this.aveEco + this.aveLan) / 3.0;
    //} вот так было

    public void getAveGrd() {
        double ave = (this.aveMath + this.aveEco + this.aveLan) / 3.0;
        System.out.println("\nСредняя оценка " + name + ": " + ave);
    }

}



class StudentTest {
    public static void main(String[] args) {

        Student Biba = new Student(); Biba.name = "Biba";
        Biba.aveMath = 2.4; Biba.aveEco = 4; Biba.aveLan = 5;
        //double aveBiba = Biba.getAveGrd();
        Student Boba = new Student(); Boba.name = "Boba";
        Boba.aveMath = 5; Boba.aveEco = 1; Boba.aveLan = 4;
        //double aveBoba = Boba.getAveGrd();
        Student Dva = new Student(); Dva.name = "Dva";
        Dva.aveMath = 4; Dva.aveEco = 2; Dva.aveLan = 3;
        //double aveDva = Dva.getAveGrd();


        Biba.getAveGrd();
        Boba.getAveGrd();
        Dva.getAveGrd();
        //System.out.println("\nСредняя оценка Бибы: " + aveBiba + "\nCредняя оценка Бобы: " + aveBoba + "\nСРедняя оценка Два: " + aveDva);


    }
}