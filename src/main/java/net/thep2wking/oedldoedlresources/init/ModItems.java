package net.thep2wking.oedldoedlresources.init;

import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.thep2wking.oedldoedlcore.api.item.ModItemBase;
import net.thep2wking.oedldoedlcore.api.item.ModItemBlockBase;
import net.thep2wking.oedldoedlcore.util.ModRarities;
import net.thep2wking.oedldoedlresources.OedldoedlResources;
import net.thep2wking.oedldoedlresources.api.item.ModItemBlockEffectBase;
import net.thep2wking.oedldoedlresources.api.item.ModItemIngotEffectBase;
import net.thep2wking.oedldoedlresources.api.item.ModItemNuggetEffectBase;
import net.thep2wking.oedldoedlresources.content.item.ingot.ItemBedrockiumIngot;
import net.thep2wking.oedldoedlresources.content.item.ingot.ItemCloudiumIngot;
import net.thep2wking.oedldoedlresources.content.item.ingot.ItemDrunkiumIngot;
import net.thep2wking.oedldoedlresources.content.item.ingot.ItemElevatiumIngot;
import net.thep2wking.oedldoedlresources.content.item.ingot.ItemMoneyIngot;
import net.thep2wking.oedldoedlresources.content.item.ingot.ItemSadistiumIngot;
import net.thep2wking.oedldoedlresources.content.item.nugget.ItemBedrockiumNugget;
import net.thep2wking.oedldoedlresources.content.item.nugget.ItemCloudiumNugget;
import net.thep2wking.oedldoedlresources.content.item.nugget.ItemCoalNugget;
import net.thep2wking.oedldoedlresources.content.item.nugget.ItemDrunkiumNugget;
import net.thep2wking.oedldoedlresources.content.item.nugget.ItemElevatiumNugget;
import net.thep2wking.oedldoedlresources.content.item.nugget.ItemMoneyNugget;
import net.thep2wking.oedldoedlresources.content.item.nugget.ItemSadistiumNugget;
import net.thep2wking.oedldoedlresources.content.itemblock.ingot.ItemBlockBedrockium;
import net.thep2wking.oedldoedlresources.content.itemblock.ingot.ItemBlockCloudium;
import net.thep2wking.oedldoedlresources.content.itemblock.ingot.ItemBlockDrunkium;
import net.thep2wking.oedldoedlresources.content.itemblock.ingot.ItemBlockElevatium;
import net.thep2wking.oedldoedlresources.content.itemblock.ingot.ItemBlockMoney;
import net.thep2wking.oedldoedlresources.content.itemblock.ingot.ItemBlockSadistium;
import net.thep2wking.oedldoedlresources.content.itemblock.misc.ItemBlockChaosPlank;

public class ModItems {
	// ore itemblocks
	public static final Item BASE_ORE = new ModItemBlockBase(ModBlocks.BASE_ORE, ModRarities.WHITE, false, 2, 0);
	public static final Item OEDLDOEDL_ORE = new ModItemBlockBase(ModBlocks.OEDLDOEDL_ORE, ModRarities.LIGHT_PURPLE, false, 2, 0);
	public static final Item RANDOMITE_ORE = new ModItemBlockBase(ModBlocks.RANDOMITE_ORE, ModRarities.YELLOW, false, 2, 0);
	public static final Item ENRICHED_URANIUM_ORE = new ModItemBlockBase(ModBlocks.ENRICHED_URANIUM_ORE, ModRarities.YELLOW, false, 2, 0);
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
	public static final Item NETHER_KITAGAWARIUM_ORE = new ModItemBlockBase(ModBlocks.NETHER_KITAGAWARIUM_ORE, ModRarities.LIGHT_PURPLE, false, 2, 0);

	public static final Item END_ELEMENT_OD = new ModItemBlockBase(ModBlocks.END_ELEMENT_OD, ModRarities.LIGHT_PURPLE, false, 2, 0);

	// ingot itemblocks
	public static final Item BASE_BLOCK = new ModItemBlockBase(ModBlocks.BASE, ModRarities.WHITE, false, 2, 0);
	public static final Item OEDLDOEDL_BLOCK = new ModItemBlockBase(ModBlocks.OEDLDOEDL, ModRarities.LIGHT_PURPLE, true, 2, 0);
	public static final Item BEDROCKIUM_BLOCK = new ItemBlockBedrockium(ModBlocks.BEDROCKIUM, MobEffects.SLOWNESS, MobEffects.HUNGER, true, ModRarities.LIGHT_PURPLE, false, 1, 0);
	public static final Item CLOUDIUM_BLOCK = new ItemBlockCloudium(ModBlocks.CLOUDIUM, MobEffects.GLOWING, true, ModRarities.LIGHT_PURPLE, false, 1, 0);
	public static final Item ELEVATIUM_BLOCK = new ItemBlockElevatium(ModBlocks.ELEVATIUM, MobEffects.LEVITATION, true, ModRarities.LIGHT_PURPLE, false, 1, 0);
	public static final Item SADISTIUM_BLOCK = new ItemBlockSadistium(ModBlocks.SADISTIUM, MobEffects.MINING_FATIGUE, MobEffects.WEAKNESS, MobEffects.GLOWING, true, ModRarities.LIGHT_PURPLE, false, 1, 0);
	public static final Item DRUNKIUM_BLOCK = new ItemBlockDrunkium(ModBlocks.DRUNKIUM, MobEffects.BLINDNESS, MobEffects.SLOWNESS, MobEffects.NAUSEA, MobEffects.WITHER, true, ModRarities.LIGHT_PURPLE, false, 1, 0);
	public static final Item MONEY_BLOCK = new ItemBlockMoney(ModBlocks.MONEY, ModRarities.DARK_GREEN, false, 3, 0);

