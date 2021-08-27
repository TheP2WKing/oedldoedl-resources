package com.thep2wking.oedldoedl.resources.util.world;

import java.util.Random;

import com.thep2wking.oedldoedl.core.config.constants.CoreConst;
import com.thep2wking.oedldoedl.core.config.constants.ResourcesConst;
import com.thep2wking.oedldoedl.resources.init.BlockInit;

import net.minecraft.block.state.IBlockState;
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
	public WorldGenerator salt_ore;

	
	public WorldGenOverworldOres() 
	{
		oedldoedl_ore = new WorldGenMinable(BlockInit.BLOCK_OEDLDOEDL_ORE.func_176223_P(), 3, BlockMatcher.func_177642_a(Blocks.field_150348_b));
		salt_ore = new WorldGenMinable(BlockInit.BLOCK_SALT_ORE.func_176223_P(), 6, BlockMatcher.func_177642_a(Blocks.field_150348_b));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.field_73011_w.getDimension())
		{
		case 0:
			
			if (CoreConst.OEDLDOEDL_ORE_GEN && ResourcesConst.OEDLDOEDL_ORE)
			{
				runGenerator(oedldoedl_ore, world, random, chunkX, chunkZ, 6, 1, 16);
			}
			if (CoreConst.SALT_ORE_GEN && ResourcesConst.SALT_ORE)
			{
				runGenerator(salt_ore, world, random, chunkX, chunkZ, 14, 30, 60);
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