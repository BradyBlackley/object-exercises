public class Exercise15 {

    // 1. Create a new method in the Hero class.
    // Name: toLine
    // Inputs: none
    // Output: String
    // Description: returns the Hero's name and powers as a single line of text.

    public static void main(String[] args) {

        // 2. Instantiate your three favorite super heroes with appropriate powers.
        // 3. Use the `toLine` method to print each hero's details to the console.
        Hero superMan = new Hero("Superman", new Power[]{new Power("flight"),
                new Power("xray vision"), new Power("super strength")});
        Hero batMan = new Hero("Batman", new Power[]{new Power("very rich"), new Power("martial arts")});
        Hero wonderWoman = new Hero("Wonderwoman", new Power[]{new Power("flight"), new Power("super strength")});


        System.out.println(superMan.toLine());
        System.out.println(batMan.toLine());
        System.out.println(wonderWoman.toLine());
    }
}
