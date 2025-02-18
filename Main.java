import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the movie that you want to watch: ");
        String movie = scn.nextLine();
        System.out.print("The movie " + movie + " has how many ratings? ");
        int ratings = scn.nextInt();

        if(ratings >= 75000){
            System.out.println("Out of the world.");
        } else if (ratings <= 45000 & ratings >= 70000) {
            System.out.println("The best movie in the world.");
        } else if (ratings >= 25000){
            System.out.println("You better watch that movie.");
        } else if(ratings >= 5000){
            System.out.println("The movie is good.");
        } else {
            System.out.println("The movie has bad ratings. You can watch that but we suggest you not to.");
        }
    }
}
