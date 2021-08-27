package com.thep2wking.oedldoedl.resources.util.tabs;

import com.thep2wking.oedldoedl.resources.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabOedldoedlResources extends CreativeTabs
{
	public TabOedldoedlResources(String label)
	{
		super("tab_oedldoedl_resources");
		func_78025_a("oedldoedl_base.png");
	}
	
	public ItemStack func_78016_d()
	{
		return new ItemStack(ItemInit.ITEM_OEDLDOEDL_STAR);
	}
}