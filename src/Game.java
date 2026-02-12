import java.util.Random;
import java.util.Scanner;


public class Game {
    Scanner scanner = new Scanner(System.in);

public Game(){
    Random random = new Random();
    boolean randomMonster = random.nextBoolean();




    if (randomMonster) {
        System.out.println("There's a monster. Fight 'f' or Run 'r':");

        while(true) {
            String command = scanner.nextLine();
            if (command.equals("f")) {
                System.out.println("Fighting the monster");
                break;
            }else if (command.equals("r")) {
                System.out.println("Running away");
                break;
            } else {
                System.out.println("Choose 'f' or 'r'");
            }

        }

    }




}





}
