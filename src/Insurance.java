import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int currentYear, birthyear;

        System.out.print("Enter current year: ");
        currentYear = keyboardInput.nextInt();

        System.out.print("Enter birth year: ");
        birthyear = keyboardInput.nextInt();

        double premiumAmount = displayPremiumAmount(currentYear, birthyear);

        System.out.println("Your are " + (currentYear - birthyear) + " years old. Your Premium is $" + premiumAmount);

    }

    public static double displayPremiumAmount(int currYear, int brthYear)
    {
        int age = currYear - brthYear;
        int decade = age / 10;
        double amt = (decade + 15 ) * 20;

        return amt;

    }
}
