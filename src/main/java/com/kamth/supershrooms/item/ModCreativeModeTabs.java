package com.kamth.supershrooms.item;

import com.kamth.supershrooms.SuperShrooms;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SuperShrooms.MODID);


    public static final Supplier<CreativeModeTab> SUPER_SHROOMS_ITEMS_TAB = CREATIVE_MODE_TAB.register("super_shrooms_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SUPER_SHROOM.get()))
                    .title(Component.translatable("creativetab.supershrooms.shrooms_items"))
                    .displayItems((itemDisplayParamters, output) -> {
                     output.accept(ModItems.SUPER_SHROOM);
                     output.accept(ModItems.MINI_SHROOM);
                        output.accept(ModItems.MEGA_SHROOM);
                    }).build());

    public static void register (IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
