package homework3;

public class main3 {

    public static void main (String[] args) {
        int [] mas = {0,17,23,15,46}; // найти максимальное число и минимальное
        int max = 0; int min = 0;
        for(int i = 0;  i < mas.length; i++ ) {
            if  ( mas [i] > max ) {
                max = mas [i] ;

            }
            if (mas[i]< min) {
                min=mas [i];
            }
        } System.out.println(max); // вывести sout за for
    }
}
