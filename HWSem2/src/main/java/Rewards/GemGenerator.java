package Rewards;

import CreatorAndProduct.IGameItem;
import CreatorAndProduct.ItemFabric;

public class GemGenerator extends ItemFabric {
    @Override
    public IGameItem createItem() {
        System.out.println("Создал новый сундук");
        return new GemReward();
    }
}