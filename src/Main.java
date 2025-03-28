import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        class YoungerClassException extends RuntimeException  {
            YoungerClassException(String msg){
                super(msg);
            }
        }
        class NameClassException extends RuntimeException  {
            NameClassException(String msg){
                super(msg);
            }
        }


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name =sc.nextLine();
        System.out.print("Enter Your Age : ");
        int yourAge = sc.nextInt();

        try {
            try {
                if (name.length() <= 3){
                    throw new NameClassException("Enter Name Proper name length is minimum 4");
                }
                if (yourAge < 18){
                    throw new YoungerClassException("Your not Eligible for Votting..");
                }
                else {
                    System.out.println("You are Eligible..for Vote");
                }
            } catch (YoungerClassException y) {
                System.out.println(y);
            } catch (NameClassException n) {
                System.out.println(n);
            }
        } finally {
            System.out.println("Votting time is close");
        }
    }
}