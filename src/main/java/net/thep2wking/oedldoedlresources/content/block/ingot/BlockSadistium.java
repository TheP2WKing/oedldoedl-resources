package net.thep2wking.oedldoedlresources.content.block.ingot;

import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;
import net.thep2wking.oedldoedlcore.util.ModTooltips;
import net.thep2wking.oedldoedlcore.util.ModTopTooltips;
import net.thep2wking.oedldoedlresources.api.block.ModBlockEffectBase;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;

public class BlockSadistium extends ModBlockEffectBase {
	public final Potion effect2;
	public final Potion effect3;

	public BlockSadistium(String modid, String name, CreativeTabs tab, Material material, SoundType sound,
			MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness, float resistance,
			int lightLevel, Potion effect, Potion effect2, Potion effect3, boolean isDebuff) {
		super(modid, name, tab, material, sound, mapColor, harvestLevel, toolType, hardness, resistance, lightLevel,
				effect, isDebuff);
		this.effect2 = effect2;
		this.effect3 = effect3;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
		if (entityIn instanceof EntityLivingBase && ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_WALKING_EFFECTS
				&& ResourcesConfig.PROPERTIES.EFFECTS.EFFECTS_EBALED) {
			((EntityLivingBase) entityIn).addPotionEffect(
					new PotionEffect(effect, ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_WALKING_BASE_DURATION,
							ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_WALKING_BASE_AMPLIFIER - 1 + 2, false, false));
			((EntityLivingBase) entityIn).addPotionEffect(
					new PotionEffect(effect2, ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_WALKING_BASE_DURATION,
							ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_WALKING_BASE_AMPLIFIER - 1 + 1, false, false));
			((EntityLivingBase) entityIn).addPotionEffect(
					new PotionEffect(effect3, 10, 0, false, false));
		}
	}

	public int getEffect() {
		return ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_WALKING_BASE_AMPLIFIER + 2;
	}

	public int getEffect2() {
		return ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_WALKING_BASE_AMPLIFIER + 1;
	}

	public int getEffect3() {
		return 1;
	}

	@Override
	public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world,
			IBlockState blockState, IProbeHitData data) {
		if (player.isSneaking() && ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_WALKING_EFFECTS
				&& ResourcesConfig.PROPERTIES.EFFECTS.EFFECTS_EBALED) {
			ModTopTooltips.addEffectHeader(mode, probeInfo, player, world, blockState, data,
					ModTooltips.EFFECT_WALKING_ON);
			ModTopTooltips.addPotionEffect(mode, probeInfo, player, world, blockState, data, effect.getName(),
					isDebuff, getEffect(), ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_BASE_DURATION);
			ModTopTooltips.addPotionEffect(mode, probeInfo, player, world, blockState, data, effect2.getName(),
					isDebuff, getEffect2(), ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_BASE_DURATION);
			ModTopTooltips.addPotionEffect(mode, probeInfo, player, world, blockState, data, effect3.getName(),
					isDebuff, getEffect3(), 20);
		} else if (ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_WALKING_EFFECTS
				&& ResourcesConfig.PROPERTIES.EFFECTS.EFFECTS_EBALED) {
			ModTopTooltips.addKey(mode, probeInfo, player, world, blockState, data, ModTopTooltips.TOP_EFFECTS);
		}
	}
}