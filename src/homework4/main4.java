package homework4;

public class main4 {

    public static void main (String[] args) {
        int a = 1; // вычислить 1+2+4..+256
        int sum = 0;
        while (a <= 256){
            sum= sum + a;
            a *= 2;
        }
        System.out.println(sum);
    }
}
