package com.moosetra.spiritdistillery;

import com.moosetra.spiritdistillery.handler.ConfigurationHandler;
import com.moosetra.spiritdistillery.init.ModBlocks;
import com.moosetra.spiritdistillery.init.ModItems;
import com.moosetra.spiritdistillery.init.ModOreGen;
import com.moosetra.spiritdistillery.init.Recipes;
import com.moosetra.spiritdistillery.proxy.IProxy;
import com.moosetra.spiritdistillery.reference.Reference;
import com.moosetra.spiritdistillery.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME, version= Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class SpiritDistillery
{
    @Mod.Instance(Reference.MOD_ID)
    public static SpiritDistillery instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization Complete!");

        ModItems.init();
        ModBlocks.init();
        Recipes.init();
        ModOreGen.init();
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete!");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}
