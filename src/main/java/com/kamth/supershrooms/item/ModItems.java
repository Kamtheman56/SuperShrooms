package com.kamth.supershrooms.item;

import com.kamth.supershrooms.SuperShrooms;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.network.chat.Component;

import java.awt.*;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperShrooms.MODID);

    public static final DeferredItem<Item> SUPER_SHROOM = ITEMS.register("super_mushroom",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SHROOM)));

    public static final DeferredItem<Item> MINI_SHROOM = ITEMS.register("mini_mushroom",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MINI)));

    public static final DeferredItem<Item> MEGA_SHROOM = ITEMS.register("mega_mushroom",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MEGA)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
