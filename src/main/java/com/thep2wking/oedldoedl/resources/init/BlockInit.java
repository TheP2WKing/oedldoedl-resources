package com.thep2wking.oedldoedl.resources.init;

import java.util.ArrayList;
import java.util.List;

import com.thep2wking.oedldoedl.resources.blocks.elements.BlockCallaxiumElement;
import com.thep2wking.oedldoedl.resources.blocks.elements.BlockBaseElement;
import com.thep2wking.oedldoedl.resources.blocks.elements.BlockFlofiniumElement;
import com.thep2wking.oedldoedl.resources.blocks.elements.BlockInderiumElement;
import com.thep2wking.oedldoedl.resources.blocks.elements.BlockKlaarsiumElement;
import com.thep2wking.oedldoedl.resources.blocks.elements.BlockLaarsiumElement;
import com.thep2wking.oedldoedl.resources.blocks.elements.BlockMakeriumElement;
import com.thep2wking.oedldoedl.resources.blocks.elements.BlockOedldoedlElement;
import com.thep2wking.oedldoedl.resources.blocks.elements.BlockPumariumElement;
import com.thep2wking.oedldoedl.resources.blocks.elements.BlockSharaniumElement;
import com.thep2wking.oedldoedl.resources.blocks.elements.BlockSkorpiumElement;
import com.thep2wking.oedldoedl.resources.blocks.elements.BlockStupidiumElement;
import com.thep2wking.oedldoedl.resources.blocks.elements.BlockTimofiumElement;
import com.thep2wking.oedldoedl.resources.blocks.gems.BlockBaseGem;
import com.thep2wking.oedldoedl.resources.blocks.ingots.BlockArgentorium;
import com.thep2wking.oedldoedl.resources.blocks.ingots.BlockBedrockium;
import com.thep2wking.oedldoedl.resources.blocks.ingots.BlockDrunkium;
import com.thep2wking.oedldoedl.resources.blocks.ingots.BlockGremorium;
import com.thep2wking.oedldoedl.resources.blocks.ingots.BlockHimejimarium;
import com.thep2wking.oedldoedl.resources.blocks.ingots.BlockBase;
import com.thep2wking.oedldoedl.resources.blocks.ingots.BlockOedldoedl;
import com.thep2wking.oedldoedl.resources.blocks.ingots.BlockQuartarium;
import com.thep2wking.oedldoedl.resources.blocks.ingots.BlockSadistium;
import com.thep2wking.oedldoedl.resources.blocks.ingots.BlockToujourium;
import com.thep2wking.oedldoedl.resources.blocks.misc.BlockChaosPlank;
import com.thep2wking.oedldoedl.resources.blocks.ores.BlockArgentoriumGemOre;
import com.thep2wking.oedldoedl.resources.blocks.ores.BlockElementOD;
import com.thep2wking.oedldoedl.resources.blocks.ores.BlockEnderOre;
import com.thep2wking.oedldoedl.resources.blocks.ores.BlockGremoriumGemOre;
import com.thep2wking.oedldoedl.resources.blocks.ores.BlockHimejimariumGemOre;
import com.thep2wking.oedldoedl.resources.blocks.ores.BlockOedldoedlOre;
import com.thep2wking.oedldoedl.resources.blocks.ores.BlockQuartariumGemOre;
import com.thep2wking.oedldoedl.resources.blocks.ores.BlockSaltOre;
import com.thep2wking.oedldoedl.resources.blocks.ores.BlockSaltpeterOre;
import com.thep2wking.oedldoedl.resources.blocks.ores.BlockSulfurOre;
import com.thep2wking.oedldoedl.resources.blocks.ores.BlockToujouriumGemOre;
import com.thep2wking.oedldoedl.resources.blocks.stars.BlockInfinityStar;
import com.thep2wking.oedldoedl.resources.blocks.stars.BlockOedldoedlStar;
import com.thep2wking.oedldoedl.resources.blocks.stars.BlockBaseStar;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final BlockBaseStar BLOCK_BASE_STAR = new BlockBaseStar("base_star_block", Material.IRON);
	public static final BlockOedldoedlStar BLOCK_OEDLDOEDL_STAR = new BlockOedldoedlStar("oedldoedl_star_block", Material.IRON);
	public static final BlockInfinityStar BLOCK_INFINITY_STAR = new BlockInfinityStar("infinity_star_block", Material.IRON);
	
	public static final BlockBase BLOCK_BASE = new BlockBase("base_block", Material.IRON);
	public static final BlockOedldoedl BLOCK_OEDLDOEDL = new BlockOedldoedl("oedldoedl_block", Material.IRON);
	public static final BlockBedrockium BLOCK_BEDROCKIUM = new BlockBedrockium("bedrockium_block", Material.IRON);
	public static final BlockDrunkium BLOCK_DRUNKIUM = new BlockDrunkium("drunkium_block", Material.IRON);
	public static final BlockSadistium BLOCK_SADISTIUM = new BlockSadistium("sadistium_block", Material.IRON);
	public static final BlockGremorium BLOCK_GREMORIUM = new BlockGremorium("gremorium_block", Material.IRON);
	public static final BlockHimejimarium BLOCK_HIMEJIMARIUM = new BlockHimejimarium("himejimarium_block", Material.IRON);
	public static final BlockToujourium BLOCK_TOUJOURIUM = new BlockToujourium("toujourium_block", Material.IRON);
	public static final BlockArgentorium BLOCK_ARGENTORIUM = new BlockArgentorium("argentorium_block", Material.IRON);
	public static final BlockQuartarium BLOCK_QUARTARIUM = new BlockQuartarium("quartarium_block", Material.IRON);
	
	public static final BlockBaseGem BLOCK_BASE_GEM = new BlockBaseGem("base_gem_block", Material.IRON);
	
	public static final BlockBaseElement BLOCK_BASE_ELEMENT = new BlockBaseElement("base_element_block", Material.IRON);
	public static final BlockOedldoedlElement BLOCK_OEDLDOEDL_ELEMENT = new BlockOedldoedlElement("oedldoedl_element_block", Material.IRON);
	public static final BlockTimofiumElement BLOCK_TIMOFIUM_ELEMENT = new BlockTimofiumElement("timofium_element_block", Material.IRON);
	public static final BlockFlofiniumElement BLOCK_FLOFINIUM_ELEMENT = new BlockFlofiniumElement("flofinium_element_block", Material.IRON);
	public static final BlockLaarsiumElement BLOCK_LAARSIUM_ELEMENT = new BlockLaarsiumElement("laarsium_element_block", Material.IRON);
	public static final BlockKlaarsiumElement BLOCK_KLAARSIUM_ELEMENT = new BlockKlaarsiumElement("klaarsium_element_block", Material.IRON);
	public static final BlockSharaniumElement BLOCK_SHARANIUM_ELEMENT = new BlockSharaniumElement("sharanium_element_block", Material.IRON);
	public static final BlockMakeriumElement BLOCK_MAKERIUM_ELEMENT = new BlockMakeriumElement("makerium_element_block", Material.IRON);
	public static final BlockInderiumElement BLOCK_INDERIUM_ELEMENT = new BlockInderiumElement("inderium_element_block", Material.IRON);
	public static final BlockPumariumElement BLOCK_PUMARIUM_ELEMENT = new BlockPumariumElement("pumarium_element_block", Material.IRON);
	public static final BlockCallaxiumElement BLOCK_CALLAXIUM_ELEMENT = new BlockCallaxiumElement("callaxium_element_block", Material.IRON);
	public static final BlockSkorpiumElement BLOCK_SKORPIUM_ELEMENT = new BlockSkorpiumElement("skorpium_element_block", Material.IRON);
	public static final BlockStupidiumElement BLOCK_STUPIDIUM_ELEMENT = new BlockStupidiumElement("stupidium_element_block", Material.IRON);
	
	public static final BlockOedldoedlOre BLOCK_OEDLDOEDL_ORE = new BlockOedldoedlOre("oedldoedl_ore", Material.ROCK);
	public static final BlockEnderOre BLOCK_ENDER_ORE = new BlockEnderOre("ender_ore", Material.ROCK);
	public static final BlockSulfurOre BLOCK_SULFUR_ORE = new BlockSulfurOre("sulfur_ore", Material.ROCK);
	public static final BlockSaltpeterOre BLOCK_SALTPETER_ORE = new BlockSaltpeterOre("saltpeter_ore", Material.ROCK);
	public static final BlockSaltOre BLOCK_SALT_ORE = new BlockSaltOre("salt_ore", Material.ROCK);
	public static final BlockGremoriumGemOre BLOCK_GREMORIUM_GEM_ORE = new BlockGremoriumGemOre("gremorium_gem_ore", Material.ROCK);
	public static final BlockHimejimariumGemOre BLOCK_HIMEJIMARIUM_GEM_ORE = new BlockHimejimariumGemOre("himejimarium_gem_ore", Material.ROCK);
	public static final BlockToujouriumGemOre BLOCK_TOUJOURIUM_GEM_ORE = new BlockToujouriumGemOre("toujourium_gem_ore", Material.ROCK);
	public static final BlockArgentoriumGemOre BLOCK_ARGENTORIUM_GEM_ORE = new BlockArgentoriumGemOre("argentorium_gem_ore", Material.ROCK);
	public static final BlockQuartariumGemOre BLOCK_QUARTARIUM_GEM_ORE = new BlockQuartariumGemOre("quartarium_gem_ore", Material.ROCK);
	public static final BlockElementOD BLOCK_ELEMENT_OD = new BlockElementOD("element_od", Material.ROCK);
	
	public static final BlockChaosPlank BLOCK_CHAOS_PLANK = new BlockChaosPlank("chaos_plank", Material.ANVIL);
}