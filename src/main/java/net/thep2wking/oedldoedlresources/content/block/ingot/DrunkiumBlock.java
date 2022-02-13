package net.thep2wking.oedldoedlresources.content.block.ingot;

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
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.thep2wking.oedldoedlcore.config.CoreConfig;
import net.thep2wking.oedldoedlresources.base.ModBlockEffectBase;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;
import net.thep2wking.oedldoedlresources.integration.TOPInfoProvider;

public class DrunkiumBlock extends ModBlockEffectBase implements TOPInfoProvider
{
	public Effect effect2;
	public Effect effect3;
	public Effect effect4;
	
	public DrunkiumBlock(SoundType sound, int harvestLevel, float hardness, float resistance, ToolType toolType, Effect effect, Effect effect2, Effect effect3, Effect effect4, 
			boolean isDebuff, int lightLevel, Properties properties) 
	{
		super(sound, harvestLevel, hardness, resistance, toolType, effect, isDebuff, lightLevel, properties);
		this.effect2 = effect2;
		this.effect3 = effect3;
		this.effect4 = effect4;
	}
	
	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) 
	{
		if (entityIn instanceof LivingEntity && ResourcesConfig.block_walking_effects_enabled.get() && ResourcesConfig.effects_enabled.get())
		{
			((LivingEntity) entityIn).addPotionEffect(new EffectInstance(effect, ResourcesConfig.block_walking_base_duration.get(), 0, false, false));
			((LivingEntity) entityIn).addPotionEffect(new EffectInstance(effect2, 10, ResourcesConfig.block_walking_base_amplifier.get() - 1 + 2, false, false));
			((LivingEntity) entityIn).addPotionEffect(new EffectInstance(effect3, ResourcesConfig.block_walking_base_duration.get(), 0, false, false));
			((LivingEntity) entityIn).addPotionEffect(new EffectInstance(effect4, ResourcesConfig.block_walking_base_duration.get(), ResourcesConfig.block_walking_base_amplifier.get() - 1 + 1, false, false));
		}
	}
	
	public int getEffect()
	{
		return 1;
	}
	
	public int getEffect2()
	{
	    return ResourcesConfig.block_walking_base_amplifier.get() + 2;
	}
	
	public int getEffect3()
	{
	    return 1;
	}
	
	public int getEffect4()
	{
	    return ResourcesConfig.block_walking_base_amplifier.get() + 1;
	}
	
	@Override
	public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, PlayerEntity player, World world, BlockState blockState, IProbeHitData data) 
	{
        probeInfo.text(CompoundText.create().label(CoreConfig.effects_annotation_formatting.get() + "{*core.oedldoedl.walking.effects.tip*}"));
        probeInfo.text(CompoundText.create().label((new StringTextComponent(CoreConfig.effects_formatting.get() + "- " + TextFormatting.ITALIC).appendSibling(new TranslationTextComponent(effect.getName())
				.mergeStyle(CoreConfig.effects_formatting.get()).mergeStyle(TextFormatting.ITALIC)
				.appendSibling(new StringTextComponent(" " + effectColor() + TextFormatting.ITALIC + "("+ getEffect() + ") (" 
				+ ResourcesConfig.block_walking_base_duration.get() / 20 + " sec)")).mergeStyle(TextFormatting.ITALIC)))));
        probeInfo.text(CompoundText.create().label((new StringTextComponent(CoreConfig.effects_formatting.get() + "- " + TextFormatting.ITALIC).appendSibling(new TranslationTextComponent(effect2.getName())
				.mergeStyle(CoreConfig.effects_formatting.get()).mergeStyle(TextFormatting.ITALIC)
				.appendSibling(new StringTextComponent(" " + effectColor() + TextFormatting.ITALIC + "("+ getEffect2() + ") (" 
				+ 1 + " sec)")).mergeStyle(TextFormatting.ITALIC)))));
        probeInfo.text(CompoundText.create().label((new StringTextComponent(CoreConfig.effects_formatting.get() + "- " + TextFormatting.ITALIC).appendSibling(new TranslationTextComponent(effect3.getName())
				.mergeStyle(CoreConfig.effects_formatting.get()).mergeStyle(TextFormatting.ITALIC)
				.appendSibling(new StringTextComponent(" " + effectColor() + TextFormatting.ITALIC + "("+ getEffect3() + ") (" 
				+ ResourcesConfig.block_walking_base_duration.get() / 20 + " sec)")).mergeStyle(TextFormatting.ITALIC)))));
        probeInfo.text(CompoundText.create().label((new StringTextComponent(CoreConfig.effects_formatting.get() + "- " + TextFormatting.ITALIC).appendSibling(new TranslationTextComponent(effect4.getName())
				.mergeStyle(CoreConfig.effects_formatting.get()).mergeStyle(TextFormatting.ITALIC)
				.appendSibling(new StringTextComponent(" " + effectColor() + TextFormatting.ITALIC + "("+ getEffect4() + ") (" 
				+ ResourcesConfig.block_walking_base_duration.get() / 20 + " sec)")).mergeStyle(TextFormatting.ITALIC)))));
	}
}