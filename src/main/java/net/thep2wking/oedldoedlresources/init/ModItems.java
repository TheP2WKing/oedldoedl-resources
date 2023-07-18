package net.thep2wking.oedldoedlresources.init;

import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.thep2wking.oedldoedlcore.api.item.ModItemBase;
import net.thep2wking.oedldoedlcore.api.item.ModItemBlockBase;
import net.thep2wking.oedldoedlcore.util.ModRarities;
import net.thep2wking.oedldoedlresources.OedldoedlResources;
import net.thep2wking.oedldoedlresources.api.item.ModItemBlockEffectBase;
import net.thep2wking.oedldoedlresources.api.item.ModItemIngotEffectBase;
import net.thep2wking.oedldoedlresources.content.itemblock.ItemBlockChaosPlank;

public class ModItems {
	// ore itemblocks
	public static final Item BASE_ORE = new ModItemBlockBase(ModBlocks.BASE_ORE, ModRarities.WHITE, false, 2, 0);
	public static final Item OEDLDOEDL_ORE = new ModItemBlockBase(ModBlocks.OEDLDOEDL_ORE, ModRarities.LIGHT_PURPLE, false, 2, 0);
	public static final Item RANDOMITE_ORE = new ModItemBlockBase(ModBlocks.RANDOMITE_ORE, ModRarities.YELLOW, false, 2, 0);
	public static final Item ENDER_ORE = new ModItemBlockBase(ModBlocks.ENDER_ORE, ModRarities.YELLOW, false, 2, 0);
	public static final Item GUNPOWDER_ORE = new ModItemBlockBase(ModBlocks.GUNPOWDER_ORE, ModRarities.WHITE, false, 2, 0);
	public static final Item SALT_ORE = new ModItemBlockBase(ModBlocks.SALT_ORE, ModRarities.WHITE, false, 2, 0);

	public static final Item NETHER_GREMORIUM_ORE = new ModItemBlockBase(ModBlocks.NETHER_GREMORIUM_ORE, ModRarities.DARK_RED, false, 2, 0);
	public static final Item NETHER_HIMEJIMARIUM_ORE = new ModItemBlockBase(ModBlocks.NETHER_HIMEJIMARIUM_ORE, ModRarities.DARK_BLUE, false, 2, 0);
	public static final Item NETHER_TOUJOURIUM_ORE = new ModItemBlockBase(ModBlocks.NETHER_TOUJOURIUM_ORE, ModRarities.GRAY, false, 2, 0);
	public static final Item NETHER_ARGENTORIUM_ORE = new ModItemBlockBase(ModBlocks.NETHER_ARGENTORIUM_ORE, ModRarities.YELLOW, false, 2, 0);
	public static final Item NETHER_QUARTARIUM_ORE = new ModItemBlockBase(ModBlocks.NETHER_QUARTARIUM_ORE, ModRarities.BLUE, false, 2, 0);
	public static final Item NETHER_NAGATORIUM_ORE = new ModItemBlockBase(ModBlocks.NETHER_NAGATORIUM_ORE, ModRarities.DARK_PURPLE, false, 2, 0);
	public static final Item NETHER_SAKURAJIMARIUM_ORE = new ModItemBlockBase(ModBlocks.NETHER_SAKURAJIMARIUM_ORE, ModRarities.DARK_GRAY, false, 2, 0);

	public static final Item END_ELEMENT_OD = new ModItemBlockBase(ModBlocks.END_ELEMENT_OD, ModRarities.LIGHT_PURPLE, false, 2, 0);

