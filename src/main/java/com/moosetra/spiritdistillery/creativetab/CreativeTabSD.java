package com.moosetra.spiritdistillery.creativetab;

import com.moosetra.spiritdistillery.init.ModItems;
import com.moosetra.spiritdistillery.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabSD
{
    public static final CreativeTabs SB_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.TarPile;
        }

    };
}
