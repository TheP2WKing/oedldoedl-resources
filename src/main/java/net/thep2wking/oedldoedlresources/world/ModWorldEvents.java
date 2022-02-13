package net.thep2wking.oedldoedlresources.world;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.thep2wking.oedldoedlresources.OedldoedlResources;

@Mod.EventBusSubscriber(modid = OedldoedlResources.MODID)
public class ModWorldEvents 
{
	@SubscribeEvent
	public static void biomeLoadingEvent(final BiomeLoadingEvent event)
	{
		ModOreGeneration.generateOres(event);
	}
}