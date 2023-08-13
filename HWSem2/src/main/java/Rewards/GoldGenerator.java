package Rewards;


import CreatorAndProduct.IGameItem;
import CreatorAndProduct.ItemFabric;

public class GoldGenerator extends ItemFabric {
    @Override
    public IGameItem createItem() {
        System.out.println("Создал новый сундук");
        return new GoldReward();
    }
}
