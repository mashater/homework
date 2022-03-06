package homework2;

public class main2 {

    public static void main (String[] args) {
        double km = 10.;// 10 км в первый день
        double sumDistance = 10;
        double currentDist = 10;

        //km*= (100 + per)/100;


        for (int i = 1; i < 7; i++) {
            currentDist = currentDist * 1.1;
            sumDistance = sumDistance + currentDist;
        }
        System.out.println(sumDistance);
    }
}
