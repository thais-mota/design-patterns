package creationalPatterns.objectPool;

import java.util.ArrayList;

public class DeliveryManPool {

    //TODO: set the max quantity of created objects
    
    static DeliveryManPool deliveryManPool;
    
    public static DeliveryManPool getIntance() {
        if(deliveryManPool == null) {
            deliveryManPool = new DeliveryManPool();
        }
        return deliveryManPool;
    }
    
    private ArrayList<DeliveryMan> deliveryManReusables; 
    
    private DeliveryManPool() {
        deliveryManReusables = new ArrayList();
    }
    
    public DeliveryMan acquireDeliveryMan() {
        if(deliveryManReusables.isEmpty()) {
            DeliveryMan deliveryMan = new DeliveryMan();
            deliveryManReusables.add(deliveryMan);
        }
        return deliveryManReusables.remove(0);
    }
    
    public void releaseDeliveryMan(DeliveryMan deliveryMan) {
        deliveryManReusables.add(deliveryMan);
    }
    
}
