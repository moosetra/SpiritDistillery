package com.moosetra.spiritdistillery.block;

import com.moosetra.spiritdistillery.init.ModBlocks;
import com.moosetra.spiritdistillery.reference.Names;
import net.minecraft.block.Block;

import java.util.Random;

public class BlockCask extends BlockSD
{
    public BlockCask()
    {
        super();
        this.setBlockName(Names.Blocks.BlockCask);
        this.setBlockTextureName("ModelCask");
        this.setHardness(2.0f);
        this.setHarvestLevel("axe", 1);
        this.setStepSound(Block.soundTypeWood);
    }
    public int blockDropped(int metadata, Random random, int fortune) {
        return getIdFromBlock(ModBlocks.Cask);
    }
}
