import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String firstname;
        String favouriteFood;
        System.out.println("Please enter your age:");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter your name:");
        firstname = scanner.nextLine();
        System.out.println("Enter your favourite food:");
        favouriteFood = scanner.nextLine();
        String info = "First name: " + firstname + "\nAge: " + age + "\nFavourite Food: " + favouriteFood;
        System.out.println(info);



    }

}