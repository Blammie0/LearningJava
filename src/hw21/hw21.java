package hw21;

public class hw21 {
    private StringBuilder nam;
    private int crs;
    private double grd;

    public StringBuilder getNam() {
        return new StringBuilder(nam);
    }

    public void setNam(StringBuilder nam) {
        if (nam != null && nam.length() >= 3) {
            this.nam = new StringBuilder(nam);
        }
    }

    public int getCrs() {
        return crs;
    }

    public void setCrs(int crs) {
        if (crs >= 1 && crs <= 4) {
            this.crs = crs;
        }
    }

    public double getGrd() {
        return grd;
    }

    public void setGrd(double grd) {
        if (grd >= 1.0 && grd <= 10.0) {
            this.grd = grd;
        }
    }

    public void showInfo() {
        System.out.println("им: " + getNam());
        System.out.println("керс: " + getCrs());
        System.out.println("асенка: " + getGrd());
    }
}

class TestStudent {
    public static void main(String[] args) {
        hw21 boba = new hw21();

        boba.setNam(new StringBuilder("Биб"));
        boba.setCrs(2);
        boba.setGrd(8.5);

        boba.showInfo();
    }
}