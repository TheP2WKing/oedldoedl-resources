package net.thep2wking.oedldoedlresources.init;

import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.thep2wking.oedldoedlcore.util.ModRarities;
import net.thep2wking.oedldoedlresources.OedldoedlResources;
import net.thep2wking.oedldoedlresources.api.item.ModItemIngotEffectBase;

public class ModItems {
	public static final Item GREMORIUM_INGOT = new ModItemIngotEffectBase(OedldoedlResources.MODID, "gremorium_ingot",
			ModTabs.TAB, MobEffects.HASTE, false, ModRarities.DARK_RED, false, 3, 1);
				public static final Item HIMEJIMARIUM_INGOT = new ModItemIngotEffectBase(OedldoedlResources.MODID, "himejimarium_ingot",
			ModTabs.TAB, MobEffects.RESISTANCE, false, ModRarities.DARK_BLUE, false, 3, 1);
				public static final Item TOUJOURIUM_INGOT = new ModItemIngotEffectBase(OedldoedlResources.MODID, "toujourium_ingot",
			ModTabs.TAB, MobEffects.SPEED, false, ModRarities.GRAY, false, 3, 1);
				public static final Item ARGENTORIUM_INGOT = new ModItemIngotEffectBase(OedldoedlResources.MODID, "argentorium_ingot",
			ModTabs.TAB, MobEffects.SATURATION, false, ModRarities.YELLOW, false, 3, 1);
				public static final Item QUARTARIUM_INGOT = new ModItemIngotEffectBase(OedldoedlResources.MODID, "quartarium_ingot",
			ModTabs.TAB, MobEffects.STRENGTH, false, ModRarities.BLUE, false, 3, 1);
				public static final Item NAGATORIUM_INGOT = new ModItemIngotEffectBase(OedldoedlResources.MODID, "nagatorium_ingot",
			ModTabs.TAB, MobEffects.UNLUCK, true, ModRarities.DARK_PURPLE, false, 3, 1);
				public static final Item SAKURAJIMARIUM_INGOT = new ModItemIngotEffectBase(OedldoedlResources.MODID, "sakurajimarium_ingot",
			ModTabs.TAB, MobEffects.JUMP_BOOST, false, ModRarities.DARK_GRAY, false, 3, 1);
}
