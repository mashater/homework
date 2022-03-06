package homeworkMass1;

public class mainMass1 { // массив из чет. чисел от 2 до 20- вывести элементы в строку через пробел, потом в столбик
    public static void main (String[] args) {
        int mass [] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        //int mass [] = {2, 0, 0, 0, 0, 0, 0, 0, 0, 20};

        //for(int i = 1; i< mass.length-1; i++){
           //mass[i]= mass [i-1]+2;
            //System.out.println(mass[i]);

        for(int i = 0; i<mass.length; i++) {
            System.out.println(mass[i]);

            }
        for(int i = 0; i<mass.length; i++) {
            System.out.print(mass[i]+ " ");
        }

        }}





