package com.kiranhart.chickennuggets.init;

import com.kiranhart.chickennuggets.ChickenNuggets;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

/**
 * The current file has been created by Kiran Hart
 * Date Created: 7/23/2020
 * Time Created: 10:06 PM
 * Usage of any code found within this class is prohibited unless given explicit permission otherwise.
 */

@Mod.EventBusSubscriber(modid = ChickenNuggets.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(ChickenNuggets.MOD_ID)
public class ItemInit {

    public static final Item raw_chicken_nugget = null;
    public static final Item cooked_chicken_nugget = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {

        // nuggets
        event.getRegistry().register(new Item(new Item.Properties()
                .maxStackSize(16)
                .group(ItemGroup.FOOD)
                .food(new Food.Builder().setAlwaysEdible().meat().hunger(2).saturation(1).effect(new EffectInstance(Effects.HUNGER, 20 * 30, 1), 0.5F).build()))
                .setRegistryName("raw_chicken_nugget"));

        event.getRegistry().register(new Item(new Item.Properties()
                .maxStackSize(16)
                .group(ItemGroup.FOOD)
                .food(new Food.Builder().setAlwaysEdible().meat().hunger(6).saturation(4).build()))
                .setRegistryName("cooked_chicken_nugget"));
    }
}