	// ingot itemblocks
	public static final Item BASE_BLOCK = new ModItemBlockBase(ModBlocks.BASE, ModRarities.WHITE, false, 2, 0);
	public static final Item OEDLDOEDL_BLOCK = new ModItemBlockBase(ModBlocks.OEDLDOEDL, ModRarities.LIGHT_PURPLE, true, 2, 0);
	public static final Item BEDROCKIUM_BLOCK = new ModItemBlockBase(ModBlocks.BEDROCKIUM, ModRarities.LIGHT_PURPLE, false, 1, 0);
	public static final Item CLOUDIUM_BLOCK = new ModItemBlockBase(ModBlocks.CLOUDIUM, ModRarities.LIGHT_PURPLE, false, 1, 0);
	public static final Item ELEVATIUM_BLOCK = new ModItemBlockBase(ModBlocks.ELEVATIUM, ModRarities.LIGHT_PURPLE, false, 1, 0);
	public static final Item SADISTIUM_BLOCK = new ModItemBlockBase(ModBlocks.SADISTIUM, ModRarities.LIGHT_PURPLE, false, 1, 0);
	public static final Item DRUNKIUM_BLOCK = new ModItemBlockBase(ModBlocks.DRUNKIUM, ModRarities.LIGHT_PURPLE, false, 1, 0);
	public static final Item MONEY_BLOCK = new ModItemBlockBase(ModBlocks.MONEY, ModRarities.DARK_GREEN, false, 3, 0);

	public static final Item GREMORIUM_BLOCK = new ModItemBlockEffectBase(ModBlocks.GREMORIUM, MobEffects.HASTE, false, ModRarities.DARK_RED, false, 1, 0);
	public static final Item HIMEJIMARIUM_BLOCK = new ModItemBlockEffectBase(ModBlocks.HIMEJIMARIUM, MobEffects.RESISTANCE, false, ModRarities.DARK_BLUE, false, 1, 0);
	public static final Item TOUJOURIUM_BLOCK = new ModItemBlockEffectBase(ModBlocks.TOUJOURIUM, MobEffects.SPEED, false, ModRarities.GRAY, false, 1, 0);
	public static final Item ARGENTORIUM_BLOCK = new ModItemBlockEffectBase(ModBlocks.ARGENTORIUM, MobEffects.SATURATION, false, ModRarities.YELLOW, false, 1, 0);
	public static final Item QUARTARIUM_BLOCK = new ModItemBlockEffectBase(ModBlocks.QUARTARIUM, MobEffects.STRENGTH, false, ModRarities.BLUE, false, 1, 0);
	public static final Item NAGATORIUM_BLOCK = new ModItemBlockEffectBase(ModBlocks.NAGATORIUM, MobEffects.UNLUCK, true, ModRarities.DARK_PURPLE, false, 1, 0);
	public static final Item SAKURAJIMARIUM_BLOCK = new ModItemBlockEffectBase(ModBlocks.SAKURAJIMARIUM, MobEffects.JUMP_BOOST, false, ModRarities.DARK_GRAY, false, 1, 0);

	// gem itemblocks
	public static final Item BASE_GEM_BLOCK = new ModItemBlockBase(ModBlocks.BASE_GEM, ModRarities.WHITE, false, 1, 0);
	public static final Item OEDLDOEDL_GEM_BLOCK = new ModItemBlockBase(ModBlocks.OEDLDOEDL_GEM, ModRarities.LIGHT_PURPLE, true, 2, 0);
	public static final Item TIMOFIUM_GEM_BLOCK = new ModItemBlockBase(ModBlocks.TIMOFIUM_GEM, ModRarities.YELLOW, true, 1, 0);
	public static final Item FLOFINIUM_GEM_BLOCK = new ModItemBlockBase(ModBlocks.FLOFINIUM_GEM, ModRarities.DARK_BLUE, true, 1, 0);
	public static final Item LAARSIUM_GEM_BLOCK = new ModItemBlockBase(ModBlocks.LAARSIUM_GEM, ModRarities.DARK_GREEN, true, 1, 0);
	public static final Item KLAARSIUM_GEM_BLOCK = new ModItemBlockBase(ModBlocks.KLAARSIUM_GEM, ModRarities.DARK_PURPLE, true, 1, 0);
	public static final Item SHARANIUM_GEM_BLOCK = new ModItemBlockBase(ModBlocks.SHARANIUM_GEM, ModRarities.LIGHT_PURPLE, true, 1, 0);
	public static final Item MAKERIUM_GEM_BLOCK = new ModItemBlockBase(ModBlocks.MAKERIUM_GEM, ModRarities.GREEN, true, 1, 0);
	public static final Item INDERIUM_GEM_BLOCK = new ModItemBlockBase(ModBlocks.INDERIUM_GEM, ModRarities.AQUA, true, 1, 0);
	public static final Item PUMARIUM_GEM_BLOCK = new ModItemBlockBase(ModBlocks.PUMARIUM_GEM, ModRarities.DARK_RED, true, 1, 0);
	public static final Item CALLAXIUM_GEM_BLOCK = new ModItemBlockBase(ModBlocks.CALLAXIUM_GEM, ModRarities.BLUE, true, 1, 0);
	public static final Item SKORPIUM_GEM_BLOCK = new ModItemBlockBase(ModBlocks.SKORPIUM_GEM, ModRarities.RED, true, 1, 0);
	public static final Item STUPIDIUM_GEM_BLOCK = new ModItemBlockBase(ModBlocks.STUPIDIUM_GEM, ModRarities.DARK_AQUA, true, 1, 0);

