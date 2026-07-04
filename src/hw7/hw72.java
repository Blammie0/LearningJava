package hw7;

public class hw72 {

    public final static double pisa = 3.14;

    public double s(double rad){
        double s = pisa*rad*rad;
        return s;
    }

    public static double p(double rad1){
        double p = 2*pisa*rad1;
        return p;
    }

    public void pop(double rad2){
        System.out.println("радыус: " + rad2);
        System.out.println("площад: " + s(rad2));
        System.out.println("прметр: " + p(rad2));
    }

}

class hw73 {
    public static void main(String[] args) {

        hw72 popa = new hw72();
        popa.pop(5);


    }
}