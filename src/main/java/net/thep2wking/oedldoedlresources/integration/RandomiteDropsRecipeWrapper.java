package net.thep2wking.oedldoedlresources.integration;

import java.util.Arrays;
import java.util.List;

import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.ingredients.VanillaTypes;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.thep2wking.oedldoedlresources.OedldoedlResources;
import net.thep2wking.oedldoedlresources.init.ModBlocks;

public class RandomiteDropsRecipeWrapper implements IRecipeWrapper {
	public ItemStack outputItem;

	public RandomiteDropsRecipeWrapper(ItemStack out) {
		this.outputItem = out;
	}

	@Override
	public void getIngredients(IIngredients ingredients) {
		ingredients.setInput(VanillaTypes.ITEM, new ItemStack(ModBlocks.RANDOMITE_ORE, 1, 0));
		ingredients.setOutput(VanillaTypes.ITEM, outputItem);
	}

	@Override
	public boolean handleClick(Minecraft minecraft, int mouseX, int mouseY, int mouseButton) {
		return false;
	}

	@Override
	public List<String> getTooltipStrings(int mouseX, int mouseY) {
		if (mouseX >= 32 && mouseX <= 56 && mouseY >= 7 && mouseY <= 24) {
			return Arrays.asList(I18n.format("jei." + OedldoedlResources.MODID + ".randomite_drops.tip1"),
					I18n.format("jei." + OedldoedlResources.MODID + ".randomite_drops.tip2"));
		}
		return IRecipeWrapper.super.getTooltipStrings(mouseX, mouseY);
	}
}