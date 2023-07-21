package net.thep2wking.oedldoedlresources.content.block.ore;

import javax.annotation.Nonnull;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.oredict.OreDictionary;
import net.thep2wking.oedldoedlcore.api.block.ModBlockOreBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;

public class BlockRandomiteOre extends ModBlockOreBase {
	public BlockRandomiteOre(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
	}

	@Override
	@SuppressWarnings("null")
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state,
			int fortune) {
		float chance = 0.9f;
		for (@Nonnull
		ItemStack oreDictDrops : OreDictionary.getOres("randomiteDrop")) {
			if (RANDOM.nextFloat() > chance) {
				drops.add(oreDictDrops);
			}
		}
	}
}