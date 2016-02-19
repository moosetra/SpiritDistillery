package com.moosetra.spiritdistillery.block;

import com.moosetra.spiritdistillery.init.ModBlocks;
import com.moosetra.spiritdistillery.reference.Names;
import com.moosetra.spiritdistillery.reference.RenderIds;
import com.moosetra.spiritdistillery.tileentity.TileEntityAgingBarrel;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.List;
import java.util.Random;

public class BlockBarrel extends BlockSD {
    public BlockBarrel() {
        super();
        this.setBlockName(Names.Blocks.BlockBarrel);
        this.setBlockTextureName("ModelBarrel");
        this.setHardness(2.0f);
        this.setHarvestLevel("axe", 1);
        this.setStepSound(Block.soundTypeWood);
    }

    public int blockDropped(int metadata, Random random, int fortune) {
        return getIdFromBlock(ModBlocks.Barrel);
    }
    public TileEntity createNewTileEntity(World world, int var2)
    {
        return new TileEntityAgingBarrel();
    }

    @Override
    public int getRenderType()
    {
        return RenderIds.barrel;
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