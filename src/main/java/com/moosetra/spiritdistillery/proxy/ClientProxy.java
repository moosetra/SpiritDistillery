package com.moosetra.spiritdistillery.proxy;

import com.moosetra.spiritdistillery.client.renderer.tileentity.*;
import com.moosetra.spiritdistillery.client.settings.Keybindings;
import com.moosetra.spiritdistillery.init.ModBlocks;
import com.moosetra.spiritdistillery.reference.Names;
import com.moosetra.spiritdistillery.reference.RenderIds;
import com.moosetra.spiritdistillery.tileentity.*;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy
{

    @Override
    public void registerKeyBindings()
    {
        ClientRegistry.registerKeyBinding(Keybindings.smellandtaste);
    }

    public ClientProxy getClientProxy()
    {
        return this;
    }

    public void initRenderingAndTextures()
    {
        RenderIds.agingBarrel = RenderingRegistry.getNextAvailableRenderId();
        RenderIds.barrel = RenderingRegistry.getNextAvailableRenderId();
        RenderIds.carboniteTank = RenderingRegistry.getNextAvailableRenderId();
        RenderIds.cask = RenderingRegistry.getNextAvailableRenderId();
        RenderIds.fermenter = RenderingRegistry.getNextAvailableRenderId();


        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.AgingBarrel), new RenderAgingBarrel());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.Barrel), new RenderBarrel());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.CarboniteTank), new RenderCarboniteTank());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.Cask), new RenderCask());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.Fermenter), new RenderFermenter());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAgingBarrel.class, new RenderAgingBarrel());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBarrel.class, new RenderBarrel());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCarboniteTank.class, new RenderCarboniteTank());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCask.class, new RenderCask());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFermenter.class, new RenderFermenter());

    }
}
