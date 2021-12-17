package com.thep2wking.oedldoedl.resources.util.conditions;

import java.util.function.BooleanSupplier;

import com.google.gson.JsonObject;
import com.thep2wking.oedldoedl.resources.ReferenceResources;
import com.thep2wking.oedldoedl.resources.config.ResourcesConfig;

import net.minecraft.util.JsonUtils;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;

public class ResourcesConditionFactory implements IConditionFactory 
{
	@Override
	public BooleanSupplier parse(JsonContext context, JsonObject json) 
	{
		boolean value = JsonUtils.getBoolean(json, "value");
		String key = JsonUtils.getString(json, "type");

		if (key.equals(ReferenceResources.MODID+":resource_conversion")) 
		{
			return () -> ResourcesConfig.GENEREL.recipes.crafting.conversionEnabled == value;
		}
		else if (key.equals(ReferenceResources.MODID+":non_tweaked_modpack")) 
		{
			return () -> ResourcesConfig.GENEREL.recipes.crafting.nonTweakedModpackEnabled == value;
		}
		return null;
	}
}