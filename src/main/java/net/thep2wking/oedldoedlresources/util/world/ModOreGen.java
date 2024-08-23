package net.thep2wking.oedldoedlresources.util.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.world.ModOreGenHelper;
import net.thep2wking.oedldoedlresources.OedldoedlResources;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;
import net.thep2wking.oedldoedlresources.init.ModBlocks;

public class ModOreGen implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (ResourcesConfig.WORLD.OVERWORLD_ORE_GEN) {
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.BASE_ORE, ResourcesConfig.WORLD.OVERWORLD.BASE_ORE_VEIN_SIZE, ResourcesConfig.WORLD.OVERWORLD.BASE_ORE_CHANCE, 1, 128, ResourcesConfig.WORLD.OVERWORLD.BASE_ORE);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.OEDLDOEDL_ORE, ResourcesConfig.WORLD.OVERWORLD.OEDLDOEDL_ORE_VEIN_SIZE, ResourcesConfig.WORLD.OVERWORLD.OEDLDOEDL_ORE_CHANCE, 1, 10, ResourcesConfig.WORLD.OVERWORLD.OEDLDOEDL_ORE);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.CATERIUM_ORE, ResourcesConfig.WORLD.OVERWORLD.CATERIUM_ORE_VEIN_SIZE, ResourcesConfig.WORLD.OVERWORLD.CATERIUM_ORE_CHANCE, 8, 32, ResourcesConfig.WORLD.OVERWORLD.CATERIUM_ORE);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.RANDOMITE_ORE, ResourcesConfig.WORLD.OVERWORLD.RANDOMITE_ORE_VEIN_SIZE, ResourcesConfig.WORLD.OVERWORLD.RANDOMITE_ORE_CHANCE, 1, 128, ResourcesConfig.WORLD.OVERWORLD.RANDOMITE_ORE);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.URANIUM_POWDER_ORE, ResourcesConfig.WORLD.OVERWORLD.URANIUM_POWDER_ORE_VEIN_SIZE, ResourcesConfig.WORLD.OVERWORLD.URANIUM_POWDER_ORE_CHANCE, 12, 48, ResourcesConfig.WORLD.OVERWORLD.URANIUM_POWDER_ORE);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.ENDER_ORE, ResourcesConfig.WORLD.OVERWORLD.ENDER_ORE_VEIN_SIZE, ResourcesConfig.WORLD.OVERWORLD.ENDER_ORE_CHANCE, 10, 20, ResourcesConfig.WORLD.OVERWORLD.ENDER_ORE);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.GUNPOWDER_ORE, ResourcesConfig.WORLD.OVERWORLD.GUNPOWDER_ORE_VEIN_SIZE, ResourcesConfig.WORLD.OVERWORLD.GUNPOWDER_ORE_CHANCE, 40, 70, ResourcesConfig.WORLD.OVERWORLD.GUNPOWDER_ORE);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.SALT_ORE, ResourcesConfig.WORLD.OVERWORLD.SALT_ORE_VEIN_SIZE, ResourcesConfig.WORLD.OVERWORLD.SALT_ORE_CHANCE, 1, 128, ResourcesConfig.WORLD.OVERWORLD.SALT_ORE);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.SULFUR_ORE, ResourcesConfig.WORLD.OVERWORLD.SULFUR_ORE_VEIN_SIZE, ResourcesConfig.WORLD.OVERWORLD.SULFUR_ORE_CHANCE, 1, 128, ResourcesConfig.WORLD.OVERWORLD.SULFUR_ORE);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.NITER_ORE, ResourcesConfig.WORLD.OVERWORLD.NITER_ORE_VEIN_SIZE, ResourcesConfig.WORLD.OVERWORLD.NITER_ORE_CHANCE, 1, 128, ResourcesConfig.WORLD.OVERWORLD.NITER_ORE);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.COOKIE_ORE, ResourcesConfig.WORLD.OVERWORLD.COOKIE_ORE_VEIN_SIZE, ResourcesConfig.WORLD.OVERWORLD.COOKIE_ORE_CHANCE, 40, 128, ResourcesConfig.WORLD.OVERWORLD.COOKIE_ORE);
		}
		
		if (ResourcesConfig.WORLD.NETHER_ORE_GEN) {
			ModOreGenHelper.addOreGenNether(world, random, chunkX, chunkZ, ModBlocks.NETHER_GREMORIUM_ORE, ResourcesConfig.WORLD.NETHER.GREMORIUM_ORE_VEIN_SIZE, ResourcesConfig.WORLD.NETHER.GREMORIUM_ORE_CHANCE, 4, 9, ResourcesConfig.WORLD.NETHER.GREMORIUM_ORE);
			ModOreGenHelper.addOreGenNether(world, random, chunkX, chunkZ, ModBlocks.NETHER_HIMEJIMARIUM_ORE, ResourcesConfig.WORLD.NETHER.HIMEJIMARIUM_ORE_VEIN_SIZE, ResourcesConfig.WORLD.NETHER.HIMEJIMARIUM_ORE_CHANCE, 7, 21, ResourcesConfig.WORLD.NETHER.HIMEJIMARIUM_ORE);
			ModOreGenHelper.addOreGenNether(world, random, chunkX, chunkZ, ModBlocks.NETHER_TOUJOURIUM_ORE, ResourcesConfig.WORLD.NETHER.TOUJOURIUM_ORE_VEIN_SIZE, ResourcesConfig.WORLD.NETHER.TOUJOURIUM_ORE_CHANCE, 11, 23, ResourcesConfig.WORLD.NETHER.TOUJOURIUM_ORE);
			ModOreGenHelper.addOreGenNether(world, random, chunkX, chunkZ, ModBlocks.NETHER_ARGENTORIUM_ORE, ResourcesConfig.WORLD.NETHER.ARGENTORIUM_ORE_VEIN_SIZE, ResourcesConfig.WORLD.NETHER.ARGENTORIUM_ORE_CHANCE, 5, 11, ResourcesConfig.WORLD.NETHER.ARGENTORIUM_ORE);
			ModOreGenHelper.addOreGenNether(world, random, chunkX, chunkZ, ModBlocks.NETHER_QUARTARIUM_ORE, ResourcesConfig.WORLD.NETHER.QUARTARIUM_ORE_VEIN_SIZE, ResourcesConfig.WORLD.NETHER.QUARTARIUM_ORE_CHANCE, 2, 14, ResourcesConfig.WORLD.NETHER.QUARTARIUM_ORE);
			ModOreGenHelper.addOreGenNether(world, random, chunkX, chunkZ, ModBlocks.NETHER_NAGATORIUM_ORE, ResourcesConfig.WORLD.NETHER.NAGATORIUM_ORE_VEIN_SIZE, ResourcesConfig.WORLD.NETHER.NAGATORIUM_ORE_CHANCE, 1, 4, ResourcesConfig.WORLD.NETHER.NAGATORIUM_ORE);
			ModOreGenHelper.addOreGenNether(world, random, chunkX, chunkZ, ModBlocks.NETHER_SAKURAJIMARIUM_ORE, ResourcesConfig.WORLD.NETHER.SAKURAJIMARIUM_ORE_VEIN_SIZE, ResourcesConfig.WORLD.NETHER.SAKURAJIMARIUM_ORE_CHANCE, 2, 12, ResourcesConfig.WORLD.NETHER.SAKURAJIMARIUM_ORE);
			ModOreGenHelper.addOreGenNether(world, random, chunkX, chunkZ, ModBlocks.NETHER_KITAGAWARIUM_ORE, ResourcesConfig.WORLD.NETHER.KITAGAWARIUM_ORE_VEIN_SIZE, ResourcesConfig.WORLD.NETHER.KITAGAWARIUM_ORE_CHANCE, 3, 5, ResourcesConfig.WORLD.NETHER.KITAGAWARIUM_ORE);
		}

		if (ResourcesConfig.WORLD.END_ORE_GEN) {
			ModOreGenHelper.addOreGenEnd(world, random, chunkX, chunkZ, ModBlocks.END_ELEMENT_OD, ResourcesConfig.WORLD.END.ELEMENT_OD_ORE_VEIN_SIZE, ResourcesConfig.WORLD.END.ELEMENT_OD_CHANCE, 1, 128, ResourcesConfig.WORLD.END.ELEMENT_OD);
		}
	}

	public static void registerModOredGen() {
		ModLogger.registeredWorldGenLogger(OedldoedlResources.MODID);

		ModOreGenHelper.registerOreGen(new ModOreGen());
	}
}