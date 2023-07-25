package net.thep2wking.oedldoedlresources.util;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlresources.OedldoedlResources;
import net.thep2wking.oedldoedlresources.util.world.WorldGenEndOres;
import net.thep2wking.oedldoedlresources.util.world.WorldGenNetherOres;
import net.thep2wking.oedldoedlresources.util.world.WorldGenOverworldOres;

public class ModWorldGen {
	public static void registerModWorldGen() {
		ModLogger.registeredWorldGenLogger(OedldoedlResources.MODID);

		GameRegistry.registerWorldGenerator(new WorldGenOverworldOres(), 1);
		GameRegistry.registerWorldGenerator(new WorldGenNetherOres(), 1);
		GameRegistry.registerWorldGenerator(new WorldGenEndOres(), 1);
	}
}