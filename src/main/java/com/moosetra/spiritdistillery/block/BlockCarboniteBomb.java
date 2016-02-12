package com.moosetra.spiritdistillery.block;

import com.moosetra.spiritdistillery.creativetab.CreativeTabSD;
import com.moosetra.spiritdistillery.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemMultiTexture;

import java.util.Random;

public class BlockCarboniteBomb extends BlockSD
{
    public BlockCarboniteBomb()
    {
        super();
        this.setBlockName("carboniteBomb");
        this.setBlockTextureName("CarboniteBomb");
        this.setHardness(2.0f);
        this.setStepSound(Block.soundTypeMetal);
    }
    public int blockDropped(int metadata, Random random, int fortune) {
        return getIdFromBlock(ModBlocks.CarboniteBomb);
    }
}
