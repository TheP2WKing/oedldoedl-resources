package net.thep2wking.oedldoedlresources.content.item.ingot;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlcore.base.ModItemBase;
import net.thep2wking.oedldoedlcore.util.TipLines;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;
import net.thep2wking.oedldoedlresources.init.ModSounds;

public class MoneyIngotItem extends ModItemBase
{
    public MoneyIngotItem(Rarity rarity, boolean hasEffect, boolean fireImmunity, TipLines lines, boolean hasAnnotation, Properties properties) 
    {
		super(rarity, hasEffect, fireImmunity, lines, hasAnnotation, properties);
	}

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) 
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
		if (ResourcesConfig.enable_money_sound.get())
		{ 
			if (handIn == Hand.MAIN_HAND)
			{
				worldIn.playSound(null, playerIn.getPosition(), ModSounds.MONEY.get(), SoundCategory.BLOCKS, 0.5f, 1f);
			}
	        return new ActionResult<ItemStack>(ActionResultType.SUCCESS, itemstack);
		}
        return new ActionResult<ItemStack>(ActionResultType.PASS, itemstack);
    }
}