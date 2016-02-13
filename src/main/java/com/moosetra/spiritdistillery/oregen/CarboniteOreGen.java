package com.moosetra.spiritdistillery.oregen;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class CarboniteOreGen implements IWorldGenerator
{

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
       // switch(world.provider.dimensionId)
       // {
           // case -1: generateNether(random, chunkX * 16, chunkZ * 16, world);
          //      break;
          //  case 0: generateOverWorld(random, chunkX * 16, chunkZ * 16, world);
          //      break;
          //  case 1: generateEnd(random, chunkX * 16, chunkZ * 16, world);
          //      break;
       // }
    }
    public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int minVeinSize, int maxVeinSize,
                                  int chancesToSpawn, int minY, int maxY )
    {
        WorldGenMinable mineable = new WorldGenMinable(block, minVeinSize + random.nextInt(maxVeinSize - minVeinSize), Blocks.stone);
        for(int i = 0; i < chancesToSpawn; i++)
        {
            int posX = blockXPos + random.nextInt(16);
            int posY = minY + random.nextInt(maxY - minY);
            int posZ = blockZPos + random.nextInt(16);
            mineable.generate(world, random, posX, posY, posZ);
        }
    }
}