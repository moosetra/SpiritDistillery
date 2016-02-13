package com.moosetra.spiritdistillery.init;

import com.moosetra.spiritdistillery.block.BlockCarboniteFrame;
import com.moosetra.spiritdistillery.item.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
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
    public static final ItemSD CarboniteRod = new ItemCarboniteRod();
    public static final ItemSD CarboniteReinforcements = new ItemCarboniteReinforcements();
    public static final ItemSD CarboniteDust = new ItemCarboniteDust();

    public static void init()
    {
        GameRegistry.registerItem(TarPile,"tarPile");
        GameRegistry.registerItem(CarboniteAxe,"carboniteAxe");
        GameRegistry.registerItem(CarboniteIngot,"carboniteIngot");
        GameRegistry.registerItem(CarboniteLighter,"carboniteLighter");
        GameRegistry.registerItem(CarbonitePickaxe,"carbonitePickaxe");
        GameRegistry.registerItem(CarboniteShovel,"carboniteShovel");
        GameRegistry.registerItem(CarboniteSword,"carboniteSword");
        GameRegistry.registerItem(CarboniteRod,"carboniteRod");
        GameRegistry.registerItem(CarboniteReinforcements,"carboniteReinforcements");
        GameRegistry.registerItem(CarboniteDust,"carboniteDust");

    }
    public static Item.ToolMaterial carbonite = EnumHelper.addToolMaterial("Carbonite", 2, 350, 7.0F, 5, 14);
}
