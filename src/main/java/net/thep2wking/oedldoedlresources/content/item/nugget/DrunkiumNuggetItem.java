package net.thep2wking.oedldoedlresources.content.item.nugget;

import java.util.List;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.thep2wking.oedldoedlcore.config.CoreConfig;
import net.thep2wking.oedldoedlcore.util.TipLines;
import net.thep2wking.oedldoedlresources.base.ModItemEffectNuggetBase;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;

public class DrunkiumNuggetItem extends ModItemEffectNuggetBase
{
    public Effect effect2;
    public Effect effect3;
    public Effect effect4;

	public DrunkiumNuggetItem(Rarity rarity, boolean hasEffect, boolean fireImmunity, Effect effect, Effect effect2, Effect effect3, Effect effect4, 
			boolean isDebuff, TipLines lines, boolean hasAnnotation, Properties properties) 
    {
		super(rarity, hasEffect, fireImmunity, effect, isDebuff, lines, hasAnnotation, properties);
		this.effect2 = effect2;
		this.effect3 = effect3;
		this.effect4 = effect4;
	}
	
	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int ambient, boolean particles) 
	{
		if (ResourcesConfig.nugget_effects_enabled.get() && ResourcesConfig.effects_enabled.get())
		{
			((LivingEntity) entityIn).addPotionEffect(new EffectInstance(effect, ResourcesConfig.nugget_base_duration.get(), 0, false, false));
			((LivingEntity) entityIn).addPotionEffect(new EffectInstance(effect2, 10, ResourcesConfig.nugget_base_duration.get() - 1 + 1, false, false));
			((LivingEntity) entityIn).addPotionEffect(new EffectInstance(effect3, ResourcesConfig.nugget_base_duration.get(), 0, false, false));
			((LivingEntity) entityIn).addPotionEffect(new EffectInstance(effect4, ResourcesConfig.nugget_base_duration.get(), ResourcesConfig.nugget_base_amplifier.get() - 1, false, false));
		}
	}
	
	public int getEffect()
	{
		return 1;
	}
	
	public int getEffect2()
	{
	    return ResourcesConfig.nugget_base_amplifier.get() + 1;
	}
	
	public int getEffect3()
	{
	    return 1;
	}
	
	public int getEffect4()
	{
	    return ResourcesConfig.nugget_base_amplifier.get();
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
		
		if (Screen.hasControlDown() && CoreConfig.effects_tooltip.get() && ResourcesConfig.nugget_effects_enabled.get() && ResourcesConfig.effects_enabled.get())
		{
			tooltip.add(new TranslationTextComponent("core.oedldoedl.given.effects.tip").mergeStyle(CoreConfig.effects_annotation_formatting.get()));
			tooltip.add((new StringTextComponent("- ").mergeStyle(CoreConfig.effects_formatting.get()).mergeStyle(TextFormatting.ITALIC).appendSibling(new TranslationTextComponent(effect.getName())
					.mergeStyle(CoreConfig.effects_formatting.get()).mergeStyle(TextFormatting.ITALIC)
					.appendSibling(new StringTextComponent(" " + effectColor() + TextFormatting.ITALIC + "("+ getEffect() + ") (" 
					+ ResourcesConfig.nugget_base_duration.get() / 20 + " sec)")).mergeStyle(TextFormatting.ITALIC))));
			tooltip.add((new StringTextComponent("- ").mergeStyle(CoreConfig.effects_formatting.get()).mergeStyle(TextFormatting.ITALIC).appendSibling(new TranslationTextComponent(effect2.getName())
					.mergeStyle(CoreConfig.effects_formatting.get()).mergeStyle(TextFormatting.ITALIC)
					.appendSibling(new StringTextComponent(" " + effectColor() + TextFormatting.ITALIC + "("+ getEffect2() + ") (" 
					+ 1 + " sec)")).mergeStyle(TextFormatting.ITALIC))));
			tooltip.add((new StringTextComponent("- ").mergeStyle(CoreConfig.effects_formatting.get()).mergeStyle(TextFormatting.ITALIC).appendSibling(new TranslationTextComponent(effect3.getName())
					.mergeStyle(CoreConfig.effects_formatting.get()).mergeStyle(TextFormatting.ITALIC)
					.appendSibling(new StringTextComponent(" " + effectColor() + TextFormatting.ITALIC + "("+ getEffect3() + ") (" 
					+ ResourcesConfig.nugget_base_duration.get() / 20 + " sec)")).mergeStyle(TextFormatting.ITALIC))));
			tooltip.add((new StringTextComponent("- ").mergeStyle(CoreConfig.effects_formatting.get()).mergeStyle(TextFormatting.ITALIC).appendSibling(new TranslationTextComponent(effect4.getName())
					.mergeStyle(CoreConfig.effects_formatting.get()).mergeStyle(TextFormatting.ITALIC)
					.appendSibling(new StringTextComponent(" " + effectColor() + TextFormatting.ITALIC + "("+ getEffect4() + ") (" 
					+ ResourcesConfig.nugget_base_duration.get() / 20 + " sec)")).mergeStyle(TextFormatting.ITALIC))));
		}
		else if (CoreConfig.effects_tooltip.get() && CoreConfig.effects_tooltip_key.get() && ResourcesConfig.nugget_effects_enabled.get() && ResourcesConfig.effects_enabled.get())
		{
			tooltip.add(new TranslationTextComponent("core.oedldoedl.effects.key").mergeStyle(TextFormatting.GRAY));
		}
    }
}