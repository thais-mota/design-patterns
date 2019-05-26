package factorymethod;

public class Main {
    
    public static void main(String[] args) {
        Factory factory = new CandyFactory();
        
        Candy candy = factory.create(CandyType.Lollipop);
        candy.eat();
        
        Candy anotherCandy = factory.create(CandyType.Bubblegum);
        anotherCandy.eat();
    }
    
}
