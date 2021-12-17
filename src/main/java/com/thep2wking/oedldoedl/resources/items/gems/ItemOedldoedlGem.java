package com.thep2wking.oedldoedl.resources.items.gems;

import java.util.List;

import com.thep2wking.oedldoedl.core.OedldoedlCore;
import com.thep2wking.oedldoedl.core.config.CoreConfig;
import com.thep2wking.oedldoedl.core.init.RarityInit;
import com.thep2wking.oedldoedl.core.util.interfaces.IHasModel;
import com.thep2wking.oedldoedl.core.util.tooltips.TooltipControlEffectInfo;
import com.thep2wking.oedldoedl.core.util.tooltips.TooltipShiftInfo;
import com.thep2wking.oedldoedl.resources.OedldoedlResources;
import com.thep2wking.oedldoedl.resources.ReferenceResources;
import com.thep2wking.oedldoedl.resources.config.ResourcesConfig;
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
		setUnlocalizedName(ReferenceResources.MODID+":"+name);
		setRegistryName(ReferenceResources.MODID+":"+name);
		setCreativeTab(OedldoedlResources.TAB);
		setMaxStackSize(64);
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
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
    
    @Override
    @SideOnly (Side.CLIENT)
    public EnumRarity getRarity(ItemStack stack) 
    {
    	return RarityInit.RED;
    }
    
    @Override
    public boolean hasCustomEntity(ItemStack stack) 
    {
		if (ResourcesConfig.GENEREL.cclProperties)
		{
			return true;
		}
		return false;
    }

    @Override
    public Entity createEntity(World world, Entity location, ItemStack itemstack) 
    {
		if (ResourcesConfig.GENEREL.cclProperties)
		{
			return new EntityImmortalItem(world, location, itemstack);
		}
		return null;
    }
    
	@Override
    public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
    {
  		if (ResourcesConfig.GENEREL.itemsGiveEffects && ResourcesConfig.RESOURCES.metals.oedldoedl.effectsEnabled)
  		{	
  	        ((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 400, 0, false, false));
  	        ((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 400, 0, false, false));
  	        ((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 400, 0, false, false));
  	        ((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 400, ResourcesConfig.RESOURCES.metals.oedldoedl.effectsAmplifierGem - 1, false, false));
  	        ((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SATURATION, 400, ResourcesConfig.RESOURCES.metals.oedldoedl.effectsAmplifierGem - 1, false, false));
  	        ((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 400, ResourcesConfig.RESOURCES.metals.oedldoedl.effectsAmplifierGem - 1, false, false));
  	        ((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 400, ResourcesConfig.RESOURCES.metals.oedldoedl.effectsAmplifierGem - 1, false, false));
  	        ((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 400, ResourcesConfig.RESOURCES.metals.oedldoedl.effectsAmplifierGem - 1, false, false));
  	        ((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, 400, ResourcesConfig.RESOURCES.metals.oedldoedl.effectsAmplifierGem - 1, false, false));
  	        ((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HASTE, 400, ResourcesConfig.RESOURCES.metals.oedldoedl.effectsAmplifierGem - 1, false, false));
  	        ((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.LUCK, 400, ResourcesConfig.RESOURCES.metals.oedldoedl.effectsAmplifierGem - 1, false, false));
  		}
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag advanced) 
	{
  		if (CoreConfig.GENEREL.tooltips.itemInformation) 
  		{
  			TooltipShiftInfo.addTooltipText(tooltip, new String[] 
  			{
  				TextFormatting.GREEN+I18n.format("item.oedldoedl.oedldoedl_gem.tip"),
  				TextFormatting.GREEN+I18n.format("item.oedldoedl.oedldoedl_gem.tip2"),
  				TextFormatting.GREEN+I18n.format("item.oedldoedl.oedldoedl_gem.tip3"),
  			});
  		}
  		
 		if (CoreConfig.GENEREL.tooltips.potionInformation && ResourcesConfig.GENEREL.itemsGiveEffects && ResourcesConfig.RESOURCES.metals.oedldoedl.effectsEnabled) 
  		{
  			TooltipControlEffectInfo.addTooltipText(tooltip, new String[] 
  			{
  				TextFormatting.DARK_GREEN+""+I18n.format("core.oedldoedl.given.effects.tip"),
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.format("item.oedldoedl.oedldoedl_gem.effects.tip")+TextFormatting.RED+""+TextFormatting.ITALIC+" (1) "+TextFormatting.YELLOW+""+TextFormatting.ITALIC+"(20 sec)",
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.format("item.oedldoedl.oedldoedl_gem.effects.tip2")+TextFormatting.RED+""+TextFormatting.ITALIC+" (1) "+TextFormatting.YELLOW+""+TextFormatting.ITALIC+"(20 sec)",
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.format("item.oedldoedl.oedldoedl_gem.effects.tip3")+TextFormatting.RED+""+TextFormatting.ITALIC+" (1) "+TextFormatting.YELLOW+""+TextFormatting.ITALIC+"(20 sec)",
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.format("item.oedldoedl.oedldoedl_gem.effects.tip4")+TextFormatting.RED+""+TextFormatting.ITALIC+" ("+ResourcesConfig.RESOURCES.metals.oedldoedl.effectsAmplifierGem+") "+TextFormatting.YELLOW+""+TextFormatting.ITALIC+"(20 sec)",
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.format("item.oedldoedl.oedldoedl_gem.effects.tip5")+TextFormatting.RED+""+TextFormatting.ITALIC+" ("+ResourcesConfig.RESOURCES.metals.oedldoedl.effectsAmplifierGem+") "+TextFormatting.YELLOW+""+TextFormatting.ITALIC+"(20 sec)",
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.format("item.oedldoedl.oedldoedl_gem.effects.tip6")+TextFormatting.RED+""+TextFormatting.ITALIC+" ("+ResourcesConfig.RESOURCES.metals.oedldoedl.effectsAmplifierGem+") "+TextFormatting.YELLOW+""+TextFormatting.ITALIC+"(20 sec)",
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.format("item.oedldoedl.oedldoedl_gem.effects.tip7")+TextFormatting.RED+""+TextFormatting.ITALIC+" ("+ResourcesConfig.RESOURCES.metals.oedldoedl.effectsAmplifierGem+") "+TextFormatting.YELLOW+""+TextFormatting.ITALIC+"(20 sec)",
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.format("item.oedldoedl.oedldoedl_gem.effects.tip8")+TextFormatting.RED+""+TextFormatting.ITALIC+" ("+ResourcesConfig.RESOURCES.metals.oedldoedl.effectsAmplifierGem+") "+TextFormatting.YELLOW+""+TextFormatting.ITALIC+"(20 sec)",
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.format("item.oedldoedl.oedldoedl_gem.effects.tip9")+TextFormatting.RED+""+TextFormatting.ITALIC+" ("+ResourcesConfig.RESOURCES.metals.oedldoedl.effectsAmplifierGem+") "+TextFormatting.YELLOW+""+TextFormatting.ITALIC+"(20 sec)",
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.format("item.oedldoedl.oedldoedl_gem.effects.tip10")+TextFormatting.RED+""+TextFormatting.ITALIC+" ("+ResourcesConfig.RESOURCES.metals.oedldoedl.effectsAmplifierGem+") "+TextFormatting.YELLOW+""+TextFormatting.ITALIC+"(20 sec)",
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.format("item.oedldoedl.oedldoedl_gem.effects.tip11")+TextFormatting.RED+""+TextFormatting.ITALIC+" ("+ResourcesConfig.RESOURCES.metals.oedldoedl.effectsAmplifierGem+") "+TextFormatting.YELLOW+""+TextFormatting.ITALIC+"(20 sec)",
  			});
  		}
	}
}