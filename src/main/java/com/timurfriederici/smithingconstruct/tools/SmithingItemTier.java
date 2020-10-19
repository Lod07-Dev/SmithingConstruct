package com.timurfriederici.smithingconstruct.tools;

import com.timurfriederici.smithingconstruct.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

import java.util.function.Supplier;

public enum SmithingItemTier implements IItemTier {

    OBSIDIAN(3, 2000, 6.0f, 3, 15, ()->{
        return Ingredient.fromItems(Items.OBSIDIAN);
    });

    private final int harvestLevel;

    private final int maxUses;

    private final float efficiency;

    private final int attackDamage;

    private final int enchantability;

    private final Supplier<Ingredient> repairMaterial;

    SmithingItemTier(int harvestLevel, int maxUses, float efficiency, int attackDamage, int enchantability, Supplier<Ingredient> repairMaterial){

        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;

    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
