package net.thep2wking.oedldoedlresources.base;

import mcjty.theoneprobe.api.CompoundText;
import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.thep2wking.oedldoedlcore.base.ModBlockBase;
import net.thep2wking.oedldoedlcore.config.CoreConfig;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;
import net.thep2wking.oedldoedlresources.integration.TOPInfoProvider;

public class ModBlockEffectBase extends ModBlockBase implements TOPInfoProvider
{
	public Effect effect;;
	public boolean isDebuff;
	/**
	 * @author TheP2WKing
	 * @param sound				{@link SoundType}
	 * @param harvestLevel		int
	 * @param hardness 			float
	 * @param resistance		float
	 * @param toolType			{@link ToolType}
	 * @param lightLevel		int
	 * @param effect			{@link Effects}
	 * @param isDebuff			boolean
	 * @param properties		{@link Properties}
	 */
	public ModBlockEffectBase(SoundType sound, int harvestLevel, float hardness, float resistance, ToolType toolType, Effect effect, boolean isDebuff, int lightLevel, Properties properties) 
	{
		super(sound, harvestLevel, hardness, resistance, toolType, lightLevel, properties);
		this.effect = effect;
		this.isDebuff = isDebuff;
	}
	
	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) 
	{
		if (entityIn instanceof LivingEntity && ResourcesConfig.block_walking_effects_enabled.get() && ResourcesConfig.effects_enabled.get())
		{
			((LivingEntity) entityIn).addPotionEffect(new EffectInstance(effect, ResourcesConfig.block_walking_base_duration.get(), ResourcesConfig.block_walking_base_amplifier.get() - 1, false, false));
		}
	}

	public TextFormatting effectColor()
	{
		if(isDebuff)
		{
			return CoreConfig.effects_negative_formatting.get();
		}
		return CoreConfig.effects_positive_formatting.get();
	}
	
	@Override
	public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, PlayerEntity player, World world, BlockState blockState, IProbeHitData data) 
	{
        probeInfo.text(CompoundText.create().label(CoreConfig.effects_annotation_formatting.get() + "{*core.oedldoedl.walking.effects.tip*}"));
        probeInfo.text(CompoundText.create().label((new StringTextComponent(CoreConfig.effects_formatting.get() + "- " + TextFormatting.ITALIC)
        		.appendSibling(new TranslationTextComponent(effect.getName()).mergeStyle(CoreConfig.effects_formatting.get()).mergeStyle(TextFormatting.ITALIC)
				.appendSibling(new StringTextComponent(" " + effectColor() + TextFormatting.ITALIC + "("+ ResourcesConfig.block_walking_base_amplifier.get() + ") (" 
				+ ResourcesConfig.block_walking_base_duration.get() / 20 + " sec)")).mergeStyle(TextFormatting.ITALIC)))));
	}
}