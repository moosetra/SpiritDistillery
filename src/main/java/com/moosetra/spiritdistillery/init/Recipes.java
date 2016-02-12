package com.moosetra.spiritdistillery.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        ItemStack tarPileStack = new ItemStack(ModItems.TarPile);
        ItemStack carboniteLighterStack = new ItemStack(ModItems.CarboniteLighter);
        ItemStack flintandsteelStack = new ItemStack(Items.flint_and_steel);
        ItemStack ironingotStack = new ItemStack(Items.iron_ingot);
        ItemStack carboniteIngotStack = new ItemStack(ModItems.CarboniteIngot);
        ItemStack stickStack = new ItemStack(Items.stick);
        ItemStack carbonitePickaxeStack = new ItemStack(ModItems.CarbonitePickaxe);
        ItemStack carboniteAxeStack = new ItemStack(ModItems.CarboniteAxe);
        ItemStack carboniteShovelStack = new ItemStack(ModItems.CarboniteShovel);
        ItemStack carboniteSwordStack = new ItemStack(ModItems.CarboniteSword);
        ItemStack gravelStack = new ItemStack(Blocks.gravel);
        ItemStack tarmacStack = new ItemStack(ModBlocks.Tarmac);
        ItemStack carboniteOreStack = new ItemStack(ModBlocks.CarboniteOre);
        ItemStack tarBlockStack = new ItemStack(ModBlocks.TarBlock);


        GameRegistry.addRecipe(carbonitePickaxeStack, "xxx", " y ", " y ",
                'x', carboniteIngotStack,'y', stickStack);

        GameRegistry.addRecipe(carboniteShovelStack, " x ", " y ", " y ",
                'x', carboniteIngotStack,'y', stickStack);

        GameRegistry.addRecipe(carboniteAxeStack, " xx", " yx", " y ",
                'x', carboniteIngotStack,'y', stickStack);

        GameRegistry.addRecipe(carboniteAxeStack, "xx ", "xy ", " y ",
                'x', carboniteIngotStack,'y', stickStack);

        GameRegistry.addRecipe(carboniteSwordStack, " x ", " x ", " y ",
                'x', carboniteIngotStack,'y', stickStack);

        GameRegistry.addRecipe(carboniteLighterStack, "xxx", "xyx", "xxx",
                'x', carboniteIngotStack, 'y', flintandsteelStack);

        GameRegistry.addRecipe(tarmacStack, "yxy", "xyx", "yxy",
                'x', tarPileStack,'y', gravelStack);

        GameRegistry.addSmelting(carboniteOreStack, carboniteIngotStack, 0);

        GameRegistry.addSmelting(tarBlockStack, tarPileStack, 0);
    }
}