	public static final Item GREMORIUM_BLOCK = new ModItemBlockEffectBase(ModBlocks.GREMORIUM, MobEffects.HASTE, false, ModRarities.DARK_RED, false, 1, 0);
	public static final Item HIMEJIMARIUM_BLOCK = new ModItemBlockEffectBase(ModBlocks.HIMEJIMARIUM, MobEffects.RESISTANCE, false, ModRarities.DARK_BLUE, false, 1, 0);
	public static final Item TOUJOURIUM_BLOCK = new ModItemBlockEffectBase(ModBlocks.TOUJOURIUM, MobEffects.SPEED, false, ModRarities.GRAY, false, 1, 0);
	public static final Item ARGENTORIUM_BLOCK = new ModItemBlockEffectBase(ModBlocks.ARGENTORIUM, MobEffects.SATURATION, false, ModRarities.YELLOW, false, 1, 0);
	public static final Item QUARTARIUM_BLOCK = new ModItemBlockEffectBase(ModBlocks.QUARTARIUM, MobEffects.STRENGTH, false, ModRarities.BLUE, false, 1, 0);
	public static final Item NAGATORIUM_BLOCK = new ModItemBlockEffectBase(ModBlocks.NAGATORIUM, MobEffects.UNLUCK, true, ModRarities.DARK_PURPLE, false, 1, 0);
	public static final Item SAKURAJIMARIUM_BLOCK = new ModItemBlockEffectBase(ModBlocks.SAKURAJIMARIUM, MobEffects.JUMP_BOOST, false, ModRarities.DARK_GRAY, false, 1, 0);
	public static final Item KITAGAWARIUM_BLOCK = new ModItemBlockEffectBase(ModBlocks.KITAGAWARIUM, MobEffects.WATER_BREATHING, false, ModRarities.LIGHT_PURPLE, false, 1, 0);

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
	public static final Item KITAGAWARIUM_GEM_BLOCK = new ModItemBlockBase(ModBlocks.KITAGAWARIUM_GEM, ModRarities.LIGHT_PURPLE, false, 2, 0);

	// star itemblocks
	public static final Item BASE_STAR_BLOCK = new ModItemBlockBase(ModBlocks.BASE_STAR, ModRarities.WHITE, false, 1, 0);
	public static final Item NETHER_STAR_BLOCK = new ModItemBlockBase(ModBlocks.NETHER_STAR, ModRarities.YELLOW, true, 1, 0);
	public static final Item OEDLDOEDL_STAR_BLOCK = new ModItemBlockBase(ModBlocks.OEDLDOEDL_STAR, ModRarities.LIGHT_PURPLE, true, 2, 0);

	// misc itemblocks
	public static final Item BALANCED_CLAY = new ModItemBlockBase(ModBlocks.BALANCED_CLAY, ModRarities.LIGHT_PURPLE, true, 2, 1);
	public static final Item CHAOS_PLANK = new ItemBlockChaosPlank(ModBlocks.CHAOS_PLANK, ModRarities.BLACK, false, 4, 0);

	// ingots
	public static final Item BASE_INGOT = new ModItemBase(OedldoedlResources.MODID, "base_ingot", OedldoedlResources.TAB, ModRarities.WHITE, false, 1, 0).setBeaconPayment();
	public static final Item OEDLDOEDL_INGOT = new ModItemBase(OedldoedlResources.MODID, "oedldoedl_ingot", OedldoedlResources.TAB, ModRarities.LIGHT_PURPLE, true, 3, 0).setBeaconPayment();
	public static final Item BEDROCKIUM_INGOT = new ItemBedrockiumIngot(OedldoedlResources.MODID, "bedrockium_ingot", OedldoedlResources.TAB, MobEffects.SLOWNESS, MobEffects.HUNGER, true, ModRarities.LIGHT_PURPLE, false, 1, 0).setBeaconPayment();
	public static final Item CLOUDIUM_INGOT = new ItemCloudiumIngot(OedldoedlResources.MODID, "cloudium_ingot", OedldoedlResources.TAB, MobEffects.GLOWING, true, ModRarities.LIGHT_PURPLE, false, 1, 0).setBeaconPayment();
	public static final Item ELEVATIUM_INGOT = new ItemElevatiumIngot(OedldoedlResources.MODID, "elevatium_ingot", OedldoedlResources.TAB, MobEffects.LEVITATION, true, ModRarities.LIGHT_PURPLE, false, 1, 0).setBeaconPayment();
	public static final Item SADISTIUM_INGOT = new ItemSadistiumIngot(OedldoedlResources.MODID, "sadistium_ingot", OedldoedlResources.TAB, MobEffects.MINING_FATIGUE, MobEffects.WEAKNESS, MobEffects.GLOWING, true, ModRarities.LIGHT_PURPLE, false, 1, 0).setBeaconPayment();
	public static final Item DRUNKIUM_INGOT = new ItemDrunkiumIngot(OedldoedlResources.MODID, "drunkium_ingot", OedldoedlResources.TAB, MobEffects.BLINDNESS, MobEffects.SLOWNESS,  MobEffects.NAUSEA, MobEffects.WITHER, true, ModRarities.LIGHT_PURPLE, false, 2, 0).setBeaconPayment();
	public static final Item MONEY_INGOT = new ItemMoneyIngot(OedldoedlResources.MODID, "money_ingot", OedldoedlResources.TAB, ModRarities.DARK_GREEN, false, 4, 0).setBeaconPayment();
	public static final Item CHAOS_INGOT = new ModItemBase(OedldoedlResources.MODID, "chaos_ingot", OedldoedlResources.TAB, ModRarities.BLACK, false, 5, 0).setBeaconPayment();

