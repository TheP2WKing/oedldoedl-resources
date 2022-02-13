package net.thep2wking.oedldoedlresources.integration;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;
import net.thep2wking.oedldoedlresources.OedldoedlResources;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;
import net.thep2wking.oedldoedlresources.init.ModItems;

@JeiPlugin
public class JEIPlugin implements IModPlugin
{
	@Override
	public ResourceLocation getPluginUid() 
	{
		return new ResourceLocation(OedldoedlResources.MODID, "jei_plugin");
	}

	@Override
    public void registerRecipes (IRecipeRegistration registration)
    {
		if (ResourcesConfig.jei_descriptions.get())
		{
			if(ResourcesConfig.enable_overworld_ores.get())
			{
		    	registration.addIngredientInfo(new ItemStack(ModItems.RANDOMITE_ORE.get()), VanillaTypes.ITEM, new TranslationTextComponent("block.oedldoedlresources.randomite_ore.jei"));
		    	registration.addIngredientInfo(new ItemStack(ModItems.OEDLDOEDL_ORE.get()), VanillaTypes.ITEM, new TranslationTextComponent("block.oedldoedlresources.oedldoedl_ore.jei"));
		    	registration.addIngredientInfo(new ItemStack(ModItems.ENDER_ORE.get()), VanillaTypes.ITEM, new TranslationTextComponent("block.oedldoedlresources.ender_ore.jei"));
		    	registration.addIngredientInfo(new ItemStack(ModItems.GUNPOWDER_ORE.get()), VanillaTypes.ITEM, new TranslationTextComponent("block.oedldoedlresources.gunpowder_ore.jei"));
		    	registration.addIngredientInfo(new ItemStack(ModItems.SALT_ORE.get()), VanillaTypes.ITEM, new TranslationTextComponent("block.oedldoedlresources.salt_ore.jei"));
			}
			
			if(ResourcesConfig.enable_nether_ores.get())
			{
		    	registration.addIngredientInfo(new ItemStack(ModItems.NETHER_GREMORIUM_ORE.get()), VanillaTypes.ITEM, new TranslationTextComponent("block.oedldoedlresources.nether_gremorium_ore.jei"));
		    	registration.addIngredientInfo(new ItemStack(ModItems.NETHER_HIMEJIMARIUM_ORE.get()), VanillaTypes.ITEM, new TranslationTextComponent("block.oedldoedlresources.nether_himejimarium_ore.jei"));
		    	registration.addIngredientInfo(new ItemStack(ModItems.NETHER_TOUJOURIUM_ORE.get()), VanillaTypes.ITEM, new TranslationTextComponent("block.oedldoedlresources.nether_toujourium_ore.jei"));
		    	registration.addIngredientInfo(new ItemStack(ModItems.NETHER_ARGENTORIUM_ORE.get()), VanillaTypes.ITEM, new TranslationTextComponent("block.oedldoedlresources.nether_argentorium_ore.jei"));
		    	registration.addIngredientInfo(new ItemStack(ModItems.NETHER_QUARTARIUM_ORE.get()), VanillaTypes.ITEM, new TranslationTextComponent("block.oedldoedlresources.nether_quartarium_ore.jei"));
		    	registration.addIngredientInfo(new ItemStack(ModItems.NETHER_NAGATORIUM_ORE.get()), VanillaTypes.ITEM, new TranslationTextComponent("block.oedldoedlresources.nether_nagatorium_ore.jei"));
		    	registration.addIngredientInfo(new ItemStack(ModItems.NETHER_SAKURAJIMARIUM_ORE.get()), VanillaTypes.ITEM, new TranslationTextComponent("block.oedldoedlresources.nether_sakurajimarium_ore.jei"));
			}
			
			if(ResourcesConfig.enable_end_ores.get())
			{
				registration.addIngredientInfo(new ItemStack(ModItems.END_ELEMENT_OD.get()), VanillaTypes.ITEM, new TranslationTextComponent("block.oedldoedlresources.end_element_od.jei"));
			}
		}
	}	
}