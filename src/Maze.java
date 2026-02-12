import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// Move within the maze

public class Maze {
    private static int location;
    private static List<String> scenes = new ArrayList<>();
//    private static String[] array;
    public static boolean keyFound = false;


public Maze() throws IOException {
    location = 0;
    loadScenes();
    currentScene();
    getCommand();



}

static void loadScenes() throws IOException {

    // load data from file
    BufferedReader bf = new BufferedReader(
            new FileReader("src/language.txt"));

    // read entire line as string
    String line = bf.readLine();


    // checking for end of file
    while (line != null) {
        scenes.add(line);
        line = bf.readLine();
    }

    // closing bufferreader object
    bf.close();


    // storing the data in arraylist to array
    String[] array
            = scenes.toArray(new String[0]);




}









 static void currentScene(){
    while(true){
        System.out.println(scenes.get(location));
        System.out.println("> ");

//        System.out.println("You are at location:" + (location + 1 ));

        String command = getCommand();
        if (command.equals("n")) {
            if(location < scenes.size() - 1) {
                location++;
                new Game(); // I wasn't sure if the random monster boolean was working, got the idea of calling the game method (which contains monster) after entering "n" from AI.

            } else {
                System.out.println("You can't keep going to the north");


            }

            } else if (command.equals("s")) {
            if (location > 0) {
                location--;

            } else {
                System.out.println("You can't keep going to the south");


            }







    }
        // Finding key in  scene 4
        if (location == 3) {
            keyFound = true;
            System.out.println("You have found the key! ");
        }

        else if (location == 4) {
            System.out.println("You have won! ");
            break;
        }



    }



}



static String getCommand(){
    Scanner scanner = new Scanner(System.in);
    String command = scanner.nextLine();

    return command;
}




}

