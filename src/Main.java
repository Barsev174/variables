import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1 () {
        // Задача 1
        System.out.println("Задача 1, без вывода на экран");

        byte cat = 1;
        short orange = 128;
        int car = 300;
        long money = 2551565848L;

        float pizza = 3.4f;
        double apple = 8.484561;

        boolean fany = true;

        char a = 64;

        // Задача 2
        System.out.println("Задача 2");

        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double totalWeightBoxer = boxer1 + boxer2;
        System.out.println("Общий вес бойцов: " + totalWeightBoxer + "кг");

        double weightDifferenceBoxer = boxer2 - boxer1;
        System.out.println("Разница в весе: " + weightDifferenceBoxer + "кг");


        // Задача 3
        System.out.println("Задача 3");
        int banana = 5;
        int weightBanana = 80;
        int Milk = 200 / 100;
        int weightMilk = 105;
        int iceCream = 2;
        int weightIceCream = 100;
        int egg = 4;
        int weightEgg = 70;

        int weightOfAllProductsG = (banana * weightBanana) + (Milk * weightMilk) + (iceCream * weightIceCream) + (egg * weightEgg);
        System.out.println("Вес завтрака в граммах: " + weightOfAllProductsG);
        double weightOfAllProductsKg = (double)weightOfAllProductsG / 1000;
        System.out.println("Вес завтрака в килограммах: " + weightOfAllProductsKg);

        // Задача 4
        System.out.println("Задача 4");
        double weight250 = 250;
        double weight500 = 500;
        double needToLose = 7;
        double gramsInKg = 1000;
        double intensityOfWeightLoss250 = weight250 / gramsInKg;
        double intensityOfWeightLoss500 = weight500 / gramsInKg;
        double weightLossDay250 = needToLose / intensityOfWeightLoss250;
        double weightLossDay500 = needToLose / intensityOfWeightLoss500;
        System.out.println("При ежедневной потере " + weight250 + " гр. веса, потребуется " + weightLossDay250 + " дней, что бы сбросить " + needToLose + " кг.");
        System.out.println("При ежедневной потере " + weight500 + " гр. веса, потребуется " + weightLossDay500 + " дней, что бы сбросить " + needToLose + " кг.");

        double averege = (weightLossDay250 + weightLossDay500) / 2;

        System.out.println("Среднее количество дней, необходимое для достижеия цели " + averege);

        // Задача 5
        System.out.println("Задача 5");
        int salaryMary = 67670;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        int salaryOfTheYearMary = salaryMary * 12;
        int salaryOfTheYearDenis = salaryDenis * 12;
        int salaryOfTheYearKristina = salaryKristina * 12;

        int salaryIncreaseMary = salaryMary * 110 / 100;
        int salaryIncreaseDenis = salaryDenis * 110 / 100;
        int salaryIncreaseKristina = salaryKristina * 110 / 100;

        int salaryIncreaseOfTheYearMary = salaryIncreaseMary * 12;
        int salaryIncreaseOfTheYearDenis = salaryIncreaseDenis * 12;
        int salaryIncreaseOfTheYearKristina = salaryIncreaseKristina * 12;

        int salaryDifferenceMary = salaryIncreaseOfTheYearMary - salaryOfTheYearMary;
        int salaryDifferenceDenis = salaryIncreaseOfTheYearDenis - salaryOfTheYearDenis;
        int salaryDifferenceKristina = salaryIncreaseOfTheYearKristina- salaryOfTheYearKristina;


        System.out.println("Маша теперь получает " + salaryIncreaseMary + " рублей в месяц. Годовой доход вырос на " + salaryDifferenceMary + " рублей");
        System.out.println("Денис теперь получает " + salaryIncreaseDenis + " рублей в месяц. Годовой доход вырос на " + salaryDifferenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryIncreaseKristina + " рублей в месяц. Годовой доход вырос на " + salaryDifferenceKristina + " рублей");


    }

}






