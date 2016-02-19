package com.moosetra.spiritdistillery.block;

import com.moosetra.spiritdistillery.creativetab.CreativeTabSD;
import com.moosetra.spiritdistillery.init.ModBlocks;
import com.moosetra.spiritdistillery.reference.Names;
import com.moosetra.spiritdistillery.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemMultiTexture;
import net.minecraft.util.IIcon;

import java.util.Random;

public class BlockCarboniteBomb extends BlockSD
{
    public BlockCarboniteBomb()
    {
        super();
        this.setBlockName(Names.Blocks.BlockCarboniteBomb);
        this.setBlockTextureName("CarboniteBomb");
        this.setHardness(2.0f);
        this.setStepSound(Block.soundTypeMetal);

        }
    public int blockDropped(int metadata, Random random, int fortune) {
        return getIdFromBlock(ModBlocks.CarboniteBomb);
    }
}
