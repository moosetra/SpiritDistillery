package com.moosetra.spiritdistillery.init;

import com.moosetra.spiritdistillery.block.*;
import com.moosetra.spiritdistillery.reference.Names;
import com.moosetra.spiritdistillery.tileentity.TileEntitySD;
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
    public static final BlockSD Barrel = new BlockBarrel();
    public static final BlockSD Grinder = new BlockGrinder();
    public static final BlockSD Bottler = new BlockBottler();
    public static final BlockSD Hearth = new BlockHearth();

    public static void init()
    {
        GameRegistry.registerBlock(TarBlock, Names.Blocks.BlockTarBlock);
        GameRegistry.registerBlock(CarboniteBomb,Names.Blocks.BlockCarboniteBomb);
        GameRegistry.registerBlock(CarboniteOre,Names.Blocks.BlockCarboniteOre);
        GameRegistry.registerBlock(RedMapleLeaf,Names.Blocks.BlockRedMapleLeaf);
        GameRegistry.registerBlock(RedMapleLog,Names.Blocks.BlockRedMapleLog);
        GameRegistry.registerBlock(Tarmac,Names.Blocks.BlockTarmac);
        GameRegistry.registerBlock(Cask,Names.Blocks.BlockCask);
        GameRegistry.registerBlock(AgingBarrel,Names.Blocks.BlockAgingBarrel);
        GameRegistry.registerBlock(CarboniteBlock, Names.Blocks.BlockCarboniteBlock);
        GameRegistry.registerBlock(CarboniteFrame,Names.Blocks.BlockCarboniteFrame);
        GameRegistry.registerBlock(CarboniteTank,Names.Blocks.BlockCarboniteTank);
        GameRegistry.registerBlock(RedMaplePlanks,Names.Blocks.BlockRedMaplePlanks);
        GameRegistry.registerBlock(Fermenter,Names.Blocks.BlockFermenter);
        GameRegistry.registerBlock(Barrel, Names.Blocks.BlockBarrel);
        GameRegistry.registerBlock(Grinder, Names.Blocks.BlockGrinder);
        GameRegistry.registerBlock(Bottler, Names.Blocks.BlockBottler);
        GameRegistry.registerBlock(Hearth, Names.Blocks.BlockHearth);

    }
}
