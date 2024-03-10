package net.thep2wking.oedldoedlresources.content.block.ore;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlcore.api.block.ModBlockOreBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;
import net.thep2wking.oedldoedlresources.init.ModItems;

public class BlockUraniumPowderOre extends ModBlockOreBase {
	public BlockUraniumPowderOre(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
	}

	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state,
			int fortune) {
		int random = new Random().nextInt(100);
		int chance = (int) (ResourcesConfig.CONTENT.URANIUM_POWER_ORE_DROP_CHANCE * 100);
		if (ResourcesConfig.CONTENT.URANIUM_POWER_ORE_DROP_CHANCE > 0) {
			if (random <= chance) {
				drops.add(new ItemStack(ModItems.URANIUM_POWDER, 1, 0));
			}
		}
	}

	@Override
	public boolean canDropFromExplosion(Explosion explosionIn) {
		return false;
	}

	@Override
	public void onBlockDestroyedByExplosion(World worldIn, BlockPos pos, Explosion explosionIn) {
		if (ResourcesConfig.CONTENT.URANIUM_POWER_ORE_EXPLODES) {
			if (!worldIn.isRemote) {
				worldIn.newExplosion(null, (double) ((float) pos.getX() + 0.5F), (double) pos.getY(),
						(double) ((float) pos.getZ() + 0.5F), 10.0f, true, true);
			}
		} else {
			super.onBlockDestroyedByExplosion(worldIn, pos, explosionIn);
		}
	}

	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
		if (ResourcesConfig.CONTENT.URANIUM_POWER_ORE_EXPLODES) {
			Random random = new Random();
			int explodeChance = random.nextInt(2);
			if (explodeChance == 0 && !worldIn.isRemote && !player.capabilities.isCreativeMode) {
				worldIn.newExplosion(null, (double) ((float) pos.getX() + 0.5F), (double) pos.getY(),
						(double) ((float) pos.getZ() + 0.5F), 10.0f, true, true);
			}
		} else {
			super.onBlockHarvested(worldIn, pos, state, player);
		}
	}
}