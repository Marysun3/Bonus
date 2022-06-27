public class Main {
    public static void main(String[] args) {
        int score = 200;
        int newSum = 1200;
        int bonus;
        if (newSum >= 1000) {
            bonus = newSum / 100;
            score = score + newSum + bonus;
        } else {
            score = score + newSum;
            bonus = 0;
        }
        System.out.println("У Вас на счету:" +score);
        System.out.println("Начислино бонусов:" +bonus);
    }
}
