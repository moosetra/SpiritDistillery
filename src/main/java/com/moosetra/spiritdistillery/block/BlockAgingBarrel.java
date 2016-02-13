package com.moosetra.spiritdistillery.block;

import com.moosetra.spiritdistillery.init.ModBlocks;
import net.minecraft.block.Block;

import java.util.Random;

public class BlockAgingBarrel extends BlockSD
{
    public BlockAgingBarrel()
    {
        super();
        this.setBlockName("agingBarrel");
        this.setBlockTextureName("agingBarrel");
        this.setHardness(2.0f);
        this.setHarvestLevel("axe", 1);
        this.setStepSound(Block.soundTypeWood);
    }
    public int blockDropped(int metadata, Random random, int fortune) {
        return getIdFromBlock(ModBlocks.AgingBarrel);
    }
}