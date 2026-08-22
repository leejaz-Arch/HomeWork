//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание №3");

        System.out.println("Задание№1" );

         byte tea = -24;
         short lea = 24567;
         int dog = 55000;
         long cat = 9000000L;
         float sus = 45.12f;
         double sas = 55.1253;
        System.out.println("Значение переменной tea с типом byte равно " + tea);
        System.out.println("Значение переменной lea с типом short равно " +lea);
        System.out.println("Значение переменной dog с типом int равно " +dog);
        System.out.println("Значение переменной cat с типом long равно " +cat);
        System.out.println("Значение переменной sus с типом float равно " +sus);
        System.out.println("Значение переменной sas с типом double равно " +sas);

        System.out.println("Задание№2");
        float x = 27.12f;
        long a = 987678965L;
        double q = 2.786;
        short w = 569;
        short t = -159;
        int e = 27897;
        byte r = 67;
        System.out.println("Значение переменной x с типом float равно " +x);
        System.out.println("Значение переменной a с типом long равно " +a);
        System.out.println("Значение переменной q с типом double равно " +q);
        System.out.println("Значение переменной w с типом short равно " +w);
        System.out.println("Значение переменной t с типом short равно " +t);
        System.out.println("Значение переменной e с типом int равно " +e);
        System.out.println("Значение переменной r с типом byte равно " +r);

        System.out.println("задача№3");
        byte lpStudent = 23;
        byte asStudent = 27;
        byte eaStudent = 30;
        short totalSheets = 480;
        int sheetsOnStudent = totalSheets / (lpStudent + asStudent+ eaStudent);
        System.out.println("На каждого ученика расчитанно " + sheetsOnStudent + " листов бумаги" );

        System.out.println("Задача№4");
        byte work1 = 20;
        short work2 = 1440;
        short work3 = 1440 * 3;
        int work4 = 1440 * 30;

        byte bottleIn1Minutes = 16/2;

        int quantityBottleIn20Min = bottleIn1Minutes * work1;
        int quantityBottleIn1Day = bottleIn1Minutes * work2;
        int quantityBottleIn3Days = bottleIn1Minutes * work3;
        int quantityBottleInt30Days = bottleIn1Minutes * work4;

        System.out.println("За 20 минут машина произвела " + quantityBottleIn20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + quantityBottleIn1Day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + quantityBottleIn3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + quantityBottleInt30Days + " штук бутылок");

        System.out.println("ЗАдача№5");
        byte totalCansOfPaint = 120;
        byte whiteColourOn1Class = 2;
        byte brownColourOn1Class = 4;

        int totalClassesInSchool = totalCansOfPaint / (whiteColourOn1Class + brownColourOn1Class);
        int totalWhiteColourCans = totalClassesInSchool * whiteColourOn1Class;
        int totalBrownColourCans = totalClassesInSchool * brownColourOn1Class;

        System.out.println("В школе, где " + totalClassesInSchool + " классов, нужно " + totalWhiteColourCans + " банок белой краски и " + totalBrownColourCans + " банок коричневой краски!");

        System.out.println("Задача№6");
        byte banans = 5;
        byte weight1BananInGrams = 80;

        short milkInMilliliters = 200;
        byte gramsIn100MillilitersOfMilk = 105;

        byte iceCreamBriquettes = 2;
        byte weight1BriquetteInGrams = 100;

        byte rawEggs = 4;
        byte weight1EggInGrams = 70;

        int totalWeightBananas = banans * weight1BananInGrams;
        int totalWeightMilk = milkInMilliliters/2 * gramsIn100MillilitersOfMilk;
        int totalWeightIceCream = iceCreamBriquettes * weight1BriquetteInGrams;
        int totalWeightRawEggs = rawEggs * weight1EggInGrams;
        int totalWeightBreakfastInGrams = totalWeightBananas + totalWeightMilk + totalWeightIceCream + totalWeightRawEggs;
        float totalWeightBreakfastInKilograms = totalWeightBreakfastInGrams/1000f;

        System.out.println("Вес завтрака в граммах = " + totalWeightBreakfastInGrams + " грамм");
        System.out.println("Вес завтрака в килограммах = " + totalWeightBreakfastInKilograms + " килограмм");

        System.out.println("Задача№7");
        byte weightNeedToLoseInKilogram = 7;
        short gramInKilorgram = 1000;
        int totalWeightNeedToLoseInGrams = weightNeedToLoseInKilogram * gramInKilorgram;

        short firstWayLoseWeightPerDayInGrams = 250;
        short secondWayLoseWeightPerDayInGrams = 500;
        int firstLoseWeightProgram = totalWeightNeedToLoseInGrams/firstWayLoseWeightPerDayInGrams;
        int secondLoseWeightProgram = totalWeightNeedToLoseInGrams/secondWayLoseWeightPerDayInGrams;

        System.out.println("Нужно " + firstLoseWeightProgram + " дней чтобы похудеть, сбрасывая по 250 грамм в день");
        System.out.println("Нужно " + secondLoseWeightProgram + "дней чтобы похудеть, сбрасывая по 500 грамм в день");

        int daysNeedToLoseWeightInAverage = (firstLoseWeightProgram + secondLoseWeightProgram)/2;
        System.out.println("В среднем нужно " + daysNeedToLoseWeightInAverage + " дней чтобы похудеть");

        System.out.println("Задача№8");
        byte monthsInYear = 12;

        int mashaGetsAMonth = 67760;
        int tenPercentOfMashaSalary = mashaGetsAMonth / 10;
        int mashaIncreasedSalary = mashaGetsAMonth + tenPercentOfMashaSalary;
        int mashaDifferenceInAnnualSalaries = mashaIncreasedSalary * monthsInYear - mashaGetsAMonth * monthsInYear;


        int denisGetsAMonth = 83690;
        int tenPercentOfDenisSalary = denisGetsAMonth / 10;
        int denisIncreasedSalary = denisGetsAMonth + tenPercentOfDenisSalary;
        int denisDifferenceInAnnualSalaries = denisIncreasedSalary * monthsInYear - denisGetsAMonth * monthsInYear;


        int kristinaGetsAMonth = 76230;
        int tenPercentOfKristinaSalary = kristinaGetsAMonth / 10;
        int kristinaIncreasedSalary = kristinaGetsAMonth + tenPercentOfKristinaSalary;
        int kristinaDifferenceInAnnualSalaries = kristinaIncreasedSalary * monthsInYear - kristinaGetsAMonth * monthsInYear;

        System.out.println("Маша теперь получает " + mashaIncreasedSalary + " рублей в месяц. Годовой доход вырос на " + mashaDifferenceInAnnualSalaries + " рублей.");
        System.out.println("Денис теперь получает " + denisIncreasedSalary + " рублей в месяц. Годовой доход вырос на " + denisDifferenceInAnnualSalaries + " рублей");
        System.out.println("Кристина теперь получает " + kristinaIncreasedSalary + " рублей в месяц. Годовой доход вырос на " + kristinaDifferenceInAnnualSalaries + " рублей");










    }
}