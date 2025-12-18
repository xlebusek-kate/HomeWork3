//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задание номер 1
        byte car = 3;
        short number = 22443;
        int iq = 120;
        long telephone = 7999696969L;
        float weight = 111.1f;
        double ip = 123.123456789;
        System.out.println(" Значение переменной car  с типом byte равно " + car);
        System.out.println(" Значение переменной number  с типом short  равно " + number);
        System.out.println(" Значение переменной IQ  с типом int равно " + iq);
        System.out.println(" Значение переменной telephone  с типом long равно " + telephone);
        System.out.println(" Значение переменной weight  с типом float  равно " + weight);
        System.out.println(" Значение переменной ip  с типом double равно " + ip);
        // Задание номер 2
        float second = 27.12f;
        long gps = 987678965549L;
        float hours = 2.786f;
        short house = 569;
        short flat = -159;
        short numberCode = 27897;
        byte carDodge = 67;
        // Задание номер 3
        byte children1 = 23;
        byte children2 = 27;
        byte children3 = 30;
        int allChildren = children1 + children2 + children3;
        short mass = 480;
        int retern3 = mass / allChildren;
        System.out.println(" На каждого ученика расчитано " + retern3 + " листов бумаги ");
        // Задание номер 4
        byte speed = 8; // за одну минуту
        int min20= speed * 20;
        int day = speed * 60 * 24;
        int day3 = speed * 60 * 24 * 3;
        int month = speed * 60 * 24 * 30;
        System.out.println(" За 20 минут машина произвела "+  min20 + " штук бутылок ");
        System.out.println(" За сутки машина произвела "+  day + " штук бутылок ");
        System.out.println(" За 3 дня машина произвела "+  day3 + " штук бутылок ");
        System.out.println(" За месяц машина произвела "+ month  + " штук бутылок ");
        // Задание номер 5
        int allBox = 120;
        byte white = 2;
        byte brown = 4;
        int classInSсhool = allBox / (white + brown);
        int classWhite = classInSсhool * white;
        int classBrown = classInSсhool * brown;
        System.out.println("В школе, где " + classInSсhool  + "классов, нужно "+ classWhite +" белой краски и" + classBrown + " коричневой краски");
        // Задание номер 6
        byte oneBanana= 80;
        byte milk100= 105;
        byte iceCream1= 100;
        byte egg = 70;
        byte Banana= 5;
        short milk = 200;
        byte icecream = 2;
        byte eggs = 4;
        int grams =oneBanana * Banana *  milk * milk100 * iceCream1 * icecream * egg * eggs;
        float kilograms =  grams / 1000f;
        System.out.println(" Вес в килограммах " + kilograms);
        System.out.println(" Вес в граммах " + grams);
        // Задание номер 7
        byte startWeight = 7;
        int allWeight = startWeight * 1000;
        short grams250 = 250;
        short grams500 = 500;
        int resultGrams250 = allWeight / grams250;
        int resultGrams500 = allWeight / grams500;
        int reternAll = (resultGrams250+resultGrams500) / 2;
        System.out.println(" Если по 250 грамм, то " + resultGrams250 + " дней");
        System.out.println(" Если по 500 грамм, то " + resultGrams500 + " дней");
        System.out.println(" В среднем " + reternAll + " дней ");
        // Задание номер 8
        int m1 = 67760;
        int d1 = 83690;
        int k1 = 76230;
        float m2 = m1 * 1.1f;
        float d2 = d1 * 1.1f;
        float k2 = k1 * 1.1f;
        int m3 = (int)m2;
        int d3 = (int)d2;
        int k3 = (int)k2;
        int incomeМ = (m3-m1) * 12;
        int incomeD = (d3-d1) * 12;
        int incomeK = (k3-k1) * 12;
        System.out.println(" Маша теперь получает "+m3+ " рублей. Годовой доход вырос на "+incomeМ+ " рублей. ");
        System.out.println(" Денис теперь получает "+d3+ " рублей. Годовой доход вырос на "+incomeD+ " рублей. ");
        System.out.println(" Кристина теперь получает "+k3+ " рублей. Годовой доход вырос на "+incomeK+ " рублей. ");
    }}