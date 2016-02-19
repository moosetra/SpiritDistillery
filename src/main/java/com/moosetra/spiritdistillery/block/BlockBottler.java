package com.moosetra.spiritdistillery.block;

import com.moosetra.spiritdistillery.init.ModBlocks;
import com.moosetra.spiritdistillery.reference.Names;
import net.minecraft.block.Block;

import java.util.Random;

public class BlockBottler extends BlockSD {
    public BlockBottler() {
        super();
        this.setBlockName(Names.Blocks.BlockBottler);
        this.setBlockTextureName("bottler");
        this.setHardness(2.0f);
        this.setHarvestLevel("pickaxe", 1);
        this.setStepSound(Block.soundTypeMetal);
    }

    public int blockDropped(int metadata, Random random, int fortune) {
        return getIdFromBlock(ModBlocks.Bottler);
    }
}
