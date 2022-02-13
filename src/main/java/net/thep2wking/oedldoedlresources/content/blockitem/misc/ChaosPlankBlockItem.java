package net.thep2wking.oedldoedlresources.content.blockitem.misc;

import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlcore.base.ModBlockItemBase;
import net.thep2wking.oedldoedlcore.util.TipLines;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;
import net.thep2wking.oedldoedlresources.init.ModSounds;

public class ChaosPlankBlockItem extends ModBlockItemBase
{
	public ChaosPlankBlockItem(Block blockIn, Rarity rarity, boolean hasEffect, boolean fireImmunity, TipLines lines, boolean hasAnnotation, Properties properties) 
	{
		super(blockIn, rarity, hasEffect, fireImmunity, lines, hasAnnotation, properties);
	}
	
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) 
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
		if (ResourcesConfig.enable_chaos_plank_sound.get())
		{     
			if (handIn == Hand.MAIN_HAND && ResourcesConfig.enable_money_sound.get())
			{
				worldIn.playSound(null, playerIn.getPosition(), ModSounds.APPLAUSE.get(), SoundCategory.BLOCKS, 1, 1);
			}
	        return new ActionResult<ItemStack>(ActionResultType.SUCCESS, itemstack);
		}
        return new ActionResult<ItemStack>(ActionResultType.PASS, itemstack);
    }
}