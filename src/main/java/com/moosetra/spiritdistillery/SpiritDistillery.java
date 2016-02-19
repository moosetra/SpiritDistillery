package com.moosetra.spiritdistillery;

import com.moosetra.spiritdistillery.client.handler.KeyInputEventHandler;
import com.moosetra.spiritdistillery.handler.ConfigurationHandler;
import com.moosetra.spiritdistillery.init.*;
import com.moosetra.spiritdistillery.proxy.IProxy;
import com.moosetra.spiritdistillery.reference.Reference;
import com.moosetra.spiritdistillery.util.LogHelper;
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

        ModItems.init();
        ModBlocks.init();
        ModOreGen.init();

        proxy.registerKeyBindings();

        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        LogHelper.info("Pre Initialization Complete!");
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();
        TileEntities.init();

        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());

        LogHelper.info("Initialization Complete!");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}