	public static final Item GREMORIUM_GEM_BLOCK = new ModItemBlockBase(ModBlocks.GREMORIUM_GEM, ModRarities.DARK_RED, false, 2, 0);
	public static final Item HIMEJIMARIUM_GEM_BLOCK = new ModItemBlockBase(ModBlocks.HIMEJIMARIUM_GEM, ModRarities.DARK_BLUE, false, 2, 0);
	public static final Item TOUJOURIUM_GEM_BLOCK = new ModItemBlockBase(ModBlocks.TOUJOURIUM_GEM, ModRarities.GRAY, false, 2, 0);
	public static final Item ARGENTORIUM_GEM_BLOCK = new ModItemBlockBase(ModBlocks.ARGENTORIUM_GEM, ModRarities.YELLOW, false, 2, 0);
	public static final Item QUARTARIUM_GEM_BLOCK = new ModItemBlockBase(ModBlocks.QUARTARIUM_GEM, ModRarities.BLUE, false, 2, 0);
	public static final Item NAGATORIUM_GEM_BLOCK = new ModItemBlockBase(ModBlocks.NAGATORIUM_GEM, ModRarities.DARK_PURPLE, false, 2, 0);
	public static final Item SAKURAJIMARIUM_GEM_BLOCK = new ModItemBlockBase(ModBlocks.SAKURAJIMARIUM_GEM, ModRarities.DARK_GRAY, false, 2, 0);

	// star itemblocks
	public static final Item BASE_STAR_BLOCK = new ModItemBlockBase(ModBlocks.BASE_STAR, ModRarities.WHITE, false, 1, 0);
	public static final Item NETHER_STAR_BLOCK = new ModItemBlockBase(ModBlocks.NETHER_STAR, ModRarities.YELLOW, true, 1, 0);
	public static final Item OEDLDOEDL_STAR_BLOCK = new ModItemBlockBase(ModBlocks.OEDLDOEDL_STAR, ModRarities.LIGHT_PURPLE, true, 2, 0);
	public static final Item INFINITY_STAR_BLOCK = new ModItemBlockBase(ModBlocks.INFINITY_STAR, ModRarities.RED, true, 2, 0);

	// misc itemblocks
	public static final Item BALANCED_CLAY = new ModItemBlockBase(ModBlocks.BALANCED_CLAY, ModRarities.LIGHT_PURPLE, true, 2, 1);
	public static final Item CHAOS_PLANK = new ItemBlockChaosPlank(ModBlocks.CHAOS_PLANK, ModRarities.BLACK, false, 4, 0);