	public static final Item GREMORIUM_INGOT = new ModItemIngotEffectBase(OedldoedlResources.MODID, "gremorium_ingot", OedldoedlResources.TAB, MobEffects.HASTE, false, ModRarities.DARK_RED, false, 3, 1).setBeaconPayment();
	public static final Item HIMEJIMARIUM_INGOT = new ModItemIngotEffectBase(OedldoedlResources.MODID, "himejimarium_ingot", OedldoedlResources.TAB, MobEffects.RESISTANCE, false, ModRarities.DARK_BLUE, false, 3, 1).setBeaconPayment();
	public static final Item TOUJOURIUM_INGOT = new ModItemIngotEffectBase(OedldoedlResources.MODID, "toujourium_ingot", OedldoedlResources.TAB, MobEffects.SPEED, false, ModRarities.GRAY, false, 3, 1).setBeaconPayment();
	public static final Item ARGENTORIUM_INGOT = new ModItemIngotEffectBase(OedldoedlResources.MODID, "argentorium_ingot", OedldoedlResources.TAB, MobEffects.SATURATION, false, ModRarities.YELLOW, false, 3, 1).setBeaconPayment();
	public static final Item QUARTARIUM_INGOT = new ModItemIngotEffectBase(OedldoedlResources.MODID, "quartarium_ingot", OedldoedlResources.TAB, MobEffects.STRENGTH, false, ModRarities.BLUE, false, 3, 1).setBeaconPayment();
	public static final Item NAGATORIUM_INGOT = new ModItemIngotEffectBase(OedldoedlResources.MODID, "nagatorium_ingot", OedldoedlResources.TAB, MobEffects.UNLUCK, true, ModRarities.DARK_PURPLE, false, 3, 1).setBeaconPayment();
	public static final Item SAKURAJIMARIUM_INGOT = new ModItemIngotEffectBase(OedldoedlResources.MODID, "sakurajimarium_ingot", OedldoedlResources.TAB, MobEffects.JUMP_BOOST, false, ModRarities.DARK_GRAY, false, 3, 1).setBeaconPayment();
	public static final Item KITAGAWARIUM_INGOT = new ModItemIngotEffectBase(OedldoedlResources.MODID, "kitagawarium_ingot", OedldoedlResources.TAB, MobEffects.WATER_BREATHING, false, ModRarities.LIGHT_PURPLE, false, 3, 1).setBeaconPayment();

	// gems
	public static final Item BASE_GEM = new ModItemBase(OedldoedlResources.MODID, "base_gem", OedldoedlResources.TAB, ModRarities.WHITE, false, 1, 0);
	public static final Item OEDLDOEDL_GEM = new ModItemBase(OedldoedlResources.MODID, "oedldoedl_gem", OedldoedlResources.TAB, ModRarities.LIGHT_PURPLE, true, 2, 0);
	public static final Item TIMOFIUM_GEM = new ModItemBase(OedldoedlResources.MODID, "timofium_gem", OedldoedlResources.TAB, ModRarities.YELLOW, true, 2, 0);
	public static final Item FLOFINIUM_GEM = new ModItemBase(OedldoedlResources.MODID, "flofinium_gem", OedldoedlResources.TAB, ModRarities.DARK_BLUE, true, 1, 0);
	public static final Item LAARSIUM_GEM = new ModItemBase(OedldoedlResources.MODID, "laarsium_gem", OedldoedlResources.TAB, ModRarities.DARK_GREEN, true, 1, 0);
	public static final Item KLAARSIUM_GEM = new ModItemBase(OedldoedlResources.MODID, "klaarsium_gem", OedldoedlResources.TAB, ModRarities.DARK_PURPLE, true, 2, 0);
	public static final Item SHARANIUM_GEM = new ModItemBase(OedldoedlResources.MODID, "sharanium_gem", OedldoedlResources.TAB, ModRarities.LIGHT_PURPLE, true, 2, 0);
	public static final Item MAKERIUM_GEM = new ModItemBase(OedldoedlResources.MODID, "makerium_gem", OedldoedlResources.TAB, ModRarities.GREEN, true, 3, 0);
	public static final Item INDERIUM_GEM = new ModItemBase(OedldoedlResources.MODID, "inderium_gem", OedldoedlResources.TAB, ModRarities.AQUA, true, 1, 0);
	public static final Item PUMARIUM_GEM = new ModItemBase(OedldoedlResources.MODID, "pumarium_gem", OedldoedlResources.TAB, ModRarities.DARK_RED, true, 1, 0);
	public static final Item CALLAXIUM_GEM = new ModItemBase(OedldoedlResources.MODID, "callaxium_gem", OedldoedlResources.TAB, ModRarities.BLUE, true, 3, 0);
	public static final Item SKORPIUM_GEM = new ModItemBase(OedldoedlResources.MODID, "skorpium_gem", OedldoedlResources.TAB, ModRarities.RED, true, 1, 0);
	public static final Item STUPIDIUM_GEM = new ModItemBase(OedldoedlResources.MODID, "stupidium_gem", OedldoedlResources.TAB, ModRarities.DARK_AQUA, true, 2, 0);

