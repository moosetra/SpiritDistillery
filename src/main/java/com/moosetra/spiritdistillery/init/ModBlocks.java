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
    public static final BlockSD Cask = new BlockCask();
    public static final BlockSD AgingBarrel = new BlockAgingBarrel();
    public static final BlockSD CarboniteBlock = new BlockCarboniteBlock();
    public static final BlockSD CarboniteFrame = new BlockCarboniteFrame();
    public static final BlockSD CarboniteTank = new BlockCarboniteTank();
    public static final BlockSD RedMaplePlanks= new BlockRedMaplePlanks();
    public static final BlockSD Fermenter = new BlockFermenter();

    public static void init()
    {
        GameRegistry.registerBlock(TarBlock, "tarBlock");
        GameRegistry.registerBlock(CarboniteBomb,"carboniteBomb");
        GameRegistry.registerBlock(CarboniteOre,"carboniteOre");
        GameRegistry.registerBlock(RedMapleLeaf,"redMapleLeaf");
        GameRegistry.registerBlock(RedMapleLog,"redMapleLog");
        GameRegistry.registerBlock(Tarmac,"tarmac");
        GameRegistry.registerBlock(Cask,"cask");
        GameRegistry.registerBlock(AgingBarrel,"agingBarrel");
        GameRegistry.registerBlock(CarboniteBlock,"carboniteBlock");
        GameRegistry.registerBlock(CarboniteFrame,"carboniteFrame");
        GameRegistry.registerBlock(CarboniteTank,"carboniteTank");
        GameRegistry.registerBlock(RedMaplePlanks,"redMaplePlanks");
        GameRegistry.registerBlock(Fermenter,"fermenter");

    }
}
