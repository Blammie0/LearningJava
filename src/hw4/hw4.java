package hw4;

class BankAcc {
    int id;
    String name;
    int balance;
    int plus = 69;
    int pinus = 67;

    BankAcc (int id, String name, int balance) {
        this.id = id; this.name = name; this.balance = balance;
    }

    int plusBal () {
        balance += plus;
        return balance;
    }
    int pinusBal () {
        balance -= pinus;
        return balance;
    }
}

public class hw4 {
    public static void main(String[] args) {

        BankAcc Bibosh = new BankAcc(1488, "Bibosh", 0);
        System.out.println("Бибош получил 69 денех.\nСчет Бибоша: " + Bibosh.plusBal());
        System.out.println("У Бибоша отобрали 67 денях.\nСчет Бибоша: " + Bibosh.pinusBal());



    }

}
