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

public class WorldGenOverworldOres implements IWorldGenerator {
	public WorldGenerator base_ore;
	public WorldGenerator oedldoedl_ore;
	public WorldGenerator randomite_ore;
	public WorldGenerator uranium_powder_ore;
	public WorldGenerator ender_ore;
	public WorldGenerator gunpowder_ore;
	public WorldGenerator salt_ore;
	public WorldGenerator cookie_ore;

	public WorldGenOverworldOres() {
		base_ore = new WorldGenMinable(ModBlocks.BASE_ORE.getDefaultState(),
				ResourcesConfig.WORLD.OVERWORLD.BASE_ORE_VEIN_SIZE, BlockMatcher.forBlock(Blocks.STONE));
		oedldoedl_ore = new WorldGenMinable(ModBlocks.OEDLDOEDL_ORE.getDefaultState(),
				ResourcesConfig.WORLD.OVERWORLD.OEDLDOEDL_ORE_VEIN_SIZE, BlockMatcher.forBlock(Blocks.STONE));
		randomite_ore = new WorldGenMinable(ModBlocks.RANDOMITE_ORE.getDefaultState(),
				ResourcesConfig.WORLD.OVERWORLD.RANDOMITE_ORE_VEIN_SIZE, BlockMatcher.forBlock(Blocks.STONE));
		uranium_powder_ore = new WorldGenMinable(ModBlocks.URANIUM_POWDER_ORE.getDefaultState(),
				ResourcesConfig.WORLD.OVERWORLD.URANIUM_POWDER_ORE_VEIN_SIZE, BlockMatcher.forBlock(Blocks.STONE));
		ender_ore = new WorldGenMinable(ModBlocks.ENDER_ORE.getDefaultState(),
				ResourcesConfig.WORLD.OVERWORLD.ENDER_ORE_VEIN_SIZE, BlockMatcher.forBlock(Blocks.STONE));
		gunpowder_ore = new WorldGenMinable(ModBlocks.GUNPOWDER_ORE.getDefaultState(),
				ResourcesConfig.WORLD.OVERWORLD.GUNPOWDER_ORE_VEIN_SIZE, BlockMatcher.forBlock(Blocks.STONE));
		salt_ore = new WorldGenMinable(ModBlocks.SALT_ORE.getDefaultState(),
				ResourcesConfig.WORLD.OVERWORLD.SALT_ORE_VEIN_SIZE, BlockMatcher.forBlock(Blocks.STONE));
		cookie_ore = new WorldGenMinable(ModBlocks.COOKIE_ORE.getDefaultState(),
				ResourcesConfig.WORLD.OVERWORLD.COOKIE_ORE_VEIN_SIZE, BlockMatcher.forBlock(Blocks.STONE));
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
			case 0:
				if (ResourcesConfig.WORLD.OVERWORLD_WORLD_GEN) {
					if (ResourcesConfig.WORLD.OVERWORLD.BASE_ORE) {
						runGenerator(base_ore, world, random, chunkX, chunkZ,
								ResourcesConfig.WORLD.OVERWORLD.BASE_ORE_CHANCE, 1, 256);
					}
					if (ResourcesConfig.WORLD.OVERWORLD.OEDLDOEDL_ORE) {
						runGenerator(oedldoedl_ore, world, random, chunkX, chunkZ,
								ResourcesConfig.WORLD.OVERWORLD.OEDLDOEDL_ORE_CHANCE, 1, 10);
					}
					if (ResourcesConfig.WORLD.OVERWORLD.RANDOMITE_ORE) {
						runGenerator(randomite_ore, world, random, chunkX, chunkZ,
								ResourcesConfig.WORLD.OVERWORLD.RANDOMITE_ORE_CHANCE, 1, 256);
					}
					if (ResourcesConfig.WORLD.OVERWORLD.URANIUM_POWDER_ORE) {
						runGenerator(uranium_powder_ore, world, random, chunkX, chunkZ,
								ResourcesConfig.WORLD.OVERWORLD.URANIUM_POWDER_ORE_CHANCE, 12, 48);
					}
					if (ResourcesConfig.WORLD.OVERWORLD.ENDER_ORE) {
						runGenerator(ender_ore, world, random, chunkX, chunkZ,
								ResourcesConfig.WORLD.OVERWORLD.ENDER_ORE_CHANCE, 10, 20);
					}
					if (ResourcesConfig.WORLD.OVERWORLD.GUNPOWDER_ORE) {
						runGenerator(gunpowder_ore, world, random, chunkX, chunkZ,
								ResourcesConfig.WORLD.OVERWORLD.GUNPOWDER_ORE_CHANCE, 40, 70);
					}
					if (ResourcesConfig.WORLD.OVERWORLD.SALT_ORE) {
						runGenerator(salt_ore, world, random, chunkX, chunkZ,
								ResourcesConfig.WORLD.OVERWORLD.SALT_ORE_CHANCE, 1, 256);
					}
					if (ResourcesConfig.WORLD.OVERWORLD.COOKIE_ORE) {
						runGenerator(cookie_ore, world, random, chunkX, chunkZ,
								ResourcesConfig.WORLD.OVERWORLD.COOKIE_ORE_CHANCE, 40, 256);
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