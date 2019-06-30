package creationalPatterns.prototype;

import java.util.HashMap;

public class SheepCache {
    private HashMap<String, Sheep> map = new HashMap();
    
    public SheepCache() {
        Sheep sheep = new Sheep();
        sheep.name = "Dolly";
        RackaSheep rackaSheep = new RackaSheep();
        rackaSheep.name = "Maria";
        rackaSheep.gender = "female";
        
        map.put("sheep", sheep);
        map.put("rackaSheep", rackaSheep);
    }
    
    public Sheep getSheep(String type) {
        return map.get(type).clone();
    }
}
