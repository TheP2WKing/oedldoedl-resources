package net.thep2wking.oedldoedlresources.util.world;

import java.util.Random;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;
import net.thep2wking.oedldoedlresources.init.ModBlocks;

public class WorldGenNetherOres implements IWorldGenerator {
	public WorldGenerator gremorium_ore;
	public WorldGenerator himejimarium_ore;
	public WorldGenerator toujourium_ore;
	public WorldGenerator argentorium_ore;
	public WorldGenerator quartarium_ore;
	public WorldGenerator nagatorium_ore;
	public WorldGenerator sakurajimarium_ore;

	public WorldGenNetherOres() {
		gremorium_ore = new WorldGenMinable(ModBlocks.NETHER_GREMORIUM_ORE.getDefaultState(),
				ResourcesConfig.WORLD.NETHER.GREMORIUM_ORE_VEIN_SIZE, BlockMatcher.forBlock(Blocks.NETHERRACK));
		himejimarium_ore = new WorldGenMinable(ModBlocks.NETHER_HIMEJIMARIUM_ORE.getDefaultState(),
				ResourcesConfig.WORLD.NETHER.HIMEJIMARIUM_ORE_VEIN_SIZE, BlockMatcher.forBlock(Blocks.NETHERRACK));
		toujourium_ore = new WorldGenMinable(ModBlocks.NETHER_TOUJOURIUM_ORE.getDefaultState(),
				ResourcesConfig.WORLD.NETHER.TOUJOURIUM_ORE_VEIN_SIZE, BlockMatcher.forBlock(Blocks.NETHERRACK));
		argentorium_ore = new WorldGenMinable(ModBlocks.NETHER_ARGENTORIUM_ORE.getDefaultState(),
				ResourcesConfig.WORLD.NETHER.ARGENTORIUM_ORE_VEIN_SIZE, BlockMatcher.forBlock(Blocks.NETHERRACK));
		quartarium_ore = new WorldGenMinable(ModBlocks.NETHER_QUARTARIUM_ORE.getDefaultState(),
				ResourcesConfig.WORLD.NETHER.QUARTARIUM_ORE_VEIN_SIZE, BlockMatcher.forBlock(Blocks.NETHERRACK));
		nagatorium_ore = new WorldGenMinable(ModBlocks.NETHER_NAGATORIUM_ORE.getDefaultState(),
				ResourcesConfig.WORLD.NETHER.NAGATORIUM_ORE_VEIN_SIZE, BlockMatcher.forBlock(Blocks.NETHERRACK));
		sakurajimarium_ore = new WorldGenMinable(ModBlocks.NETHER_SAKURAJIMARIUM_ORE.getDefaultState(),
				ResourcesConfig.WORLD.NETHER.SAKURAJIMARIUM_ORE_VEIN_SIZE, BlockMatcher.forBlock(Blocks.NETHERRACK));
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
			case -1:

				if (ResourcesConfig.WORLD.NETHER_WORLD_GEN) {
					if (ResourcesConfig.WORLD.NETHER.GREMORIUM_ORE) {
						runGenerator(gremorium_ore, world, random, chunkX, chunkZ,
								ResourcesConfig.WORLD.NETHER.GREMORIUM_ORE_CHANCE, 4, 9);
					}
					if (ResourcesConfig.WORLD.NETHER.HIMEJIMARIUM_ORE) {
						runGenerator(himejimarium_ore, world, random, chunkX, chunkZ,
								ResourcesConfig.WORLD.NETHER.HIMEJIMARIUM_ORE_CHANCE, 7, 21);
					}
					if (ResourcesConfig.WORLD.NETHER.TOUJOURIUM_ORE) {
						runGenerator(toujourium_ore, world, random, chunkX, chunkZ,
								ResourcesConfig.WORLD.NETHER.TOUJOURIUM_ORE_CHANCE, 11, 23);
					}
					if (ResourcesConfig.WORLD.NETHER.ARGENTORIUM_ORE) {
						runGenerator(argentorium_ore, world, random, chunkX, chunkZ,
								ResourcesConfig.WORLD.NETHER.ARGENTORIUM_ORE_CHANCE, 5, 11);
					}
					if (ResourcesConfig.WORLD.NETHER.QUARTARIUM_ORE) {
						runGenerator(quartarium_ore, world, random, chunkX, chunkZ,
								ResourcesConfig.WORLD.NETHER.QUARTARIUM_ORE_CHANCE, 2, 14);
					}
					if (ResourcesConfig.WORLD.NETHER.NAGATORIUM_ORE) {
						runGenerator(nagatorium_ore, world, random, chunkX, chunkZ,
								ResourcesConfig.WORLD.NETHER.NAGATORIUM_ORE_CHANCE, 1, 4);
					}
					if (ResourcesConfig.WORLD.NETHER.SAKURAJIMARIUM_ORE) {
						runGenerator(sakurajimarium_ore, world, random, chunkX, chunkZ,
								ResourcesConfig.WORLD.NETHER.SAKURAJIMARIUM_ORE_CHANCE, 2, 12);
					}
				}
				break;
		}
	}

	public void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance,
			int minHeight, int maxHeight) {
		if (minHeight > maxHeight || minHeight < 0 || maxHeight > 256)
			throw new IllegalArgumentException("Ore generated out of bounds");

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chance; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);

			gen.generate(world, rand, new BlockPos(x, y, z));
		}
	}
}