package net.thep2wking.oedldoedlresources.content.block.ore;

import java.util.List;
import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.oredict.OreDictionary;
import net.thep2wking.oedldoedlcore.api.block.ModBlockOreBase;
import net.thep2wking.oedldoedlcore.util.ModRandomUtil;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;

public class BlockElementOD extends ModBlockOreBase {
	public static final List<ItemStack> DROPS = OreDictionary.getOres("fragmentDrop");
	
	public BlockElementOD(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
	}

	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state,
			int fortune) {
		if (ResourcesConfig.CONTENT.ELEMENT_OD_RANDOM_DROPS) {
			Random random = new Random();
			ItemStack randomItem = ModRandomUtil.selectRandom(random, DROPS);
			randomItem.setCount(random.nextInt(ResourcesConfig.CONTENT.ELEMENT_OD_DROP_BOUND) + 1);
			drops.add(randomItem);
		} else {
			drops.add(new ItemStack(Blocks.END_STONE, 1, 0));
		}
	}
}