package com.thep2wking.oedldoedl.resources.items.ingots;

import java.util.List;

import com.thep2wking.oedldoedl.core.OedldoedlCore;
import com.thep2wking.oedldoedl.core.config.constants.CoreConst;
import com.thep2wking.oedldoedl.core.init.RarityInit;
import com.thep2wking.oedldoedl.core.util.interfaces.IHasModel;
import com.thep2wking.oedldoedl.core.util.tooltips.TooltipControlEffectInfo;
import com.thep2wking.oedldoedl.core.util.tooltips.TooltipShiftInfo;
import com.thep2wking.oedldoedl.resources.OedldoedlResources;
import com.thep2wking.oedldoedl.resources.ReferenceResources;
import com.thep2wking.oedldoedl.resources.init.ItemInit;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBedrockiumIngot extends Item implements IHasModel
{
	public ItemBedrockiumIngot(String name) 
	{
		func_77655_b(ReferenceResources.MODID+":"+name);
		setRegistryName(ReferenceResources.MODID+":"+name);
		func_77637_a(OedldoedlResources.TAB);
		func_77625_d(64);
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	@SideOnly (Side.CLIENT)
	public void registerModels()
	{
		OedldoedlCore.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
    @Override
    @SideOnly (Side.CLIENT)
    public EnumRarity func_77613_e(ItemStack stack) 
    {
    	return RarityInit.LIGHT_PURPLE;
    }
	
	@Override
    public void func_77663_a(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
    {
  		if (CoreConst.POTION_EFFECTS) 
  		{
  			((EntityLivingBase) entity).func_70690_d(new PotionEffect(MobEffects.field_76421_d, 10, 5, false, false));
  			((EntityLivingBase) entity).func_70690_d(new PotionEffect(MobEffects.field_76438_s, 200, 2, false, false));
  		}
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void func_77624_a(ItemStack stack, World world, List<String> tooltip, ITooltipFlag advanced) 
	{
  		if (CoreConst.ITEM_INFORMATION) 
  		{
  			TooltipShiftInfo.addTooltipText(tooltip, new String[] 
  			{
  				TextFormatting.GREEN+I18n.func_135052_a("item.oedldoedl.bedrockium_ingot.tip"),
  				TextFormatting.GREEN+I18n.func_135052_a("item.oedldoedl.bedrockium_ingot.tip2"),
  			});
  		}
		
  		if (CoreConst.POTION_INFORMATION && CoreConst.POTION_EFFECTS) 
  		{
  			TooltipControlEffectInfo.addTooltipText(tooltip, new String[] 
  			{
  				TextFormatting.DARK_GREEN+""+I18n.func_135052_a("core.oedldoedl.given.effects.tip"),
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.func_135052_a("item.oedldoedl.bedrockium_ingot.effects.tip"),
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.func_135052_a("item.oedldoedl.bedrockium_ingot.effects.tip2"),
  			});
  		}
	}
}