package com.moosetra.spiritdistillery.block;

import com.moosetra.spiritdistillery.init.ModBlocks;
import com.moosetra.spiritdistillery.proxy.ClientProxy;
import com.moosetra.spiritdistillery.reference.Names;
import com.moosetra.spiritdistillery.reference.RenderIds;
import com.moosetra.spiritdistillery.tileentity.TileEntityAgingBarrel;
import com.moosetra.spiritdistillery.tileentity.TileEntitySD;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

public class BlockAgingBarrel extends BlockTileEntitySD
{
    public BlockAgingBarrel()
    {
        super(Material.wood);
        this.setBlockName(Names.Blocks.BlockAgingBarrel);
        this.setHardness(2.0f);
    }

    public TileEntity createNewTileEntity(World world, int var2)
    {
        return new TileEntityAgingBarrel();
    }

    @Override
    public int getRenderType()
    {
        return RenderIds.agingBarrel;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    public void onBlockAdded(World world, int x, int y, int z)
    {
        EntityPlayer entity = Minecraft.getMinecraft().thePlayer;
        if(entity!=null&&world!=null)
        {
            int le = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
            world.setBlockMetadataWithNotify(x, y, z, le, 2);
        }
        world.markBlockForUpdate(x, y, z);
    }
}

