package com.thep2wking.oedldoedl.resources.util.handler;

import com.thep2wking.oedldoedl.core.config.constants.ResourcesConst;
import com.thep2wking.oedldoedl.core.util.interfaces.IHasModel;
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
  		if (ResourcesConst.STAR_BASE_BLOCK) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_STAR_BASE);
  		}
  		if (ResourcesConst.OEDLDOEDL_STAR_BLOCK) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_OEDLDOEDL_STAR);
  		}
  		if (ResourcesConst.INFINITY_STAR_BLOCK) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_INFINITY_STAR);
  		}
  		//resources - ingot blocks
  		if (ResourcesConst.INGOT_BASE_BLOCK) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_INGOT_BASE);
  		}
  		if (ResourcesConst.OEDLDOEDL_BLOCK) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_OEDLDOEDL);
  		}
  		if (ResourcesConst.BEDROCKIUM_BLOCK) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_BEDROCKIUM);
  		}	
  		if (ResourcesConst.DRUNKIUM_BLOCK) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_DRUNKIUM);
  		}
  		if (ResourcesConst.SADISTIUM_BLOCK) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_SADISTIUM);
  		}
  		if (ResourcesConst.USELESSIUM_BLOCK) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_USELESSIUM);
  		}
  		if (ResourcesConst.GREMORIUM_BLOCK) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_GREMORIUM);
  		}
  		if (ResourcesConst.HIMEJIMARIUM_BLOCK) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_HIMEJIMARIUM);
  		}
  		if (ResourcesConst.TOUJOURIUM_BLOCK) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_TOUJOURIUM);
  		}
  		if (ResourcesConst.ARGENTORIUM_BLOCK) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_ARGENTORIUM);
  		}
  		if (ResourcesConst.QUARTARIUM_BLOCK) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_QUARTARIUM);
  		}
		//resources - gem blocks
  		if (ResourcesConst.GEM_BASE_BLOCK) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_GEM_BASE);
  		}
  		//resources - ore blocks
  		if (ResourcesConst.OEDLDOEDL_ORE) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_OEDLDOEDL_ORE);
  		}
  		if (ResourcesConst.SALT_ORE) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_SALT_ORE);
  		}
  		if (ResourcesConst.GREMORIUM_GEM_ORE) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_GREMORIUM_GEM_ORE);
  		}
  		if (ResourcesConst.HIMEJIMARIUM_GEM_ORE) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_HIMEJIMARIUM_GEM_ORE);
  		}
  		if (ResourcesConst.TOUJOURIUM_GEM_ORE) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_TOUJOURIUM_GEM_ORE);
  		}
  		if (ResourcesConst.ARGENTORIUM_GEM_ORE) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_ARGENTORIUM_GEM_ORE);
  		}
  		if (ResourcesConst.QUARTARIUM_GEM_ORE) 
  		{
  			event.getRegistry().register(BlockInit.BLOCK_QUARTARIUM_GEM_ORE);
  		}
	}
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		//resources - star block items
  		if (ResourcesConst.STAR_BASE_BLOCK) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_STAR_BASE).setRegistryName("star_base_block"));
  		}
  		if (ResourcesConst.OEDLDOEDL_STAR_BLOCK) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_OEDLDOEDL_STAR).setRegistryName("oedldoedl_star_block"));
  		}
  		if (ResourcesConst.INFINITY_STAR_BLOCK) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_INFINITY_STAR).setRegistryName("infinity_star_block"));
  		}
  		//resources - ingot block items
  		if (ResourcesConst.INGOT_BASE_BLOCK) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_INGOT_BASE).setRegistryName("ingot_base_block"));
  		}
  		if (ResourcesConst.OEDLDOEDL_BLOCK) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_OEDLDOEDL).setRegistryName("oedldoedl_block"));
  		}
  		if (ResourcesConst.BEDROCKIUM_BLOCK) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_BEDROCKIUM).setRegistryName("bedrockium_block"));
  		}
  		if (ResourcesConst.DRUNKIUM_BLOCK) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_DRUNKIUM).setRegistryName("drunkium_block"));
  		}
  		if (ResourcesConst.SADISTIUM_BLOCK) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_SADISTIUM).setRegistryName("sadistium_block"));
  		}
  		if (ResourcesConst.USELESSIUM_BLOCK) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_USELESSIUM).setRegistryName("uselessium_block"));
  		}
  		if (ResourcesConst.GREMORIUM_BLOCK) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_GREMORIUM).setRegistryName("gremorium_block"));
  		}
  		if (ResourcesConst.HIMEJIMARIUM_BLOCK) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_HIMEJIMARIUM).setRegistryName("himejimarium_block"));
  		}
  		if (ResourcesConst.TOUJOURIUM_BLOCK) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_TOUJOURIUM).setRegistryName("toujourium_block"));
  		}
  		if (ResourcesConst.ARGENTORIUM_BLOCK) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_ARGENTORIUM).setRegistryName("argentorium_block"));
  		}
  		if (ResourcesConst.QUARTARIUM_BLOCK) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_QUARTARIUM).setRegistryName("quartarium_block"));
  		}
  		//resources - gem block items
  		if (ResourcesConst.GEM_BASE_BLOCK) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_GEM_BASE).setRegistryName("gem_base_block"));
  		}
  		//resources - ore block items
  		if (ResourcesConst.OEDLDOEDL_ORE) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_OEDLDOEDL_ORE).setRegistryName("oedldoedl_ore"));
  		}
  		if (ResourcesConst.SALT_ORE) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_SALT_ORE).setRegistryName("salt_ore"));
  		}
  		if (ResourcesConst.GREMORIUM_GEM_ORE) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_GREMORIUM_GEM_ORE).setRegistryName("gremorium_gem_ore"));
  		}
  		if (ResourcesConst.HIMEJIMARIUM_GEM_ORE) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_HIMEJIMARIUM_GEM_ORE).setRegistryName("himejimarium_gem_ore"));
  		}
  		if (ResourcesConst.TOUJOURIUM_GEM_ORE) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_TOUJOURIUM_GEM_ORE).setRegistryName("toujourium_gem_ore"));
  		}
  		if (ResourcesConst.ARGENTORIUM_GEM_ORE) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_ARGENTORIUM_GEM_ORE).setRegistryName("argentorium_gem_ore"));
  		}
  		if (ResourcesConst.QUARTARIUM_GEM_ORE) 
  		{
  			event.getRegistry().register(new ItemBlock(BlockInit.BLOCK_QUARTARIUM_GEM_ORE).setRegistryName("quartarium_gem_ore"));
  		}
  		//resources - star items
  		if (ResourcesConst.STAR_BASE) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_STAR_BASE);
  		}
  		if (ResourcesConst.OEDLDOEDL_STAR) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_OEDLDOEDL_STAR);
  		}
  		if (ResourcesConst.INFINITY_STAR) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_INFINITY_STAR);
  		}
  		//resources - ingot items
  		if (ResourcesConst.INGOT_BASE) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_INGOT_BASE);
  		}
  		if (ResourcesConst.OEDLDOEDL_INGOT) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_OEDLDOEDL_INGOT);
  		}
  		if (ResourcesConst.BEDROCKIUM_INGOT) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_BEDROCKIUM_INGOT);
  		}
  		if (ResourcesConst.DRUNKIUM_INGOT) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_DRUNKIUM_INGOT);
  		}
  		if (ResourcesConst.SADISTIUM_INGOT) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_SADISTIUM_INGOT);
  		}
  		if (ResourcesConst.USELESSIUM_INGOT) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_USELESSIUM_INGOT);
  		}
  		if (ResourcesConst.GREMORIUM_INGOT) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_GREMORIUM_INGOT);
  		}
  		if (ResourcesConst.HIMEJIMARIUM_INGOT) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_HIMEJIMARIUM_INGOT);
  		}
  		if (ResourcesConst.TOUJOURIUM_INGOT) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_TOUJOURIUM_INGOT);
  		}
  		if (ResourcesConst.ARGENTORIUM_INGOT) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_ARGENTORIUM_INGOT);
  		}
  		if (ResourcesConst.QUARTARIUM_INGOT) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_QUARTARIUM_INGOT);
  		}
  		if (ResourcesConst.CHAOS_INGOT) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_CHAOS_INGOT);
  		}
  		//resources - gem items
 		if (ResourcesConst.GEM_BASE) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_GEM_BASE);
  		}
 		if (ResourcesConst.OEDLDOEDL_GEM) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_OEDLDOEDL_GEM);
  		}
 		if (ResourcesConst.TIMOFIUM_GEM) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_TIMOFIUM_GEM);
  		}
 		if (ResourcesConst.FLOFINIUM_GEM) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_FLOFINIUM_GEM);
  		}
 		if (ResourcesConst.LAARSIUM_GEM) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_LAARSIUM_GEM);
  		}
 		if (ResourcesConst.KLAARSIUM_GEM) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_KLAARSIUM_GEM);
  		}
 		if (ResourcesConst.SHARANIUM_GEM) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_SHARANIUM_GEM);
  		}
 		if (ResourcesConst.MAKERIUM_GEM) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_MAKERIUM_GEM);
  		}
 		if (ResourcesConst.INDERIUM_GEM) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_INDERIUM_GEM);
  		}
 		if (ResourcesConst.PUMARIUM_GEM) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_PUMARIUM_GEM);
  		}
 		if (ResourcesConst.CALLAXIUM_GEM) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_CALLAXIUM_GEM);
  		}
 		if (ResourcesConst.SKORPIUM_GEM) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_SKORPIUM_GEM);
  		}
 		if (ResourcesConst.STUPIDIUM_GEM) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_STUPIDIUM_GEM);
  		}
 		if (ResourcesConst.GREMORIUM_GEM) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_GREMORIUM_GEM);
  		}
 		if (ResourcesConst.HIMEJIMARIUM_GEM) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_HIMEJIMARIUM_GEM);
  		}
 		if (ResourcesConst.TOUJOURIUM_GEM) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_TOUJOURIUM_GEM);
  		}
 		if (ResourcesConst.ARGENTORIUM_GEM) 
  		{
 			event.getRegistry().register(ItemInit.ITEM_ARGENTORIUM_GEM);
  		}
 		if (ResourcesConst.QUARTARIUM_GEM) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_QUARTARIUM_GEM);
  		}
  		//resources - shard items
  		if (ResourcesConst.SHARD_BASE) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_SHARD_BASE);
  		}
  		if (ResourcesConst.OEDLDOEDL_SHARD) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_OEDLDOEDL_SHARD);
  		}
  		if (ResourcesConst.INFINITY_SHARD) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_INFINITY_SHARD);
  		}
  		//resources - nugget items
  		if (ResourcesConst.NUGGET_BASE) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_NUGGET_BASE);
  		}
  		if (ResourcesConst.OEDLDOEDL_NUGGET) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_OEDLDOEDL_NUGGET);
  		}
  		if (ResourcesConst.BEDROCKIUM_NUGGET) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_BEDROCKIUM_NUGGET);
  		}
  		if (ResourcesConst.DRUNKIUM_NUGGET) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_DRUNKIUM_NUGGET);
  		}
  		if (ResourcesConst.SADISTIUM_NUGGET) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_SADISTIUM_NUGGET);
  		}
		if (ResourcesConst.USELESSIUM_NUGGET) 
  		{
			event.getRegistry().register(ItemInit.ITEM_USELESSIUM_NUGGET);
  		}
  		if (ResourcesConst.GREMORIUM_NUGGET) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_GREMORIUM_NUGGET);
  		}
  		if (ResourcesConst.HIMEJIMARIUM_NUGGET) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_HIMEJIMARIUM_NUGGET);
  		}
  		if (ResourcesConst.TOUJOURIUM_NUGGET) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_TOUJOURIUM_NUGGET);
  		}
  		if (ResourcesConst.ARGENTORIUM_NUGGET) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_ARGENTORIUM_NUGGET);
  		}
  		if (ResourcesConst.QUARTARIUM_NUGGET) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_QUARTARIUM_NUGGET);
  		}
  		//resources - dust items
  		if (ResourcesConst.DUST_BASE) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_DUST_BASE);
  		}
  		if (ResourcesConst.OEDLDOEDL_DUST) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_OEDLDOEDL_DUST);
  		}
  		if (ResourcesConst.SALT_DUST) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_SALT_DUST);
  		}
  		//resources - singularity items
  		if (ResourcesConst.SINGULARITY_BASE) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_SINGULARITY_BASE);
  		}
  		if (ResourcesConst.OEDLDOEDL_SINGULARITY) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_OEDLDOEDL_SINGULARITY);
  		}
  		if (ResourcesConst.GREMORIUM_SINGULARITY) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_GREMORIUM_SINGULARITY);
  		}
  		if (ResourcesConst.HIMEJIMARIUM_SINGULARITY) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_HIMEJIMARIUM_SINGULARITY);
  		}
  		if (ResourcesConst.TOUJOURIUM_SINGULARITY) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_TOUJOURIUM_SINGULARITY);
  		}
  		if (ResourcesConst.ARGENTORIUM_SINGULARITY) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_ARGENTORIUM_SINGULARITY);
  		}
  		if (ResourcesConst.QUARTARIUM_SINGULARITY) 
  		{
  			event.getRegistry().register(ItemInit.ITEM_QUARTARIUM_SINGULARITY);
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