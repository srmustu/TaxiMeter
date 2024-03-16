import java.util.Scanner;
public class TaxiMeter {
    public static void main(String[] args) {
        /* bu program
        -  
         */

        Scanner number = new Scanner(System.in);

        double startFee,fee,minPrice,totalPrice,pathLenght,price,protectedPrice;
        String message1,message2,message3,message4,message5;
        message1 = "Welcome to taximetre. Please enter the desired values for the calculation" ;
        System.out.println(message1);
        message2 = "Starting fee and minimum amount : ";
        System.out.print(message2);
        startFee = number.nextDouble();

        message3 = "Km traveled : ";
        System.out.print(message3);
        pathLenght = number.nextDouble();

        message4 = "Fee per kilometer : ";
        System.out.print(message4);
        price = number.nextDouble();

        message5 = "Total price : ";
        totalPrice = (price * pathLenght) + startFee;
        minPrice = 20;
        protectedPrice = (totalPrice < 20) ? minPrice : totalPrice;

        System.out.println(message5 + protectedPrice);

    }
}