	public static final Item GREMORIUM_GEM = new ModItemBase(OedldoedlResources.MODID, "gremorium_gem", OedldoedlResources.TAB, ModRarities.DARK_RED, false, 2, 0);
	public static final Item HIMEJIMARIUM_GEM = new ModItemBase(OedldoedlResources.MODID, "himejimarium_gem", OedldoedlResources.TAB, ModRarities.DARK_BLUE, false, 2, 0);
	public static final Item TOUJOURIUM_GEM = new ModItemBase(OedldoedlResources.MODID, "toujourium_gem", OedldoedlResources.TAB, ModRarities.GRAY, false, 2, 0);
	public static final Item ARGENTORIUM_GEM = new ModItemBase(OedldoedlResources.MODID, "argentorium_gem", OedldoedlResources.TAB, ModRarities.YELLOW, false, 2, 0);
	public static final Item QUARTARIUM_GEM = new ModItemBase(OedldoedlResources.MODID, "quartarium_gem", OedldoedlResources.TAB, ModRarities.BLUE, false, 2, 0);
	public static final Item NAGATORIUM_GEM = new ModItemBase(OedldoedlResources.MODID, "nagatorium_gem", OedldoedlResources.TAB, ModRarities.DARK_PURPLE, false, 2, 0);
	public static final Item SAKURAJIMARIUM_GEM = new ModItemBase(OedldoedlResources.MODID, "sakurajimarium_gem", OedldoedlResources.TAB, ModRarities.DARK_GRAY, false, 2, 0);
	public static final Item KITAGAWARIUM_GEM = new ModItemBase(OedldoedlResources.MODID, "kitagawarium_gem", OedldoedlResources.TAB, ModRarities.LIGHT_PURPLE, false, 2, 0);

	// stars
	public static final Item BASE_STAR = new ModItemBase(OedldoedlResources.MODID, "base_star", OedldoedlResources.TAB, ModRarities.WHITE, false, 1, 0);
	public static final Item OEDLDOEDL_STAR = new ModItemBase(OedldoedlResources.MODID, "oedldoedl_star", OedldoedlResources.TAB, ModRarities.LIGHT_PURPLE, true, 3, 0);

	public static final Item GREMORIUM_STAR = new ModItemBase(OedldoedlResources.MODID, "gremorium_star", OedldoedlResources.TAB, ModRarities.DARK_RED, true, 1, 0);
	public static final Item HIMEJIMARIUM_STAR = new ModItemBase(OedldoedlResources.MODID, "himejimarium_star", OedldoedlResources.TAB, ModRarities.DARK_BLUE, true, 1, 0);
	public static final Item TOUJOURIUM_STAR = new ModItemBase(OedldoedlResources.MODID, "toujourium_star", OedldoedlResources.TAB, ModRarities.GRAY, true, 1, 0);
	public static final Item ARGENTORIUM_STAR = new ModItemBase(OedldoedlResources.MODID, "argentorium_star", OedldoedlResources.TAB, ModRarities.YELLOW, true, 1, 0);
	public static final Item QUARTARIUM_STAR = new ModItemBase(OedldoedlResources.MODID, "quartarium_star", OedldoedlResources.TAB, ModRarities.BLUE, true, 1, 0);
	public static final Item NAGATORIUM_STAR = new ModItemBase(OedldoedlResources.MODID, "nagatorium_star", OedldoedlResources.TAB, ModRarities.DARK_PURPLE, true, 1, 0);
	public static final Item SAKURAJIMARIUM_STAR = new ModItemBase(OedldoedlResources.MODID, "sakurajimarium_star", OedldoedlResources.TAB, ModRarities.DARK_GRAY, true, 1, 0);
	public static final Item KITAGAWARIUM_STAR = new ModItemBase(OedldoedlResources.MODID, "kitagawarium_star", OedldoedlResources.TAB, ModRarities.LIGHT_PURPLE, true, 1, 0);

