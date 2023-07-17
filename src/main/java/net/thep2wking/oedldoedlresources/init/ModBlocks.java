package net.thep2wking.oedldoedlresources.init;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.MobEffects;
import net.thep2wking.oedldoedlcore.api.block.ModBlockBase;
import net.thep2wking.oedldoedlcore.api.block.ModBlockOreBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;
import net.thep2wking.oedldoedlresources.OedldoedlResources;
import net.thep2wking.oedldoedlresources.api.block.ModBlockEffectBase;

public class ModBlocks {
	// ores
	public static final Block BASE_ORE = new ModBlockOreBase(OedldoedlResources.MODID, "base_ore", OedldoedlResources.TAB, 0, 0, Material.ROCK, SoundType.STONE, MapColor.STONE, 0, ModToolTypes.PICKAXE, 2f, 4f, 0);
	public static final Block OEDLDOEDL_ORE = new ModBlockOreBase(OedldoedlResources.MODID, "oedldoedl_ore", OedldoedlResources.TAB, 0, 0, Material.ROCK, SoundType.STONE, MapColor.STONE, 3, ModToolTypes.PICKAXE, 12f, 24f, 2);
	public static final Block RANDOMITE_ORE = new ModBlockOreBase(OedldoedlResources.MODID, "randomite_ore", OedldoedlResources.TAB, 0, 2, Material.ROCK, SoundType.STONE, MapColor.STONE, 2, ModToolTypes.PICKAXE, 3f, 6f, 0);
	public static final Block ENDER_ORE = new ModBlockOreBase(OedldoedlResources.MODID, "ender_ore", OedldoedlResources.TAB, 2, 4, Material.ROCK, SoundType.STONE, MapColor.STONE, 1, ModToolTypes.PICKAXE, 4f, 8f, 0);
	public static final Block GUNPOWDER_ORE = new ModBlockOreBase(OedldoedlResources.MODID, "gunpowder_ore", OedldoedlResources.TAB, 1, 3, Material.ROCK, SoundType.STONE, MapColor.STONE, 1, ModToolTypes.PICKAXE, 3f, 6f, 0);
	public static final Block SALT_ORE = new ModBlockOreBase(OedldoedlResources.MODID, "salt_ore", OedldoedlResources.TAB, 0, 2, Material.ROCK, SoundType.STONE, MapColor.STONE, 1, ModToolTypes.PICKAXE, 3f, 3f, 0);

	public static final Block NETHER_GREMORIUM_ORE = new ModBlockOreBase(OedldoedlResources.MODID, "nether_gremorium_ore", OedldoedlResources.TAB, 8, 20, Material.ROCK, SoundType.STONE, MapColor.NETHERRACK, 3, ModToolTypes.PICKAXE, 35f, 70f, 0);
	public static final Block NETHER_HIMEJIMARIUM_ORE = new ModBlockOreBase(OedldoedlResources.MODID, "nether_himejimarium_ore", OedldoedlResources.TAB, 8, 20, Material.ROCK, SoundType.STONE, MapColor.NETHERRACK, 3, ModToolTypes.PICKAXE, 35f, 70f, 0);
	public static final Block NETHER_TOUJOURIUM_ORE = new ModBlockOreBase(OedldoedlResources.MODID, "nether_toujourium_ore", OedldoedlResources.TAB, 8, 20, Material.ROCK, SoundType.STONE, MapColor.NETHERRACK, 3, ModToolTypes.PICKAXE, 35f, 70f, 0);
	public static final Block NETHER_ARGENTORIUM_ORE = new ModBlockOreBase(OedldoedlResources.MODID, "nether_argentorium_ore", OedldoedlResources.TAB, 8, 20, Material.ROCK, SoundType.STONE, MapColor.NETHERRACK, 3, ModToolTypes.PICKAXE, 35f, 70f, 0);
	public static final Block NETHER_QUARTARIUM_ORE = new ModBlockOreBase(OedldoedlResources.MODID, "nether_quartarium_ore", OedldoedlResources.TAB, 8, 20, Material.ROCK, SoundType.STONE, MapColor.NETHERRACK, 3, ModToolTypes.PICKAXE, 35f, 70f, 0);
	public static final Block NETHER_NAGATORIUM_ORE = new ModBlockOreBase(OedldoedlResources.MODID, "nether_nagatorium_ore", OedldoedlResources.TAB, 8, 20, Material.ROCK, SoundType.STONE, MapColor.NETHERRACK, 3, ModToolTypes.PICKAXE, 35f, 70f, 0);
	public static final Block NETHER_SAKURAJIMARIUM_ORE = new ModBlockOreBase(OedldoedlResources.MODID, "nether_sakurajimarium_ore", OedldoedlResources.TAB, 8, 20, Material.ROCK, SoundType.STONE, MapColor.NETHERRACK, 3, ModToolTypes.PICKAXE, 35f, 70f, 0);
	
