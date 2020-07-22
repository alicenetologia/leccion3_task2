package test.olesia;

public class Main {

    public static void main(String[] args) {
        int currentBalance = 300_00;
        int transfer = 1100_00;
        int bonus;
        if (transfer < 1000_00) {
            bonus = 0;
        } else {
            bonus = transfer / 100;
        }
        int totalBalance = bonus + currentBalance + transfer;
        System.out.println("Your bonus " + bonus);
        System.out.println("Your total balance " + totalBalance);
    }
}
