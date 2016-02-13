package com.moosetra.spiritdistillery.init;

import com.moosetra.spiritdistillery.oregen.CarboniteOreGen;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModOreGen
{
    public static void init()
    {
        GameRegistry.registerWorldGenerator(new CarboniteOreGen(), 1);
    }
}
