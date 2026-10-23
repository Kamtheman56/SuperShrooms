package com.kamth.supershrooms.effect;

import com.kamth.supershrooms.SuperShrooms;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEffects {

    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, SuperShrooms.MODID);

    public static final DeferredHolder<MobEffect, MobEffect> SUPER_EFFECT = MOB_EFFECTS.register("super",
            () -> new SuperEffect(MobEffectCategory.BENEFICIAL, 0000)
                    .addAttributeModifier(Attributes.SCALE,
                            ResourceLocation.fromNamespaceAndPath(SuperShrooms.MODID,"super"), 1,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(Attributes.BLOCK_INTERACTION_RANGE,
                            ResourceLocation.fromNamespaceAndPath(SuperShrooms.MODID,"super"), 4,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(Attributes.STEP_HEIGHT,
                            ResourceLocation.fromNamespaceAndPath(SuperShrooms.MODID,"super"), 1,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(Attributes.ENTITY_INTERACTION_RANGE,
                            ResourceLocation.fromNamespaceAndPath(SuperShrooms.MODID,"super"), 4,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(Attributes.SAFE_FALL_DISTANCE,
                            ResourceLocation.fromNamespaceAndPath(SuperShrooms.MODID,"super"), 6,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(Attributes.ATTACK_DAMAGE,
                            ResourceLocation.fromNamespaceAndPath(SuperShrooms.MODID,"super"), 4,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
    );
    public static final DeferredHolder<MobEffect, MobEffect> MINI_EFFECT = MOB_EFFECTS.register("mini",
            () -> new SuperEffect(MobEffectCategory.BENEFICIAL, 0000)
                    .addAttributeModifier(Attributes.SCALE,
                            ResourceLocation.fromNamespaceAndPath(SuperShrooms.MODID,"mini"), -0.65,
                            AttributeModifier.Operation.ADD_VALUE)
                    .addAttributeModifier(Attributes.GRAVITY,
                            ResourceLocation.fromNamespaceAndPath(SuperShrooms.MODID,"mini"), -.05,
                            AttributeModifier.Operation.ADD_VALUE)
                    .addAttributeModifier(Attributes.MOVEMENT_SPEED,
                            ResourceLocation.fromNamespaceAndPath(SuperShrooms.MODID,"mini"), 1.2,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(Attributes.SAFE_FALL_DISTANCE,
                            ResourceLocation.fromNamespaceAndPath(SuperShrooms.MODID,"mini"), 12,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)

    );
    public static final DeferredHolder<MobEffect, MobEffect> MEGA_EFFECT = MOB_EFFECTS.register("mega",
            () -> new SuperEffect(MobEffectCategory.BENEFICIAL, 0000)
                    .addAttributeModifier(Attributes.SCALE,
                            ResourceLocation.fromNamespaceAndPath(SuperShrooms.MODID,"mega"), 1.8,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(Attributes.BLOCK_INTERACTION_RANGE,
                            ResourceLocation.fromNamespaceAndPath(SuperShrooms.MODID,"mega"), 8,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(Attributes.STEP_HEIGHT,
                            ResourceLocation.fromNamespaceAndPath(SuperShrooms.MODID,"mega"), 2,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(Attributes.ENTITY_INTERACTION_RANGE,
                            ResourceLocation.fromNamespaceAndPath(SuperShrooms.MODID,"mega"), 8,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(Attributes.SAFE_FALL_DISTANCE,
                            ResourceLocation.fromNamespaceAndPath(SuperShrooms.MODID,"mega"), 10,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(Attributes.ATTACK_DAMAGE,
                            ResourceLocation.fromNamespaceAndPath(SuperShrooms.MODID,"mega"), 6,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(Attributes.ATTACK_KNOCKBACK,
                            ResourceLocation.fromNamespaceAndPath(SuperShrooms.MODID,"mega"), 4,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(Attributes.JUMP_STRENGTH,
                            ResourceLocation.fromNamespaceAndPath(SuperShrooms.MODID,"mega"), 1.2,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
    );

    public static void register (IEventBus eventBus){
        MOB_EFFECTS.register(eventBus);
    }

}
