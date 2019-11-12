package creationalPatterns.objectPool;

import java.util.ArrayList;

public class DeliveryManPool {

    //TODO: set the max quantity of created objects
    
    private static DeliveryManPool deliveryManPool;
    
    public static DeliveryManPool getIntance() {
        if(deliveryManPool == null) {
            deliveryManPool = new DeliveryManPool();
        }
        return deliveryManPool;
    }
    
    private ArrayList<DeliveryMan> deliveryManReusables; 
    private int poolSize;
    
    private DeliveryManPool() {
        deliveryManReusables = new ArrayList();
        poolSize = 5;
    }
    
    public DeliveryMan acquireDeliveryMan() {
        if(deliveryManReusables.isEmpty() && poolSize > 0) {
            poolSize--;
            DeliveryMan deliveryMan = new DeliveryMan();
            deliveryManReusables.add(deliveryMan);
        }
        if(!deliveryManReusables.isEmpty()) {
            return deliveryManReusables.remove(0);
        }
        return null;
    }
    
    public void releaseDeliveryMan(DeliveryMan deliveryMan) {
        deliveryManReusables.add(deliveryMan);
    }
    
}
