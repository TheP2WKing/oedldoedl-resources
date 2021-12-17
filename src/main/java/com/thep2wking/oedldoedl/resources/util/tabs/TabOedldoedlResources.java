package com.thep2wking.oedldoedl.resources.util.tabs;

import com.thep2wking.oedldoedl.core.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabOedldoedlResources extends CreativeTabs
{
	public TabOedldoedlResources(String label)
	{
		super("tab_oedldoedl_resources");
		setBackgroundImageName("oedldoedl_base.png");
	}
	
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ItemInit.ITEM_ICON_RESOURCES);
	}
}