	// elements
	public static final Item BASE_ELEMENT = new ModItemBase(OedldoedlResources.MODID, "base_element", OedldoedlResources.TAB, ModRarities.WHITE, false, 1, 0);
	public static final Item OEDLDOEDL_ELEMENT = new ModItemBase(OedldoedlResources.MODID, "oedldoedl_element", OedldoedlResources.TAB, ModRarities.LIGHT_PURPLE, true, 2, 0);
	public static final Item TIMOFIUM_ELEMENT = new ModItemBase(OedldoedlResources.MODID, "timofium_element", OedldoedlResources.TAB, ModRarities.YELLOW, false, 2, 0);
	public static final Item FLOFINIUM_ELEMENT = new ModItemBase(OedldoedlResources.MODID, "flofinium_element", OedldoedlResources.TAB, ModRarities.DARK_BLUE, false, 2, 0);
	public static final Item LAARSIUM_ELEMENT = new ModItemBase(OedldoedlResources.MODID, "laarsium_element", OedldoedlResources.TAB, ModRarities.DARK_GREEN, false, 2, 0);
	public static final Item KLAARSIUM_ELEMENT = new ModItemBase(OedldoedlResources.MODID, "klaarsium_element", OedldoedlResources.TAB, ModRarities.DARK_PURPLE, false, 1, 0);
	public static final Item SHARANIUM_ELEMENT = new ModItemBase(OedldoedlResources.MODID, "sharanium_element", OedldoedlResources.TAB, ModRarities.LIGHT_PURPLE, false, 1, 0);
	public static final Item MAKERIUM_ELEMENT = new ModItemBase(OedldoedlResources.MODID, "makerium_element", OedldoedlResources.TAB, ModRarities.GREEN, false, 1, 0);
	public static final Item INDERIUM_ELEMENT = new ModItemBase(OedldoedlResources.MODID, "inderium_element", OedldoedlResources.TAB, ModRarities.AQUA, false, 1, 0);
	public static final Item PUMARIUM_ELEMENT = new ModItemBase(OedldoedlResources.MODID, "pumarium_element", OedldoedlResources.TAB, ModRarities.DARK_RED, false, 1, 0);
	public static final Item CALLAXIUM_ELEMENT = new ModItemBase(OedldoedlResources.MODID, "callaxium_element", OedldoedlResources.TAB, ModRarities.BLUE, false, 1, 0);
	public static final Item SKORPIUM_ELEMENT = new ModItemBase(OedldoedlResources.MODID, "skorpium_element", OedldoedlResources.TAB, ModRarities.RED, false, 2, 0);
	public static final Item STUPIDIUM_ELEMENT = new ModItemBase(OedldoedlResources.MODID, "stupidium_element", OedldoedlResources.TAB, ModRarities.DARK_AQUA, false, 1, 0);

	// dusts
	public static final Item BASE_DUST = new ModItemBase(OedldoedlResources.MODID, "base_dust", OedldoedlResources.TAB, ModRarities.WHITE, false, 1, 0);
	public static final Item OEDLDOEDL_DUST = new ModItemBase(OedldoedlResources.MODID, "oedldoedl_dust", OedldoedlResources.TAB, ModRarities.LIGHT_PURPLE, true, 3, 0);
	public static final Item ENDER_DUST = new ModItemBase(OedldoedlResources.MODID, "ender_dust", OedldoedlResources.TAB, ModRarities.YELLOW, false, 1, 1);
	public static final Item SALT_DUST = new ModItemBase(OedldoedlResources.MODID, "salt_dust", OedldoedlResources.TAB, ModRarities.WHITE, false, 1, 1);

