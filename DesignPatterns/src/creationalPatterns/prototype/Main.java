package creationalPatterns.prototype;

public class Main {
    public static void main(String[] args) {
        SheepCache cache = new SheepCache();
        
        Sheep sheep = cache.getSheep("sheep");
        Sheep rackaSheep = cache.getSheep("rackaSheep");
    }
}
