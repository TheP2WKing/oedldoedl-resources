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
import net.thep2wking.oedldoedlresources.init.ModBlocks;
import net.thep2wking.oedldoedlresources.init.ModItems;
import net.thep2wking.oedldoedlresources.init.ModSounds;

@Mod.EventBusSubscriber
public class ModRegistry {
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		ModLogger.registeredBlocksLogger(OedldoedlResources.MODID);

		// ore itemblocks
		ModRegistryHelper.registerBlock(event, ModBlocks.BASE_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.OEDLDOEDL_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.RANDOMITE_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.ENDER_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.GUNPOWDER_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.SALT_ORE);

		ModRegistryHelper.registerBlock(event, ModBlocks.NETHER_GREMORIUM_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.NETHER_HIMEJIMARIUM_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.NETHER_TOUJOURIUM_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.NETHER_ARGENTORIUM_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.NETHER_QUARTARIUM_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.NETHER_NAGATORIUM_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.NETHER_SAKURAJIMARIUM_ORE);

		ModRegistryHelper.registerBlock(event, ModBlocks.END_ELEMENT_OD);

		// ingots
		ModRegistryHelper.registerBlock(event, ModBlocks.BASE);
		ModRegistryHelper.registerBlock(event, ModBlocks.OEDLDOEDL);
		ModRegistryHelper.registerBlock(event, ModBlocks.BEDROCKIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.CLOUDIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.ELEVATIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.SADISTIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.DRUNKIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.MONEY);

		ModRegistryHelper.registerBlock(event, ModBlocks.GREMORIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.HIMEJIMARIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.TOUJOURIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.ARGENTORIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.QUARTARIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.NAGATORIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.SAKURAJIMARIUM);

		// gems
		ModRegistryHelper.registerBlock(event, ModBlocks.BASE_GEM);
		ModRegistryHelper.registerBlock(event, ModBlocks.OEDLDOEDL_GEM);
		ModRegistryHelper.registerBlock(event, ModBlocks.TIMOFIUM_GEM);
		ModRegistryHelper.registerBlock(event, ModBlocks.FLOFINIUM_GEM);
		ModRegistryHelper.registerBlock(event, ModBlocks.LAARSIUM_GEM);
		ModRegistryHelper.registerBlock(event, ModBlocks.KLAARSIUM_GEM);
		ModRegistryHelper.registerBlock(event, ModBlocks.SHARANIUM_GEM);
		ModRegistryHelper.registerBlock(event, ModBlocks.MAKERIUM_GEM);
		ModRegistryHelper.registerBlock(event, ModBlocks.INDERIUM_GEM);
		ModRegistryHelper.registerBlock(event, ModBlocks.PUMARIUM_GEM);
		ModRegistryHelper.registerBlock(event, ModBlocks.CALLAXIUM_GEM);
		ModRegistryHelper.registerBlock(event, ModBlocks.SKORPIUM_GEM);
		ModRegistryHelper.registerBlock(event, ModBlocks.STUPIDIUM_GEM);

		ModRegistryHelper.registerBlock(event, ModBlocks.GREMORIUM_GEM);
		ModRegistryHelper.registerBlock(event, ModBlocks.HIMEJIMARIUM_GEM);
		ModRegistryHelper.registerBlock(event, ModBlocks.TOUJOURIUM_GEM);
		ModRegistryHelper.registerBlock(event, ModBlocks.ARGENTORIUM_GEM);
		ModRegistryHelper.registerBlock(event, ModBlocks.QUARTARIUM_GEM);
		ModRegistryHelper.registerBlock(event, ModBlocks.NAGATORIUM_GEM);
		ModRegistryHelper.registerBlock(event, ModBlocks.SAKURAJIMARIUM_GEM);

		// stars
		ModRegistryHelper.registerBlock(event, ModBlocks.BASE_STAR);
		ModRegistryHelper.registerBlock(event, ModBlocks.NETHER_STAR);
		ModRegistryHelper.registerBlock(event, ModBlocks.OEDLDOEDL_STAR);
		ModRegistryHelper.registerBlock(event, ModBlocks.INFINITY_STAR);

