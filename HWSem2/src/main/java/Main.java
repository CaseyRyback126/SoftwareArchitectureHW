import CreatorAndProduct.ItemFabric;
import Rewards.GemGenerator;
import Rewards.GoldGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
      /*  IPack.ItemFabric generator = new Rewards.GoldGenerator();
        generator.openReward();
        generator = new Rewards.GoldGenerator();
        generator.openReward();
       */

        ItemFabric generator = new GoldGenerator();
        generator.openReward();
        generator = new GemGenerator();
        generator.openReward();
        System.out.println();

        Random rnd = ThreadLocalRandom.current();
        List<ItemFabric> fabricList = new ArrayList<>();

        fabricList.add(new GoldGenerator());
        fabricList.add(new GemGenerator());

        for(int i =0; i<20; i++)
        {
            int index = Math.abs(rnd.nextInt()%2)==0?0:1;
            ItemFabric fabric = fabricList.get(index);
            fabric.openReward();
        }

    }
}
/*
    // IPack.ItemFabric generator = new Rewards.GoldGenerator();
    // generator.openReward();
    // generator = new Rewards.GemGenerator();
    // generator.openReward();
    // System.out.println();

    Random rnd = ThreadLocalRandom.current();
    List<IPack.ItemFabric> fabricList = new ArrayList<>();

        fabricList.add(new Rewards.GoldGenerator());
        fabricList.add(new Rewards.GemGenerator());

        for(int i =0; i<20; i++)
        {
        int index = Math.abs(rnd.nextInt()%2)==0?0:1;
        IPack.ItemFabric fabric = fabricList.get(index);
        fabric.openReward();
        }
*/
/*
 * abstract class IPack.ItemFabric
 *   openReward
 *   createItem
 * interface iGameItem
 *   open
 *gold
 *gem
 *
 * */