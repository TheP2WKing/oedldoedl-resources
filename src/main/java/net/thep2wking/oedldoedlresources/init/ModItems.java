package net.thep2wking.oedldoedlresources.init;

import net.minecraft.item.Item;
import net.minecraft.potion.Effects;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.thep2wking.oedldoedlcore.base.ModBlockItemBase;
import net.thep2wking.oedldoedlcore.base.ModItemBase;
import net.thep2wking.oedldoedlcore.config.CoreConfig;
import net.thep2wking.oedldoedlcore.util.ModRarities;
import net.thep2wking.oedldoedlcore.util.TipLines;
import net.thep2wking.oedldoedlresources.OedldoedlResources;
import net.thep2wking.oedldoedlresources.base.ModBlockItemEffectBase;
import net.thep2wking.oedldoedlresources.base.ModItemEffectIngotBase;
import net.thep2wking.oedldoedlresources.base.ModItemEffectNuggetBase;
import net.thep2wking.oedldoedlresources.content.blockitem.ingot.BedrockiumBlockItem;
import net.thep2wking.oedldoedlresources.content.blockitem.ingot.CloudiumBlockItem;
import net.thep2wking.oedldoedlresources.content.blockitem.ingot.DrunkiumBlockItem;
import net.thep2wking.oedldoedlresources.content.blockitem.ingot.ElevatiumBlockItem;
import net.thep2wking.oedldoedlresources.content.blockitem.ingot.MoneyBlockItem;
import net.thep2wking.oedldoedlresources.content.blockitem.misc.ChaosPlankBlockItem;
import net.thep2wking.oedldoedlresources.content.item.ingot.BedrockiumIngotItem;
import net.thep2wking.oedldoedlresources.content.item.ingot.CloudiumIngotItem;
import net.thep2wking.oedldoedlresources.content.item.ingot.DrunkiumIngotItem;
import net.thep2wking.oedldoedlresources.content.item.ingot.ElevatiumIngotItem;
import net.thep2wking.oedldoedlresources.content.item.ingot.MoneyIngotItem;
import net.thep2wking.oedldoedlresources.content.item.ingot.UnstableIngotItem;
import net.thep2wking.oedldoedlresources.content.item.nugget.BedrockiumNuggetItem;
import net.thep2wking.oedldoedlresources.content.item.nugget.CloudiumNuggetItem;
import net.thep2wking.oedldoedlresources.content.item.nugget.DrunkiumNuggetItem;
import net.thep2wking.oedldoedlresources.content.item.nugget.ElevatiumNuggetItem;
import net.thep2wking.oedldoedlresources.content.item.nugget.MoneyNuggetItem;
import net.thep2wking.oedldoedlresources.util.ModItemGroups;

