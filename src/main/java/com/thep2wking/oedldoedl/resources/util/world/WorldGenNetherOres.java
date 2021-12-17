package com.thep2wking.oedldoedl.resources.util.world;

import java.util.Random;

import com.thep2wking.oedldoedl.resources.config.ResourcesConfig;
import com.thep2wking.oedldoedl.resources.init.BlockInit;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenNetherOres implements IWorldGenerator
{
	public WorldGenerator gremorium_gem_ore;
	public WorldGenerator himejimarium_gem_ore;
	public WorldGenerator toujourium_gem_ore;
	public WorldGenerator argentorium_gem_ore;
	public WorldGenerator quartarium_gem_ore;
	
	public WorldGenNetherOres() 
	{
		gremorium_gem_ore = new WorldGenMinable(BlockInit.BLOCK_GREMORIUM_GEM_ORE.getDefaultState(), 3, BlockMatcher.forBlock(Blocks.NETHERRACK));
		himejimarium_gem_ore = new WorldGenMinable(BlockInit.BLOCK_HIMEJIMARIUM_GEM_ORE.getDefaultState(), 3, BlockMatcher.forBlock(Blocks.NETHERRACK));
		toujourium_gem_ore = new WorldGenMinable(BlockInit.BLOCK_TOUJOURIUM_GEM_ORE.getDefaultState(), 3, BlockMatcher.forBlock(Blocks.NETHERRACK));
		argentorium_gem_ore = new WorldGenMinable(BlockInit.BLOCK_ARGENTORIUM_GEM_ORE.getDefaultState(), 3, BlockMatcher.forBlock(Blocks.NETHERRACK));
		quartarium_gem_ore = new WorldGenMinable(BlockInit.BLOCK_QUARTARIUM_GEM_ORE.getDefaultState(), 3, BlockMatcher.forBlock(Blocks.NETHERRACK));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case -1:
			
			if (ResourcesConfig.GENEREL.worldgen.worldGenNether)
			{
				if (ResourcesConfig.RESOURCES.metals.gremorium.enabled && ResourcesConfig.RESOURCES.metals.gremorium.oreGenEnabled)
				{
					runGenerator(gremorium_gem_ore, world, random, chunkX, chunkZ, ResourcesConfig.RESOURCES.metals.gremorium.oreRarity, 4, 9);
				}
				if (ResourcesConfig.RESOURCES.metals.himejimarium.enabled && ResourcesConfig.RESOURCES.metals.himejimarium.oreGenEnabled)
				{
					runGenerator(himejimarium_gem_ore, world, random, chunkX, chunkZ, ResourcesConfig.RESOURCES.metals.himejimarium.oreRarity, 9, 21);
				}
				if (ResourcesConfig.RESOURCES.metals.toujourium.enabled && ResourcesConfig.RESOURCES.metals.toujourium.oreGenEnabled)
				{
					runGenerator(toujourium_gem_ore, world, random, chunkX, chunkZ, ResourcesConfig.RESOURCES.metals.toujourium.oreRarity, 11, 29);
				}
				if (ResourcesConfig.RESOURCES.metals.argentorium.enabled && ResourcesConfig.RESOURCES.metals.argentorium.oreGenEnabled)
				{
					runGenerator(argentorium_gem_ore, world, random, chunkX, chunkZ, ResourcesConfig.RESOURCES.metals.argentorium.oreRarity, 5, 11);
				}
				if (ResourcesConfig.RESOURCES.metals.quartarium.enabled && ResourcesConfig.RESOURCES.metals.quartarium.oreGenEnabled)
				{
					runGenerator(quartarium_gem_ore, world, random, chunkX, chunkZ, ResourcesConfig.RESOURCES.metals.quartarium.oreRarity, 2, 14);
				}
			}
			break;
		}
	}
	
	public void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
}