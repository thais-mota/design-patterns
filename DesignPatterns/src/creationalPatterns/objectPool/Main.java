package creationalPatterns.objectPool;

public class Main {
    public static void main(String[] args) {
        DeliveryManPool pool = DeliveryManPool.getIntance();
        
        DeliveryMan deliveryMan = pool.acquireDeliveryMan();
        DeliveryMan deliveryMan2 = pool.acquireDeliveryMan();
        DeliveryMan deliveryMan3 = pool.acquireDeliveryMan();
        DeliveryMan deliveryMan4 = pool.acquireDeliveryMan();
        DeliveryMan deliveryMan5 = pool.acquireDeliveryMan();
        DeliveryMan deliveryMan6 = pool.acquireDeliveryMan();
        pool.releaseDeliveryMan(deliveryMan);
        pool.releaseDeliveryMan(deliveryMan);
        pool.releaseDeliveryMan(deliveryMan3);
        pool.releaseDeliveryMan(deliveryMan4);
        pool.releaseDeliveryMan(deliveryMan5);
        pool.releaseDeliveryMan(deliveryMan6);
    }
}
