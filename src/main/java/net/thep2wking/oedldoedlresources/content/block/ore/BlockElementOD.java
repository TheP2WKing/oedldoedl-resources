package net.thep2wking.oedldoedlresources.content.block.ore;

import java.util.ArrayList;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.thep2wking.oedldoedlcore.api.block.ModBlockOreBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;
import net.thep2wking.oedldoedlresources.init.ModItems;

public class BlockElementOD extends ModBlockOreBase {
	public BlockElementOD(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, float lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
	}

	@Override
	public ArrayList<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState blockstate, int fortune) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		if (RANDOM.nextFloat() > 0.80f) {
			drops.add(new ItemStack(ModItems.BALANCED_CLAY, 1));
		}
		if (RANDOM.nextFloat() > 0.80f) {
			drops.add(new ItemStack(ModItems.BALANCED_CLAY, 1));
		}
		if (RANDOM.nextFloat() > 0.80f) {
			drops.add(new ItemStack(ModItems.BALANCED_CLAY, 1));
		}
		if (RANDOM.nextFloat() > 0.80f) {
			drops.add(new ItemStack(ModItems.BALANCED_CLAY, 1));
		}
		if (RANDOM.nextFloat() > 0.80f) {
			drops.add(new ItemStack(ModItems.BALANCED_CLAY, 1));
		}
		if (RANDOM.nextFloat() > 0.80f) {
			drops.add(new ItemStack(ModItems.BALANCED_CLAY, 1));
		}
		if (RANDOM.nextFloat() > 0.80f) {
			drops.add(new ItemStack(ModItems.BALANCED_CLAY, 1));
		}
		if (RANDOM.nextFloat() > 0.80f) {
			drops.add(new ItemStack(ModItems.BALANCED_CLAY, 1));
		}
		if (RANDOM.nextFloat() > 0.80f) {
			drops.add(new ItemStack(ModItems.BALANCED_CLAY, 1));
		}
		if (RANDOM.nextFloat() > 0.80f) {
			drops.add(new ItemStack(ModItems.BALANCED_CLAY, 1));
		}
		if (RANDOM.nextFloat() > 0.80f) {
			drops.add(new ItemStack(ModItems.BALANCED_CLAY, 1));
		}
		return drops;
	}
}