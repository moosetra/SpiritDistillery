package com.moosetra.spiritdistillery.block;

import com.moosetra.spiritdistillery.creativetab.CreativeTabSD;
import com.moosetra.spiritdistillery.init.ModBlocks;
import net.minecraft.block.Block;

import java.util.Random;

public class BlockCarboniteOre extends BlockSD
{
    public BlockCarboniteOre()
    {
        super();
        this.setBlockName("carboniteOre");
        this.setBlockTextureName("carboniteOre");
        this.setHardness(3.0f);
        this.setHarvestLevel("pickaxe", 1);
        this.setStepSound(Block.soundTypeStone);
    }
    public int blockDropped(int metadata, Random random, int fortune) {
        return getIdFromBlock(ModBlocks.CarboniteOre);
    }
}
