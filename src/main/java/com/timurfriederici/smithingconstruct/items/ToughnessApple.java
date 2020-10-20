package com.timurfriederici.smithingconstruct.items;

import com.timurfriederici.smithingconstruct.SmithingConstruct;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ToughnessApple extends Item {
    public ToughnessApple() {
        super(new Item.Properties().group(SmithingConstruct.TAB)

                .food(new Food.Builder()
                        .effect(()->new EffectInstance(Effects.ABSORPTION, 3200, 1), 1.0f)
                        .effect(()->new EffectInstance(Effects.RESISTANCE, 3200, 1), 1.0f)
                        .effect(()->new EffectInstance(Effects.REGENERATION, 3200, 1), 1.0f)
                        .effect(()->new EffectInstance(Effects.FIRE_RESISTANCE, 3200, 1), 1.0f)
                        .effect(()->new EffectInstance(Effects.WEAKNESS, 6400, 1), 0.3f)
                        .hunger(5)
                        .saturation(10)
                        .setAlwaysEdible()
                        .build()
                )

        );
    }
}
