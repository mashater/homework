package homework1;

public class main1 {
    public static void main(String[] args) {
        int i = 10; // c помощью цикла while посчитать сумму четных элементов от 10 до 55
        int sum = 0;
        while (i<56){
            if (i%2 == 0){
                sum = sum +i; // вот это непонятно
            }
            i++;
        }
        System.out.println(sum);
    }

}

