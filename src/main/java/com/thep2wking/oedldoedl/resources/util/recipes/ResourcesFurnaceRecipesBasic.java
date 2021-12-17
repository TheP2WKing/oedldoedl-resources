package com.thep2wking.oedldoedl.resources.util.recipes;

import com.thep2wking.oedldoedl.resources.config.ResourcesConfig;
import com.thep2wking.oedldoedl.resources.init.BlockInit;
import com.thep2wking.oedldoedl.resources.init.ItemInit;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ResourcesFurnaceRecipesBasic 
{
	public static void init()
	{
  		if (ResourcesConfig.RESOURCES.metals.bedrockium.enabled && ResourcesConfig.GENEREL.recipes.smelting.bedrockEnabled) 
  		{
  			GameRegistry.addSmelting(BlockInit.BLOCK_BEDROCKIUM, new ItemStack(Blocks.BEDROCK, 1), 10.0f);
  		}
  		if (ResourcesConfig.RESOURCES.metals.dimension.overworldEnabled) 
  		{
			for (ItemStack ore : OreDictionary.getOres("dirt"))
            {
				GameRegistry.addSmelting(ore, new ItemStack(ItemInit.ITEM_OVERWORLD_INGOT, 1), 0.7f);		
            }
			for (ItemStack ore : OreDictionary.getOres("grass"))
            {
				GameRegistry.addSmelting(ore, new ItemStack(ItemInit.ITEM_OVERWORLD_INGOT, 1), 0.7f);
            }
  		}
  		if (ResourcesConfig.RESOURCES.metals.dimension.netherEnabled) 
  		{
	  		GameRegistry.addSmelting(Blocks.NETHER_BRICK, new ItemStack(ItemInit.ITEM_NETHER_INGOT, 1), 0.7f);
	  		GameRegistry.addSmelting(Blocks.RED_NETHER_BRICK, new ItemStack(ItemInit.ITEM_NETHER_INGOT, 1), 0.7f);
  		}
  		if (ResourcesConfig.RESOURCES.metals.dimension.endEnabled) 
  		{
			for (ItemStack ore : OreDictionary.getOres("endstone"))
            {
				GameRegistry.addSmelting(ore, new ItemStack(ItemInit.ITEM_END_INGOT, 1), 0.7f);
            }
	  		GameRegistry.addSmelting(Blocks.END_BRICKS, new ItemStack(ItemInit.ITEM_END_INGOT, 1), 0.7f);
	  	}
	}
}