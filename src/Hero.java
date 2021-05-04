public class Hero {

    private final String name;
    private final Power[] powers;

    public Hero(String name, Power[] powers){
        this.name = name;
        this.powers = powers;
    }

    public String getName() {
        return name;
    }

    public Power[] getPowers() {
        return powers;
    }

    public String toLine(){

        String str = "";
        str += this.getName();
        str += ": ";

        String delimiter = "";
        for(Power p : this.getPowers()){

            str += p.getName();
            delimiter = " ";
            str += delimiter;
        }
        str += "\n";
        return str;
    }
}
