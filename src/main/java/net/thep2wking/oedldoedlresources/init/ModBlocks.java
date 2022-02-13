package net.thep2wking.oedldoedlresources.init;

import java.util.function.Supplier;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.potion.Effects;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.thep2wking.oedldoedlcore.base.ModBlockBase;
import net.thep2wking.oedldoedlcore.base.ModOreBlockBase;
import net.thep2wking.oedldoedlcore.config.CoreConfig;
import net.thep2wking.oedldoedlresources.OedldoedlResources;
import net.thep2wking.oedldoedlresources.base.ModBlockEffectBase;
import net.thep2wking.oedldoedlresources.content.block.gem.SaltBlock;
import net.thep2wking.oedldoedlresources.content.block.ingot.BedrockiumBlock;
import net.thep2wking.oedldoedlresources.content.block.ingot.CloudiumBlock;
import net.thep2wking.oedldoedlresources.content.block.ingot.DrunkiumBlock;
import net.thep2wking.oedldoedlresources.content.block.ingot.ElevatiumBlock;
import net.thep2wking.oedldoedlresources.content.block.ingot.MoneyBlock;
import net.thep2wking.oedldoedlresources.content.block.misc.BlockChaosPlank;
import net.thep2wking.oedldoedlresources.content.block.ore.EnderOreBlock;

