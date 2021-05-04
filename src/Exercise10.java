import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        // BALLOON GAME
        Scanner console = new Scanner(System.in);

        // 1. Instantiate three balloons of different colors.
        Balloon red = new Balloon("Red");
        Balloon blue = new Balloon("Blue");
        Balloon green = new Balloon("Green");

        boolean stop = false;
        do {
            System.out.println("Inflate? [y/n]: ");
            if (console.nextLine().equalsIgnoreCase("y")) {
                // 2. If the user confirms an inflate, inflate each balloon.
                red.inflate();
                blue.inflate();
                green.inflate();
            }
            if(red.isExploded() || blue.isExploded() || green.isExploded()){
                stop = true;
            }
            // 3. When one or more balloons explode, stop the loop.
        } while (!stop);

        // 4. Print the color of the winners (balloons that exploded).
            if(red.isExploded()){
                System.out.println("Red exploded");
            } else if(blue.isExploded()){
                System.out.println("Blue exploded");
            } else if(green.isExploded()){
                System.out.println("Green exploded");
            } else {
                System.out.println("Nothing exploded");
            }
    }
}
