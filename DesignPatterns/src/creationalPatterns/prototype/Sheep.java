package creationalPatterns.prototype;

public class Sheep {

    String name;
    
    public Sheep clone() {
        Sheep sheep = new Sheep();
        sheep.name = name;
        return sheep;
    }
}
