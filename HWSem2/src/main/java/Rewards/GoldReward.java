package Rewards;

import CreatorAndProduct.IGameItem;

public class GoldReward implements IGameItem {
    @Override
    public void open() {
        System.out.println("Gold");
    }
}
