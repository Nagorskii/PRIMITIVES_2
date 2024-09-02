public class Main {
    public static void main(String[] args) {
        int account = 100;
        int addention = 1100;

        int bonus = 0;
        if (addention > 1000) {
            bonus = addention / 100;

        }
        int balance = account + addention + bonus;
        System.out.println("Бонус =" + bonus);
        System.out.println("Счет:" + balance);
    }

}
