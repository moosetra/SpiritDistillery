package com.moosetra.spiritdistillery.init;

import com.moosetra.spiritdistillery.item.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{
    public static final ItemSD TarPile = new ItemTarPile();
    public static final ItemSD CarboniteAxe = new ItemCarboniteAxe();
    public static final ItemSD CarboniteIngot = new ItemCarboniteIngot();
    public static final ItemSD CarboniteLighter = new ItemCarboniteLighter();
    public static final ItemSD CarbonitePickaxe = new ItemCarbonitePickaxe();
    public static final ItemSD CarboniteShovel = new ItemCarboniteShovel();
    public static final ItemSD CarboniteSword = new ItemCarboniteSword();

    public static void init()
    {
        GameRegistry.registerItem(TarPile,"tarPile");
        GameRegistry.registerItem(CarboniteAxe,"carboniteAxe");
        GameRegistry.registerItem(CarboniteIngot,"carboniteIngot");
        GameRegistry.registerItem(CarboniteLighter,"carboniteLighter");
        GameRegistry.registerItem(CarbonitePickaxe,"carbonitePickaxe");
        GameRegistry.registerItem(CarboniteShovel,"carboniteShovel");
        GameRegistry.registerItem(CarboniteSword,"carboniteSword");

    }
    public static Item.ToolMaterial carbonite = EnumHelper.addToolMaterial("Carbonite", 2, 350, 7.0F, 5, 14);
}