	// nuggets 
	public static final Item COAL_NUGGET = new ItemCoalNugget(OedldoedlResources.MODID, "coal_nugget", OedldoedlResources.TAB, ModRarities.WHITE, false, 1, 0);
	public static final Item CHARCOAL_NUGGET = new ItemCoalNugget(OedldoedlResources.MODID, "charcoal_nugget", OedldoedlResources.TAB, ModRarities.WHITE, false, 1, 0);
	public static final Item DIAMOND_NUGGET = new ModItemBase(OedldoedlResources.MODID, "diamond_nugget", OedldoedlResources.TAB, ModRarities.WHITE, false, 1, 0);
	public static final Item LAPIS_NUGGET = new ModItemBase(OedldoedlResources.MODID, "lapis_nugget", OedldoedlResources.TAB, ModRarities.WHITE, false, 1, 0);
	public static final Item EMERALD_NUGGET = new ModItemBase(OedldoedlResources.MODID, "emerald_nugget", OedldoedlResources.TAB, ModRarities.WHITE, false, 1, 0);
	public static final Item QUARTZ_NUGGET = new ModItemBase(OedldoedlResources.MODID, "quartz_nugget", OedldoedlResources.TAB, ModRarities.WHITE, false, 1, 0);
	public static final Item OBSIDIAN_NUGGET = new ModItemBase(OedldoedlResources.MODID, "obsidian_nugget", OedldoedlResources.TAB, ModRarities.WHITE, false, 1, 0);
	public static final Item ENDER_NUGGET = new ModItemBase(OedldoedlResources.MODID, "ender_nugget", OedldoedlResources.TAB, ModRarities.WHITE, false, 1, 0);
	public static final Item BASE_NUGGET = new ModItemBase(OedldoedlResources.MODID, "base_nugget", OedldoedlResources.TAB, ModRarities.WHITE, false, 1, 0);
	public static final Item OEDLDOEDL_NUGGET = new ModItemBase(OedldoedlResources.MODID, "oedldoedl_nugget", OedldoedlResources.TAB, ModRarities.WHITE, true, 2, 0);
	public static final Item BEDROCKIUM_NUGGET = new ItemBedrockiumNugget(OedldoedlResources.MODID, "bedrockium_nugget", OedldoedlResources.TAB, MobEffects.SLOWNESS, MobEffects.HUNGER, true, ModRarities.LIGHT_PURPLE, false, 1, 0);
	public static final Item CLOUDIUM_NUGGET = new ItemCloudiumNugget(OedldoedlResources.MODID, "cloudium_nugget", OedldoedlResources.TAB, MobEffects.GLOWING, true, ModRarities.LIGHT_PURPLE, false, 1, 0);
	public static final Item ELEVATIUM_NUGGET = new ItemElevatiumNugget(OedldoedlResources.MODID, "elevatium_nugget", OedldoedlResources.TAB, MobEffects.LEVITATION, true, ModRarities.LIGHT_PURPLE, false, 1, 0);
	public static final Item SADISTIUM_NUGGET = new ItemSadistiumNugget(OedldoedlResources.MODID, "sadistium_nugget", OedldoedlResources.TAB, MobEffects.MINING_FATIGUE, MobEffects.WEAKNESS, MobEffects.GLOWING, true, ModRarities.LIGHT_PURPLE, false, 1, 0);
	public static final Item DRUNKIUM_NUGGET = new ItemDrunkiumNugget(OedldoedlResources.MODID, "drunkium_nugget", OedldoedlResources.TAB, MobEffects.BLINDNESS, MobEffects.SLOWNESS,  MobEffects.NAUSEA, MobEffects.WITHER, true, ModRarities.LIGHT_PURPLE, false, 2, 0);
	public static final Item MONEY_NUGGET = new ItemMoneyNugget(OedldoedlResources.MODID, "money_nugget", OedldoedlResources.TAB, ModRarities.DARK_GREEN, false, 3, 0);

	public static final Item GREMORIUM_NUGGET = new ModItemNuggetEffectBase(OedldoedlResources.MODID, "gremorium_nugget", OedldoedlResources.TAB, MobEffects.HASTE, false, ModRarities.DARK_RED, false, 1, 0);
	public static final Item HIMEJIMARIUM_NUGGET = new ModItemNuggetEffectBase(OedldoedlResources.MODID, "himejimarium_nugget", OedldoedlResources.TAB, MobEffects.RESISTANCE, false, ModRarities.DARK_BLUE, false, 1, 0);
	public static final Item TOUJOURIUM_NUGGET = new ModItemNuggetEffectBase(OedldoedlResources.MODID, "toujourium_nugget", OedldoedlResources.TAB, MobEffects.SPEED, false, ModRarities.GRAY, false, 1, 0);
	public static final Item ARGENTORIUM_NUGGET = new ModItemNuggetEffectBase(OedldoedlResources.MODID, "argentorium_nugget", OedldoedlResources.TAB, MobEffects.SATURATION, false, ModRarities.YELLOW, false, 1, 0);
	public static final Item QUARTARIUM_NUGGET = new ModItemNuggetEffectBase(OedldoedlResources.MODID, "quartarium_nugget", OedldoedlResources.TAB, MobEffects.STRENGTH, false, ModRarities.BLUE, false, 1, 0);
	public static final Item NAGATORIUM_NUGGET = new ModItemNuggetEffectBase(OedldoedlResources.MODID, "nagatorium_nugget", OedldoedlResources.TAB, MobEffects.UNLUCK, true, ModRarities.DARK_PURPLE, false, 1, 0);
	public static final Item SAKURAJIMARIUM_NUGGET = new ModItemNuggetEffectBase(OedldoedlResources.MODID, "sakurajimarium_nugget", OedldoedlResources.TAB, MobEffects.JUMP_BOOST, false, ModRarities.DARK_GRAY, false, 1, 0);
	public static final Item KITAGAWARIUM_NUGGET = new ModItemNuggetEffectBase(OedldoedlResources.MODID, "kitagawarium_nugget", OedldoedlResources.TAB, MobEffects.WATER_BREATHING, false, ModRarities.LIGHT_PURPLE, false, 1, 0);

