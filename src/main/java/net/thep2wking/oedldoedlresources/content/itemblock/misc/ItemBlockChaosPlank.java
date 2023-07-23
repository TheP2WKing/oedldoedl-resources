package net.thep2wking.oedldoedlresources.content.itemblock.misc;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlcore.api.item.ModItemBlockBase;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;
import net.thep2wking.oedldoedlresources.init.ModSounds;

public class ItemBlockChaosPlank extends ModItemBlockBase {
	public ItemBlockChaosPlank(Block block, EnumRarity rarity, boolean hasEffect, int tooltipLines,
			int annotationLines) {
		super(block, rarity, hasEffect, tooltipLines, annotationLines);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		if (ResourcesConfig.CONTENT.CHAOS_PLANK_SOUND) {
			if (handIn == EnumHand.MAIN_HAND) {
				worldIn.playSound(null, playerIn.getPosition(), ModSounds.WOW, SoundCategory.BLOCKS, 1f, 1f);
			}
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
		}
		return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
	}
}