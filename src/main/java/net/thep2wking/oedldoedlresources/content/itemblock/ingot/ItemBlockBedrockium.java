package net.thep2wking.oedldoedlresources.content.itemblock.ingot;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.config.CoreConfig;
import net.thep2wking.oedldoedlcore.util.ModTooltips;
import net.thep2wking.oedldoedlresources.api.item.ModItemBlockEffectBase;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;

public class ItemBlockBedrockium extends ModItemBlockEffectBase {
	public final Potion effect2;

	public ItemBlockBedrockium(Block block, Potion effect, Potion effect2, boolean isDebuff, EnumRarity rarity,
			boolean hasEffect, int tooltipLines, int annotationLines) {
		super(block, effect, isDebuff, rarity, hasEffect, tooltipLines, annotationLines);
		this.effect2 = effect2;
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if (entityIn instanceof EntityLivingBase && ResourcesConfig.PROPERTIES.EFFECTS.EFFECTS_EBALED
				&& ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_EFFECTS) {
			((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(effect, 10,
					ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_BASE_AMPLIFIER - 1 + 4, false, false));
			((EntityLivingBase) entityIn).addPotionEffect(
					new PotionEffect(effect2, ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_BASE_DURATION,
							ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_BASE_AMPLIFIER - 1 + 2, false, false));
		}
	}

	public int getEffect() {
		return ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_BASE_AMPLIFIER + 4;
	}

	public int getEffect2() {
		return ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_BASE_AMPLIFIER + 2;
	}

	public int getEffect3() {
		return ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_WALKING_BASE_AMPLIFIER + 4;
	}

	public int getEffect4() {
		return ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_WALKING_BASE_AMPLIFIER + 2;
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

		if (ModTooltips.showEffectTip() && ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_EFFECTS
				&& ResourcesConfig.PROPERTIES.EFFECTS.EFFECTS_EBALED) {
			ModTooltips.addEffectHeader(tooltip, ModTooltips.EFFECT_GIVEN);
			ModTooltips.addPotionEffect(tooltip, effect.getName(), isDebuff, getEffect(), 20);
			ModTooltips.addPotionEffect(tooltip, effect2.getName(), isDebuff, getEffect2(),
					ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_BASE_DURATION);
		} else if (ModTooltips.showEffectTipKey() && ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_EFFECTS
				&& !ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_WALKING_EFFECTS
				&& ResourcesConfig.PROPERTIES.EFFECTS.EFFECTS_EBALED) {
			ModTooltips.addKey(tooltip, ModTooltips.KEY_EFFECTS);
		}

		if (ModTooltips.showEffectTip() && ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_WALKING_EFFECTS
				&& ResourcesConfig.PROPERTIES.EFFECTS.EFFECTS_EBALED) {
			ModTooltips.addEffectHeader(tooltip, ModTooltips.EFFECT_WALKING_ON);
			ModTooltips.addPotionEffect(tooltip, effect.getName(), isDebuff, getEffect3(), 20);
			ModTooltips.addPotionEffect(tooltip, effect2.getName(), isDebuff, getEffect4(),
					ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_WALKING_BASE_DURATION);
		} else if (ModTooltips.showEffectTipKey() && ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_WALKING_EFFECTS
				&& ResourcesConfig.PROPERTIES.EFFECTS.EFFECTS_EBALED
				&& !ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_EFFECTS) {
			ModTooltips.addKey(tooltip, ModTooltips.KEY_EFFECTS);
		}

		if (!ModTooltips.showEffectTip() && CoreConfig.TOOLTIPS.EFFECTS_TOOLTIPS_KEY
				&& ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_WALKING_EFFECTS
				&& ResourcesConfig.PROPERTIES.EFFECTS.BLOCKS.BLOCK_EFFECTS
				&& ResourcesConfig.PROPERTIES.EFFECTS.EFFECTS_EBALED) {
			ModTooltips.addKey(tooltip, ModTooltips.KEY_EFFECTS);
		}
	}
}