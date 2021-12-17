package com.thep2wking.oedldoedl.resources.items.ingots;

import java.util.List;

import com.thep2wking.oedldoedl.core.OedldoedlCore;
import com.thep2wking.oedldoedl.core.config.CoreConfig;
import com.thep2wking.oedldoedl.core.init.RarityInit;
import com.thep2wking.oedldoedl.core.util.interfaces.IHasModel;
import com.thep2wking.oedldoedl.core.util.tooltips.TooltipAltOriginInfo;
import com.thep2wking.oedldoedl.core.util.tooltips.TooltipShiftInfo;
import com.thep2wking.oedldoedl.resources.OedldoedlResources;
import com.thep2wking.oedldoedl.resources.ReferenceResources;
import com.thep2wking.oedldoedl.resources.config.ResourcesConfig;
import com.thep2wking.oedldoedl.resources.init.ItemInit;

import codechicken.lib.model.ModelRegistryHelper;
import codechicken.lib.util.TransformUtils;
import morph.avaritia.api.IHaloRenderItem;
import morph.avaritia.api.registration.IModelRegister;
import morph.avaritia.client.render.item.HaloRenderItem;
import morph.avaritia.entity.EntityImmortalItem;
import morph.avaritia.init.AvaritiaTextures;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemHimejimariumIngot extends Item implements IHasModel, IHaloRenderItem, IModelRegister
{
	public ItemHimejimariumIngot(String name) 
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
		if (ResourcesConfig.GENEREL.cclProperties)
		{
			ModelResourceLocation himejimarium_ingot = new ModelResourceLocation("oedldoedlresources:himejimarium_ingot");
			ModelLoader.registerItemVariants(this, himejimarium_ingot);
			IBakedModel wrappedModel = new HaloRenderItem(TransformUtils.DEFAULT_ITEM, modelRegistry -> modelRegistry.getObject(himejimarium_ingot));
        	ModelRegistryHelper.register(himejimarium_ingot, wrappedModel);
        	ModelLoader.setCustomMeshDefinition(this, stack -> himejimarium_ingot);
		}
		else
		{
			OedldoedlCore.proxy.registerItemRenderer(this, 0, "inventory");
		}
	}
	
    @Override
    @SideOnly (Side.CLIENT)
    public EnumRarity getRarity(ItemStack stack) 
    {
    	return RarityInit.DARK_BLUE;
    }
	
    @Override
    @SideOnly (Side.CLIENT)
    public boolean shouldDrawHalo(ItemStack stack)
    {
		if (ResourcesConfig.GENEREL.cclProperties)
		{
			return true;
		}
		return false;
    }

    @Override
    @SideOnly (Side.CLIENT)
    public TextureAtlasSprite getHaloTexture(ItemStack stack) 
    {
		if (ResourcesConfig.GENEREL.cclProperties)
		{
			return AvaritiaTextures.HALO;
		}
		return null;
    }

    @Override
    @SideOnly (Side.CLIENT)
    public int getHaloSize(ItemStack stack) 
    {
		if (ResourcesConfig.GENEREL.cclProperties)
		{
			return 6;
		}
		return 0;
    }

    @Override
    @SideOnly (Side.CLIENT)
    public boolean shouldDrawPulse(ItemStack stack) 
    {
		if (ResourcesConfig.GENEREL.cclProperties)
		{
			return true;
		}
		return false;
    }

    @Override
    @SideOnly (Side.CLIENT)
    public int getHaloColour(ItemStack stack) 
    {
		if (ResourcesConfig.GENEREL.cclProperties)
		{
			return 0xFF232033;
		}
		return 0;
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
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag advanced) 
	{
  		if (CoreConfig.GENEREL.tooltips.itemInformation) 
  		{
  			TooltipShiftInfo.addTooltipText(tooltip, new String[] 
  			{
  				TextFormatting.DARK_GREEN+I18n.format("core.oedldoedl.stats.tip")+" "+
  				TextFormatting.DARK_BLUE+I18n.format("item.oedldoedl.himejimarium_ingot.tip"),
  				TextFormatting.GREEN+I18n.format("item.oedldoedl.himejimarium_ingot.tip2"),
  				TextFormatting.GREEN+I18n.format("item.oedldoedl.himejimarium_ingot.tip3"),
  				TextFormatting.GREEN+I18n.format("item.oedldoedl.himejimarium_ingot.tip4"),
  			});
  		}
  		
  		if (CoreConfig.GENEREL.tooltips.originInformation) 
  		{
  			TooltipAltOriginInfo.addTooltipText(tooltip, new String[] 
  			{
  				TextFormatting.DARK_AQUA+""+TextFormatting.ITALIC+I18n.format("item.oedldoedl.dxd.origin.tip"),
  			});
  		}
	}
}