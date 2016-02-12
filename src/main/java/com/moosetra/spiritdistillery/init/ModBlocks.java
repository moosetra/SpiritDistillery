package com.moosetra.spiritdistillery.init;

import com.moosetra.spiritdistillery.block.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class ModBlocks
{
    public static final BlockSD TarBlock = new BlockTarBlock();
    public static final BlockSD CarboniteBomb = new BlockCarboniteBomb();
    public static final BlockSD CarboniteOre = new BlockCarboniteOre();
    public static final BlockSD RedMapleLeaf = new BlockRedMapleLeaf();
    public static final BlockSD RedMapleLog = new BlockRedMapleLog();
    public static final BlockSD Tarmac = new BlockTarmac();

    public static void init()
    {
        GameRegistry.registerBlock(TarBlock, "tarBlock");
        GameRegistry.registerBlock(CarboniteBomb,"carboniteBomb");
        GameRegistry.registerBlock(CarboniteOre,"carboniteOre");
        GameRegistry.registerBlock(RedMapleLeaf,"redMapleLeaf");
        GameRegistry.registerBlock(RedMapleLog,"redMapleLog");
        GameRegistry.registerBlock(Tarmac,"tarmac");

    }
}
