package net.thep2wking.oedldoedlresources.content.block.ore;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.api.block.ModBlockOreBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;
import net.thep2wking.oedldoedlresources.init.ModItems;

public class BlockEnderOre extends ModBlockOreBase {
	public BlockEnderOre(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.ENDER_DUST;
	}

	@Override
	public int quantityDropped(Random rand) {
		int min = 1;
		int max = 2;
		return rand.nextInt(max) + min;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		if (ResourcesConfig.CONTENT.ENDER_ORE_PARTICLES) {
			this.spawnParticles(worldIn, pos);
		}
	}

	private void spawnParticles(World worldIn, BlockPos pos) {
		Random random = worldIn.rand;

		for (int i = 0; i < 6; ++i) {
			double d1 = (double) ((float) pos.getX() + random.nextFloat());
			double d2 = (double) ((float) pos.getY() + random.nextFloat());
			double d3 = (double) ((float) pos.getZ() + random.nextFloat());

			if (i == 0 && !worldIn.getBlockState(pos.up()).isOpaqueCube()) {
				d2 = (double) pos.getY() + 0.0625D + 1.0D;
			}
			if (i == 1 && !worldIn.getBlockState(pos.down()).isOpaqueCube()) {
				d2 = (double) pos.getY() - 0.0625D;
			}
			if (i == 2 && !worldIn.getBlockState(pos.south()).isOpaqueCube()) {
				d3 = (double) pos.getZ() + 0.0625D + 1.0D;
			}
			if (i == 3 && !worldIn.getBlockState(pos.north()).isOpaqueCube()) {
				d3 = (double) pos.getZ() - 0.0625D;
			}
			if (i == 4 && !worldIn.getBlockState(pos.east()).isOpaqueCube()) {
				d1 = (double) pos.getX() + 0.0625D + 1.0D;
			}
			if (i == 5 && !worldIn.getBlockState(pos.west()).isOpaqueCube()) {
				d1 = (double) pos.getX() - 0.0625D;
			}
			if (d1 < (double) pos.getX() || d1 > (double) (pos.getX() + 1) || d2 < 0.0D
					|| d2 > (double) (pos.getY() + 1) || d3 < (double) pos.getZ() || d3 > (double) (pos.getZ() + 1)) {
				worldIn.spawnParticle(EnumParticleTypes.PORTAL, d1, d2, d3, 0.0D, 0.0D, 0.0D);
			}
		}
	}
}