	// ingots
	public static final Item BASE_INGOT = new ModItemBase(OedldoedlResources.MODID, "base_ingot", OedldoedlResources.TAB, ModRarities.WHITE, false, 1, 0);
	public static final Item OEDLDOEDL_INGOT = new ModItemBase(OedldoedlResources.MODID, "oedldoedl_ingot", OedldoedlResources.TAB, ModRarities.LIGHT_PURPLE, true, 3, 0);
	public static final Item BEDROCKIUM_INGOT = new ModItemBase(OedldoedlResources.MODID, "bedrockium_ingot", OedldoedlResources.TAB, ModRarities.LIGHT_PURPLE, false, 1, 0);
	public static final Item CLOUDIUM_INGOT = new ModItemBase(OedldoedlResources.MODID, "cloudium_ingot", OedldoedlResources.TAB, ModRarities.LIGHT_PURPLE, false, 1, 0);
	public static final Item ELEVATIUM_INGOT = new ModItemBase(OedldoedlResources.MODID, "elevatium_ingot", OedldoedlResources.TAB, ModRarities.LIGHT_PURPLE, false, 1, 0);
	public static final Item SADISTIUM_INGOT = new ModItemBase(OedldoedlResources.MODID, "sadistium_ingot", OedldoedlResources.TAB, ModRarities.LIGHT_PURPLE, false, 1, 0);
	public static final Item DRUNKIUM_INGOT = new ModItemBase(OedldoedlResources.MODID, "drunkium_ingot", OedldoedlResources.TAB, ModRarities.LIGHT_PURPLE, false, 2, 0);
	public static final Item MONEY_INGOT = new ModItemBase(OedldoedlResources.MODID, "money_ingot", OedldoedlResources.TAB, ModRarities.DARK_GREEN, false, 4, 0);

	public static final Item GREMORIUM_INGOT = new ModItemIngotEffectBase(OedldoedlResources.MODID, "gremorium_ingot", OedldoedlResources.TAB, MobEffects.HASTE, false, ModRarities.DARK_RED, false, 3, 1).setBeaconPayment();
	public static final Item HIMEJIMARIUM_INGOT = new ModItemIngotEffectBase(OedldoedlResources.MODID, "himejimarium_ingot", OedldoedlResources.TAB, MobEffects.RESISTANCE, false, ModRarities.DARK_BLUE, false, 3, 1).setBeaconPayment();
	public static final Item TOUJOURIUM_INGOT = new ModItemIngotEffectBase(OedldoedlResources.MODID, "toujourium_ingot", OedldoedlResources.TAB, MobEffects.SPEED, false, ModRarities.GRAY, false, 3, 1).setBeaconPayment();
	public static final Item ARGENTORIUM_INGOT = new ModItemIngotEffectBase(OedldoedlResources.MODID, "argentorium_ingot", OedldoedlResources.TAB, MobEffects.SATURATION, false, ModRarities.YELLOW, false, 3, 1).setBeaconPayment();
	public static final Item QUARTARIUM_INGOT = new ModItemIngotEffectBase(OedldoedlResources.MODID, "quartarium_ingot", OedldoedlResources.TAB, MobEffects.STRENGTH, false, ModRarities.BLUE, false, 3, 1).setBeaconPayment();
	public static final Item NAGATORIUM_INGOT = new ModItemIngotEffectBase(OedldoedlResources.MODID, "nagatorium_ingot", OedldoedlResources.TAB, MobEffects.UNLUCK, true, ModRarities.DARK_PURPLE, false, 3, 1).setBeaconPayment();
	public static final Item SAKURAJIMARIUM_INGOT = new ModItemIngotEffectBase(OedldoedlResources.MODID, "sakurajimarium_ingot", OedldoedlResources.TAB, MobEffects.JUMP_BOOST, false, ModRarities.DARK_GRAY, false, 3, 1).setBeaconPayment();

	public static final Item UNSTABLE_INGOT = new ModItemBase(OedldoedlResources.MODID, "unstable_ingot", OedldoedlResources.TAB, ModRarities.RED, false, 3, 1);
	public static final Item CHAOS_INGOT = new ModItemBase(OedldoedlResources.MODID, "chaos_ingot", OedldoedlResources.TAB, ModRarities.BLACK, false, 5, 0);
}