package com.moosetra.spiritdistillery.block;

import com.moosetra.spiritdistillery.init.ModBlocks;
import com.moosetra.spiritdistillery.reference.Names;
import net.minecraft.block.Block;

import java.util.Random;

public class BlockCarboniteTank extends BlockSD
{
    public BlockCarboniteTank()
    {
        super();
        this.setBlockName(Names.Blocks.BlockCarboniteTank);
        this.setBlockTextureName("ModelCarboniteTank");
        this.setHardness(2.0f);
        this.setHarvestLevel("pickaxe", 1);
        this.setStepSound(Block.soundTypeGlass);
    }


    public int blockDropped(int metadata, Random random, int fortune)
    {
        return getIdFromBlock(ModBlocks.CarboniteTank);
    }
}
