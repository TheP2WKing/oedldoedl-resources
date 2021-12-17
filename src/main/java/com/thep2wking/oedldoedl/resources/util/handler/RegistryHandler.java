package com.thep2wking.oedldoedl.resources.util.handler;

import com.thep2wking.oedldoedl.core.util.interfaces.IHasModel;
import com.thep2wking.oedldoedl.resources.config.ResourcesConfig;
import com.thep2wking.oedldoedl.resources.init.BlockInit;
import com.thep2wking.oedldoedl.resources.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler
{
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		//resources - star blocks
  		if (ResourcesConfig.RESOURCES.metals.base.enabled) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_BASE_STAR);
  		}
  		if (ResourcesConfig.RESOURCES.stars.oedldoedlStar.enabled) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_OEDLDOEDL_STAR);
  		}
  		if (ResourcesConfig.RESOURCES.stars.infinityStar.enabled) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_INFINITY_STAR);
  		}
  		
  		//resources - ingot blocks
  		if (ResourcesConfig.RESOURCES.metals.base.enabled) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_BASE);
  		}
  		if (ResourcesConfig.RESOURCES.metals.oedldoedl.enabled) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_OEDLDOEDL);
  		}
  		if (ResourcesConfig.RESOURCES.metals.bedrockium.enabled) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_BEDROCKIUM);
  		}	
  		if (ResourcesConfig.RESOURCES.metals.drunkium.enabled) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_DRUNKIUM);
  		}
  		if (ResourcesConfig.RESOURCES.metals.sadistium.enabled) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_SADISTIUM);
  		}
  		if (ResourcesConfig.RESOURCES.metals.gremorium.enabled) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_GREMORIUM);
  		}
  		if (ResourcesConfig.RESOURCES.metals.himejimarium.enabled) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_HIMEJIMARIUM);
  		}
  		if (ResourcesConfig.RESOURCES.metals.toujourium.enabled) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_TOUJOURIUM);
  		}
  		if (ResourcesConfig.RESOURCES.metals.argentorium.enabled) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_ARGENTORIUM);
  		}
  		if (ResourcesConfig.RESOURCES.metals.quartarium.enabled) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_QUARTARIUM);
  		}
  		
		//resources - gem blocks
  		if (ResourcesConfig.RESOURCES.metals.base.enabled) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_BASE_GEM);
  		}
  		
  		if (ResourcesConfig.RESOURCES.misc.developerElements.enabled) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_BASE_ELEMENT);
  			event.getRegistry().register(BlockInit.BLOCK_OEDLDOEDL_ELEMENT);
  			event.getRegistry().register(BlockInit.BLOCK_TIMOFIUM_ELEMENT);
  			event.getRegistry().register(BlockInit.BLOCK_FLOFINIUM_ELEMENT);
  			event.getRegistry().register(BlockInit.BLOCK_LAARSIUM_ELEMENT);
  			event.getRegistry().register(BlockInit.BLOCK_KLAARSIUM_ELEMENT);
  			event.getRegistry().register(BlockInit.BLOCK_SHARANIUM_ELEMENT);
  			event.getRegistry().register(BlockInit.BLOCK_MAKERIUM_ELEMENT);
  			event.getRegistry().register(BlockInit.BLOCK_INDERIUM_ELEMENT);
  			event.getRegistry().register(BlockInit.BLOCK_PUMARIUM_ELEMENT);
  			event.getRegistry().register(BlockInit.BLOCK_CALLAXIUM_ELEMENT);
  			event.getRegistry().register(BlockInit.BLOCK_SKORPIUM_ELEMENT);
  			event.getRegistry().register(BlockInit.BLOCK_STUPIDIUM_ELEMENT);	
  		}
  		
  		//resources - ore blocks
  		if (ResourcesConfig.RESOURCES.metals.oedldoedl.enabled) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_OEDLDOEDL_ORE);
  		}
  		if (ResourcesConfig.RESOURCES.dusts.ender.enabled)
  		{
  			event.getRegistry().register(BlockInit.BLOCK_ENDER_ORE);
  		}
  		if (ResourcesConfig.RESOURCES.dusts.sulfur.enabled)
  		{
  			event.getRegistry().register(BlockInit.BLOCK_SULFUR_ORE);
  		}
  		if (ResourcesConfig.RESOURCES.dusts.saltpeter.enabled)
  		{
  			event.getRegistry().register(BlockInit.BLOCK_SALTPETER_ORE);
  		}
  		if (ResourcesConfig.RESOURCES.dusts.salt.enabled)
  		{
  			event.getRegistry().register(BlockInit.BLOCK_SALT_ORE);
  		}
  		if (ResourcesConfig.RESOURCES.metals.gremorium.enabled) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_GREMORIUM_GEM_ORE);
  		}
  		if (ResourcesConfig.RESOURCES.metals.himejimarium.enabled) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_HIMEJIMARIUM_GEM_ORE);
  		}
  		if (ResourcesConfig.RESOURCES.metals.toujourium.enabled) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_TOUJOURIUM_GEM_ORE);
  		}
  		if (ResourcesConfig.RESOURCES.metals.argentorium.enabled) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_ARGENTORIUM_GEM_ORE);
  		}
  		if (ResourcesConfig.RESOURCES.metals.quartarium.enabled) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_QUARTARIUM_GEM_ORE);
  		}
  		if (ResourcesConfig.RESOURCES.misc.developerElements.enabled)
  		{
			event.getRegistry().register(BlockInit.BLOCK_ELEMENT_OD);
  		}
  		
  		//resources - misc blocks
  		if (ResourcesConfig.RESOURCES.misc.chaosPlank.enabled) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_CHAOS_PLANK);
  		}
	}
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		//resources - star block items
  		if (ResourcesConfig.RESOURCES.metals.base.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_BASE_STAR).setRegistryName("base_star_block"));
  		}
  		if (ResourcesConfig.RESOURCES.stars.oedldoedlStar.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_OEDLDOEDL_STAR).setRegistryName("oedldoedl_star_block"));
  		}
  		if (ResourcesConfig.RESOURCES.stars.infinityStar.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_INFINITY_STAR).setRegistryName("infinity_star_block"));
  		}
  		
  		//resources - ingot block items
  		if (ResourcesConfig.RESOURCES.metals.base.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_BASE).setRegistryName("base_block"));
  		}
  		if (ResourcesConfig.RESOURCES.metals.oedldoedl.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_OEDLDOEDL).setRegistryName("oedldoedl_block"));
  		}
  		if (ResourcesConfig.RESOURCES.metals.bedrockium.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_BEDROCKIUM).setRegistryName("bedrockium_block"));
  		}
  		if (ResourcesConfig.RESOURCES.metals.drunkium.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_DRUNKIUM).setRegistryName("drunkium_block"));
  		}
  		if (ResourcesConfig.RESOURCES.metals.sadistium.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_SADISTIUM).setRegistryName("sadistium_block"));
  		}
  		if (ResourcesConfig.RESOURCES.metals.gremorium.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_GREMORIUM).setRegistryName("gremorium_block"));
  		}
  		if (ResourcesConfig.RESOURCES.metals.himejimarium.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_HIMEJIMARIUM).setRegistryName("himejimarium_block"));
  		}
  		if (ResourcesConfig.RESOURCES.metals.toujourium.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_TOUJOURIUM).setRegistryName("toujourium_block"));
  		}
  		if (ResourcesConfig.RESOURCES.metals.argentorium.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_ARGENTORIUM).setRegistryName("argentorium_block"));
  		}
  		if (ResourcesConfig.RESOURCES.metals.quartarium.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_QUARTARIUM).setRegistryName("quartarium_block"));
  		}
  		
  		//resources - gem block items
  		if (ResourcesConfig.RESOURCES.metals.base.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_BASE_GEM).setRegistryName("base_gem_block"));
  		}
  		
  		if (ResourcesConfig.RESOURCES.misc.developerElements.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_BASE_ELEMENT).setRegistryName("base_element_block"));
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_OEDLDOEDL_ELEMENT).setRegistryName("oedldoedl_element_block"));
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_TIMOFIUM_ELEMENT).setRegistryName("timofium_element_block"));
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_FLOFINIUM_ELEMENT).setRegistryName("flofinium_element_block"));
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_LAARSIUM_ELEMENT).setRegistryName("laarsium_element_block"));
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_KLAARSIUM_ELEMENT).setRegistryName("klaarsium_element_block"));
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_SHARANIUM_ELEMENT).setRegistryName("sharanium_element_block"));
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_MAKERIUM_ELEMENT).setRegistryName("makerium_element_block"));
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_INDERIUM_ELEMENT).setRegistryName("inderium_element_block"));
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_PUMARIUM_ELEMENT).setRegistryName("pumarium_element_block"));
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_CALLAXIUM_ELEMENT).setRegistryName("callaxium_element_block"));
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_SKORPIUM_ELEMENT).setRegistryName("skorpium_element_block"));
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_STUPIDIUM_ELEMENT).setRegistryName("stupidium_element_block"));
  		}
  		
  		//resources - ore block items
  		if (ResourcesConfig.RESOURCES.metals.oedldoedl.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_OEDLDOEDL_ORE).setRegistryName("oedldoedl_ore"));
  		}
  		if (ResourcesConfig.RESOURCES.dusts.ender.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_ENDER_ORE).setRegistryName("ender_ore"));
  		}
  		if (ResourcesConfig.RESOURCES.dusts.sulfur.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_SULFUR_ORE).setRegistryName("sulfur_ore"));
  		}
  		if (ResourcesConfig.RESOURCES.dusts.saltpeter.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_SALTPETER_ORE).setRegistryName("saltpeter_ore"));
  		}
  		if (ResourcesConfig.RESOURCES.dusts.salt.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_SALT_ORE).setRegistryName("salt_ore"));
  		}
  		if (ResourcesConfig.RESOURCES.metals.gremorium.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_GREMORIUM_GEM_ORE).setRegistryName("gremorium_gem_ore"));
  		}
  		if (ResourcesConfig.RESOURCES.metals.himejimarium.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_HIMEJIMARIUM_GEM_ORE).setRegistryName("himejimarium_gem_ore"));
  		}
  		if (ResourcesConfig.RESOURCES.metals.toujourium.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_TOUJOURIUM_GEM_ORE).setRegistryName("toujourium_gem_ore"));
  		}
  		if (ResourcesConfig.RESOURCES.metals.argentorium.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_ARGENTORIUM_GEM_ORE).setRegistryName("argentorium_gem_ore"));
  		}
  		if (ResourcesConfig.RESOURCES.metals.quartarium.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_QUARTARIUM_GEM_ORE).setRegistryName("quartarium_gem_ore"));
  		}
  		if (ResourcesConfig.RESOURCES.misc.developerElements.enabled) 
  		{
			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_ELEMENT_OD).setRegistryName("element_od"));
  		}
  		
  		if (ResourcesConfig.RESOURCES.misc.chaosPlank.enabled) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_CHAOS_PLANK).setRegistryName("chaos_plank"));
  		}
  		
  		//resources - star items
  		if (ResourcesConfig.RESOURCES.metals.base.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_BASE_STAR);
  		}
  		if (ResourcesConfig.RESOURCES.stars.oedldoedlStar.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_OEDLDOEDL_STAR);
  		}
  		if (ResourcesConfig.RESOURCES.stars.infinityStar.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_INFINITY_STAR);
  		}
  		
  		//resources - ingot items
  		if (ResourcesConfig.RESOURCES.metals.base.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_BASE_INGOT);
  		}
  		if (ResourcesConfig.RESOURCES.metals.oedldoedl.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_OEDLDOEDL_INGOT);
  		}
  		if (ResourcesConfig.RESOURCES.metals.bedrockium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_BEDROCKIUM_INGOT);
  		}
  		if (ResourcesConfig.RESOURCES.metals.drunkium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_DRUNKIUM_INGOT);
  		}
  		if (ResourcesConfig.RESOURCES.metals.sadistium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_SADISTIUM_INGOT);
  		}
  		if (ResourcesConfig.RESOURCES.metals.dimension.overworldEnabled) 
  		{
			event.getRegistry().register(ItemInit.ITEM_OVERWORLD_INGOT);
  		}
  		if (ResourcesConfig.RESOURCES.metals.dimension.netherEnabled) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_NETHER_INGOT);
  		}
  		if (ResourcesConfig.RESOURCES.metals.dimension.endEnabled) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_END_INGOT);
  		}
  		if (ResourcesConfig.RESOURCES.metals.gremorium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_GREMORIUM_INGOT);
  		}
  		if (ResourcesConfig.RESOURCES.metals.himejimarium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_HIMEJIMARIUM_INGOT);
  		}
  		if (ResourcesConfig.RESOURCES.metals.toujourium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_TOUJOURIUM_INGOT);
  		}
  		if (ResourcesConfig.RESOURCES.metals.argentorium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_ARGENTORIUM_INGOT);
  		}
  		if (ResourcesConfig.RESOURCES.metals.quartarium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_QUARTARIUM_INGOT);
  		}
  		if (ResourcesConfig.RESOURCES.metals.chaos.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_CHAOS_INGOT);
  		}
  		
  		//resources - gem items
 		if (ResourcesConfig.RESOURCES.metals.base.enabled) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_BASE_GEM);
  		}
 		if (ResourcesConfig.RESOURCES.metals.oedldoedl.enabled) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_OEDLDOEDL_GEM);
  		}
 		if (ResourcesConfig.RESOURCES.misc.developerGems.enabled) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_TIMOFIUM_GEM);
 			event.getRegistry().register(ItemInit.ITEM_FLOFINIUM_GEM);
 			event.getRegistry().register(ItemInit.ITEM_LAARSIUM_GEM);
 			event.getRegistry().register(ItemInit.ITEM_KLAARSIUM_GEM);
 			event.getRegistry().register(ItemInit.ITEM_SHARANIUM_GEM);
 			event.getRegistry().register(ItemInit.ITEM_MAKERIUM_GEM);
 			event.getRegistry().register(ItemInit.ITEM_INDERIUM_GEM);
 			event.getRegistry().register(ItemInit.ITEM_PUMARIUM_GEM);
 			event.getRegistry().register(ItemInit.ITEM_CALLAXIUM_GEM);
 			event.getRegistry().register(ItemInit.ITEM_SKORPIUM_GEM);
 			event.getRegistry().register(ItemInit.ITEM_STUPIDIUM_GEM);
  		}
 		if (ResourcesConfig.RESOURCES.metals.gremorium.enabled) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_GREMORIUM_GEM);
  		}
 		if (ResourcesConfig.RESOURCES.metals.himejimarium.enabled) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_HIMEJIMARIUM_GEM);
  		}
 		if (ResourcesConfig.RESOURCES.metals.toujourium.enabled) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_TOUJOURIUM_GEM);
  		}
 		if (ResourcesConfig.RESOURCES.metals.argentorium.enabled) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_ARGENTORIUM_GEM);
  		}
 		if (ResourcesConfig.RESOURCES.metals.quartarium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_QUARTARIUM_GEM);
  		}
  		
  		//resources - element items
  		if (ResourcesConfig.RESOURCES.metals.base.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_BASE_ELEMENT);
  		}
  		if (ResourcesConfig.RESOURCES.metals.oedldoedl.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_OEDLDOEDL_ELEMENT);
  		}
  		if (ResourcesConfig.RESOURCES.misc.developerElements.enabled) 
  		{
	  		event.getRegistry().register(ItemInit.ITEM_TIMOFIUM_ELEMENT);
	  		event.getRegistry().register(ItemInit.ITEM_FLOFINIUM_ELEMENT);
	  		event.getRegistry().register(ItemInit.ITEM_LAARSIUM_ELEMENT);
	  		event.getRegistry().register(ItemInit.ITEM_KLAARSIUM_ELEMENT);
	  		event.getRegistry().register(ItemInit.ITEM_SHARANIUM_ELEMENT);
	  		event.getRegistry().register(ItemInit.ITEM_MAKERIUM_ELEMENT);
	  		event.getRegistry().register(ItemInit.ITEM_INDERIUM_ELEMENT);
	  		event.getRegistry().register(ItemInit.ITEM_PUMARIUM_ELEMENT);
	  		event.getRegistry().register(ItemInit.ITEM_CALLAXIUM_ELEMENT);
	  		event.getRegistry().register(ItemInit.ITEM_SKORPIUM_ELEMENT);
	  		event.getRegistry().register(ItemInit.ITEM_STUPIDIUM_ELEMENT);
  		}
 		
  		//resources - dust items
  		if (ResourcesConfig.RESOURCES.metals.base.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_BASE_DUST);
  		}
  		if (ResourcesConfig.RESOURCES.metals.oedldoedl.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_OEDLDOEDL_DUST);
  		}
  		if (ResourcesConfig.RESOURCES.dusts.ender.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_ENDER_DUST);
  		}
  		if (ResourcesConfig.RESOURCES.dusts.sulfur.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_SULFUR_DUST);
  		}
  		if (ResourcesConfig.RESOURCES.dusts.saltpeter.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_SALTPETER_DUST);
  		}
  		if (ResourcesConfig.RESOURCES.dusts.salt.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_SALT_DUST);
  		}

  		//resources - shard items
  		if (ResourcesConfig.RESOURCES.metals.base.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_BASE_SHARD);
  		}
  		if (ResourcesConfig.RESOURCES.stars.oedldoedlStar.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_OEDLDOEDL_SHARD);
  		}
  		if (ResourcesConfig.RESOURCES.stars.infinityStar.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_INFINITY_SHARD);
  		}
  		if (ResourcesConfig.RESOURCES.metals.gremorium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_GREMORIUM_SHARD);
  		}
  		if (ResourcesConfig.RESOURCES.metals.himejimarium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_HIMEJIMARIUM_SHARD);
  		}
  		if (ResourcesConfig.RESOURCES.metals.toujourium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_TOUJOURIUM_SHARD);
  		}
  		if (ResourcesConfig.RESOURCES.metals.argentorium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_ARGENTORIUM_SHARD);
  		}
  		if (ResourcesConfig.RESOURCES.metals.quartarium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_QUARTARIUM_SHARD);
  		}
  		
  		//resources - nugget items
  		if (ResourcesConfig.RESOURCES.metals.base.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_BASE_NUGGET);
  		}
  		if (ResourcesConfig.RESOURCES.metals.oedldoedl.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_OEDLDOEDL_NUGGET);
  		}
  		if (ResourcesConfig.RESOURCES.metals.bedrockium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_BEDROCKIUM_NUGGET);
  		}
  		if (ResourcesConfig.RESOURCES.metals.drunkium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_DRUNKIUM_NUGGET);
  		}
  		if (ResourcesConfig.RESOURCES.metals.sadistium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_SADISTIUM_NUGGET);
  		}
  		if (ResourcesConfig.RESOURCES.metals.dimension.overworldEnabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_OVERWORLD_NUGGET);
  		}
  		if (ResourcesConfig.RESOURCES.metals.dimension.netherEnabled) 
  		{
			event.getRegistry().register(ItemInit.ITEM_NETHER_NUGGET);
  		}
  		if (ResourcesConfig.RESOURCES.metals.dimension.endEnabled) 
  		{
			event.getRegistry().register(ItemInit.ITEM_END_NUGGET);
  		}
  		if (ResourcesConfig.RESOURCES.metals.gremorium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_GREMORIUM_NUGGET);
  		}
  		if (ResourcesConfig.RESOURCES.metals.himejimarium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_HIMEJIMARIUM_NUGGET);
  		}
  		if (ResourcesConfig.RESOURCES.metals.toujourium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_TOUJOURIUM_NUGGET);
  		}
  		if (ResourcesConfig.RESOURCES.metals.argentorium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_ARGENTORIUM_NUGGET);
  		}
  		if (ResourcesConfig.RESOURCES.metals.quartarium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_QUARTARIUM_NUGGET);
  		}
  		
  		//resources - fragemnt items
  		if (ResourcesConfig.RESOURCES.metals.base.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_BASE_FRAGMENT);
  		}
  		if (ResourcesConfig.RESOURCES.metals.oedldoedl.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_OEDLDOEDL_FRAGMENT);
  		}
  		if (ResourcesConfig.RESOURCES.misc.developerElements.enabled) 
  		{
	  		event.getRegistry().register(ItemInit.ITEM_TIMOFIUM_FRAGMENT);
	  		event.getRegistry().register(ItemInit.ITEM_FLOFINIUM_FRAGMENT);
	  		event.getRegistry().register(ItemInit.ITEM_LAARSIUM_FRAGMENT);
	  		event.getRegistry().register(ItemInit.ITEM_KLAARSIUM_FRAGMENT);
	  		event.getRegistry().register(ItemInit.ITEM_SHARANIUM_FRAGMENT);
	  		event.getRegistry().register(ItemInit.ITEM_MAKERIUM_FRAGMENT);
	  		event.getRegistry().register(ItemInit.ITEM_INDERIUM_FRAGMENT);
	  		event.getRegistry().register(ItemInit.ITEM_PUMARIUM_FRAGMENT);
	  		event.getRegistry().register(ItemInit.ITEM_CALLAXIUM_FRAGMENT);
	  		event.getRegistry().register(ItemInit.ITEM_SKORPIUM_FRAGMENT);
	  		event.getRegistry().register(ItemInit.ITEM_STUPIDIUM_FRAGMENT);
  		}
  		
  		//resources - singularity items
  		if (ResourcesConfig.RESOURCES.metals.base.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_BASE_SINGULARITY);
  		}
  		if (ResourcesConfig.RESOURCES.metals.oedldoedl.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_OEDLDOEDL_SINGULARITY);
  		}
  		if (ResourcesConfig.RESOURCES.metals.gremorium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_GREMORIUM_SINGULARITY);
  		}
  		if (ResourcesConfig.RESOURCES.metals.himejimarium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_HIMEJIMARIUM_SINGULARITY);
  		}
  		if (ResourcesConfig.RESOURCES.metals.toujourium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_TOUJOURIUM_SINGULARITY);
  		}
  		if (ResourcesConfig.RESOURCES.metals.argentorium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_ARGENTORIUM_SINGULARITY);
  		}
  		if (ResourcesConfig.RESOURCES.metals.quartarium.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_QUARTARIUM_SINGULARITY);
  		}
  	
  		//resources - catalyst items
  		if (ResourcesConfig.RESOURCES.metals.oedldoedl.enabled) 
  		{
			event.getRegistry().register(ItemInit.ITEM_OEDLDOEDL_CATALYST);
  		}
  		if (ResourcesConfig.RESOURCES.metals.chaos.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_CHAOS_CATALYST);
  		}
  		
  		//resources - misc items
  		if (ResourcesConfig.RESOURCES.misc.balancedClay.enabled) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_BALANCED_CLAY);
  		}
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Block block : BlockInit.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
		
		for(Item item : ItemInit.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
	}

	public static void preInitRegistries(FMLPreInitializationEvent event) 
	{

	}
	
	public static void InitRegistries(FMLInitializationEvent event) 
	{
		
	}
	
	public static void postInitRegistries(FMLPostInitializationEvent event) 
	{

	}
}