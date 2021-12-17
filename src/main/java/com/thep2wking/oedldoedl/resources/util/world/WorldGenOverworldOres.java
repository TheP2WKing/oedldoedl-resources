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

public class WorldGenOverworldOres implements IWorldGenerator
{
	public WorldGenerator oedldoedl_ore;
	public WorldGenerator ender_ore;
	public WorldGenerator sulfur_ore;
	public WorldGenerator saltpeter_ore;
	public WorldGenerator salt_ore;

	
	public WorldGenOverworldOres() 
	{
		oedldoedl_ore = new WorldGenMinable(BlockInit.BLOCK_OEDLDOEDL_ORE.getDefaultState(), 2, BlockMatcher.forBlock(Blocks.STONE));
		ender_ore = new WorldGenMinable(BlockInit.BLOCK_ENDER_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		sulfur_ore = new WorldGenMinable(BlockInit.BLOCK_SULFUR_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		saltpeter_ore = new WorldGenMinable(BlockInit.BLOCK_SALTPETER_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		salt_ore = new WorldGenMinable(BlockInit.BLOCK_SALT_ORE.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 0:
			
			if (ResourcesConfig.GENEREL.worldgen.worldGenOverworld)
			{
				if (ResourcesConfig.RESOURCES.metals.oedldoedl.enabled && ResourcesConfig.RESOURCES.metals.oedldoedl.oreGenEnabled)
				{
					runGenerator(oedldoedl_ore, world, random, chunkX, chunkZ, ResourcesConfig.RESOURCES.metals.oedldoedl.oreRarity, 1, 10);
				}
				if (ResourcesConfig.RESOURCES.dusts.ender.enabled && ResourcesConfig.RESOURCES.dusts.ender.oreGenEnabled)
				{
					runGenerator(ender_ore, world, random, chunkX, chunkZ, ResourcesConfig.RESOURCES.dusts.ender.oreRarity, 10, 20);
				}
				if (ResourcesConfig.RESOURCES.dusts.sulfur.enabled && ResourcesConfig.RESOURCES.dusts.sulfur.oreGenEnabled)
				{
					runGenerator(sulfur_ore, world, random, chunkX, chunkZ, ResourcesConfig.RESOURCES.dusts.sulfur.oreRarity, 40, 50);
				}
				if (ResourcesConfig.RESOURCES.dusts.saltpeter.enabled && ResourcesConfig.RESOURCES.dusts.saltpeter.oreGenEnabled)
				{
					runGenerator(saltpeter_ore, world, random, chunkX, chunkZ, ResourcesConfig.RESOURCES.dusts.saltpeter.oreRarity, 40, 50);
				}
				if (ResourcesConfig.RESOURCES.dusts.salt.enabled && ResourcesConfig.RESOURCES.dusts.salt.oreGenEnabled)
				{
					runGenerator(salt_ore, world, random, chunkX, chunkZ, ResourcesConfig.RESOURCES.dusts.salt.oreRarity, 30, 60);
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