	public static final Block END_ELEMENT_OD = new ModBlockOreBase(OedldoedlResources.MODID, "end_element_od", OedldoedlResources.TAB, 10, 16, Material.ROCK, SoundType.STONE, MapColor.SAND, 4, ModToolTypes.PICKAXE, 50f, 100f, 2);
	
	// ingots
	public static final Block BASE = new ModBlockBase(OedldoedlResources.MODID, "base_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.IRON, 0, ModToolTypes.PICKAXE, 5f, 10f, 0).setBeaconBase();
	public static final Block OEDLDOEDL = new ModBlockBase(OedldoedlResources.MODID, "oedldoedl_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.YELLOW, 3, ModToolTypes.PICKAXE, 20f, 40f, 3).setBeaconBase();
	public static final Block BEDROCKIUM = new ModBlockBase(OedldoedlResources.MODID, "bedrockium_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.BLACK, 6, ModToolTypes.PICKAXE, 150f, 300f, 0).setBeaconBase();
	public static final Block CLOUDIUM = new ModBlockBase(OedldoedlResources.MODID, "cloudium_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.SNOW, 1, ModToolTypes.PICKAXE, 5f, 10f, 0).setBeaconBase();
	public static final Block ELEVATIUM = new ModBlockBase(OedldoedlResources.MODID, "elevatium_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.PURPLE, 1, ModToolTypes.PICKAXE, 10f, 20f, 0).setBeaconBase();
	public static final Block SADISTIUM = new ModBlockBase(OedldoedlResources.MODID, "sadistium_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.BROWN, 2, ModToolTypes.PICKAXE, 15f, 30f, 0).setBeaconBase();
	public static final Block DRUNKIUM = new ModBlockBase(OedldoedlResources.MODID, "drunkium_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.CYAN, 2, ModToolTypes.PICKAXE, 15f, 30f, 0).setBeaconBase();
	public static final Block MONEY = new ModBlockBase(OedldoedlResources.MODID, "money_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.LIME, 3, ModToolTypes.PICKAXE, 25f, 50f, 0).setBeaconBase();

	public static final Block GREMORIUM = new ModBlockEffectBase(OedldoedlResources.MODID, "gremorium_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.NETHERRACK, 4, ModToolTypes.PICKAXE, 40f, 80f, 0, MobEffects.HASTE, false).setBeaconBase();
	public static final Block HIMEJIMARIUM = new ModBlockEffectBase(OedldoedlResources.MODID, "himejimarium_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.BLUE_STAINED_HARDENED_CLAY, 4, ModToolTypes.PICKAXE, 40f, 80f, 0, MobEffects.RESISTANCE, false).setBeaconBase();
	public static final Block TOUJOURIUM = new ModBlockEffectBase(OedldoedlResources.MODID, "toujourium_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.SNOW, 4, ModToolTypes.PICKAXE, 40f, 80f, 0, MobEffects.SPEED, false).setBeaconBase();
	public static final Block ARGENTORIUM = new ModBlockEffectBase(OedldoedlResources.MODID, "argentorium_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.YELLOW, 4, ModToolTypes.PICKAXE, 40f, 80f, 0, MobEffects.SATURATION, false).setBeaconBase();
	public static final Block QUARTARIUM = new ModBlockEffectBase(OedldoedlResources.MODID, "quartarium_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.BLUE, 4, ModToolTypes.PICKAXE, 40f, 80f, 0, MobEffects.STRENGTH, false).setBeaconBase();
	public static final Block NAGATORIUM = new ModBlockEffectBase(OedldoedlResources.MODID, "nagatorium_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.PURPLE, 4, ModToolTypes.PICKAXE, 40f, 80f, 0, MobEffects.UNLUCK, true).setBeaconBase();
	public static final Block SAKURAJIMARIUM = new ModBlockEffectBase(OedldoedlResources.MODID, "sakurajimarium_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.GRAY, 4, ModToolTypes.PICKAXE, 40f, 80f, 0, MobEffects.JUMP_BOOST, false).setBeaconBase();

	// gems
	public static final Block BASE_GEM = new ModBlockBase(OedldoedlResources.MODID, "base_gem_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.IRON, 1, ModToolTypes.PICKAXE, 5f, 10f, 0).setBeaconBase();
	public static final Block OEDLDOEDL_GEM = new ModBlockBase(OedldoedlResources.MODID, "oedldoedl_gem_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.YELLOW, 3, ModToolTypes.PICKAXE, 20f, 40f, 3).setBeaconBase();
	public static final Block TIMOFIUM_GEM = new ModBlockBase(OedldoedlResources.MODID, "timofium_gem_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.YELLOW, 2, ModToolTypes.PICKAXE, 10f, 20f, 0).setBeaconBase();
	public static final Block FLOFINIUM_GEM = new ModBlockBase(OedldoedlResources.MODID, "flofinium_gem_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.BLUE, 2, ModToolTypes.PICKAXE, 10f, 20f, 0).setBeaconBase();
	public static final Block LAARSIUM_GEM = new ModBlockBase(OedldoedlResources.MODID, "laarsium_gem_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.GREEN, 2, ModToolTypes.PICKAXE, 10f, 20f, 0).setBeaconBase();
	public static final Block KLAARSIUM_GEM = new ModBlockBase(OedldoedlResources.MODID, "klaarsium_gem_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.PURPLE_STAINED_HARDENED_CLAY, 2, ModToolTypes.PICKAXE, 10f, 20f, 0).setBeaconBase();
	public static final Block SHARANIUM_GEM = new ModBlockBase(OedldoedlResources.MODID, "sharanium_gem_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.PURPLE, 2, ModToolTypes.PICKAXE, 10f, 20f, 0).setBeaconBase();
	public static final Block MAKERIUM_GEM = new ModBlockBase(OedldoedlResources.MODID, "makerium_gem_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.LIME, 2, ModToolTypes.PICKAXE, 10f, 20f, 0).setBeaconBase();
	public static final Block INDERIUM_GEM = new ModBlockBase(OedldoedlResources.MODID, "inderium_gem_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.LIGHT_BLUE, 2, ModToolTypes.PICKAXE, 10f, 20f, 0).setBeaconBase();
	public static final Block PUMARIUM_GEM = new ModBlockBase(OedldoedlResources.MODID, "pumarium_gem_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.NETHERRACK, 2, ModToolTypes.PICKAXE, 10f, 20f, 0).setBeaconBase();
	public static final Block CALLAXIUM_GEM = new ModBlockBase(OedldoedlResources.MODID, "callaxium_gem_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.LAPIS, 2, ModToolTypes.PICKAXE, 10f, 20f, 0).setBeaconBase();
	public static final Block SKORPIUM_GEM = new ModBlockBase(OedldoedlResources.MODID, "skorpium_gem_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.RED, 2, ModToolTypes.PICKAXE, 10f, 20f, 0).setBeaconBase();
	public static final Block STUPIDIUM_GEM = new ModBlockBase(OedldoedlResources.MODID, "stupidium_gem_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.CYAN, 2, ModToolTypes.PICKAXE, 10f, 20f, 0).setBeaconBase();

	public static final Block GREMORIUM_GEM = new ModBlockBase(OedldoedlResources.MODID, "gremorium_gem_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.NETHERRACK, 3, ModToolTypes.PICKAXE, 20f, 40f, 0).setBeaconBase();
	public static final Block HIMEJIMARIUM_GEM = new ModBlockBase(OedldoedlResources.MODID, "himejimarium_gem_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.BLUE_STAINED_HARDENED_CLAY, 3, ModToolTypes.PICKAXE, 20f, 40f, 0).setBeaconBase();
	public static final Block TOUJOURIUM_GEM = new ModBlockBase(OedldoedlResources.MODID, "toujourium_gem_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.SNOW, 3, ModToolTypes.PICKAXE, 20f, 40f, 0).setBeaconBase();
	public static final Block ARGENTORIUM_GEM = new ModBlockBase(OedldoedlResources.MODID, "argentorium_gem_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.YELLOW, 3, ModToolTypes.PICKAXE, 20f, 40f, 0).setBeaconBase();
	public static final Block QUARTARIUM_GEM = new ModBlockBase(OedldoedlResources.MODID, "quartarium_gem_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.BLUE, 3, ModToolTypes.PICKAXE, 20f, 40f, 0).setBeaconBase();
	public static final Block NAGATORIUM_GEM = new ModBlockBase(OedldoedlResources.MODID, "nagatorium_gem_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.PURPLE, 3, ModToolTypes.PICKAXE, 20f, 40f, 0).setBeaconBase();
	public static final Block SAKURAJIMARIUM_GEM = new ModBlockBase(OedldoedlResources.MODID, "sakurajimarium_gem_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.GRAY, 3, ModToolTypes.PICKAXE, 20f, 40f, 0).setBeaconBase();

	// stars
	public static final Block BASE_STAR = new ModBlockBase(OedldoedlResources.MODID, "base_star_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.NETHERRACK, 1, ModToolTypes.PICKAXE, 5f, 10f, 0).setBeaconBase();
	public static final Block NETHER_STAR = new ModBlockBase(OedldoedlResources.MODID, "nether_star_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.NETHERRACK, 2, ModToolTypes.PICKAXE, 8f, 16f, 1).setBeaconBase();
	public static final Block OEDLDOEDL_STAR = new ModBlockBase(OedldoedlResources.MODID, "oedldoedl_star_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.NETHERRACK, 3, ModToolTypes.PICKAXE, 20f, 40f, 3).setBeaconBase();
	public static final Block INFINITY_STAR = new ModBlockBase(OedldoedlResources.MODID, "infinity_star_block", OedldoedlResources.TAB, Material.IRON, SoundType.METAL, MapColor.NETHERRACK, 4, ModToolTypes.PICKAXE, 50f, 100f, 5).setBeaconBase();
	
	// misc
	public static final Block BALANCED_CLAY = new ModBlockBase(OedldoedlResources.MODID, "balanced_clay", OedldoedlResources.TAB, Material.GROUND, SoundType.GROUND, MapColor.CLAY, 3, ModToolTypes.SHOVEL, 100f, 100f, 0);
	public static final Block CHAOS_PLANK = new ModBlockBase(OedldoedlResources.MODID, "chaos_plank", OedldoedlResources.TAB, Material.IRON, SoundType.ANVIL, MapColor.BLACK, 10, ModToolTypes.PICKAXE, 10000f, 10000f, 0);
}