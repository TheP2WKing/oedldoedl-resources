package net.thep2wking.oedldoedlresources.util.world;

import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.world.ModPlantGenHelper;
import net.thep2wking.oedldoedlresources.OedldoedlResources;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;
import net.thep2wking.oedldoedlresources.init.ModBlocks;

public class ModFlowerGen {
	@SubscribeEvent
	public void generate(DecorateBiomeEvent.Decorate event) {
		if (ResourcesConfig.WORLD.OVERWORLD_FLOWER_GEN) {
			ModPlantGenHelper.addFLowerGenOverworld(event, ModBlocks.BACON_AGARIC, ResourcesConfig.WORLD.OVERWORLD.BACON_AGARIC_FLOWER_CHANCE, ResourcesConfig.WORLD.OVERWORLD.BACON_AGARIC_FLOWER);
		}
	}

	public static void registerModFlowerGen() {
		ModLogger.registeredWorldGenLogger(OedldoedlResources.MODID);

		ModPlantGenHelper.registerFlowerGen(new ModFlowerGen());
	}
}