public class ModBlocks 
{
	//deferred register
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, OedldoedlResources.MODID);
	
	//blocks
	public static final RegistryObject<Block> BASE_ORE = registerBlock("base_ore", 
			() -> new ModOreBlockBase(SoundType.STONE, 0, 2f, 4f, ToolType.PICKAXE, 0, 0, 0, AbstractBlock.Properties.create(Material.ROCK, MaterialColor.GRAY)));
	public static final RegistryObject<Block> RANDOMITE_ORE = registerBlock("randomite_ore", 
			() -> new ModOreBlockBase(SoundType.STONE, 2, 3f, 6f, ToolType.PICKAXE, 2, 0, 2, AbstractBlock.Properties.create(Material.ROCK, MaterialColor.GRAY)));
	public static final RegistryObject<Block> OEDLDOEDL_ORE = registerBlock("oedldoedl_ore", 
			() -> new ModOreBlockBase(SoundType.STONE, 3, 12f, 24f, ToolType.PICKAXE, 4, 0, 0, AbstractBlock.Properties.create(Material.ROCK, MaterialColor.GRAY)));
	public static final RegistryObject<Block> ENDER_ORE = registerBlock("ender_ore", 
			() -> new EnderOreBlock(SoundType.STONE, 2, 4f, 8f, ToolType.PICKAXE, 0, 2, 4, AbstractBlock.Properties.create(Material.ROCK, MaterialColor.GRAY)));
	public static final RegistryObject<Block> GUNPOWDER_ORE = registerBlock("gunpowder_ore", 
			() -> new ModOreBlockBase(SoundType.STONE, 1, 3f, 6f, ToolType.PICKAXE, 0, 1, 3, AbstractBlock.Properties.create(Material.ROCK, MaterialColor.GRAY)));
	public static final RegistryObject<Block> SALT_ORE = registerBlock("salt_ore", 
			() -> new ModOreBlockBase(SoundType.STONE, 1, 3f, 3f, ToolType.PICKAXE, 0, 0, 2, AbstractBlock.Properties.create(Material.ROCK, MaterialColor.GRAY)));
	public static final RegistryObject<Block> NETHER_GREMORIUM_ORE = registerBlock("nether_gremorium_ore", 
			() -> new ModOreBlockBase(SoundType.ANCIENT_DEBRIS, 3, 35f, 70f, ToolType.PICKAXE, 0, 8, 20, AbstractBlock.Properties.create(Material.ROCK, MaterialColor.NETHERRACK)));
	public static final RegistryObject<Block> NETHER_HIMEJIMARIUM_ORE = registerBlock("nether_himejimarium_ore",
			() -> new ModOreBlockBase(SoundType.ANCIENT_DEBRIS, 3, 35f, 70f, ToolType.PICKAXE, 0, 8, 20, AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLUE)));
	public static final RegistryObject<Block> NETHER_TOUJOURIUM_ORE = registerBlock("nether_toujourium_ore", 
			() -> new ModOreBlockBase(SoundType.ANCIENT_DEBRIS, 3, 35f, 70f, ToolType.PICKAXE, 0, 8, 20, AbstractBlock.Properties.create(Material.ROCK, MaterialColor.SNOW)));
	public static final RegistryObject<Block> NETHER_ARGENTORIUM_ORE = registerBlock("nether_argentorium_ore", 
			() -> new ModOreBlockBase(SoundType.ANCIENT_DEBRIS, 3, 35f, 70f, ToolType.PICKAXE, 0, 8, 20, AbstractBlock.Properties.create(Material.ROCK, MaterialColor.YELLOW)));
	public static final RegistryObject<Block> NETHER_QUARTARIUM_ORE = registerBlock("nether_quartarium_ore", 
			() -> new ModOreBlockBase(SoundType.ANCIENT_DEBRIS, 3, 35f, 70f, ToolType.PICKAXE, 0, 8, 20, AbstractBlock.Properties.create(Material.ROCK, MaterialColor.WATER)));
	public static final RegistryObject<Block> NETHER_NAGATORIUM_ORE = registerBlock("nether_nagatorium_ore", 
			() -> new ModOreBlockBase(SoundType.ANCIENT_DEBRIS, 3, 35f, 70f, ToolType.PICKAXE, 0, 8, 20, AbstractBlock.Properties.create(Material.ROCK, MaterialColor.PURPLE)));
	public static final RegistryObject<Block> NETHER_SAKURAJIMARIUM_ORE = registerBlock("nether_sakurajimarium_ore", 
			() -> new ModOreBlockBase(SoundType.ANCIENT_DEBRIS, 3, 35f, 70f, ToolType.PICKAXE, 0, 8, 20, AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLACK)));
	public static final RegistryObject<Block> END_ELEMENT_OD = registerBlock("end_element_od", 
			() -> new ModOreBlockBase(SoundType.STONE, 4, 50f, 100f, ToolType.PICKAXE, 6, 10, 16, AbstractBlock.Properties.create(Material.ROCK, MaterialColor.SAND)));

	public static final RegistryObject<Block> BASE = registerBlock("base_block", 
			() -> new ModBlockBase(SoundType.METAL, 1, 5f, 10f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.IRON)));
	public static final RegistryObject<Block> OEDLDOEDL = registerBlock("oedldoedl_block", 
			() -> new ModBlockBase(SoundType.METAL, 3, 20f, 40f, ToolType.PICKAXE, 6, AbstractBlock.Properties.create(Material.IRON, MaterialColor.YELLOW)));
	public static final RegistryObject<Block> BEDROCKIUM = registerBlock("bedrockium_block", 
			() -> new BedrockiumBlock(SoundType.METAL, 6, 150f, 300f, ToolType.PICKAXE, Effects.SLOWNESS, Effects.HUNGER, true, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.STONE)));
	public static final RegistryObject<Block> CLOUDIUM = registerBlock("cloudium_block", 
			() -> new CloudiumBlock(SoundType.METAL, 1, 5f, 10f, ToolType.PICKAXE, Effects.SLOW_FALLING, false, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.SNOW)));
	public static final RegistryObject<Block> ELEVATIUM = registerBlock("elevatium_block", 
			() -> new ElevatiumBlock(SoundType.METAL, 1, 10f, 20f, ToolType.PICKAXE, Effects.LEVITATION, true, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.WARPED_HYPHAE)));
	public static final RegistryObject<Block> DRUNKIUM = registerBlock("drunkium_block", 
			() -> new DrunkiumBlock(SoundType.METAL, 2, 15f, 30f, ToolType.PICKAXE, Effects.BLINDNESS, Effects.SLOWNESS, Effects.NAUSEA, Effects.WITHER, true, 0, 
					AbstractBlock.Properties.from(Blocks.GLASS)));
	public static final RegistryObject<Block> MONEY = registerBlock("money_block", 
			() -> new MoneyBlock(SoundType.METAL, 3, 25f, 50f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.WOOL, MaterialColor.GREEN)));
	public static final RegistryObject<Block> CRYSTAL_MATRIX = registerBlock("crystal_matrix_block", 
			() -> new ModBlockBase(SoundType.METAL, 3, 40f, 80f, ToolType.PICKAXE, 4, AbstractBlock.Properties.create(Material.IRON, MaterialColor.WARPED_NYLIUM)));
	public static final RegistryObject<Block> NEUTRONIUM = registerBlock("neutronium_block", 
			() -> new ModBlockBase(SoundType.METAL, 4, 50f, 100f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLACK)));
	public static final RegistryObject<Block> GREMORIUM = registerBlock("gremorium_block", 
			() -> new ModBlockEffectBase(SoundType.NETHERITE, 4, 40f, 80f, ToolType.PICKAXE, Effects.HASTE, false, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.NETHERRACK)));
	public static final RegistryObject<Block> HIMEJIMARIUM = registerBlock("himejimarium_block", 
			() -> new ModBlockEffectBase(SoundType.NETHERITE, 4, 40f, 80f, ToolType.PICKAXE, Effects.RESISTANCE, false, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLUE_TERRACOTTA)));
	public static final RegistryObject<Block> TOUJOURIUM = registerBlock("toujourium_block", 
			() -> new ModBlockEffectBase(SoundType.NETHERITE, 4, 40f, 80f, ToolType.PICKAXE, Effects.SPEED, false, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.SNOW)));
	public static final RegistryObject<Block> ARGENTORIUM = registerBlock("argentorium_block", 
			() -> new ModBlockEffectBase(SoundType.NETHERITE, 4, 40f, 80f, ToolType.PICKAXE, Effects.SATURATION, false, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.YELLOW)));
	public static final RegistryObject<Block> QUARTARIUM = registerBlock("quartarium_block", 
			() -> new ModBlockEffectBase(SoundType.NETHERITE, 4, 40f, 80f, ToolType.PICKAXE, Effects.STRENGTH, false, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLUE)));
	public static final RegistryObject<Block> NAGATORIUM = registerBlock("nagatorium_block", 
			() -> new ModBlockEffectBase(SoundType.NETHERITE, 4, 40f, 80f, ToolType.PICKAXE, Effects.MINING_FATIGUE, true, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.PURPLE)));
	public static final RegistryObject<Block> SAKURAJIMARIUM = registerBlock("sakurajimarium_block", 
			() -> new ModBlockEffectBase(SoundType.NETHERITE, 4, 40f, 80f, ToolType.PICKAXE, Effects.JUMP_BOOST, false, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.GRAY)));
	
	public static final RegistryObject<Block> BASE_GEM = registerBlock("base_gem_block", 
			() -> new ModBlockBase(SoundType.METAL, 1, 5f, 10f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.IRON)));
	public static final RegistryObject<Block> OEDLDOEDL_GEM = registerBlock("oedldoedl_gem_block", 
			() -> new ModBlockBase(SoundType.METAL, 3, 10f, 20f, ToolType.PICKAXE, 6, AbstractBlock.Properties.create(Material.IRON, MaterialColor.YELLOW)));
	public static final RegistryObject<Block> TIMOFIUM_GEM = registerBlock("timofium_gem_block", 
			() -> new ModBlockBase(SoundType.METAL, 2, 10f, 20f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.YELLOW)));
	public static final RegistryObject<Block> FLOFINIUM_GEM = registerBlock("flofinium_gem_block", 
			() -> new ModBlockBase(SoundType.METAL, 2, 10f, 20f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLUE)));
	public static final RegistryObject<Block> LAARSIUM_GEM = registerBlock("laarsium_gem_block", 
			() -> new ModBlockBase(SoundType.METAL, 2, 10f, 20f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.GREEN)));
	public static final RegistryObject<Block> KLAARSIUM_GEM = registerBlock("klaarsium_gem_block", 
			() -> new ModBlockBase(SoundType.METAL, 2, 10f, 20f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.PURPLE)));
	public static final RegistryObject<Block> SHARANIUM_GEM = registerBlock("sharanium_gem_block", 
			() -> new ModBlockBase(SoundType.METAL, 2, 10f, 20f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.PURPLE)));
	public static final RegistryObject<Block> MAKERIUM_GEM = registerBlock("makerium_gem_block", 
			() -> new ModBlockBase(SoundType.METAL, 2, 10f, 20f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.LIME)));
	public static final RegistryObject<Block> INDERIUM_GEM = registerBlock("inderium_gem_block", 
			() -> new ModBlockBase(SoundType.METAL, 2, 10f, 20f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.LIGHT_BLUE)));
	public static final RegistryObject<Block> PUMARIUM_GEM = registerBlock("pumarium_gem_block", 
			() -> new ModBlockBase(SoundType.METAL, 2, 10f, 20f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.NETHERRACK)));
	public static final RegistryObject<Block> CALLAXIUM_GEM = registerBlock("callaxium_gem_block", 
			() -> new ModBlockBase(SoundType.METAL, 2, 10f, 20f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.LAPIS)));
	public static final RegistryObject<Block> SKORPIUM_GEM = registerBlock("skorpium_gem_block", 
			() -> new ModBlockBase(SoundType.METAL, 2, 10f, 20f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.CRIMSON_NYLIUM)));
	public static final RegistryObject<Block> STUPIDIUM_GEM = registerBlock("stupidium_gem_block", 
			() -> new ModBlockBase(SoundType.METAL, 2, 10f, 20f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.WARPED_STEM)));
	public static final RegistryObject<Block> SALT = registerBlock("salt_block", 
			() -> new SaltBlock(SoundType.STONE, 3f, 3f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.ROCK, MaterialColor.SNOW)));
	public static final RegistryObject<Block> GREMORIUM_GEM = registerBlock("gremorium_gem_block", 
			() -> new ModBlockBase(SoundType.METAL, 3, 20f, 40f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.NETHERRACK)));
	public static final RegistryObject<Block> HIMEJIMARIUM_GEM = registerBlock("himejimarium_gem_block", 
			() -> new ModBlockBase(SoundType.METAL, 3, 20f, 40f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLUE)));
	public static final RegistryObject<Block> TOUJOURIUM_GEM = registerBlock("toujourium_gem_block", 
			() -> new ModBlockBase(SoundType.METAL, 3, 20f, 40f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.SNOW)));
	public static final RegistryObject<Block> ARGENTORIUM_GEM = registerBlock("argentorium_gem_block", 
			() -> new ModBlockBase(SoundType.METAL, 3, 20f, 40f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.YELLOW)));
	public static final RegistryObject<Block> QUARTARIUM_GEM = registerBlock("quartarium_gem_block", 
			() -> new ModBlockBase(SoundType.METAL, 3, 20f, 40f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLUE)));
	public static final RegistryObject<Block> NAGATORIUM_GEM = registerBlock("nagatorium_gem_block", 
			() -> new ModBlockBase(SoundType.METAL, 3, 20f, 40f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.PURPLE)));
	public static final RegistryObject<Block> SAKURAJIMARIUM_GEM = registerBlock("sakurajimarium_gem_block", 
			() -> new ModBlockBase(SoundType.METAL, 3, 20f, 40f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.GRAY)));
	
	public static final RegistryObject<Block> BASE_STAR = registerBlock("base_star_block", 
			() -> new ModBlockBase(SoundType.METAL, 1, 5f, 10f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.IRON)));
	public static final RegistryObject<Block> NETHER_STAR = registerBlock("nether_star_block", 
			() -> new ModBlockBase(SoundType.METAL, 2, 8f, 16f, ToolType.PICKAXE, 3, AbstractBlock.Properties.create(Material.IRON, MaterialColor.DIAMOND)));
	public static final RegistryObject<Block> OEDLDOEDL_STAR = registerBlock("oedldoedl_star_block", 
			() -> new ModBlockBase(SoundType.METAL, 3, 20f, 40f, ToolType.PICKAXE, 6, AbstractBlock.Properties.create(Material.IRON, MaterialColor.YELLOW)));
	public static final RegistryObject<Block> INFINITY_STAR = registerBlock("infinity_star_block", 
			() -> new ModBlockBase(SoundType.METAL, 4, 50f, 100f, ToolType.PICKAXE, 10, AbstractBlock.Properties.create(Material.IRON, MaterialColor.RED)));
	
	public static final RegistryObject<Block> CHAOS_PLANK = registerBlock("chaos_plank", 
			() -> new BlockChaosPlank(SoundType.ANVIL, 10, 10000f, 100000f, ToolType.PICKAXE, 0, AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLACK)));

	private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block)
	{
		RegistryObject<T> toReturn = BLOCKS.register(name, block);	
		return toReturn;
	}
	
	public static void register(IEventBus enevtBus)
	{
		BLOCKS.register(enevtBus);
	
		if (CoreConfig.general_logging.get()) {OedldoedlResources.LOGGER.info("Registerd Blocks for " + OedldoedlResources.MODID + "!");}
	}
}