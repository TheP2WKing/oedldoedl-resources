package net.thep2wking.oedldoedlresources.integration.jei;

import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import net.minecraft.item.ItemStack;
import net.thep2wking.oedldoedlcore.api.integration.ModJEIPluginBase;
import net.thep2wking.oedldoedlresources.OedldoedlResources;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;
import net.thep2wking.oedldoedlresources.init.ModBlocks;

@JEIPlugin
public class OedldoedlResourcesJEIPlugin extends ModJEIPluginBase {
	@Override
	public String getModId() {
		return OedldoedlResources.MODID;
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registry) {
		if (ResourcesConfig.INTEGRATION.JEI.RANDOMITE_DROPS_RECIPE_CATEGORY && ResourcesConfig.CONTENT.RANDOMITE_RANDOM_DROPS) {
			addRecipeCategory(registry, new RandomiteDropsRecipeCategory(getGuiHelper(registry)));
		}
	}
	
	@Override
	public void register(IModRegistry registry) {
		super.register(registry);

		if (ResourcesConfig.INTEGRATION.JEI.RANDOMITE_DROPS_RECIPE_CATEGORY && ResourcesConfig.CONTENT.RANDOMITE_RANDOM_DROPS) {
			addRecipeCatalyst(registry, new ItemStack(ModBlocks.RANDOMITE_ORE, 1, 0), RandomiteDropsRecipeCategory.UID);
			addRecipes(registry, RandomiteDropsRecipeWrapper.getDrops(), RandomiteDropsRecipeCategory.UID);
		}
	}
}