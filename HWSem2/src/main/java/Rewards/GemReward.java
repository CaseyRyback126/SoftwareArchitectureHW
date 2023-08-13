package Rewards;

import CreatorAndProduct.IGameItem;

public class GemReward implements IGameItem {
    @Override
    public void open() {
        System.out.println("Gem");
    }
}
