package net.thep2wking.oedldoedlresources.content.block.ore;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.thep2wking.oedldoedlcore.api.block.ModBlockOreBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;

public class BlockGunpowderOre extends ModBlockOreBase {
	public BlockGunpowderOre(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Items.GUNPOWDER;
	}

	@Override
	public int quantityDropped(Random rand) {
		int min = 1;
		int max = 3;
		return rand.nextInt(max) + min;
	}
}