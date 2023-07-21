package net.thep2wking.oedldoedlresources.content.block.ore;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.thep2wking.oedldoedlcore.api.block.ModBlockOreBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;
import net.thep2wking.oedldoedlresources.init.ModBlocks;
import net.thep2wking.oedldoedlresources.init.ModItems;

public class BlockNetherGemOre extends ModBlockOreBase {
	public BlockNetherGemOre(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, float lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		if (this == ModBlocks.NETHER_GREMORIUM_ORE) {
			return ModItems.GREMORIUM_SHARD;
		} else if (this == ModBlocks.NETHER_HIMEJIMARIUM_ORE) {
			return ModItems.HIMEJIMARIUM_SHARD;
		} else if (this == ModBlocks.NETHER_TOUJOURIUM_ORE) {
			return ModItems.TOUJOURIUM_SHARD;
		} else if (this == ModBlocks.NETHER_ARGENTORIUM_ORE) {
			return ModItems.ARGENTORIUM_SHARD;
		} else if (this == ModBlocks.NETHER_QUARTARIUM_ORE) {
			return ModItems.QUARTARIUM_SHARD;
		} else if (this == ModBlocks.NETHER_NAGATORIUM_ORE) {
			return ModItems.NAGATORIUM_SHARD;
		} else {
			return this == ModBlocks.NETHER_SAKURAJIMARIUM_ORE ? ModItems.SAKURAJIMARIUM_SHARD : Item.getItemFromBlock(this);
		}
	}

	@Override
	public int quantityDropped(Random rand) {
		int min = 1;
		int max = 1;
		return rand.nextInt(max) + min;
	}
}