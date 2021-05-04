import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        Musician[] musicians = new Musician[5];
        musicians[0] = new Musician("Frank Ocean", 10);

        // 1. Use a loop to populate the `musicians` array with your top 5 favorite musicians.
        // (Replace Frank Ocean.)
        // Create musicians from user input. (See Exercise04.)
        System.out.print("Press enter to name and rate a musican, or type \"end\":");
        boolean end = false;
        String command = console.nextLine();
        int musicianCount = 0;

        do{
        if(command.equalsIgnoreCase("end")){
            end = true;
        } else {
            if(musicianCount == 5){
                break;
            }else {
                Musician m = new Musician();
                System.out.print("Musician name:");
                m.setName(console.nextLine());
                System.out.print("Musician rating:");
                int rating = Integer.parseInt(console.nextLine());
                m.setRating(rating);
                musicians[musicianCount] = m;
                musicianCount++;
            }
        }
    }while(!end);

        // 2. Use a second loop to print details about each musician.
        for (Musician musician : musicians) {
            System.out.println(musician.getName() + " " + musician.getRating());
        }
    }
}
