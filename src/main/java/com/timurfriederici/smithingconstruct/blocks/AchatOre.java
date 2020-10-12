package com.timurfriederici.smithingconstruct.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class AchatOre extends Block {
    public AchatOre() {
        super(Properties.create(Material.ROCK)
            .hardnessAndResistance(4.0f, 4.0f)
            .sound(SoundType.STONE)
            .harvestLevel(3)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
        );
    }
}
