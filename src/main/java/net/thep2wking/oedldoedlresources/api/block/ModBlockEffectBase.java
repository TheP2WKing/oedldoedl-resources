package net.thep2wking.oedldoedlresources.api.block;

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
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlcore.api.block.ModBlockBase;
import net.thep2wking.oedldoedlcore.integration.top.ITOPInfoProvider;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;
import net.thep2wking.oedldoedlcore.util.ModTooltips;
import net.thep2wking.oedldoedlcore.util.ModTopTooltips;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;

public class ModBlockEffectBase extends ModBlockBase implements ITOPInfoProvider {
	public final Potion effect;
	public final boolean isDebuff;

	public ModBlockEffectBase(String modid, String name, CreativeTabs tab, Material material, SoundType sound, MapColor mapColor,
			int harvestLevel, ModToolTypes toolType, float hardness, float resistance, float lightLevel, Potion effect,
			boolean isDebuff) {
		super(modid, name, tab, material, sound, mapColor, harvestLevel, toolType, hardness, resistance, lightLevel);
		this.effect = effect;
		this.isDebuff = isDebuff;
	}

	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
		if (entityIn instanceof EntityLivingBase && ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_WALKING_EFFECTS
				&& ResourcesConfig.PROPERTIES.EFFECTS.EFFECTS_EBALED) {
			((EntityLivingBase) entityIn)
					.addPotionEffect(
							new PotionEffect(effect,
									ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_WALKING_BASE_DURATION,
									ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_WALKING_BASE_AMPLIFIER - 1, false,
									false));
		}
	}

	@Override
	public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world,
			IBlockState blockState, IProbeHitData data) {
		if (player.isSneaking() && ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_WALKING_EFFECTS
				&& ResourcesConfig.PROPERTIES.EFFECTS.EFFECTS_EBALED) {
			ModTopTooltips.addEffectHeader(mode, probeInfo, player, world, blockState, data,
					ModTooltips.EFFECT_WALKING_ON);
			ModTopTooltips.addPotionEffect(mode, probeInfo, player, world, blockState, data, effect.getName(),
					isDebuff, ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_WALKING_BASE_AMPLIFIER,
					ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_WALKING_BASE_DURATION);
		} else if (ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_WALKING_EFFECTS
				&& ResourcesConfig.PROPERTIES.EFFECTS.EFFECTS_EBALED){
				ModTopTooltips.addKey(mode, probeInfo, player, world, blockState, data, ModTopTooltips.TOP_EFFECTS);
		}
	}
}