package creationalPatterns.objectPool;

public class Main {
    public static void main(String[] args) {
        DeliveryManPool pool = DeliveryManPool.getIntance();
        
        DeliveryMan deliveryMan = pool.acquireDeliveryMan();
        pool.releaseDeliveryMan(deliveryMan);
    }
}
