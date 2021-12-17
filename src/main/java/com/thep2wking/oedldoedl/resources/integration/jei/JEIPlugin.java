package com.thep2wking.oedldoedl.resources.integration.jei;

import com.thep2wking.oedldoedl.resources.config.ResourcesConfig;
import com.thep2wking.oedldoedl.resources.init.BlockInit;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@mezz.jei.api.JEIPlugin
public class JEIPlugin implements IModPlugin 
{
	@Override
	public void register(IModRegistry registry) 
	{
		if (ResourcesConfig.INTEGRATION.jeiShowDescriptions)
		{
	      	registry.addIngredientInfo(new ItemStack(Item.getByNameOrId("oedldoedlresources:oedldoedl_ore")), ItemStack.class, I18n.format("item.oedldoedl.oedldoedl_ore.jei.tip"));
	      	registry.addIngredientInfo(new ItemStack(Item.getByNameOrId("oedldoedlresources:ender_ore")), ItemStack.class, I18n.format("item.oedldoedl.ender_ore.jei.tip"));
	      	registry.addIngredientInfo(new ItemStack(Item.getByNameOrId("oedldoedlresources:sulfur_ore")), ItemStack.class, I18n.format("item.oedldoedl.sulfur_ore.jei.tip"));
	      	registry.addIngredientInfo(new ItemStack(Item.getByNameOrId("oedldoedlresources:saltpeter_ore")), ItemStack.class, I18n.format("item.oedldoedl.saltpeter_ore.jei.tip"));
	      	registry.addIngredientInfo(new ItemStack(Item.getByNameOrId("oedldoedlresources:salt_ore")), ItemStack.class, I18n.format("item.oedldoedl.salt_ore.jei.tip"));
	      	registry.addIngredientInfo(new ItemStack(Item.getByNameOrId("oedldoedlresources:gremorium_gem_ore")), ItemStack.class, I18n.format("item.oedldoedl.gremorium_gem_ore.jei.tip"));
	      	registry.addIngredientInfo(new ItemStack(Item.getByNameOrId("oedldoedlresources:himejimarium_gem_ore")), ItemStack.class, I18n.format("item.oedldoedl.himejimarium_gem_ore.jei.tip"));
	      	registry.addIngredientInfo(new ItemStack(Item.getByNameOrId("oedldoedlresources:toujourium_gem_ore")), ItemStack.class, I18n.format("item.oedldoedl.toujourium_gem_ore.jei.tip"));
	      	registry.addIngredientInfo(new ItemStack(Item.getByNameOrId("oedldoedlresources:argentorium_gem_ore")), ItemStack.class, I18n.format("item.oedldoedl.argentorium_gem_ore.jei.tip"));
	      	registry.addIngredientInfo(new ItemStack(Item.getByNameOrId("oedldoedlresources:quartarium_gem_ore")), ItemStack.class, I18n.format("item.oedldoedl.quartarium_gem_ore.jei.tip"));
	      	registry.addIngredientInfo(new ItemStack(Item.getByNameOrId("oedldoedlresources:element_od")), ItemStack.class, I18n.format("item.oedldoedl.element_od.jei.tip"));
		}
	}
}