package hw11;

public class Student {
    String name;
    int age;
    int course;
    public Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    static void srav(Student pipa, Student popa) {
        if (pipa.age == popa.age && pipa.name == popa.name && pipa.course == popa.course) {
            System.out.println("Студенты " + pipa.name + " и " + popa.name + " равны");
        } else {
            System.out.println("Студенты " + pipa.name + " и " + popa.name + " НЕ равны");
        }
    }

    static void srav1(Student pipa, Student popa) {
        String pipaname = pipa.name;
        String popaname = popa.name;
        if (pipaname.equals(popaname)) {
            System.out.println("все гуд бро имена похожи бро");
        } else {System.out.println("все не гуд бро имена не похожи бро"); }

        if (pipa.age == popa.age) {
            System.out.println("все гуд бро возрасты похожи бро");
        } else {System.out.println("все не гуд бро возрасты не похожи бро"); }

        if (pipa.course == popa.course) {
            System.out.println("все гуд бро курсы похожи бро");
        } else {System.out.println("все не гуд бро курсы не похожи бро"); }

    }
}


class Tst{
    public static void main(String[] args) {
        Student biba = new Student("Biba", 18, 1);
        Student boba = new Student("Boba", 18, 1);

        Student.srav(biba, boba);
        Student.srav1(biba, boba);


    }
}