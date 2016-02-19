package com.moosetra.spiritdistillery.block;

import com.moosetra.spiritdistillery.init.ModBlocks;
import com.moosetra.spiritdistillery.reference.Names;
import com.moosetra.spiritdistillery.reference.RenderIds;
import com.moosetra.spiritdistillery.tileentity.TileEntityAgingBarrel;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

public class BlockFermenter extends BlockSD
{
    public BlockFermenter()
    {
        super();
        this.setBlockName(Names.Blocks.BlockFermenter);
        this.setBlockTextureName("ModelFermenter");
        this.setHardness(2.0f);
        this.setHarvestLevel("pickaxe", 1);
        this.setStepSound(Block.soundTypeMetal);
    }
    public int blockDropped(int metadata, Random random, int fortune) {
        return getIdFromBlock(ModBlocks.Fermenter);
    }
    public TileEntity createNewTileEntity(World world, int var2)
    {
        return new TileEntityAgingBarrel();
    }

    @Override
    public int getRenderType()
    {
        return RenderIds.fermenter;
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
