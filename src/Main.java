import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomNumber = new Random();
        System.out.println("Привіт! вгадай число від 0 до 10");
        int genarationNumbers;
        genarationNumbers = randomNumber.nextInt(10);

        while (true){
            System.out.println("Введіть число від 0 до 10: ");
            int number = scanner.nextInt();
            if ( genarationNumbers == number){
                System.out.println("Вгадали!!");
                break;
            } else if (genarationNumbers != number) {
                System.out.println("Не вгадали...Спробуйте ще раз");
                
            }


        }
        System.out.println("Гра закінчилась! ");


    }
}