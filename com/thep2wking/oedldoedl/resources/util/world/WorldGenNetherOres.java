package com.thep2wking.oedldoedl.resources.util.world;

import java.util.Random;

import com.thep2wking.oedldoedl.core.config.constants.CoreConst;
import com.thep2wking.oedldoedl.core.config.constants.ResourcesConst;
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
		gremorium_gem_ore = new WorldGenMinable(BlockInit.BLOCK_GREMORIUM_GEM_ORE.func_176223_P(), 3, BlockMatcher.func_177642_a(Blocks.field_150424_aL));
		himejimarium_gem_ore = new WorldGenMinable(BlockInit.BLOCK_HIMEJIMARIUM_GEM_ORE.func_176223_P(), 3, BlockMatcher.func_177642_a(Blocks.field_150424_aL));
		toujourium_gem_ore = new WorldGenMinable(BlockInit.BLOCK_TOUJOURIUM_GEM_ORE.func_176223_P(), 3, BlockMatcher.func_177642_a(Blocks.field_150424_aL));
		argentorium_gem_ore = new WorldGenMinable(BlockInit.BLOCK_ARGENTORIUM_GEM_ORE.func_176223_P(), 3, BlockMatcher.func_177642_a(Blocks.field_150424_aL));
		quartarium_gem_ore = new WorldGenMinable(BlockInit.BLOCK_QUARTARIUM_GEM_ORE.func_176223_P(), 3, BlockMatcher.func_177642_a(Blocks.field_150424_aL));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.field_73011_w.getDimension())
		{
		case -1:
			
			if (CoreConst.GREMORIUM_GEM_ORE_GEN && ResourcesConst.GREMORIUM_GEM_ORE)
			{
				runGenerator(gremorium_gem_ore, world, random, chunkX, chunkZ, 1, 4, 9);
			}
			if (CoreConst.HIMEJIMARIUM_GEM_ORE_GEN && ResourcesConst.HIMEJIMARIUM_GEM_ORE)
			{
				runGenerator(himejimarium_gem_ore, world, random, chunkX, chunkZ, 1, 9, 21);
			}
			if (CoreConst.TOUJOURIUM_GEM_ORE_GEN && ResourcesConst.TOUJOURIUM_GEM_ORE)
			{
				runGenerator(toujourium_gem_ore, world, random, chunkX, chunkZ, 1, 11, 29);
			}
			if (CoreConst.ARGENTORIUM_GEM_ORE_GEN && ResourcesConst.ARGENTORIUM_GEM_ORE)
			{
				runGenerator(argentorium_gem_ore, world, random, chunkX, chunkZ, 1, 5, 11);
			}
			if (CoreConst.QUARTARIUM_GEM_ORE_GEN && ResourcesConst.QUARTARIUM_GEM_ORE)
			{
				runGenerator(quartarium_gem_ore, world, random, chunkX, chunkZ, 1, 2, 14);
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
			
			gen.func_180709_b(world, rand, new BlockPos(x,y,z));
		}
	}
}