	// shards
	public static final Item GREMORIUM_SHARD = new ModItemBase(OedldoedlResources.MODID, "gremorium_shard", OedldoedlResources.TAB, ModRarities.DARK_RED, false, 1, 1);
	public static final Item HIMEJIMARIUM_SHARD = new ModItemBase(OedldoedlResources.MODID, "himejimarium_shard", OedldoedlResources.TAB, ModRarities.DARK_BLUE, false, 1, 1);
	public static final Item TOUJOURIUM_SHARD = new ModItemBase(OedldoedlResources.MODID, "toujourium_shard", OedldoedlResources.TAB, ModRarities.GRAY, false, 1, 1);
	public static final Item ARGENTORIUM_SHARD = new ModItemBase(OedldoedlResources.MODID, "argentorium_shard", OedldoedlResources.TAB, ModRarities.YELLOW, false, 1, 1);
	public static final Item QUARTARIUM_SHARD = new ModItemBase(OedldoedlResources.MODID, "quartarium_shard", OedldoedlResources.TAB, ModRarities.BLUE, false, 1, 1);
	public static final Item NAGATORIUM_SHARD = new ModItemBase(OedldoedlResources.MODID, "nagatorium_shard", OedldoedlResources.TAB, ModRarities.DARK_PURPLE, false, 1, 1);
	public static final Item SAKURAJIMARIUM_SHARD = new ModItemBase(OedldoedlResources.MODID, "sakurajimarium_shard", OedldoedlResources.TAB, ModRarities.DARK_GRAY, false, 1, 1);
	public static final Item KITAGAWARIUM_SHARD = new ModItemBase(OedldoedlResources.MODID, "kitagawarium_shard", OedldoedlResources.TAB, ModRarities.LIGHT_PURPLE, false, 1, 1);

	public static final Item BASE_STAR_SHARD = new ModItemBase(OedldoedlResources.MODID, "base_star_shard", OedldoedlResources.TAB, ModRarities.WHITE, false, 1, 0);
	public static final Item NETHER_STAR_SHARD = new ModItemBase(OedldoedlResources.MODID, "nether_star_shard", OedldoedlResources.TAB, ModRarities.YELLOW, true, 1, 0);
	public static final Item OEDLDOEDL_STAR_SHARD = new ModItemBase(OedldoedlResources.MODID, "oedldoedl_star_shard", OedldoedlResources.TAB, ModRarities.LIGHT_PURPLE, true, 1, 0);

	public static final Item GREMORIUM_STAR_SHARD = new ModItemBase(OedldoedlResources.MODID, "gremorium_star_shard", OedldoedlResources.TAB, ModRarities.DARK_RED, true, 1, 0);
	public static final Item HIMEJIMARIUM_STAR_SHARD = new ModItemBase(OedldoedlResources.MODID, "himejimarium_star_shard", OedldoedlResources.TAB, ModRarities.DARK_BLUE, true, 1, 0);
	public static final Item TOUJOURIUM_STAR_SHARD = new ModItemBase(OedldoedlResources.MODID, "toujourium_star_shard", OedldoedlResources.TAB, ModRarities.GRAY, true, 1, 0);
	public static final Item ARGENTORIUM_STAR_SHARD = new ModItemBase(OedldoedlResources.MODID, "argentorium_star_shard", OedldoedlResources.TAB, ModRarities.YELLOW, true, 1, 0);
	public static final Item QUARTARIUM_STAR_SHARD = new ModItemBase(OedldoedlResources.MODID, "quartarium_star_shard", OedldoedlResources.TAB, ModRarities.BLUE, true, 1, 0);
	public static final Item NAGATORIUM_STAR_SHARD = new ModItemBase(OedldoedlResources.MODID, "nagatorium_star_shard", OedldoedlResources.TAB, ModRarities.DARK_PURPLE, true, 1, 0);
	public static final Item SAKURAJIMARIUM_STAR_SHARD = new ModItemBase(OedldoedlResources.MODID, "sakurajimarium_star_shard", OedldoedlResources.TAB, ModRarities.DARK_GRAY, true, 1, 0);
	public static final Item KITAGAWARIUM_STAR_SHARD = new ModItemBase(OedldoedlResources.MODID, "kitagawarium_star_shard", OedldoedlResources.TAB, ModRarities.LIGHT_PURPLE, true, 1, 0);
	// fragments
	public static final Item BASE_FRAGMENT = new ModItemBase(OedldoedlResources.MODID, "base_fragment", OedldoedlResources.TAB, ModRarities.WHITE, false, 1, 0);
	public static final Item OEDLDOEDL_FRAGMENT = new ModItemBase(OedldoedlResources.MODID, "oedldoedl_fragment", OedldoedlResources.TAB, ModRarities.LIGHT_PURPLE, true, 1, 0);
	public static final Item TIMOFIUM_FRAGMENT = new ModItemBase(OedldoedlResources.MODID, "timofium_fragment", OedldoedlResources.TAB, ModRarities.YELLOW, false, 1, 1);
	public static final Item FLOFINIUM_FRAGMENT = new ModItemBase(OedldoedlResources.MODID, "flofinium_fragment", OedldoedlResources.TAB, ModRarities.DARK_BLUE, false, 1, 1);
	public static final Item LAARSIUM_FRAGMENT = new ModItemBase(OedldoedlResources.MODID, "laarsium_fragment", OedldoedlResources.TAB, ModRarities.DARK_GREEN, false, 1, 1);
	public static final Item KLAARSIUM_FRAGMENT = new ModItemBase(OedldoedlResources.MODID, "klaarsium_fragment", OedldoedlResources.TAB, ModRarities.DARK_PURPLE, false, 1, 1);
	public static final Item SHARANIUM_FRAGMENT = new ModItemBase(OedldoedlResources.MODID, "sharanium_fragment", OedldoedlResources.TAB, ModRarities.LIGHT_PURPLE, false, 1, 1);
	public static final Item MAKERIUM_FRAGMENT = new ModItemBase(OedldoedlResources.MODID, "makerium_fragment", OedldoedlResources.TAB, ModRarities.GREEN, false, 1, 1);
	public static final Item INDERIUM_FRAGMENT = new ModItemBase(OedldoedlResources.MODID, "inderium_fragment", OedldoedlResources.TAB, ModRarities.AQUA, false, 1, 1);
	public static final Item PUMARIUM_FRAGMENT = new ModItemBase(OedldoedlResources.MODID, "pumarium_fragment", OedldoedlResources.TAB, ModRarities.DARK_RED, false, 1, 1);
	public static final Item CALLAXIUM_FRAGMENT = new ModItemBase(OedldoedlResources.MODID, "callaxium_fragment", OedldoedlResources.TAB, ModRarities.BLUE, false, 1, 1);
	public static final Item SKORPIUM_FRAGMENT = new ModItemBase(OedldoedlResources.MODID, "skorpium_fragment", OedldoedlResources.TAB, ModRarities.RED, false, 1, 1);
	public static final Item STUPIDIUM_FRAGMENT = new ModItemBase(OedldoedlResources.MODID, "stupidium_fragment", OedldoedlResources.TAB, ModRarities.DARK_AQUA, false, 1, 1);

