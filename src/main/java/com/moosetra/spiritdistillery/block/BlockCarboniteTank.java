package com.moosetra.spiritdistillery.block;

import com.moosetra.spiritdistillery.init.ModBlocks;
import com.moosetra.spiritdistillery.tileentity.TileEntityCarboniteTank;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class BlockCarboniteTank extends BlockSD
{
    public BlockCarboniteTank()
    {
        super();
        this.setBlockName("carboniteTank");
        this.setBlockTextureName("carboniteTank");
        this.setHardness(2.0f);
        this.setHarvestLevel("pickaxe", 1);
        this.setStepSound(Block.soundTypeGlass);
    }
       

    public int blockDropped(int metadata, Random random, int fortune)
    {
        return getIdFromBlock(ModBlocks.CarboniteTank);
    }
}
