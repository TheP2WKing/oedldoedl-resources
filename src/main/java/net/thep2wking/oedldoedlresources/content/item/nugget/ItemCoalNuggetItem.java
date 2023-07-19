package net.thep2wking.oedldoedlresources.content.item.nugget;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.thep2wking.oedldoedlcore.api.item.ModItemBase;

public class ItemCoalNuggetItem extends ModItemBase {
	public ItemCoalNuggetItem(String modid, String name, CreativeTabs tab, EnumRarity rarity, boolean hasEffect,
			int tooltipLines, int annotationLines) {
		super(modid, name, tab, rarity, hasEffect, tooltipLines, annotationLines);
	}

	@Override
	public int getItemBurnTime(ItemStack itemStack) {
		return 200;
	}
}