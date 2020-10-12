package com.timurfriederici.smithingconstruct.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MagicalBurntStoneBrick extends Block {
    public MagicalBurntStoneBrick() {
        super(Properties.create(Material.ROCK)
            .hardnessAndResistance(7.0f, 10.0f)
            .sound(SoundType.STONE)
            .harvestLevel(3)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
        );
    }
}
