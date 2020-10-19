package com.timurfriederici.smithingconstruct.util;

import com.timurfriederici.smithingconstruct.SmithingConstruct;
import com.timurfriederici.smithingconstruct.blocks.*;
import com.timurfriederici.smithingconstruct.items.ItemBase;
import com.timurfriederici.smithingconstruct.items.MagicItemBase;
import com.timurfriederici.smithingconstruct.tools.SmithingItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SmithingConstruct.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SmithingConstruct.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    //Gems
    public static final RegistryObject<Item> ACHAT_GEM = ITEMS.register("achat_gem", ItemBase::new);
    public static final RegistryObject<Item> OBSIDIAN_SCRAPS = ITEMS.register("obsidian_scrap", ItemBase::new);

    //Ingots
    public static final RegistryObject<Item> BURNT_BRICK = ITEMS.register("burnt_brick", ItemBase::new);
    public static final RegistryObject<Item> OBSIDIAN_INGOT = ITEMS.register("obsidian_ingot", ItemBase::new);

    //Items
    public static final RegistryObject<Item> MAGICAL_NETHERITE_RING = ITEMS.register("magical_netherite_ring", MagicItemBase::new);
    public static final RegistryObject<Item> MAGICAL_DIAMOND_RING = ITEMS.register("magical_diamond_ring", MagicItemBase::new);
    public static final RegistryObject<Item> MAGICAL_GOLD_RING = ITEMS.register("magical_gold_ring", MagicItemBase::new);
    public static final RegistryObject<Item> MAGICAL_IRON_RING = ITEMS.register("magical_iron_ring", MagicItemBase::new);
    public static final RegistryObject<Item> MAGICAL_BURNT_BRICK_RING = ITEMS.register("magical_burnt_brick_ring", MagicItemBase::new);

    //Tools
    public static RegistryObject<SwordItem> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword",           ()-> new SwordItem  (SmithingItemTier.OBSIDIAN, 2, -2.8f, new Item.Properties().group(SmithingConstruct.TAB)));
    public static RegistryObject<AxeItem> OBSIDIAN_AXE = ITEMS.register("obsidian_axe",                 ()-> new AxeItem    (SmithingItemTier.OBSIDIAN, 3, -2.8f, new Item.Properties().group(SmithingConstruct.TAB)));
    public static RegistryObject<PickaxeItem> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe",     ()-> new PickaxeItem(SmithingItemTier.OBSIDIAN, 1, -2.6f, new Item.Properties().group(SmithingConstruct.TAB)));
    public static RegistryObject<ShovelItem> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel",        ()-> new ShovelItem (SmithingItemTier.OBSIDIAN, 1, -2.2f, new Item.Properties().group(SmithingConstruct.TAB)));
    public static RegistryObject<HoeItem> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe",                 ()-> new HoeItem    (SmithingItemTier.OBSIDIAN, 0, -2.2f, new Item.Properties().group(SmithingConstruct.TAB)));

    //Food


    //Blocks
    public static final RegistryObject<Block> BURNT_STONE_BRICK_BLOCK = BLOCKS.register("burnt_stone_brick_block", BurntStoneBrick::new);
    public static final RegistryObject<Block> BURNT_STONE_BLOCK = BLOCKS.register("burnt_stone_block", BurntStone::new);
    public static final RegistryObject<Block> BURNT_COBBLESTONE_BLOCK = BLOCKS.register("burnt_cobblestone_block", BurntCobblestone::new);
    public static final RegistryObject<Block> MAGICAL_BURNT_STONE_BRICK_BLOCK = BLOCKS.register("magical_burnt_stone_brick_block", MagicalBurntStoneBrick::new);
    public static final RegistryObject<Block> MORTAR_BLOCK = BLOCKS.register("mortar_block", Mortar::new);
    public static final RegistryObject<Block> ACHAT_ORE_BLOCK = BLOCKS.register("achat_ore_block", AchatOre::new);

    //Blockitems
    public static final RegistryObject<Item> BURNT_STONE_BRICK_BLOCK_ITEM = ITEMS.register("burnt_stone_brick_block", () -> new BlockItemBase(BURNT_STONE_BRICK_BLOCK.get()));
    public static final RegistryObject<Item> BURNT_STONE_BLOCK_ITEM = ITEMS.register("burnt_stone_block", () -> new BlockItemBase(BURNT_STONE_BLOCK.get()));
    public static final RegistryObject<Item> BURNT_COBBLESTONE_BLOCK_ITEM = ITEMS.register("burnt_cobblestone_block", () -> new BlockItemBase(BURNT_COBBLESTONE_BLOCK.get()));
    public static final RegistryObject<Item> MAGICAL_BURNT_STONE_BRICK_BLOCK_ITEM = ITEMS.register("magical_burnt_stone_brick_block", () -> new BlockItemBase(MAGICAL_BURNT_STONE_BRICK_BLOCK.get()));
    public static final RegistryObject<Item> MORTAR_BLOCK_ITEM = ITEMS.register("mortar_block", () -> new BlockItemBase(MORTAR_BLOCK.get()));
    public static final RegistryObject<Item> ACHAT_ORE_BLOCK_ITEM = ITEMS.register("achat_ore_block", () -> new BlockItemBase(ACHAT_ORE_BLOCK.get()));

}
