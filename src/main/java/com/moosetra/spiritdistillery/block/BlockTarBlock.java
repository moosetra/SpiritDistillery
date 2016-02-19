package com.moosetra.spiritdistillery.block;

import com.moosetra.spiritdistillery.creativetab.CreativeTabSD;
import com.moosetra.spiritdistillery.init.ModBlocks;
import com.moosetra.spiritdistillery.init.ModItems;
import com.moosetra.spiritdistillery.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockTarBlock extends BlockSD
{
    public BlockTarBlock()
    {
        super();
        this.setBlockName(Names.Blocks.BlockTarBlock);
        this.setBlockTextureName("tarBlock");
        this.setHardness(2.5f);
        this.setHarvestLevel("shovel", 1);
        this.setStepSound(Block.soundTypeGravel);
    }
    public int itemDropped(int metadata, Random random, int fortune) {
        return getIdFromBlock(ModBlocks.TarBlock);
    }
}