public class ModItems 
{
	//deferred register
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OedldoedlResources.MODID);
	
	//blockitems
	public static final RegistryObject<Item> BASE_ORE = ITEMS.register("base_ore", 
			() -> new ModBlockItemBase(ModBlocks.BASE_ORE.get(), ModRarities.WHITE, false, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> RANDOMITE_ORE = ITEMS.register("randomite_ore", 
			() -> new ModBlockItemBase(ModBlocks.RANDOMITE_ORE.get(), ModRarities.LIGHT_PURPLE, false, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> OEDLDOEDL_ORE = ITEMS.register("oedldoedl_ore", 
			() -> new ModBlockItemBase(ModBlocks.OEDLDOEDL_ORE.get(), ModRarities.LIGHT_PURPLE, false, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> ENDER_ORE = ITEMS.register("ender_ore", 
			() -> new ModBlockItemBase(ModBlocks.ENDER_ORE.get(), ModRarities.AQUA, false, false, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> GUNPOWDER_ORE = ITEMS.register("gunpowder_ore", 
			() -> new ModBlockItemBase(ModBlocks.GUNPOWDER_ORE.get(), ModRarities.WHITE, false, false, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> SALT_ORE = ITEMS.register("salt_ore", 
			() -> new ModBlockItemBase(ModBlocks.SALT_ORE.get(), ModRarities.WHITE, false, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));;
	public static final RegistryObject<Item> NETHER_GREMORIUM_ORE = ITEMS.register("nether_gremorium_ore", 
			() -> new ModBlockItemBase(ModBlocks.NETHER_GREMORIUM_ORE.get(), ModRarities.DARK_RED, false, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));;
	public static final RegistryObject<Item> NETHER_HIMEJIMARIUM_ORE = ITEMS.register("nether_himejimarium_ore", 
			() -> new ModBlockItemBase(ModBlocks.NETHER_HIMEJIMARIUM_ORE.get(), ModRarities.DARK_BLUE, false, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));;
	public static final RegistryObject<Item> NETHER_TOUJOURIUM_ORE = ITEMS.register("nether_toujourium_ore", 
			() -> new ModBlockItemBase(ModBlocks.NETHER_TOUJOURIUM_ORE.get(), ModRarities.GRAY, false, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));;
	public static final RegistryObject<Item> NETHER_ARGENTORIUM_ORE = ITEMS.register("nether_argentorium_ore", 
			() -> new ModBlockItemBase(ModBlocks.NETHER_ARGENTORIUM_ORE.get(), ModRarities.YELLOW, false, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));;
	public static final RegistryObject<Item> NETHER_QUARTARIUM_ORE = ITEMS.register("nether_quartarium_ore", 
			() -> new ModBlockItemBase(ModBlocks.NETHER_QUARTARIUM_ORE.get(), ModRarities.BLUE, false, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));;
	public static final RegistryObject<Item> NETHER_NAGATORIUM_ORE = ITEMS.register("nether_nagatorium_ore", 
			() -> new ModBlockItemBase(ModBlocks.NETHER_NAGATORIUM_ORE.get(), ModRarities.DARK_PURPLE, false, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));;
	public static final RegistryObject<Item> NETHER_SAKURAJIMARIUM_ORE = ITEMS.register("nether_sakurajimarium_ore", 
			() -> new ModBlockItemBase(ModBlocks.NETHER_SAKURAJIMARIUM_ORE.get(), ModRarities.DARK_GRAY, false, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));;
	public static final RegistryObject<Item> END_ELEMENT_OD = ITEMS.register("end_element_od", 
			() -> new ModBlockItemBase(ModBlocks.END_ELEMENT_OD.get(), ModRarities.LIGHT_PURPLE, false, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));;

	public static final RegistryObject<Item> BASE_BLOCK = ITEMS.register("base_block", 
			() -> new ModBlockItemBase(ModBlocks.BASE.get(), ModRarities.WHITE, false, false, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> OEDLDOEDL_BLOCK = ITEMS.register("oedldoedl_block", 
			() -> new ModBlockItemBase(ModBlocks.OEDLDOEDL.get(), ModRarities.LIGHT_PURPLE, true, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> BEDROCKIUM_BLOCK = ITEMS.register("bedrockium_block", 
			() -> new BedrockiumBlockItem(ModBlocks.BEDROCKIUM.get(), ModRarities.LIGHT_PURPLE, false, true, Effects.SLOWNESS, Effects.HUNGER, true, TipLines.ONE, false, 
					new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> CLOUDIUM_BLOCK = ITEMS.register("cloudium_block", 
			() -> new CloudiumBlockItem(ModBlocks.CLOUDIUM.get(), ModRarities.LIGHT_PURPLE, false, true, Effects.SLOW_FALLING, false, TipLines.ONE, false, 
					new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> ELEVATIUM_BLOCK = ITEMS.register("elevatium_block", 
			() -> new ElevatiumBlockItem(ModBlocks.ELEVATIUM.get(), ModRarities.LIGHT_PURPLE, false, true, Effects.LEVITATION, true, TipLines.ONE, false, 
					new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> DRUNKIUM_BLOCK = ITEMS.register("drunkium_block", 
			() -> new DrunkiumBlockItem(ModBlocks.DRUNKIUM.get(), ModRarities.LIGHT_PURPLE, false, true, Effects.BLINDNESS, Effects.SLOWNESS, Effects.NAUSEA, Effects.WITHER, true, TipLines.ONE, false, 
					new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> MONEY_BLOCK = ITEMS.register("money_block", 
			() -> new MoneyBlockItem(ModBlocks.MONEY.get(), ModRarities.DARK_GREEN, false, true, TipLines.THREE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> CRYSTAL_MATRIX_BLOCK = ITEMS.register("crystal_matrix_block", 
			() -> new ModBlockItemBase(ModBlocks.CRYSTAL_MATRIX.get(), ModRarities.AQUA, false, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> NEUTRONIUM_BLOCK = ITEMS.register("neutronium_block", 
			() -> new ModBlockItemBase(ModBlocks.NEUTRONIUM.get(), ModRarities.AQUA, false, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> GREMORIUM_BLOCK = ITEMS.register("gremorium_block", 
			() -> new ModBlockItemEffectBase(ModBlocks.GREMORIUM.get(), ModRarities.DARK_RED, false, true, Effects.HASTE, false, TipLines.ONE, false, 
					new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> HIMEJIMARIUM_BLOCK = ITEMS.register("himejimarium_block", 
			() -> new ModBlockItemEffectBase(ModBlocks.HIMEJIMARIUM.get(), ModRarities.DARK_BLUE, false, true, Effects.RESISTANCE, false, TipLines.ONE, false, 
					new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> TOUJOURIUM_BLOCK = ITEMS.register("toujourium_block", 
			() -> new ModBlockItemEffectBase(ModBlocks.TOUJOURIUM.get(), ModRarities.GRAY, false, true, Effects.SPEED, false, TipLines.ONE, false, 
					new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> ARGENTORIUM_BLOCK = ITEMS.register("argentorium_block", 
			() -> new ModBlockItemEffectBase(ModBlocks.ARGENTORIUM.get(), ModRarities.YELLOW, false, true, Effects.SATURATION, false, TipLines.ONE, false, 
					new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> QUARTARIUM_BLOCK = ITEMS.register("quartarium_block", 
			() -> new ModBlockItemEffectBase(ModBlocks.QUARTARIUM.get(), ModRarities.BLUE, false, true, Effects.STRENGTH, false, TipLines.ONE, false, 
					new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> NAGATORIUM_BLOCK = ITEMS.register("nagatorium_block", 
			() -> new ModBlockItemEffectBase(ModBlocks.NAGATORIUM.get(), ModRarities.DARK_PURPLE, false, true, Effects.MINING_FATIGUE, true, TipLines.ONE, false, 
					new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> SAKURAJIMARIUM_BLOCK = ITEMS.register("sakurajimarium_block", 
			() -> new ModBlockItemEffectBase(ModBlocks.SAKURAJIMARIUM.get(), ModRarities.DARK_GRAY, false, true, Effects.JUMP_BOOST, false, TipLines.ONE, false, 
					new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	
	public static final RegistryObject<Item> BASE_GEM_BLOCK = ITEMS.register("base_gem_block", 
			() -> new ModBlockItemBase(ModBlocks.BASE_GEM.get(), ModRarities.WHITE, false, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> OEDLDOEDL_GEM_BLOCK = ITEMS.register("oedldoedl_gem_block", 
			() -> new ModBlockItemBase(ModBlocks.OEDLDOEDL_GEM.get(), ModRarities.LIGHT_PURPLE, true, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> TIMOFIUM_GEM_BLOCK = ITEMS.register("timofium_gem_block", 
			() -> new ModBlockItemBase(ModBlocks.TIMOFIUM_GEM.get(), ModRarities.YELLOW, true, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> FLOFINIUM_GEM_BLOCK = ITEMS.register("flofinium_gem_block", 
			() -> new ModBlockItemBase(ModBlocks.FLOFINIUM_GEM.get(), ModRarities.DARK_BLUE, true, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> LAARSIUM_GEM_BLOCK = ITEMS.register("laarsium_gem_block", 
			() -> new ModBlockItemBase(ModBlocks.LAARSIUM_GEM.get(), ModRarities.DARK_GREEN, true, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> KLAARSIUM_GEM_BLOCK = ITEMS.register("klaarsium_gem_block", 
			() -> new ModBlockItemBase(ModBlocks.KLAARSIUM_GEM.get(), ModRarities.DARK_PURPLE, true, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> SHARANIUM_GEM_BLOCK = ITEMS.register("sharanium_gem_block", 
			() -> new ModBlockItemBase(ModBlocks.SHARANIUM_GEM.get(), ModRarities.LIGHT_PURPLE, true, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> MAKERIUM_GEM_BLOCK = ITEMS.register("makerium_gem_block", 
			() -> new ModBlockItemBase(ModBlocks.MAKERIUM_GEM.get(), ModRarities.GREEN, true, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> INDERIUM_GEM_BLOCK = ITEMS.register("inderium_gem_block", 
			() -> new ModBlockItemBase(ModBlocks.INDERIUM_GEM.get(), ModRarities.AQUA, true, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> PUMARIUM_GEM_BLOCK = ITEMS.register("pumarium_gem_block", 
			() -> new ModBlockItemBase(ModBlocks.PUMARIUM_GEM.get(), ModRarities.DARK_RED, true, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> CALLAXIUM_GEM_BLOCK = ITEMS.register("callaxium_gem_block", 
			() -> new ModBlockItemBase(ModBlocks.CALLAXIUM_GEM.get(), ModRarities.BLUE, true, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> SKORPIUM_GEM_BLOCK = ITEMS.register("skorpium_gem_block", 
			() -> new ModBlockItemBase(ModBlocks.SKORPIUM_GEM.get(), ModRarities.RED, true, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> STUPIDIUM_GEM_BLOCK = ITEMS.register("stupidium_gem_block", 
			() -> new ModBlockItemBase(ModBlocks.STUPIDIUM_GEM.get(), ModRarities.DARK_AQUA, true, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> SALT_GEM_BLOCK = ITEMS.register("salt_block", 
			() -> new ModBlockItemBase(ModBlocks.SALT.get(), ModRarities.WHITE, false, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> GREMORIUM_GEM_BLOCK = ITEMS.register("gremorium_gem_block", 
			() -> new ModBlockItemBase(ModBlocks.GREMORIUM_GEM.get(), ModRarities.DARK_RED, false, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> HIMEJIMARIUM_GEM_BLOCK = ITEMS.register("himejimarium_gem_block", 
			() -> new ModBlockItemBase(ModBlocks.HIMEJIMARIUM_GEM.get(), ModRarities.DARK_BLUE, false, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> TOUJOURIUM_GEM_BLOCK = ITEMS.register("toujourium_gem_block", 
			() -> new ModBlockItemBase(ModBlocks.TOUJOURIUM_GEM.get(), ModRarities.GRAY, false, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> ARGENTORIUM_GEM_BLOCK = ITEMS.register("argentorium_gem_block", 
			() -> new ModBlockItemBase(ModBlocks.ARGENTORIUM_GEM.get(), ModRarities.YELLOW, false, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> QUARTARIUM_GEM_BLOCK = ITEMS.register("quartarium_gem_block", 
			() -> new ModBlockItemBase(ModBlocks.QUARTARIUM_GEM.get(), ModRarities.BLUE, false, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> NAGATORIUM_GEM_BLOCK = ITEMS.register("nagatorium_gem_block", 
			() -> new ModBlockItemBase(ModBlocks.NAGATORIUM_GEM.get(), ModRarities.DARK_PURPLE, false, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> SAKURAJIMARIUM_GEM_BLOCK = ITEMS.register("sakurajimarium_gem_block", 
			() -> new ModBlockItemBase(ModBlocks.SAKURAJIMARIUM_GEM.get(), ModRarities.DARK_GRAY, false, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	
	public static final RegistryObject<Item> BASE_STAR_BLOCK = ITEMS.register("base_star_block", 
			() -> new ModBlockItemBase(ModBlocks.BASE_STAR.get(), ModRarities.WHITE, false, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> NETHER_STAR_BLOCK = ITEMS.register("nether_star_block", 
			() -> new ModBlockItemBase(ModBlocks.NETHER_STAR.get(), ModRarities.YELLOW, true, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> OEDLDOEDL_STAR_BLOCK = ITEMS.register("oedldoedl_star_block", 
			() -> new ModBlockItemBase(ModBlocks.OEDLDOEDL_STAR.get(), ModRarities.LIGHT_PURPLE, true, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> INFINITY_STAR_BLOCK = ITEMS.register("infinity_star_block", 
			() -> new ModBlockItemBase(ModBlocks.INFINITY_STAR.get(), ModRarities.RED, true, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	
	public static final RegistryObject<Item> CHAOS_PLANK = ITEMS.register("chaos_plank", 
			() -> new ChaosPlankBlockItem(ModBlocks.CHAOS_PLANK.get(), ModRarities.BLACK, false, true, TipLines.FOUR, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	
	//items
	public static final RegistryObject<Item> BASE_INGOT = ITEMS.register("base_ingot",
			() -> new ModItemBase(ModRarities.WHITE, false, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> OEDLDOEDL_INGOT = ITEMS.register("oedldoedl_ingot",
			() -> new ModItemBase(ModRarities.LIGHT_PURPLE, true, true, TipLines.THREE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> BEDROCKIUM_INGOT = ITEMS.register("bedrockium_ingot", 
			() -> new BedrockiumIngotItem(ModRarities.LIGHT_PURPLE, false, true, Effects.SLOWNESS, Effects.HUNGER, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> CLOUDIUM_INGOT = ITEMS.register("cloudium_ingot", 
			() -> new CloudiumIngotItem(ModRarities.LIGHT_PURPLE, false, true, Effects.SLOW_FALLING, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> ELEVATIUM_INGOT = ITEMS.register("elevatium_ingot", 
			() -> new ElevatiumIngotItem(ModRarities.LIGHT_PURPLE, false, true, Effects.LEVITATION, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> DRUNKIUM_INGOT = ITEMS.register("drunkium_ingot", 
			() -> new DrunkiumIngotItem(ModRarities.LIGHT_PURPLE, false, true, Effects.BLINDNESS, Effects.SLOWNESS, Effects.NAUSEA, Effects.WITHER, true, TipLines.TWO, false, 
					new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> MONEY_INGOT = ITEMS.register("money_ingot", 
			() -> new MoneyIngotItem(ModRarities.DARK_GREEN, false, true, TipLines.FOUR, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> CRYSTAL_MATRIX_INGOT = ITEMS.register("crystal_matrix_ingot",
			() -> new ModItemBase(ModRarities.AQUA, false, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> NEUTRONIUM_INGOT = ITEMS.register("neutronium_ingot",
			() -> new ModItemBase(ModRarities.AQUA, false, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> GREMORIUM_INGOT = ITEMS.register("gremorium_ingot", 
			() -> new ModItemEffectIngotBase(ModRarities.DARK_RED, false, true, Effects.HASTE, false, TipLines.THREE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> HIMEJIMARIUM_INGOT = ITEMS.register("himejimarium_ingot", 
			() -> new ModItemEffectIngotBase(ModRarities.DARK_BLUE, false, true, Effects.RESISTANCE, false, TipLines.THREE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> TOUJOURIUM_INGOT = ITEMS.register("toujourium_ingot", 
			() -> new ModItemEffectIngotBase(ModRarities.GRAY, false, true, Effects.SPEED, false, TipLines.THREE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));;
	public static final RegistryObject<Item> ARGENTORIUM_INGOT = ITEMS.register("argentorium_ingot", 
			() -> new ModItemEffectIngotBase(ModRarities.YELLOW, false, true, Effects.SATURATION, false, TipLines.THREE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> QUARTARIUM_INGOT = ITEMS.register("quartarium_ingot",
			() -> new ModItemEffectIngotBase(ModRarities.BLUE, false, true, Effects.STRENGTH, false, TipLines.THREE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> NAGATORIUM_INGOT = ITEMS.register("nagatorium_ingot", 
			() -> new ModItemEffectIngotBase(ModRarities.DARK_PURPLE, false, true, Effects.MINING_FATIGUE, true, TipLines.THREE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> SAKURAJIMARIUM_INGOT = ITEMS.register("sakurajimarium_ingot",
			() -> new ModItemEffectIngotBase(ModRarities.DARK_GRAY, false, true, Effects.JUMP_BOOST, false, TipLines.THREE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> UNSTABLE_INGOT = ITEMS.register("unstable_ingot", 
			() -> new UnstableIngotItem(ModRarities.RED, false, true, true, TipLines.THREE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> INFINITY_INGOT = ITEMS.register("infinity_ingot",
			() -> new ModItemBase(ModRarities.RED, false, true, TipLines.FOUR, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> CHAOS_INGOT = ITEMS.register("chaos_ingot",
			() -> new ModItemBase(ModRarities.BLACK, false, true, TipLines.FIVE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	
	public static final RegistryObject<Item> BASE_GEM = ITEMS.register("base_gem",
			() -> new ModItemBase(ModRarities.WHITE, false, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> OEDLDOEDL_GEM = ITEMS.register("oedldoedl_gem",
			() -> new ModItemBase(ModRarities.LIGHT_PURPLE, true, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> TIMOFIUM_GEM = ITEMS.register("timofium_gem",
			() -> new ModItemBase(ModRarities.YELLOW, true, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> FLOFINIUM_GEM = ITEMS.register("flofinium_gem",
			() -> new ModItemBase(ModRarities.DARK_BLUE, true, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> LAARSIUM_GEM = ITEMS.register("laarsium_gem",
			() -> new ModItemBase(ModRarities.DARK_GREEN, true, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> KLAARSIUM_GEM = ITEMS.register("klaarsium_gem",
			() -> new ModItemBase(ModRarities.DARK_PURPLE, true, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> SHARANIUM_GEM = ITEMS.register("sharanium_gem",
			() -> new ModItemBase(ModRarities.LIGHT_PURPLE, true, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> MAKERIUM_GEM = ITEMS.register("makerium_gem",
			() -> new ModItemBase(ModRarities.GREEN, true, true, TipLines.THREE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> INDERIUM_GEM = ITEMS.register("inderium_gem",
			() -> new ModItemBase(ModRarities.AQUA, true, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> PUMARIUM_GEM = ITEMS.register("pumarium_gem",
			() -> new ModItemBase(ModRarities.DARK_RED, true, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> CALLAXIUM_GEM = ITEMS.register("callaxium_gem",
			() -> new ModItemBase(ModRarities.BLUE, true, true, TipLines.THREE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> SKORPIUM_GEM = ITEMS.register("skorpium_gem",
			() -> new ModItemBase(ModRarities.RED, true, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> STUPIDIUM_GEM = ITEMS.register("stupidium_gem",
			() -> new ModItemBase(ModRarities.DARK_AQUA, true, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> SALT = ITEMS.register("salt", 
			() -> new ModItemBase(ModRarities.WHITE, false, true, TipLines.ONE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> GREMORIUM_GEM = ITEMS.register("gremorium_gem", 
			() -> new ModItemBase(ModRarities.DARK_RED, false, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> HIMEJIMARIUM_GEM = ITEMS.register("himejimarium_gem", 
			() -> new ModItemBase(ModRarities.DARK_BLUE, false, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> TOUJOURIUM_GEM = ITEMS.register("toujourium_gem", 
			() -> new ModItemBase(ModRarities.GRAY, false, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> ARGENTORIUM_GEM = ITEMS.register("argentorium_gem", 
			() -> new ModItemBase(ModRarities.YELLOW, false, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> QUARTARIUM_GEM = ITEMS.register("quartarium_gem", 
			() -> new ModItemBase(ModRarities.BLUE, false, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));;
	public static final RegistryObject<Item> NAGATORIUM_GEM = ITEMS.register("nagatorium_gem", 
			() -> new ModItemBase(ModRarities.DARK_PURPLE, false, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> SAKURAJIMARIUM_GEM = ITEMS.register("sakurajimarium_gem", 
			() -> new ModItemBase(ModRarities.DARK_GRAY, false, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	
	public static final RegistryObject<Item> BASE_STAR = ITEMS.register("base_star",
			() -> new ModItemBase(ModRarities.WHITE, false, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> OEDLDOEDL_STAR = ITEMS.register("oedldoedl_star",
			() -> new ModItemBase(ModRarities.LIGHT_PURPLE, true, true, TipLines.THREE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> INFINITY_STAR = ITEMS.register("infinity_star",
			() -> new ModItemBase(ModRarities.RED, true, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	
	public static final RegistryObject<Item> BASE_ELEMENT = ITEMS.register("base_element",
			() -> new ModItemBase(ModRarities.WHITE, false, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> OEDLDOEDL_ELEMENT = ITEMS.register("oedldoedl_element",
			() -> new ModItemBase(ModRarities.LIGHT_PURPLE, true, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> TIMOFIUM_ELEMENT = ITEMS.register("timofium_element",
			() -> new ModItemBase(ModRarities.YELLOW, false, false, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> FLOFINIUM_ELEMENT = ITEMS.register("flofinium_element",
			() -> new ModItemBase(ModRarities.DARK_BLUE, false, false, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> LAARSIUM_ELEMENT = ITEMS.register("laarsium_element",
			() -> new ModItemBase(ModRarities.DARK_GREEN, false, false, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> KLAARSIUM_ELEMENT = ITEMS.register("klaarsium_element",
			() -> new ModItemBase(ModRarities.DARK_PURPLE, false, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> SHARANIUM_ELEMENT = ITEMS.register("sharanium_element",
			() -> new ModItemBase(ModRarities.LIGHT_PURPLE, false, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> MAKERIUM_ELEMENT = ITEMS.register("makerium_element",
			() -> new ModItemBase(ModRarities.GREEN, false, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> INDERIUM_ELEMENT = ITEMS.register("inderium_element",
			() -> new ModItemBase(ModRarities.AQUA, false, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> PUMARIUM_ELEMENT = ITEMS.register("pumarium_element",
			() -> new ModItemBase(ModRarities.DARK_RED, false, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> CALLAXIUM_ELEMENT = ITEMS.register("callaxium_element",
			() -> new ModItemBase(ModRarities.BLUE, false, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> SKORPIUM_ELEMENT = ITEMS.register("skorpium_element",
			() -> new ModItemBase(ModRarities.RED, false, false, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> STUPIDIUM_ELEMENT = ITEMS.register("stupidium_element",
			() -> new ModItemBase(ModRarities.DARK_AQUA, false, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	
	public static final RegistryObject<Item> BASE_DUST = ITEMS.register("base_dust",
			() -> new ModItemBase(ModRarities.WHITE, false, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> OEDLDOEDL_DUST = ITEMS.register("oedldoedl_dust",
			() -> new ModItemBase(ModRarities.LIGHT_PURPLE, true, true, TipLines.THREE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> ENDER_DUST = ITEMS.register("ender_dust",
			() -> new ModItemBase(ModRarities.AQUA, false, false, TipLines.ONE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> SALT_DUST = ITEMS.register("salt_dust",
			() -> new ModItemBase(ModRarities.WHITE, false, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	
	public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget",
			() -> new ModItemBase(ModRarities.WHITE, false, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> EMERALD_NUGGET = ITEMS.register("emerald_nugget",
			() -> new ModItemBase(ModRarities.WHITE, false, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget",
			() -> new ModItemBase(ModRarities.WHITE, false, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> BASE_NUGGET = ITEMS.register("base_nugget",
			() -> new ModItemBase(ModRarities.WHITE, false, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> OEDLDOEDL_NUGGET = ITEMS.register("oedldoedl_nugget",
			() -> new ModItemBase(ModRarities.LIGHT_PURPLE, true, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> BEDROCKIUM_NUGGET = ITEMS.register("bedrockium_nugget", 
			() -> new BedrockiumNuggetItem(ModRarities.LIGHT_PURPLE, false, true, Effects.SLOWNESS, Effects.HUNGER, true, TipLines.ONE, false, 
					new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> CLOUDIUM_NUGGET = ITEMS.register("cloudium_nugget", 
			() -> new CloudiumNuggetItem(ModRarities.LIGHT_PURPLE, false, true, Effects.SLOW_FALLING, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> ELEVATIUM_NUGGET = ITEMS.register("elevatium_nugget", 
			() -> new ElevatiumNuggetItem(ModRarities.LIGHT_PURPLE, false, true, Effects.LEVITATION, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> DRUNKIUM_NUGGET = ITEMS.register("drunkium_nugget", 
			() -> new DrunkiumNuggetItem(ModRarities.LIGHT_PURPLE, false, true, Effects.BLINDNESS, Effects.SLOWNESS, Effects.NAUSEA, Effects.WITHER, true, TipLines.TWO, false, 
					new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> MONEY_NUGGET = ITEMS.register("money_nugget", 
			() -> new MoneyNuggetItem(ModRarities.DARK_GREEN, false, true, TipLines.THREE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> CRYSTAL_MATRIX_NUGGET = ITEMS.register("crystal_matrix_nugget",
			() -> new ModItemBase(ModRarities.AQUA, false, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> NEUTRONIUM_NUGGET = ITEMS.register("neutronium_nugget",
			() -> new ModItemBase(ModRarities.AQUA, false, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> GREMORIUM_NUGGET = ITEMS.register("gremorium_nugget", 
			() -> new ModItemEffectNuggetBase(ModRarities.DARK_RED, false, true, Effects.HASTE, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> HIMEJIMARIUM_NUGGET = ITEMS.register("himejimarium_nugget", 
			() -> new ModItemEffectNuggetBase(ModRarities.DARK_BLUE, false, true, Effects.RESISTANCE, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> TOUJOURIUM_NUGGET = ITEMS.register("toujourium_nugget", 
			() -> new ModItemEffectNuggetBase(ModRarities.GRAY, false, true, Effects.SPEED, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));;
	public static final RegistryObject<Item> ARGENTORIUM_NUGGET = ITEMS.register("argentorium_nugget", 
			() -> new ModItemEffectNuggetBase(ModRarities.YELLOW, false, true, Effects.SATURATION, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> QUARTARIUM_NUGGET = ITEMS.register("quartarium_nugget",
			() -> new ModItemEffectNuggetBase(ModRarities.BLUE, false, true, Effects.STRENGTH, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> NAGATORIUM_NUGGET = ITEMS.register("nagatorium_nugget", 
			() -> new ModItemEffectNuggetBase(ModRarities.DARK_PURPLE, false, true, Effects.MINING_FATIGUE, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> SAKURAJIMARIUM_NUGGET = ITEMS.register("sakurajimarium_nugget",
			() -> new ModItemEffectNuggetBase(ModRarities.DARK_GRAY, false, true, Effects.JUMP_BOOST, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	
	public static final RegistryObject<Item> GREMORIUM_SHARD = ITEMS.register("gremorium_shard", 
			() -> new ModItemBase(ModRarities.DARK_RED, false, true, TipLines.ONE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> HIMEJIMARIUM_SHARD = ITEMS.register("himejimarium_shard", 
			() -> new ModItemBase(ModRarities.DARK_BLUE, false, true, TipLines.ONE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> TOUJOURIUM_SHARD = ITEMS.register("toujourium_shard", 
			() -> new ModItemBase(ModRarities.GRAY, false, true, TipLines.ONE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> ARGENTORIUM_SHARD = ITEMS.register("argentorium_shard", 
			() -> new ModItemBase(ModRarities.YELLOW, false, true, TipLines.ONE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> QUARTARIUM_SHARD = ITEMS.register("quartarium_shard", 
			() -> new ModItemBase(ModRarities.BLUE, false, true, TipLines.ONE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));;
	public static final RegistryObject<Item> NAGATORIUM_SHARD = ITEMS.register("nagatorium_shard", 
			() -> new ModItemBase(ModRarities.DARK_PURPLE, false, true, TipLines.ONE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> SAKURAJIMARIUM_SHARD = ITEMS.register("sakurajimarium_shard", 
			() -> new ModItemBase(ModRarities.DARK_GRAY, false, true, TipLines.ONE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> BASE_STAR_SHARD = ITEMS.register("base_star_shard",
			() -> new ModItemBase(ModRarities.WHITE, false, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> NETHER_STAR_SHARD = ITEMS.register("nether_star_shard",
			() -> new ModItemBase(ModRarities.YELLOW, true, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> OEDLDOEDL_STAR_SHARD = ITEMS.register("oedldoedl_star_shard",
			() -> new ModItemBase(ModRarities.LIGHT_PURPLE, true, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> INFINITY_STAR_SHARD = ITEMS.register("infinity_star_shard",
			() -> new ModItemBase(ModRarities.RED, true, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	
	public static final RegistryObject<Item> BASE_FRAGMENT = ITEMS.register("base_fragment",
			() -> new ModItemBase(ModRarities.WHITE, false, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> OEDLDOEDL_FRAGMENT = ITEMS.register("oedldoedl_fragment",
			() -> new ModItemBase(ModRarities.LIGHT_PURPLE, true, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> TIMOFIUM_FRAGMENT = ITEMS.register("timofium_fragment",
			() -> new ModItemBase(ModRarities.YELLOW, false, false, TipLines.ONE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> FLOFINIUM_FRAGMENT = ITEMS.register("flofinium_fragment",
			() -> new ModItemBase(ModRarities.DARK_BLUE, false, false, TipLines.ONE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> LAARSIUM_FRAGMENT = ITEMS.register("laarsium_fragment",
			() -> new ModItemBase(ModRarities.DARK_GREEN, false, false, TipLines.ONE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> KLAARSIUM_FRAGMENT = ITEMS.register("klaarsium_fragment",
			() -> new ModItemBase(ModRarities.DARK_PURPLE, false, false, TipLines.ONE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> SHARANIUM_FRAGMENT = ITEMS.register("sharanium_fragment",
			() -> new ModItemBase(ModRarities.LIGHT_PURPLE, false, false, TipLines.ONE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> MAKERIUM_FRAGMENT = ITEMS.register("makerium_fragment",
			() -> new ModItemBase(ModRarities.GREEN, false, false, TipLines.ONE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> INDERIUM_FRAGMENT = ITEMS.register("inderium_fragment",
			() -> new ModItemBase(ModRarities.AQUA, false, false, TipLines.ONE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> PUMARIUM_FRAGMENT = ITEMS.register("pumarium_fragment",
			() -> new ModItemBase(ModRarities.DARK_RED, false, false, TipLines.ONE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> CALLAXIUM_FRAGMENT = ITEMS.register("callaxium_fragment",
			() -> new ModItemBase(ModRarities.BLUE, false, false, TipLines.ONE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> SKORPIUM_FRAGMENT = ITEMS.register("skorpium_fragment",
			() -> new ModItemBase(ModRarities.RED, false, false, TipLines.ONE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> STUPIDIUM_FRAGMENT = ITEMS.register("stupidium_fragment",
			() -> new ModItemBase(ModRarities.DARK_AQUA, false, false, TipLines.ONE, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	
	public static final RegistryObject<Item> BASE_SINGULARITY = ITEMS.register("base_singularity", 
			() -> new ModItemBase(ModRarities.WHITE, false, false, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> OEDLDOEDL_SINGULARITY = ITEMS.register("oedldoedl_singularity", 
			() -> new ModItemBase(ModRarities.LIGHT_PURPLE, true, true, TipLines.TWO, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> GREMORIUM_SINGULARITY = ITEMS.register("gremorium_singularity", 
			() -> new ModItemBase(ModRarities.DARK_RED, false, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> HIMEJIMARIUM_SINGULARITY = ITEMS.register("himejimarium_singularity", 
			() -> new ModItemBase(ModRarities.DARK_BLUE, false, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> TOUJOURIUM_SINGULARITY = ITEMS.register("toujourium_singularity", 
			() -> new ModItemBase(ModRarities.GRAY, false, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));;
	public static final RegistryObject<Item> ARGENTORIUM_SINGULARITY = ITEMS.register("argentorium_singularity", 
			() -> new ModItemBase(ModRarities.YELLOW, false, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> QUARTARIUM_SINGULARITY = ITEMS.register("quartarium_singularity",
			() -> new ModItemBase(ModRarities.BLUE, false, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> NAGATORIUM_SINGULARITY = ITEMS.register("nagatorium_singularity", 
			() -> new ModItemBase(ModRarities.DARK_PURPLE, false, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> SAKURAJIMARIUM_SINGULARITY = ITEMS.register("sakurajimarium_singularity",
			() -> new ModItemBase(ModRarities.DARK_GRAY, false, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	
	public static final RegistryObject<Item> OEDLDOEDL_CATALYST = ITEMS.register("oedldoedl_catalyst",
			() -> new ModItemBase(ModRarities.LIGHT_PURPLE, true, true, TipLines.ONE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> INFINITY_CATALYST = ITEMS.register("infinity_catalyst",
			() -> new ModItemBase(ModRarities.RED, false, true, TipLines.THREE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	public static final RegistryObject<Item> CHAOS_CATALYST = ITEMS.register("chaos_catalyst",
			() -> new ModItemBase(ModRarities.BLACK, false, true, TipLines.THREE, false, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	
	public static final RegistryObject<Item> BALANCED_CLAY_BALL = ITEMS.register("balanced_clay_ball",
			() -> new ModItemBase(ModRarities.LIGHT_PURPLE, true, true, TipLines.TWO, true, new Item.Properties().group(ModItemGroups.TAB_RESOURCES)));
	
	public static void register(IEventBus enevtBus)
	{
		ITEMS.register(enevtBus);
		
		if (CoreConfig.general_logging.get()) {OedldoedlResources.LOGGER.info("Registerd Items for " + OedldoedlResources.MODID + "!");}
	}
}