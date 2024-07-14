package net.thep2wking.oedldoedlresources.content.block.misc;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.thep2wking.oedldoedlcore.api.block.ModBlockPlantBase;
import net.thep2wking.oedldoedlcore.util.ModPlantAABB;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;

public class BlockBaconAgaric extends ModBlockPlantBase {
	public BlockBaconAgaric(String modid, String name, CreativeTabs tab, ModPlantAABB aabb, boolean hasOffset,
			boolean isShareable, Material material, SoundType sound, MapColor mapColor, int harvestLevel,
			ModToolTypes toolType, float hardness, float resistance, int lightLevel) {
		super(modid, name, tab, aabb, hasOffset, isShareable, material, sound, mapColor, harvestLevel, toolType,
				hardness, resistance, lightLevel);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Items.PORKCHOP;
	}

	@Override
	public int quantityDropped(Random rand) {
		return 1;
	}

	@Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
		return 1;
	}

	@Override
	public boolean canSustainBush(IBlockState state) {
		return super.canSustainBush(state) || state.getBlock() == Blocks.STONE;
	}
}