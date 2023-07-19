package net.thep2wking.oedldoedlresources.content.item.ingot;

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

public class ItemCloudiumIngot extends ModItemIngotEffectBase {
	public ItemCloudiumIngot(String modid, String name, CreativeTabs tab, Potion effect, boolean isDebuff, EnumRarity rarity, boolean hasEffect, int tooltipLines, int annotationLines) {
		super(modid, name, tab, effect, isDebuff, rarity, hasEffect, tooltipLines, annotationLines);
	}
	
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if (entityIn instanceof EntityLivingBase && ResourcesConfig.PROPERTIES.EFFECTS.EFFECTS_EBALED
				&& ResourcesConfig.PROPERTIES.EFFECTS.INGOTS.INGOT_EFFECTS) {
			((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(effect, 10, 0, false, false));
		}
	}

	public int getEffect() {
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

		if (ModTooltips.showEffectTip() && ResourcesConfig.PROPERTIES.EFFECTS.INGOTS.INGOT_EFFECTS
				&& ResourcesConfig.PROPERTIES.EFFECTS.EFFECTS_EBALED) {
			ModTooltips.addEffectHeader(tooltip, ModTooltips.EFFECT_GIVEN);
			ModTooltips.addPotionEffect(tooltip, effect.getName(), isDebuff, getEffect(), 20);
		} else if (ModTooltips.showEffectTipKey() && ResourcesConfig.PROPERTIES.EFFECTS.INGOTS.INGOT_EFFECTS
				&& ResourcesConfig.PROPERTIES.EFFECTS.EFFECTS_EBALED) {
			ModTooltips.addKey(tooltip, ModTooltips.KEY_EFFECTS);
		}
	}
}