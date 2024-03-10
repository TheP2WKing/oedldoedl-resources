package net.thep2wking.oedldoedlresources.integration;

import java.util.ArrayList;
import java.util.List;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.oredict.OreDictionary;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlresources.OedldoedlResources;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;
import net.thep2wking.oedldoedlresources.init.ModBlocks;

@mezz.jei.api.JEIPlugin
public class JEIPlugin implements IModPlugin {
	@Override
	public void register(IModRegistry registry) {
		if (Loader.isModLoaded("jei")) {
			ModLogger.registeredIntegration("JEI", OedldoedlResources.MODID);
		}

		if (ResourcesConfig.INTEGRATION.JEI.RANDOMITE_DROPS_RECIPE_CATEGORY
				&& ResourcesConfig.CONTENT.RANDOMITE_RANDOM_DROPS) {
			List<RandomiteDropsRecipeWrapper> randomiteDrop = new ArrayList<>();
			for (ItemStack output : OreDictionary.getOres("randomiteDrop")) {
				randomiteDrop.add(new RandomiteDropsRecipeWrapper(output));
				registry.addRecipes(randomiteDrop, RandomiteDropsRecipeCategory.UID);
				randomiteDrop.clear();
			}

			registry.addRecipeCatalyst(new ItemStack(ModBlocks.RANDOMITE_ORE, 1, 0), RandomiteDropsRecipeCategory.UID);
		}
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registry) {
		if (ResourcesConfig.INTEGRATION.JEI.RANDOMITE_DROPS_RECIPE_CATEGORY
				&& ResourcesConfig.CONTENT.RANDOMITE_RANDOM_DROPS) {
			registry.addRecipeCategories(new RandomiteDropsRecipeCategory(registry.getJeiHelpers().getGuiHelper()));
		}
	}
}