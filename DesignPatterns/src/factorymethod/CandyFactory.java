package factorymethod;

public class CandyFactory extends Factory {

    @Override
    public Candy create(CandyType type) {
        
        switch(type) {
            case Lollipop:
                return new Lollipop();
            case Bubblegum:
                return new Bubblegum();
            default:
                return null;
        }
         
    }
    
}
