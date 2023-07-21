package net.thep2wking.oedldoedlresources.content.item.nugget;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlcore.api.item.ModItemBase;
import net.thep2wking.oedldoedlresources.init.ModSounds;

public class ItemMoneyNugget extends ModItemBase {
	public ItemMoneyNugget(String modid, String name, CreativeTabs tab, EnumRarity rarity, boolean hasEffect,
			int tooltipLines, int annotationLines) {
		super(modid, name, tab, rarity, hasEffect, tooltipLines, annotationLines);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		if (handIn == EnumHand.MAIN_HAND) {
			worldIn.playSound(null, playerIn.getPosition(), ModSounds.MONEY, SoundCategory.BLOCKS, 0.8f, 1f);
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
	}
}