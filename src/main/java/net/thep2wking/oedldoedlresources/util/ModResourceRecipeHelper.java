package net.thep2wking.oedldoedlresources.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModResourceRecipeHelper {
	// metals
	public static void addNuggetToIngotAndBack(String modid, String material, Item nugget, Item ingot) {
		if (nugget != null && ingot != null) {
			GameRegistry.addShapedRecipe(new ResourceLocation(modid, "conversion/" + material + "_ingot_from_nugget"),
					null, new ItemStack(ingot, 1), "AAA", "AAA", "AAA", 'A',
					"nugget" + material.substring(0, 1).toUpperCase() + material.substring(1));
		}

		if (nugget != null && ingot != null) {
			GameRegistry.addShapedRecipe(new ResourceLocation(modid, "conversion/" + material + "_nugget_from_ingot"),
					null, new ItemStack(nugget, 9), "A", 'A',
					"ingot" + material.substring(0, 1).toUpperCase() + material.substring(1));
		}
	}

	public static void addIngotToBlockAndBack(String modid, String material, Item ingot, Block block) {
		if (ingot != null && block != null) {
			GameRegistry.addShapedRecipe(new ResourceLocation(modid, "conversion/" + material + "_block_from_ingot"),
					null, new ItemStack(Item.getItemFromBlock(block), 1), "AAA", "AAA", "AAA", 'A',
					"ingot" + material.substring(0, 1).toUpperCase() + material.substring(1));
		}

		if (ingot != null && block != null) {
			GameRegistry.addShapedRecipe(new ResourceLocation(modid, "conversion/" + material + "_ingot_from_block"),
					null, new ItemStack(ingot, 9), "A", 'A',
					"block" + material.substring(0, 1).toUpperCase() + material.substring(1));
		}
	}

	public static void addMetalConversion(String modid, String material, Item nugget, Item ingot, Block block) {
		addNuggetToIngotAndBack(modid, material, nugget, ingot);
		addIngotToBlockAndBack(modid, material, ingot, block);
	}

	// gems
	public static void addShardToGemAndBack(String modid, String material, Item shard, Item gem) {
		if (shard != null && gem != null) {
			GameRegistry.addShapedRecipe(new ResourceLocation(modid, "conversion/" + material + "_gem_from_shard"),
					null, new ItemStack(gem, 1), "AAA", "AAA", "AAA", 'A',
					"shard" + material.substring(0, 1).toUpperCase() + material.substring(1));
		}

		if (shard != null && gem != null) {
			GameRegistry.addShapedRecipe(new ResourceLocation(modid, "conversion/" + material + "_shard_from_gem"),
					null, new ItemStack(shard, 9), "A", 'A',
					"gem" + material.substring(0, 1).toUpperCase() + material.substring(1));
		}
	}

	public static void addGemToBlockAndBack(String modid, String material, Item gem, Block block) {
		if (gem != null && block != null) {
			GameRegistry.addShapedRecipe(new ResourceLocation(modid, "conversion/" + material + "_gem_block_from_gem"),
					null, new ItemStack(Item.getItemFromBlock(block), 1), "AAA", "AAA", "AAA", 'A',
					"gem" + material.substring(0, 1).toUpperCase() + material.substring(1));
		}

		if (gem != null && block != null) {
			GameRegistry.addShapedRecipe(new ResourceLocation(modid, "conversion/" + material + "_gem_from_gem_block"),
					null, new ItemStack(gem, 9), "A", 'A',
					"block" + material.substring(0, 1).toUpperCase() + material.substring(1) + "Gem");
		}
	}

	public static void addGemConversion(String modid, String material, Item shard, Item gem, Block block) {
		addShardToGemAndBack(modid, material, shard, gem);
		addGemToBlockAndBack(modid, material, gem, block);
	}

	// elements
	public static void addFragmentToElementAndBack(String modid, String material, Item fragment, Item element) {
		if (fragment != null && element != null) {
			GameRegistry.addShapedRecipe(
					new ResourceLocation(modid, "conversion/" + material + "_element_from_fragment"), null,
					new ItemStack(element, 1), "AAA", "AAA", "AAA", 'A',
					"fragment" + material.substring(0, 1).toUpperCase() + material.substring(1));
		}

		if (fragment != null && element != null) {
			GameRegistry.addShapedRecipe(
					new ResourceLocation(modid, "conversion/" + material + "_fragment_from_element"), null,
					new ItemStack(fragment, 9), "A", 'A',
					"element" + material.substring(0, 1).toUpperCase() + material.substring(1));
		}
	}

	public static void addElementToBlockAndBack(String modid, String material, Item element, Block block) {
		if (element != null && block != null) {
			GameRegistry.addShapedRecipe(
					new ResourceLocation(modid, "conversion/" + material + "_element_block_from_element"), null,
					new ItemStack(Item.getItemFromBlock(block), 1), "AAA", "AAA", "AAA", 'A',
					"element" + material.substring(0, 1).toUpperCase() + material.substring(1));
		}

		if (element != null && block != null) {
			GameRegistry.addShapedRecipe(
					new ResourceLocation(modid, "conversion/" + material + "_element_from_element_block"), null,
					new ItemStack(element, 9), "A", 'A',
					"block" + material.substring(0, 1).toUpperCase() + material.substring(1));
		}
	}

	public static void addElementConversion(String modid, String material, Item fragment, Item element, Block block) {
		addFragmentToElementAndBack(modid, material, fragment, element);
		addElementToBlockAndBack(modid, material, element, block);
	}

	// stars
	public static void addShardToStarAndBack(String modid, String material, Item shard, Item star) {
		if (shard != null && star != null) {
			GameRegistry.addShapedRecipe(
					new ResourceLocation(modid, "conversion/" + material + "_star_from_shard"), null,
					new ItemStack(star, 1), "AAA", "AAA", "AAA", 'A',
					"shard" + material.substring(0, 1).toUpperCase() + material.substring(1));
		}

		if (shard != null && star != null) {
			GameRegistry.addShapedRecipe(
					new ResourceLocation(modid, "conversion/" + material + "_shard_from_star"), null,
					new ItemStack(shard, 9), "A", 'A', material);
		}
	}

	public static void addStarToBlockAndBack(String modid, String material, Item star, Block block) {
		if (star != null && block != null) {
			GameRegistry.addShapedRecipe(
					new ResourceLocation(modid, "conversion/" + material + "_star_block_from_star"), null,
					new ItemStack(Item.getItemFromBlock(block), 1), "AAA", "AAA", "AAA", 'A', material);
		}

		if (star != null && block != null) {
			GameRegistry.addShapedRecipe(
					new ResourceLocation(modid, "conversion/" + material + "_star_from_star_block"), null,
					new ItemStack(star, 9), "A", 'A',
					"block" + material.substring(0, 1).toUpperCase() + material.substring(1));
		}
	}

	public static void addStarConversion(String modid, String material, Item shard, Item star, Block block) {
		addShardToStarAndBack(modid, material, shard, star);
		addStarToBlockAndBack(modid, material, star, block);
	}
}