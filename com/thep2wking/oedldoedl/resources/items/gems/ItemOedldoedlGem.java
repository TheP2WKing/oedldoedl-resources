package com.thep2wking.oedldoedl.resources.items.gems;

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

import morph.avaritia.entity.EntityImmortalItem;
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

public class ItemOedldoedlGem extends Item implements IHasModel
{
	public ItemOedldoedlGem(String name) 
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
	
    @SideOnly(Side.CLIENT)
    @Override
    public boolean func_77636_d(ItemStack stack)
    {
        return true;
    }
    
    @Override
    @SideOnly (Side.CLIENT)
    public EnumRarity func_77613_e(ItemStack stack) 
    {
    	return RarityInit.RED;
    }
    
    @Override
    public boolean hasCustomEntity(ItemStack stack) 
    {
		if (CoreConst.CCL_TEXTURES)
		{
			return true;
		}
		return false;
    }

    @Override
    public Entity createEntity(World world, Entity location, ItemStack itemstack) 
    {
		if (CoreConst.CCL_TEXTURES)
		{
			return new EntityImmortalItem(world, location, itemstack);
		}
		return null;
    }
    
	@Override
    public void func_77663_a(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
    {
        ((EntityLivingBase) entity).func_70690_d(new PotionEffect(MobEffects.field_76444_x, 200, 1, false, false));
        ((EntityLivingBase) entity).func_70690_d(new PotionEffect(MobEffects.field_76426_n, 200, 1, false, false));
        ((EntityLivingBase) entity).func_70690_d(new PotionEffect(MobEffects.field_76422_e, 200, 1, false, false));
        ((EntityLivingBase) entity).func_70690_d(new PotionEffect(MobEffects.field_76430_j, 200, 1, false, false));
        ((EntityLivingBase) entity).func_70690_d(new PotionEffect(MobEffects.field_188425_z, 200, 1, false, false));
        ((EntityLivingBase) entity).func_70690_d(new PotionEffect(MobEffects.field_76439_r, 200, 0, false, false));
        ((EntityLivingBase) entity).func_70690_d(new PotionEffect(MobEffects.field_76428_l, 200, 1, false, false));
        ((EntityLivingBase) entity).func_70690_d(new PotionEffect(MobEffects.field_76429_m, 200, 1, false, false));
        ((EntityLivingBase) entity).func_70690_d(new PotionEffect(MobEffects.field_76424_c, 200, 1, false, false));
        ((EntityLivingBase) entity).func_70690_d(new PotionEffect(MobEffects.field_76420_g, 200, 1, false, false));
        ((EntityLivingBase) entity).func_70690_d(new PotionEffect(MobEffects.field_76427_o, 200, 0, false, false));
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void func_77624_a(ItemStack stack, World world, List<String> tooltip, ITooltipFlag advanced) 
	{
  		if (CoreConst.ITEM_INFORMATION) 
  		{
  			TooltipShiftInfo.addTooltipText(tooltip, new String[] 
  			{
  				TextFormatting.GREEN+I18n.func_135052_a("item.oedldoedl.oedldoedl_gem.tip"),
  				TextFormatting.GREEN+I18n.func_135052_a("item.oedldoedl.oedldoedl_gem.tip2"),
  			});
  		}
  		
  		if (CoreConst.POTION_INFORMATION) 
  		{
  			TooltipControlEffectInfo.addTooltipText(tooltip, new String[] 
  			{
  				TextFormatting.DARK_GREEN+""+I18n.func_135052_a("core.oedldoedl.given.effects.tip"),
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.func_135052_a("item.oedldoedl.oedldoedl_gem.effects.tip"),
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.func_135052_a("item.oedldoedl.oedldoedl_gem.effects.tip2"),
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.func_135052_a("item.oedldoedl.oedldoedl_gem.effects.tip3"),
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.func_135052_a("item.oedldoedl.oedldoedl_gem.effects.tip4"),
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.func_135052_a("item.oedldoedl.oedldoedl_gem.effects.tip5"),
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.func_135052_a("item.oedldoedl.oedldoedl_gem.effects.tip6"),
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.func_135052_a("item.oedldoedl.oedldoedl_gem.effects.tip7"),
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.func_135052_a("item.oedldoedl.oedldoedl_gem.effects.tip8"),
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.func_135052_a("item.oedldoedl.oedldoedl_gem.effects.tip9"),
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.func_135052_a("item.oedldoedl.oedldoedl_gem.effects.tip10"),
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.func_135052_a("item.oedldoedl.oedldoedl_gem.effects.tip11"),
  			});
  		}
	}
}