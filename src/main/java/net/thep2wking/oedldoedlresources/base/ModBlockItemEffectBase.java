package net.thep2wking.oedldoedlresources.base;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.thep2wking.oedldoedlcore.base.ModBlockItemBase;
import net.thep2wking.oedldoedlcore.config.CoreConfig;
import net.thep2wking.oedldoedlcore.util.TipLines;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;

public class ModBlockItemEffectBase extends ModBlockItemBase
{
	public Effect effect;
	public boolean isDebuff;
	public boolean hasAnnotation;
	public TipLines lines = TipLines.ONE;
	
	/**
	 * @author TheP2WKing
	 * @param blockIn			{@link Block} 
	 * @param rarity			{@link Rarity}
	 * @param hasEffect			boolean
	 * @param fireImmunity		boolean
	 * @param effect			{@link Effects}
	 * @param isDebuff			boolean
	 * @param lines 			{@link TipLines}
	 * @param hasAnnotation  	boolean
	 * @param properties		{@link Properties}
	 */
    public ModBlockItemEffectBase(Block blockIn, Rarity rarity, boolean hasEffect, boolean fireImmunity, Effect effect, boolean isDebuff, TipLines lines, boolean hasAnnotation, Properties properties) 
    {
		super(blockIn, rarity, hasEffect, fireImmunity, lines, hasAnnotation, properties);
		this.effect = effect;
		this.isDebuff = isDebuff;
		this.hasAnnotation = hasAnnotation;
		this.lines = lines;
	}

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int ambient, boolean particles) 
	{
		if (ResourcesConfig.block_effects_enabled.get() && ResourcesConfig.effects_enabled.get())
		{
			((LivingEntity) entityIn).addPotionEffect(new EffectInstance(effect, ResourcesConfig.block_base_duration.get(), ResourcesConfig.block_base_amplifier.get() - 1, false, false));
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
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) 
    {
		if (Screen.hasShiftDown() && CoreConfig.information_tooltip.get())
		{   
			if(hasAnnotation)
			{
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".annotation").mergeStyle(CoreConfig.information_annotation_formatting.get()));
			}
			
			if(lines == TipLines.DISABLED)
			{
				//no tooltip
			}
			if(lines == TipLines.ONE)
			{
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip").mergeStyle(CoreConfig.information_formatting.get()));
			}
			if(lines == TipLines.TWO)
			{
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip2").mergeStyle(CoreConfig.information_formatting.get()));
			}
			if(lines == TipLines.THREE)
			{
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip2").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip3").mergeStyle(CoreConfig.information_formatting.get()));
			}
			if(lines == TipLines.FOUR)
			{
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip2").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip3").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip4").mergeStyle(CoreConfig.information_formatting.get()));
			}
			if(lines == TipLines.FIVE)
			{
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip2").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip3").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip4").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip5").mergeStyle(CoreConfig.information_formatting.get()));
			}
		}
		else if (CoreConfig.information_tooltip.get() && CoreConfig.information_tooltip_key.get() && !(lines == TipLines.DISABLED))
		{
			tooltip.add(new TranslationTextComponent("core.oedldoedl.info.key").mergeStyle(TextFormatting.GRAY));
		}
		
		if (Screen.hasControlDown() && CoreConfig.effects_tooltip.get() && ResourcesConfig.block_effects_enabled.get() && ResourcesConfig.effects_enabled.get())
		{
			tooltip.add(new TranslationTextComponent("core.oedldoedl.given.effects.tip").mergeStyle(CoreConfig.effects_annotation_formatting.get()));
			tooltip.add((new StringTextComponent("- ").mergeStyle(CoreConfig.effects_formatting.get()).mergeStyle(TextFormatting.ITALIC).appendSibling(new TranslationTextComponent(effect.getName())
					.mergeStyle(CoreConfig.effects_formatting.get()).mergeStyle(TextFormatting.ITALIC)
					.appendSibling(new StringTextComponent(" " + effectColor() + TextFormatting.ITALIC + "("+ ResourcesConfig.block_base_amplifier.get() + ") (" 
					+ ResourcesConfig.block_base_duration.get() / 20 + " sec)")).mergeStyle(TextFormatting.ITALIC))));
		}
		else if (CoreConfig.effects_tooltip.get() && CoreConfig.effects_tooltip_key.get() && ResourcesConfig.block_effects_enabled.get() && ResourcesConfig.effects_enabled.get() && !ResourcesConfig.block_walking_effects_enabled.get())
		{
			tooltip.add(new TranslationTextComponent("core.oedldoedl.effects.key").mergeStyle(TextFormatting.GRAY));
		}
		
		if (Screen.hasControlDown() && CoreConfig.effects_tooltip.get() && ResourcesConfig.block_walking_effects_enabled.get() && ResourcesConfig.effects_enabled.get())
		{
			tooltip.add(new TranslationTextComponent("core.oedldoedl.walking.effects.tip").mergeStyle(CoreConfig.effects_annotation_formatting.get()));
			tooltip.add((new StringTextComponent("- ").mergeStyle(CoreConfig.effects_formatting.get()).mergeStyle(TextFormatting.ITALIC).appendSibling(new TranslationTextComponent(effect.getName())
					.mergeStyle(CoreConfig.effects_formatting.get()).mergeStyle(TextFormatting.ITALIC)
					.appendSibling(new StringTextComponent(" " + effectColor() + TextFormatting.ITALIC + "("+ ResourcesConfig.block_walking_base_amplifier.get() + ") (" 
					+ ResourcesConfig.block_walking_base_duration.get() / 20 + " sec)")).mergeStyle(TextFormatting.ITALIC))));
		}
		else if (CoreConfig.effects_tooltip.get() && CoreConfig.effects_tooltip_key.get() && ResourcesConfig.block_walking_effects_enabled.get() && ResourcesConfig.effects_enabled.get() && !ResourcesConfig.block_effects_enabled.get())
		{
			tooltip.add(new TranslationTextComponent("core.oedldoedl.effects.key").mergeStyle(TextFormatting.GRAY));
		}
		
		if (!Screen.hasControlDown() && CoreConfig.effects_tooltip.get() && CoreConfig.effects_tooltip_key.get() && ResourcesConfig.block_walking_effects_enabled.get() && ResourcesConfig.block_effects_enabled.get() && ResourcesConfig.effects_enabled.get())
		{
			tooltip.add(new TranslationTextComponent("core.oedldoedl.effects.key").mergeStyle(TextFormatting.GRAY));
		}
    }
}