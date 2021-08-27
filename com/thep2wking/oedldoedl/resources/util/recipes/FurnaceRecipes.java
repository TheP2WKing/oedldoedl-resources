package com.thep2wking.oedldoedl.resources.util.recipes;

import com.thep2wking.oedldoedl.core.config.constants.CoreConst;
import com.thep2wking.oedldoedl.core.config.constants.ResourcesConst;
import com.thep2wking.oedldoedl.resources.init.BlockInit;
import com.thep2wking.oedldoedl.resources.init.ItemInit;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnaceRecipes 
{
	public static void init()
	{
  		if (ResourcesConst.DUST_BASE && ResourcesConst.INGOT_BASE) 
  		{
  			GameRegistry.addSmelting(ItemInit.ITEM_DUST_BASE, new ItemStack(ItemInit.ITEM_INGOT_BASE, 1), 0.7f);
  		}
  		if (ResourcesConst.OEDLDOEDL_DUST && ResourcesConst.OEDLDOEDL_INGOT) 
  		{
  			GameRegistry.addSmelting(ItemInit.ITEM_OEDLDOEDL_DUST, new ItemStack(ItemInit.ITEM_OEDLDOEDL_INGOT, 1), 0.7f);
  		}
  		if (ResourcesConst.OEDLDOEDL_ORE && ResourcesConst.OEDLDOEDL_INGOT) 
  		{
  			GameRegistry.addSmelting(BlockInit.BLOCK_OEDLDOEDL_ORE, new ItemStack(ItemInit.ITEM_OEDLDOEDL_INGOT, 1), 0.7f);
  		}
  		if (ResourcesConst.SALT_ORE && ResourcesConst.SALT_DUST) 
  		{
  			GameRegistry.addSmelting(BlockInit.BLOCK_SALT_ORE, new ItemStack(ItemInit.ITEM_SALT_DUST, 1), 0.7f);
  		}
  		if (ResourcesConst.GREMORIUM_GEM_ORE && ResourcesConst.USELESSIUM_INGOT) 
  		{
  			GameRegistry.addSmelting(BlockInit.BLOCK_GREMORIUM_GEM_ORE, new ItemStack(ItemInit.ITEM_USELESSIUM_INGOT, 1), 0.7f);
  		}
  		if (ResourcesConst.HIMEJIMARIUM_GEM_ORE && ResourcesConst.USELESSIUM_INGOT) 
  		{
  			GameRegistry.addSmelting(BlockInit.BLOCK_HIMEJIMARIUM_GEM_ORE, new ItemStack(ItemInit.ITEM_USELESSIUM_INGOT, 1), 0.7f);
  		}
  		if (ResourcesConst.TOUJOURIUM_GEM_ORE && ResourcesConst.USELESSIUM_INGOT) 
  		{
  			GameRegistry.addSmelting(BlockInit.BLOCK_TOUJOURIUM_GEM_ORE, new ItemStack(ItemInit.ITEM_USELESSIUM_INGOT, 1), 0.7f);
  		}
  		if (ResourcesConst.ARGENTORIUM_GEM_ORE && ResourcesConst.USELESSIUM_INGOT) 
  		{
  			GameRegistry.addSmelting(BlockInit.BLOCK_ARGENTORIUM_GEM_ORE, new ItemStack(ItemInit.ITEM_USELESSIUM_INGOT, 1), 0.7f);
  		}
  		if (ResourcesConst.QUARTARIUM_GEM_ORE && ResourcesConst.USELESSIUM_INGOT) 
  		{
  			GameRegistry.addSmelting(BlockInit.BLOCK_QUARTARIUM_GEM_ORE, new ItemStack(ItemInit.ITEM_USELESSIUM_INGOT, 1), 0.7f);
  		}
  		GameRegistry.addSmelting(BlockInit.BLOCK_BEDROCKIUM, new ItemStack(Blocks.field_150357_h, 1), 10.0f);
	}
}