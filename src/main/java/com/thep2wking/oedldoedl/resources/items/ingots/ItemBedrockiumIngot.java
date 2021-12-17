package com.thep2wking.oedldoedl.resources.items.ingots;

import java.util.List;

import com.thep2wking.oedldoedl.core.OedldoedlCore;
import com.thep2wking.oedldoedl.core.config.CoreConfig;
import com.thep2wking.oedldoedl.core.init.RarityInit;
import com.thep2wking.oedldoedl.core.util.interfaces.IHasModel;
import com.thep2wking.oedldoedl.core.util.tooltips.TooltipAltOriginInfo;
import com.thep2wking.oedldoedl.core.util.tooltips.TooltipControlEffectInfo;
import com.thep2wking.oedldoedl.core.util.tooltips.TooltipShiftInfo;
import com.thep2wking.oedldoedl.resources.OedldoedlResources;
import com.thep2wking.oedldoedl.resources.ReferenceResources;
import com.thep2wking.oedldoedl.resources.config.ResourcesConfig;
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
	
    @Override
    @SideOnly (Side.CLIENT)
    public EnumRarity getRarity(ItemStack stack) 
    {
    	return RarityInit.LIGHT_PURPLE;
    }
	
	@Override
    public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
    {
  		if (ResourcesConfig.GENEREL.itemsGiveEffects && ResourcesConfig.RESOURCES.metals.bedrockium.effectsEnabled) 
  		{
  			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 10, ResourcesConfig.RESOURCES.metals.bedrockium.slownessAmplifierIngot - 1, false, false));
  			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HUNGER, 200, ResourcesConfig.RESOURCES.metals.bedrockium.hungerAmplifierIngot - 1, false, false));
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
  				TextFormatting.GREEN+I18n.format("item.oedldoedl.bedrockium_ingot.tip"),
  				TextFormatting.GREEN+I18n.format("item.oedldoedl.bedrockium_ingot.tip2"),
  			});
  		}
		
  		if (CoreConfig.GENEREL.tooltips.potionInformation && ResourcesConfig.GENEREL.itemsGiveEffects && ResourcesConfig.RESOURCES.metals.bedrockium.effectsEnabled) 
  		{
  			TooltipControlEffectInfo.addTooltipText(tooltip, new String[] 
  			{
  				TextFormatting.DARK_GREEN+""+I18n.format("core.oedldoedl.given.effects.tip"),
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.format("item.oedldoedl.bedrockium_ingot.effects.tip")+TextFormatting.RED+""+TextFormatting.ITALIC+" ("+ResourcesConfig.RESOURCES.metals.bedrockium.slownessAmplifierIngot+") "+TextFormatting.YELLOW+""+TextFormatting.ITALIC+"(1 sec)",
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.format("item.oedldoedl.bedrockium_ingot.effects.tip2")+TextFormatting.RED+""+TextFormatting.ITALIC+" ("+ResourcesConfig.RESOURCES.metals.bedrockium.hungerAmplifierIngot+") "+TextFormatting.YELLOW+""+TextFormatting.ITALIC+"(10 sec)",
  			});
  		}
  		
  		if (CoreConfig.GENEREL.tooltips.originInformation) 
  		{
  			TooltipAltOriginInfo.addTooltipText(tooltip, new String[] 
  			{
  				TextFormatting.DARK_AQUA+""+TextFormatting.ITALIC+I18n.format("item.oedldoedl.xuold.origin.tip"),
  			});
  		}
	}
}