	// singularities
	public static final Item BASE_SINGULARITY = new ModItemBase(OedldoedlResources.MODID, "base_singularity", OedldoedlResources.TAB, ModRarities.WHITE, false, 1, 0);
	public static final Item OEDLDOEDL_SINGULARITY = new ModItemBase(OedldoedlResources.MODID, "oedldoedl_singularity", OedldoedlResources.TAB, ModRarities.LIGHT_PURPLE, true, 2, 0);

	public static final Item GREMORIUM_SINGULARITY = new ModItemBase(OedldoedlResources.MODID, "gremorium_singularity", OedldoedlResources.TAB, ModRarities.DARK_RED, false, 1, 0);
	public static final Item HIMEJIMARIUM_SINGULARITY = new ModItemBase(OedldoedlResources.MODID, "himejimarium_singularity", OedldoedlResources.TAB, ModRarities.DARK_BLUE, false, 1, 0);
	public static final Item TOUJOURIUM_SINGULARITY = new ModItemBase(OedldoedlResources.MODID, "toujourium_singularity", OedldoedlResources.TAB, ModRarities.GRAY, false, 1, 0);
	public static final Item ARGENTORIUM_SINGULARITY = new ModItemBase(OedldoedlResources.MODID, "argentorium_singularity", OedldoedlResources.TAB, ModRarities.YELLOW, false, 1, 0);
	public static final Item QUARTARIUM_SINGULARITY = new ModItemBase(OedldoedlResources.MODID, "quartarium_singularity", OedldoedlResources.TAB, ModRarities.BLUE, false, 1, 0);
	public static final Item NAGATORIUM_SINGULARITY = new ModItemBase(OedldoedlResources.MODID, "nagatorium_singularity", OedldoedlResources.TAB, ModRarities.DARK_PURPLE, false, 1, 0);
	public static final Item SAKURAJIMARIUM_SINGULARITY = new ModItemBase(OedldoedlResources.MODID, "sakurajimarium_singularity", OedldoedlResources.TAB, ModRarities.DARK_GRAY, false, 1, 0);
	public static final Item KITAGAWARIUM_SINGULARITY = new ModItemBase(OedldoedlResources.MODID, "kitagawarium_singularity", OedldoedlResources.TAB, ModRarities.LIGHT_PURPLE, false, 1, 0);

	// catalysts
	public static final Item OEDLDOEDL_CATALYST = new ModItemBase(OedldoedlResources.MODID, "oedldoedl_catalyst", OedldoedlResources.TAB, ModRarities.LIGHT_PURPLE, false, 1, 0);
	public static final Item CHAOS_CATALYST = new ModItemBase(OedldoedlResources.MODID, "chaos_catalyst", OedldoedlResources.TAB, ModRarities.BLACK, false, 3, 0);

	// misc
	public static final Item ENRICHED_URANIUM = new ModItemBase(OedldoedlResources.MODID, "enriched_uranium", OedldoedlResources.TAB, ModRarities.YELLOW, false, 1, 1);
	public static final Item BALANCED_CLAY_BALL = new ModItemBase(OedldoedlResources.MODID, "balanced_clay_ball", OedldoedlResources.TAB, ModRarities.LIGHT_PURPLE, true, 2, 1);
}