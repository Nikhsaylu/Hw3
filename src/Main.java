public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte a = 1;
        short b = 333;
        int c = 33333;
        long d = 333333;
        double e = 2.3;
        System.out.println("Значение переменной с типом byte равно " + a);
        System.out.println("Значение переменной с типом short равно" + b);
        System.out.println("Значение переменной с типом int равно " +c);
        System.out.println("Значение переменной с типом long равно " + d );
        System.out.println("Значение переменной с типом double равно " + e);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println("1: float- " + a);
        System.out.println("2: long- " + b);
        System.out.println("3: double- " + c);
        System.out.println("4: short- " + d);
        System.out.println("5: short- " + e);
        System.out.println("6: short- " + f);
        System.out.println("7: byte- " + g);







    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        int total = lp + as + ea;
        short paper = 480;
        System.out.println("На каждого ученика расчитано " + paper / total + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte bottle = 16;
        byte min = 2;
        int bottleInMin = bottle / min;
        int twentyMin = bottleInMin * 20;
        System.out.println("За 20 минут машина произвела " + twentyMin + " бутылок");
        int hour = bottleInMin * 60;
        int day = hour * 24;
        System.out.println("За сутки машина произвела " + day + " бутылок");
        int threeDays = day * 3;
        System.out.println("За 3 дня машина произвела " + threeDays + " бутылок");
        int month = day * 30;
        System.out.println("За месяц машина произвела " + month + " бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte white = 2;
        byte brown = 4;
        int onclass = white + brown;
        byte totalPaint = 120;
        int totalClass = totalPaint / onclass;
        int whiteTotal = white * totalClass;
        int brownTotal = brown * totalClass;
        System.out.println(" В школе, где " + totalClass + " классов, нужно " + whiteTotal + " банок белой краски и " +brownTotal + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        byte bananas = 5;
        int bananasWeight = bananas * 80;
        byte milk = 105;
        int milkWeight = milk * 2;
        byte ice = 2;
        int iceWeight = ice * 100;
        byte egg = 4;
        int eggWeight= egg * 70;
        int breakfast = bananasWeight + milkWeight + iceWeight + eggWeight;
        System.out.println("Вес завтрака в граммах равен " + breakfast);
        int grPerKg = 1000;
        float breakfastKg = breakfast / (float)grPerKg;
        System.out.println("Вес завтрака в кг равен " + breakfastKg);


    }
    public static void task7() {
        System.out.println("Задача 7");
        byte weightLossKg = 7;
        int weightLossGr = weightLossKg * 1000;
        short lossDay = 250;
        int days = weightLossGr / lossDay;
        System.out.println("Спортсмену понадобится " + days + " дней, для сброса веса, если он будет сбрасывать по 250гр");
        short lossDaySecond = 500;
        int daysSecond = weightLossGr /lossDaySecond;
        System.out.println("Спортсмену понадобится " +daysSecond + " дней, если он будет сбрасывать по 500 гр");



    }
    public static void task8() {
        System.out.println("Задача 8");
        long masha = 67760;
        long denis = 83690;
        long kristina = 76230;
        byte add = 10;
        long mashaAdd = masha / 100 * add;
        long mashaAffter = masha + mashaAdd;
        System.out.println("С учетом повышения зп Маши" + mashaAffter);
        long denisAdd = denis / 100 *add;
        long denisAffter = denis + denisAdd;
        System.out.println("С учетом повышения зп Дениса " + denisAffter);
        long kristinaAdd = kristina / 100 * add;
        long kristinaAffter = kristina + kristinaAdd;
        System.out.println("С учетом повышения зп Кристины " +kristinaAffter);
        byte year = 12;
        long totalBefore = (masha + denis + kristina) * year;
        System.out.println("До увеличения зарплата за год у 3 была такова: " + totalBefore);
        long totalAffter = (mashaAffter + denisAffter +kristinaAffter) * year;
        System.out.println("После увеличения зп за год у 3 стала такой: " + totalAffter);




    }



}