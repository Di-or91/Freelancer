public class FreelancerService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;

        int monthsRest = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                // отдыхаем
                money = money - expenses;
                money = money / 3;
                monthsRest ++;
            } else {
                // работаем
            money = money + income;
            money = money - expenses;
            }
        }
        return monthsRest;
    }

}
