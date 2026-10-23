package com.kamth.supershrooms.item;

import com.kamth.supershrooms.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties SHROOM = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f).alwaysEdible()
            .effect(() -> new MobEffectInstance(ModEffects.SUPER_EFFECT, 800), 1f).build();

    public static final FoodProperties MINI = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f).alwaysEdible()
            .effect(() -> new MobEffectInstance(ModEffects.MINI_EFFECT, 800), 1f).build();

    public static final FoodProperties MEGA = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f).alwaysEdible()
            .effect(() -> new MobEffectInstance(ModEffects.MEGA_EFFECT, 800), 1f).build();

}
