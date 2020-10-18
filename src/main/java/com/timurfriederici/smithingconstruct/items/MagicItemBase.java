package com.timurfriederici.smithingconstruct.items;

import com.timurfriederici.smithingconstruct.SmithingConstruct;
import net.minecraft.item.Item;

public class MagicItemBase extends Item {
    public MagicItemBase() {
        super(new Item.Properties().group(SmithingConstruct.TAB)

                .maxStackSize(1)

        );
    }
}
