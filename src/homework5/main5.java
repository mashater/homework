package homework5;

public class main5 {
    public static void main (String[] args) { //Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
                 // сколько амеб будет через 3, 6, 9, 12,..., 24 часа
        int kletki = 1;
        int time;
        for (time = 3; time <= 24; time = time + 3) {
            kletki = kletki * 2;
            System.out.println(time +" " + kletki );
        }
    }
}
