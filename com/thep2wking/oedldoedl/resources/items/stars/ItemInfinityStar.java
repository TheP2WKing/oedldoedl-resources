package com.thep2wking.oedldoedl.resources.items.stars;

import java.util.List;

import com.thep2wking.oedldoedl.core.config.constants.CoreConst;
import com.thep2wking.oedldoedl.core.init.RarityInit;
import com.thep2wking.oedldoedl.core.util.interfaces.IHasModel;
import com.thep2wking.oedldoedl.core.util.tooltips.TooltipShiftInfo;
import com.thep2wking.oedldoedl.resources.OedldoedlResources;
import com.thep2wking.oedldoedl.resources.ReferenceResources;
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

public class ItemInfinityStar extends Item implements IHasModel, IHaloRenderItem, IModelRegister
{
	public ItemInfinityStar(String name) 
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
        ModelResourceLocation infinity_star = new ModelResourceLocation("oedldoedlresources:infinity_star");
        ModelLoader.registerItemVariants(this, infinity_star);
        IBakedModel wrappedModel = new HaloRenderItem(TransformUtils.DEFAULT_ITEM, modelRegistry -> modelRegistry.func_82594_a(infinity_star));
        ModelRegistryHelper.register(infinity_star, wrappedModel);
        ModelLoader.setCustomMeshDefinition(this, stack -> infinity_star);
	}
    
    @Override
    @SideOnly (Side.CLIENT)
    public EnumRarity func_77613_e(ItemStack stack) 
    {
    	return RarityInit.RED;
    }
    
    @Override
    @SideOnly (Side.CLIENT)
    public boolean shouldDrawHalo(ItemStack stack)
    {
		if (CoreConst.CCL_TEXTURES)
		{
			return true;
		}
		return false;
    }

    @Override
    @SideOnly (Side.CLIENT)
    public TextureAtlasSprite getHaloTexture(ItemStack stack) 
    {
		if (CoreConst.CCL_TEXTURES)
		{
			return AvaritiaTextures.HALO;
		}
		return null;
    }

    @Override
    @SideOnly (Side.CLIENT)
    public int getHaloSize(ItemStack stack) 
    {
		if (CoreConst.CCL_TEXTURES)
		{
			return 6;
		}
		return 0;
    }	

    @Override
    @SideOnly (Side.CLIENT)
    public boolean shouldDrawPulse(ItemStack stack) 
    {
		if (CoreConst.CCL_TEXTURES)
		{
			return true;
		}
		return false;
    }

    @Override
    @SideOnly (Side.CLIENT)
    public int getHaloColour(ItemStack stack) 
    {
		if (CoreConst.CCL_TEXTURES)
		{
			return 0xFF000000;
		}
		return 0;
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
	@SideOnly(Side.CLIENT)
	public void func_77624_a(ItemStack stack, World world, List<String> tooltip, ITooltipFlag advanced) 
	{
  		if (CoreConst.ITEM_INFORMATION) 
  		{
  			TooltipShiftInfo.addTooltipText(tooltip, new String[] 
  			{
  				TextFormatting.GREEN+I18n.func_135052_a("item.oedldoedl.infinity_star.tip"),
  				TextFormatting.GREEN+I18n.func_135052_a("item.oedldoedl.infinity_star.tip2"),
  			});
  		}
	}
}