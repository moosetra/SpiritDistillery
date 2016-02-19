package com.moosetra.spiritdistillery.block;

import com.moosetra.spiritdistillery.init.ModBlocks;
import com.moosetra.spiritdistillery.reference.Names;
import net.minecraft.block.Block;

import java.util.Random;

public class BlockCarboniteBlock extends BlockSD
{
    public BlockCarboniteBlock()
    {
        super();
        this.setBlockName(Names.Blocks.BlockCarboniteBlock);
        this.setBlockTextureName("carboniteBlock");
        this.setHardness(4.0f);
        this.setHarvestLevel("pickaxe", 2);
        this.setStepSound(Block.soundTypeStone);
    }
    public int blockDropped(int metadata, Random random, int fortune) {
        return getIdFromBlock(ModBlocks.CarboniteBlock);
    }
}

