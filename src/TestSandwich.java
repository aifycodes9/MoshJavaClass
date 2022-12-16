import java.util.Scanner;

public class TestSandwich {
    public static void main(String[] args) {
        Sandwich first = new Sandwich();

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("enter the main ingredient: ");
        first.mainIngredient = keyboardInput.nextLine();

        System.out.print("enter the bread type: ");
        first.breadType = keyboardInput.nextLine();

        System.out.print("enter the price: ");
        first.price = keyboardInput.nextDouble();
        keyboardInput.nextLine();


        System.out.println();
        System.out.println("Our Sandwich: ");
        System.out.println("==================");
        System.out.println("Main Ingredient: " + first.mainIngredient);
        System.out.println("Bread Type: " + first.breadType) ;
        System.out.println("Price: $" + first.price);


    }
}
