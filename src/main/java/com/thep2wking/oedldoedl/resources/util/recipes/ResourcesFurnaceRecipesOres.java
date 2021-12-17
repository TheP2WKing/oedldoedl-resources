package com.thep2wking.oedldoedl.resources.util.recipes;

import com.thep2wking.oedldoedl.resources.config.ResourcesConfig;
import com.thep2wking.oedldoedl.resources.init.BlockInit;
import com.thep2wking.oedldoedl.resources.init.ItemInit;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ResourcesFurnaceRecipesOres 
{
	public static void init()
	{
  		if (ResourcesConfig.RESOURCES.metals.base.enabled) 
  		{
  			GameRegistry.addSmelting(ItemInit.ITEM_BASE_DUST, new ItemStack(ItemInit.ITEM_BASE_INGOT, 1), 0.7f);
  		}
  		if (ResourcesConfig.RESOURCES.metals.oedldoedl.enabled) 
  		{
  			GameRegistry.addSmelting(ItemInit.ITEM_OEDLDOEDL_DUST, new ItemStack(ItemInit.ITEM_OEDLDOEDL_INGOT, 1), 0.7f);
			GameRegistry.addSmelting(BlockInit.BLOCK_OEDLDOEDL_ORE, new ItemStack(ItemInit.ITEM_OEDLDOEDL_INGOT, 1), 0.7f);
  		}
  		if (ResourcesConfig.RESOURCES.metals.gremorium.enabled) 
  		{
			GameRegistry.addSmelting(BlockInit.BLOCK_GREMORIUM_GEM_ORE, new ItemStack(ItemInit.ITEM_GREMORIUM_SHARD, 1), 0.7f);
  		}
  		if (ResourcesConfig.RESOURCES.metals.himejimarium.enabled) 
  		{
			GameRegistry.addSmelting(BlockInit.BLOCK_HIMEJIMARIUM_GEM_ORE, new ItemStack(ItemInit.ITEM_HIMEJIMARIUM_SHARD, 1), 0.7f);
  		}
  		if (ResourcesConfig.RESOURCES.metals.toujourium.enabled) 
  		{
			GameRegistry.addSmelting(BlockInit.BLOCK_TOUJOURIUM_GEM_ORE, new ItemStack(ItemInit.ITEM_TOUJOURIUM_SHARD, 1), 0.7f);
  		}
  		if (ResourcesConfig.RESOURCES.metals.argentorium.enabled) 
  		{
			GameRegistry.addSmelting(BlockInit.BLOCK_ARGENTORIUM_GEM_ORE, new ItemStack(ItemInit.ITEM_ARGENTORIUM_SHARD, 1), 0.7f);
  		}
  		if (ResourcesConfig.RESOURCES.metals.quartarium.enabled) 
  		{
			GameRegistry.addSmelting(BlockInit.BLOCK_QUARTARIUM_GEM_ORE, new ItemStack(ItemInit.ITEM_QUARTARIUM_SHARD, 1), 0.7f);
  		}
  		if (ResourcesConfig.RESOURCES.dusts.ender.enabled) 
  		{
  			GameRegistry.addSmelting(BlockInit.BLOCK_ENDER_ORE, new ItemStack(ItemInit.ITEM_ENDER_DUST, 1), 0.7f);
  		}
  		if (ResourcesConfig.RESOURCES.dusts.sulfur.enabled) 
  		{
  			GameRegistry.addSmelting(BlockInit.BLOCK_SULFUR_ORE, new ItemStack(ItemInit.ITEM_SULFUR_DUST, 1), 0.7f);
  		}
  		if (ResourcesConfig.RESOURCES.dusts.saltpeter.enabled) 
  		{
  			GameRegistry.addSmelting(BlockInit.BLOCK_SALTPETER_ORE, new ItemStack(ItemInit.ITEM_SALTPETER_DUST, 1), 0.7f);
  		}
  		if (ResourcesConfig.RESOURCES.dusts.salt.enabled) 
  		{
			GameRegistry.addSmelting(BlockInit.BLOCK_SALT_ORE, new ItemStack(ItemInit.ITEM_SALT_DUST, 1), 0.7f);
  		}
	}
}