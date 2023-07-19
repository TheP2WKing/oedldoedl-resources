package net.thep2wking.oedldoedlresources.content.item.nugget;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.util.ModTooltips;
import net.thep2wking.oedldoedlresources.api.item.ModItemIngotEffectBase;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;

public class ItemSadistiumNugget extends ModItemIngotEffectBase {
	public final Potion effect2;
	public final Potion effect3;

	public ItemSadistiumNugget(String modid, String name, CreativeTabs tab, Potion effect, Potion effect2,
			Potion effect3, boolean isDebuff, EnumRarity rarity, boolean hasEffect, int tooltipLines,
			int annotationLines) {
		super(modid, name, tab, effect, isDebuff, rarity, hasEffect, tooltipLines, annotationLines);
		this.effect2 = effect2;
		this.effect3 = effect3;
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if (entityIn instanceof EntityLivingBase && ResourcesConfig.PROPERTIES.EFFECTS.EFFECTS_EBALED
				&& ResourcesConfig.PROPERTIES.EFFECTS.NUGGETS.NUGGET_EFFECTS) {
			((EntityLivingBase) entityIn).addPotionEffect(
					new PotionEffect(effect, ResourcesConfig.PROPERTIES.EFFECTS.NUGGETS.NUGGET_BASE_DURATION,
							ResourcesConfig.PROPERTIES.EFFECTS.NUGGETS.NUGGET_BASE_AMPLIFIER - 1 + 2, false, false));
			((EntityLivingBase) entityIn).addPotionEffect(
					new PotionEffect(effect2, ResourcesConfig.PROPERTIES.EFFECTS.NUGGETS.NUGGET_BASE_DURATION,
							ResourcesConfig.PROPERTIES.EFFECTS.NUGGETS.NUGGET_BASE_AMPLIFIER - 1 + 1, false, false));
			((EntityLivingBase) entityIn).addPotionEffect(
					new PotionEffect(effect3, 10, 0, false, false));
		}
	}

	public int getEffect() {
		return ResourcesConfig.PROPERTIES.EFFECTS.NUGGETS.NUGGET_BASE_AMPLIFIER + 2;
	}

	public int getEffect2() {
		return ResourcesConfig.PROPERTIES.EFFECTS.NUGGETS.NUGGET_BASE_AMPLIFIER + 1;
	}

	public int getEffect3() {
		return 1;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if (ModTooltips.showAnnotationTip()) {
			for (int i = 1; i <= annotationLines; ++i) {
				ModTooltips.addAnnotation(tooltip, this.getUnlocalizedName(), i);
			}
		}
		if (ModTooltips.showInfoTip()) {
			for (int i = 1; i <= tooltipLines; ++i) {
				ModTooltips.addInformation(tooltip, this.getUnlocalizedName(), i);
			}
		} else if (ModTooltips.showInfoTipKey() && !(tooltipLines == 0)) {
			ModTooltips.addKey(tooltip, ModTooltips.KEY_INFO);
		}

		if (ModTooltips.showEffectTip() && ResourcesConfig.PROPERTIES.EFFECTS.NUGGETS.NUGGET_EFFECTS
				&& ResourcesConfig.PROPERTIES.EFFECTS.EFFECTS_EBALED) {
			ModTooltips.addEffectHeader(tooltip, ModTooltips.EFFECT_GIVEN);
			ModTooltips.addPotionEffect(tooltip, effect.getName(), isDebuff, getEffect(), ResourcesConfig.PROPERTIES.EFFECTS.NUGGETS.NUGGET_BASE_DURATION);
			ModTooltips.addPotionEffect(tooltip, effect2.getName(), isDebuff, getEffect2(), ResourcesConfig.PROPERTIES.EFFECTS.NUGGETS.NUGGET_BASE_DURATION);
						ModTooltips.addPotionEffect(tooltip, effect3.getName(), isDebuff, getEffect3(), 20);
		} else if (ModTooltips.showEffectTipKey() && ResourcesConfig.PROPERTIES.EFFECTS.NUGGETS.NUGGET_EFFECTS
				&& ResourcesConfig.PROPERTIES.EFFECTS.EFFECTS_EBALED) {
			ModTooltips.addKey(tooltip, ModTooltips.KEY_EFFECTS);
		}
	}
}