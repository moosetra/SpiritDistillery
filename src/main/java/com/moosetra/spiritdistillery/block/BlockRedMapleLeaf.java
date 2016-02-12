package com.moosetra.spiritdistillery.block;

import com.moosetra.spiritdistillery.init.ModBlocks;
import net.minecraft.block.Block;

import java.util.Random;

public class BlockRedMapleLeaf extends BlockSD
{
    public BlockRedMapleLeaf()
    {
        super();
        this.setBlockName("redMapleLeaf");
        this.setBlockTextureName("redMapleLeaf");
        this.setHardness(1.0f);
        this.setHarvestLevel("axe", 1);
        this.setStepSound(Block.soundTypeGrass);
    }
}
