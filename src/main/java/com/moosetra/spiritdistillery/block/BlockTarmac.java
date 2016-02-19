package com.moosetra.spiritdistillery.block;

import com.moosetra.spiritdistillery.init.ModBlocks;
import com.moosetra.spiritdistillery.reference.Names;
import net.minecraft.block.Block;

import java.util.Random;

public class BlockTarmac extends BlockSD
{
    public BlockTarmac()
    {
        super();
        this.setBlockName(Names.Blocks.BlockTarmac);
        this.setBlockTextureName("tarmac");
        this.setHardness(4.0f);
        this.setHarvestLevel("pickaxe", 2);
        this.setStepSound(Block.soundTypeStone);
    }
    public int blockDropped(int metadata, Random random, int fortune) {
        return getIdFromBlock(ModBlocks.Tarmac);
    }
}
