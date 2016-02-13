package com.moosetra.spiritdistillery.block;

import com.moosetra.spiritdistillery.init.ModBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.List;
import java.util.Random;

public class BlockBarrel extends BlockSD {
    public BlockBarrel() {
        super();
        this.setBlockName("barrel");
        this.setBlockTextureName("barrel");
        this.setHardness(2.0f);
        this.setHarvestLevel("axe", 1);
        this.setStepSound(Block.soundTypeWood);
    }

    public int blockDropped(int metadata, Random random, int fortune) {
        return getIdFromBlock(ModBlocks.Barrel);
    }
}