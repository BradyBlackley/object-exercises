public class Balloon {

    private String color;
    private double psi;

    public Balloon(String color){
        this.color = color;
        this.psi = 0.0;
    }

    public void inflate(){
        this.psi = this.psi + Math.random() * 5.0;
    }

    public boolean isExploded(){
        return this.psi > 16.0;
    }

    public String getColor(){
        return this.color;
    }

    public double getPsi(){
        if(this.psi > 16.0){
            return Double.POSITIVE_INFINITY;
        } else {
            return this.psi;
        }
    }

}
