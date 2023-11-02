public class Army {


    public static void main(String[] args) {

        int armyLannister = 147483648;
        System.out.println("Пехота Ланнистеров насчитывает: " + armyLannister + " единиц");

        int armySaruman = 1147483848;
        System.out.println("Пехота Сарумана насчитывает: " + armySaruman + " единиц");

        int sumOfArmies = (armyLannister + armySaruman);
        System.out.println("Общее число войск: " + sumOfArmies + " единиц");
    }
}
