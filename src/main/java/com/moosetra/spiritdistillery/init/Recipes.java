package com.moosetra.spiritdistillery.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
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
        ItemStack carboniteBlockStack = new ItemStack(ModBlocks.CarboniteBlock);
        ItemStack carboniteRodStack = new ItemStack(ModItems.CarboniteRod);
        ItemStack carboniteReinforcementsStack = new ItemStack(ModItems.CarboniteReinforcements);
        ItemStack redMaplePlanksStack = new ItemStack(ModBlocks.RedMaplePlanks);
        ItemStack redMapleLogStack = new ItemStack(ModBlocks.RedMapleLog);
        ItemStack agingBarrelStack = new ItemStack(ModBlocks.AgingBarrel);
        ItemStack caskStack = new ItemStack(ModBlocks.Cask);
        ItemStack fermenterStack = new ItemStack(ModBlocks.Fermenter);
        ItemStack carboniteFrameStack = new ItemStack(ModBlocks.CarboniteFrame);
        ItemStack glassStack = new ItemStack(Blocks.glass);
        ItemStack carboniteTankStack = new ItemStack(ModBlocks.CarboniteTank);
        ItemStack carboniteDustStack = new ItemStack(ModItems.CarboniteDust);
        ItemStack hopperStack = new ItemStack(Blocks.hopper);



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

        GameRegistry.addRecipe(carboniteBlockStack, "xxx", "xxx", "xxx",
                'x', carboniteIngotStack);

        GameRegistry.addRecipe(carboniteRodStack, "   ", "xxx", "   ",
                'x', carboniteIngotStack);

        GameRegistry.addRecipe(caskStack, "xzx", "yyy", "xyx",
                'x', carboniteRodStack, 'y', redMaplePlanksStack, 'z', hopperStack);

        GameRegistry.addRecipe(agingBarrelStack, "xzx", "zyz", "xyx",
                'x', carboniteReinforcementsStack, 'y', redMapleLogStack, 'z', carboniteTankStack, 'z', hopperStack);

        GameRegistry.addRecipe(carboniteReinforcementsStack, "xxx", "zyz", "xxx",
                'x', carboniteRodStack, 'y', carboniteBlockStack, 'z', carboniteIngotStack);

        GameRegistry.addRecipe(carboniteFrameStack, "x x", "yxy", "x x",
                'x', carboniteRodStack, 'y', carboniteReinforcementsStack);

        GameRegistry.addRecipe(carboniteTankStack, "xyx", "yyy", "xyx",
                'x', carboniteReinforcementsStack, 'y', glassStack);

        GameRegistry.addRecipe(fermenterStack, " v ", "wyw", "xzx",
                'x',carboniteReinforcementsStack  , 'y',carboniteFrameStack, 'z', carboniteTankStack,
                'w', redMapleLogStack, 'v', hopperStack);

        GameRegistry.addShapelessRecipe(redMaplePlanksStack, redMapleLogStack);

        GameRegistry.addSmelting(carboniteOreStack, carboniteIngotStack, 0.7f);

        GameRegistry.addSmelting(carboniteDustStack, carboniteIngotStack, 0.7f);

        GameRegistry.addSmelting(tarBlockStack, tarPileStack, 0);
    }
}
