package com.moosetra.spiritdistillery.block;

import com.moosetra.spiritdistillery.init.ModBlocks;
import com.moosetra.spiritdistillery.item.ItemSD;
import net.minecraft.block.Block;

import java.util.Random;

public class BlockCarboniteFrame extends BlockSD
{
    public BlockCarboniteFrame()
    {
        super();
        this.setBlockName("carboniteFrame");
        this.setBlockTextureName("carboniteFrame");
        this.setHardness(2.0f);
        this.setHarvestLevel("pickaxe", 1);
        this.setStepSound(Block.soundTypeMetal);
    }
    public int blockDropped(int metadata, Random random, int fortune) {
        return getIdFromBlock(ModBlocks.CarboniteFrame);
    }
}