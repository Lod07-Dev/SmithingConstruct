package com.timurfriederici.smithingconstruct.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Mortar extends Block {
    public Mortar() {
        super(Properties.create(Material.SAND)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.SAND)
            .harvestLevel(1)
            .harvestTool(ToolType.SHOVEL)
            .setRequiresTool()
        );
    }
}
