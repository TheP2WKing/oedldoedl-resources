package com.thep2wking.oedldoedl.resources.blocks.ores;

import java.util.List;

import com.thep2wking.oedldoedl.core.OedldoedlCore;
import com.thep2wking.oedldoedl.core.config.constants.CoreConst;
import com.thep2wking.oedldoedl.core.util.interfaces.IHasModel;
import com.thep2wking.oedldoedl.core.util.tooltips.TooltipShiftInfo;
import com.thep2wking.oedldoedl.resources.OedldoedlResources;
import com.thep2wking.oedldoedl.resources.ReferenceResources;
import com.thep2wking.oedldoedl.resources.init.BlockInit;
import com.thep2wking.oedldoedl.resources.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockOedldoedlOre extends Block implements IHasModel
{
    public BlockOedldoedlOre(String name, Material material)
	{
		super(material);
		func_149663_c(ReferenceResources.MODID+":"+name);
		setRegistryName(ReferenceResources.MODID+":"+name);
		func_149672_a(SoundType.field_185851_d);
		func_149711_c(5.0F);
		func_149752_b(20.0F);
		setHarvestLevel("pickaxe", 2);
		func_149715_a(0.5F);
		func_149713_g(0);
		func_149647_a(OedldoedlResources.TAB);
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
    
	@Override
	@SideOnly (Side.CLIENT)
	public void registerModels() 
	{
		OedldoedlCore.proxy.registerItemRenderer(Item.func_150898_a(this), 0, "inventory");
	}
    
	@Override
	@SideOnly(Side.CLIENT)
	public void func_190948_a(ItemStack stack, World world, List<String> tooltip, ITooltipFlag advanced) 
	{
  		if (CoreConst.ITEM_INFORMATION) 
  		{
  			TooltipShiftInfo.addTooltipText(tooltip, new String[] 
  			{
  				TextFormatting.GREEN+I18n.func_135052_a("item.oedldoedl.oedldoedl_ore.tip"),
  				TextFormatting.GREEN+I18n.func_135052_a("item.oedldoedl.oedldoedl_ore.tip2"),
  			});
  		}
	}
}