import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int birthMonth = 0;

        System.out.println("Please enter your birth month (1-12)");
        birthMonth = in.nextInt();
        if (1 <= birthMonth && birthMonth <= 12)
        {
            System.out.println("Your birth month is " + birthMonth);
        }
        else
        {
            System.out.println("You entered an incorrect month value: " +birthMonth);
        }
    }
}