package net.thep2wking.oedldoedlresources.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.ModRegistryHelper;
import net.thep2wking.oedldoedlresources.OedldoedlResources;
import net.thep2wking.oedldoedlresources.init.ModItems;

@Mod.EventBusSubscriber
public class ModRegistry {
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		ModLogger.registeredBlocksLogger(OedldoedlResources.MODID);
	}

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		ModLogger.registeredItemsLogger(OedldoedlResources.MODID);

		ModRegistryHelper.registerItem(event, ModItems.GREMORIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.HIMEJIMARIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.TOUJOURIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.ARGENTORIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.QUARTARIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.NAGATORIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.SAKURAJIMARIUM_INGOT);
	}

	@SubscribeEvent
	public static void onSoundEventRegister(RegistryEvent.Register<SoundEvent> event) {
		ModLogger.registeredSoundEventsLogger(OedldoedlResources.MODID);
	}
}