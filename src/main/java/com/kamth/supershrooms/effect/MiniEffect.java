package com.kamth.supershrooms.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class MiniEffect extends MobEffect {
    protected MiniEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

 @Override
    public boolean applyEffectTick(LivingEntity livingEntity, int amplifier){

        return super.applyEffectTick(livingEntity, amplifier);
 }


}
