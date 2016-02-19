package com.moosetra.spiritdistillery.init;

import com.moosetra.spiritdistillery.creativetab.CreativeTabSD;
import com.moosetra.spiritdistillery.reference.Names;
import com.moosetra.spiritdistillery.tileentity.TileEntityBarrel;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;


import java.util.Random;

public class TileEntities
{
    public static void init() {
        GameRegistry.registerTileEntity(TileEntityBarrel.class, Names.Blocks.BlockAgingBarrel);
        GameRegistry.registerTileEntity(TileEntityBarrel.class, Names.Blocks.BlockBarrel);
        GameRegistry.registerTileEntity(TileEntityBarrel.class, Names.Blocks.BlockCarboniteTank);
        GameRegistry.registerTileEntity(TileEntityBarrel.class, Names.Blocks.BlockCask);
        GameRegistry.registerTileEntity(TileEntityBarrel.class, Names.Blocks.BlockFermenter);
    }
}