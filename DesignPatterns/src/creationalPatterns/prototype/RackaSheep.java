package creationalPatterns.prototype;

public class RackaSheep extends Sheep {
    String gender;
    
    @Override
    public Sheep clone() {
        RackaSheep sheep = new RackaSheep();
        sheep.name = name;
        sheep.gender = gender;
        return sheep;
    }
}
