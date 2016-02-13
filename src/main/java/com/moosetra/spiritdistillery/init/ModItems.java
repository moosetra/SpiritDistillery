package com.moosetra.spiritdistillery.init;

import com.moosetra.spiritdistillery.item.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
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
    public static final ItemSD SytleA175LBottle = new ItemStyleA175LBottle();
    public static final ItemSD StyleA750mLBottle = new ItemStyleA750mLBottle();
    public static final ItemSD StyleA375mLBottle = new ItemStyleA375mLBottle();
    public static final ItemSD SytleB175LBottle = new ItemStyleB175LBottle();
    public static final ItemSD StyleB750mLBottle = new ItemStyleB750mLBottle();
    public static final ItemSD StyleB375mLBottle = new ItemStyleB375mLBottle();

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
        GameRegistry.registerItem(SytleA175LBottle, "styleA175LBottle");
        GameRegistry.registerItem(StyleA375mLBottle, "styleA375mLBottle");
        GameRegistry.registerItem(StyleA750mLBottle, "styleA750mLBottle");
        GameRegistry.registerItem(SytleB175LBottle, "styleB175LBottle");
        GameRegistry.registerItem(StyleB375mLBottle, "styleB375mLBottle");
        GameRegistry.registerItem(StyleB750mLBottle, "styleB750mLBottle");
    }
}
