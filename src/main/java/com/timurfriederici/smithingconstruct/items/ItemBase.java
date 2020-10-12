package com.timurfriederici.smithingconstruct.items;

import com.timurfriederici.smithingconstruct.SmithingConstruct;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(SmithingConstruct.TAB));
    }
}
