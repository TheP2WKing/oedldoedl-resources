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

public class WorldGenEndOres implements IWorldGenerator {
	public WorldGenerator element_od;

	public WorldGenEndOres() {
		element_od = new WorldGenMinable(ModBlocks.END_ELEMENT_OD.getDefaultState(),
				ResourcesConfig.WORLD.END.ELEMENT_OD_ORE_VEIN_SIZE, BlockMatcher.forBlock(Blocks.END_STONE));
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
			case 1:

				if (ResourcesConfig.WORLD.END_WORLD_GEN) {
					if (ResourcesConfig.WORLD.END.ELEMENT_OD) {
						runGenerator(element_od, world, random, chunkX, chunkZ,
								ResourcesConfig.WORLD.END.ELEMENT_OD_CHANCE, 1, 256);
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