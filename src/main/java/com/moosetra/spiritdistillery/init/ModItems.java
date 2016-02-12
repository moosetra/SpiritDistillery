package com.moosetra.spiritdistillery.init;

import com.moosetra.spiritdistillery.item.ItemSD;
import com.moosetra.spiritdistillery.item.ItemTarPile;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemSD TarPile = new ItemTarPile();

    public static void init()
    {
        GameRegistry.registerItem(TarPile,"Tar Pile");
    }
}