		// misc
		ModRegistryHelper.registerBlock(event, ModBlocks.BALANCED_CLAY);
		ModRegistryHelper.registerBlock(event, ModBlocks.CHAOS_PLANK);
	}

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		ModLogger.registeredItemsLogger(OedldoedlResources.MODID);

		// ore itemblocks
		ModRegistryHelper.registerItemBlock(event, ModItems.BASE_ORE);
		ModRegistryHelper.registerItemBlock(event, ModItems.OEDLDOEDL_ORE);
		ModRegistryHelper.registerItemBlock(event, ModItems.RANDOMITE_ORE);
		ModRegistryHelper.registerItemBlock(event, ModItems.ENDER_ORE);
		ModRegistryHelper.registerItemBlock(event, ModItems.GUNPOWDER_ORE);
		ModRegistryHelper.registerItemBlock(event, ModItems.SALT_ORE);

		ModRegistryHelper.registerItemBlock(event, ModItems.NETHER_GREMORIUM_ORE);
		ModRegistryHelper.registerItemBlock(event, ModItems.NETHER_HIMEJIMARIUM_ORE);
		ModRegistryHelper.registerItemBlock(event, ModItems.NETHER_TOUJOURIUM_ORE);
		ModRegistryHelper.registerItemBlock(event, ModItems.NETHER_ARGENTORIUM_ORE);
		ModRegistryHelper.registerItemBlock(event, ModItems.NETHER_QUARTARIUM_ORE);
		ModRegistryHelper.registerItemBlock(event, ModItems.NETHER_NAGATORIUM_ORE);
		ModRegistryHelper.registerItemBlock(event, ModItems.NETHER_SAKURAJIMARIUM_ORE);

		ModRegistryHelper.registerItemBlock(event, ModItems.END_ELEMENT_OD);

		// ingot itemblocks
		ModRegistryHelper.registerItemBlock(event, ModItems.BASE_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.OEDLDOEDL_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.BEDROCKIUM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.CLOUDIUM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.ELEVATIUM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.SADISTIUM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.DRUNKIUM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.MONEY_BLOCK);

		ModRegistryHelper.registerItemBlock(event, ModItems.GREMORIUM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.HIMEJIMARIUM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.TOUJOURIUM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.ARGENTORIUM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.QUARTARIUM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.NAGATORIUM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.SAKURAJIMARIUM_BLOCK);

		// gem itemblocks
		ModRegistryHelper.registerItemBlock(event, ModItems.BASE_GEM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.OEDLDOEDL_GEM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.TIMOFIUM_GEM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.FLOFINIUM_GEM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.LAARSIUM_GEM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.KLAARSIUM_GEM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.SHARANIUM_GEM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.MAKERIUM_GEM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.INDERIUM_GEM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.PUMARIUM_GEM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.CALLAXIUM_GEM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.SKORPIUM_GEM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.STUPIDIUM_GEM_BLOCK);

		ModRegistryHelper.registerItemBlock(event, ModItems.GREMORIUM_GEM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.HIMEJIMARIUM_GEM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.TOUJOURIUM_GEM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.ARGENTORIUM_GEM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.QUARTARIUM_GEM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.NAGATORIUM_GEM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.SAKURAJIMARIUM_GEM_BLOCK);

		// star itemblocks
		ModRegistryHelper.registerItemBlock(event, ModItems.BASE_STAR_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.NETHER_STAR_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.OEDLDOEDL_STAR_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.INFINITY_STAR_BLOCK);

		// misc itemblocks
		ModRegistryHelper.registerItemBlock(event, ModItems.BALANCED_CLAY);
		ModRegistryHelper.registerItemBlock(event, ModItems.CHAOS_PLANK);

		// ingots
		ModRegistryHelper.registerItem(event, ModItems.BASE_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.OEDLDOEDL_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.BEDROCKIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.CLOUDIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.ELEVATIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.SADISTIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.DRUNKIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.MONEY_INGOT);

		ModRegistryHelper.registerItem(event, ModItems.GREMORIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.HIMEJIMARIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.TOUJOURIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.ARGENTORIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.QUARTARIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.NAGATORIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.SAKURAJIMARIUM_INGOT);

		ModRegistryHelper.registerItem(event, ModItems.UNSTABLE_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.CHAOS_INGOT);
	}

	@SubscribeEvent
	public static void onSoundEventRegister(RegistryEvent.Register<SoundEvent> event) {
		ModLogger.registeredSoundEventsLogger(OedldoedlResources.MODID);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.MONEY);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.WOW);
	}
}