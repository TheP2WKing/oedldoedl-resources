package com.thep2wking.oedldoedl.resources.init;

import java.util.ArrayList;
import java.util.List;

import com.thep2wking.oedldoedl.resources.blocks.gems.BlockGemBase;
import com.thep2wking.oedldoedl.resources.blocks.ingots.BlockArgentorium;
import com.thep2wking.oedldoedl.resources.blocks.ingots.BlockBedrockium;
import com.thep2wking.oedldoedl.resources.blocks.ingots.BlockDrunkium;
import com.thep2wking.oedldoedl.resources.blocks.ingots.BlockGremorium;
import com.thep2wking.oedldoedl.resources.blocks.ingots.BlockHimejimarium;
import com.thep2wking.oedldoedl.resources.blocks.ingots.BlockIngotBase;
import com.thep2wking.oedldoedl.resources.blocks.ingots.BlockOedldoedl;
import com.thep2wking.oedldoedl.resources.blocks.ingots.BlockQuartarium;
import com.thep2wking.oedldoedl.resources.blocks.ingots.BlockSadistium;
import com.thep2wking.oedldoedl.resources.blocks.ingots.BlockToujourium;
import com.thep2wking.oedldoedl.resources.blocks.ingots.BlockUselessium;
import com.thep2wking.oedldoedl.resources.blocks.ores.BlockArgentoriumGemOre;
import com.thep2wking.oedldoedl.resources.blocks.ores.BlockGremoriumGemOre;
import com.thep2wking.oedldoedl.resources.blocks.ores.BlockHimejimariumGemOre;
import com.thep2wking.oedldoedl.resources.blocks.ores.BlockOedldoedlOre;
import com.thep2wking.oedldoedl.resources.blocks.ores.BlockQuartariumGemOre;
import com.thep2wking.oedldoedl.resources.blocks.ores.BlockSaltOre;
import com.thep2wking.oedldoedl.resources.blocks.ores.BlockToujouriumGemOre;
import com.thep2wking.oedldoedl.resources.blocks.stars.BlockInfinityStar;
import com.thep2wking.oedldoedl.resources.blocks.stars.BlockOedldoedlStar;
import com.thep2wking.oedldoedl.resources.blocks.stars.BlockStarBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final BlockStarBase BLOCK_STAR_BASE = new BlockStarBase("star_base_block", Material.field_151573_f);
	public static final BlockOedldoedlStar BLOCK_OEDLDOEDL_STAR = new BlockOedldoedlStar("oedldoedl_star_block", Material.field_151573_f);
	public static final BlockInfinityStar BLOCK_INFINITY_STAR = new BlockInfinityStar("infinity_star_block", Material.field_151573_f);
	
	public static final BlockIngotBase BLOCK_INGOT_BASE = new BlockIngotBase("ingot_base_block", Material.field_151573_f);
	public static final BlockOedldoedl BLOCK_OEDLDOEDL = new BlockOedldoedl("oedldoedl_block", Material.field_151573_f);
	public static final BlockBedrockium BLOCK_BEDROCKIUM = new BlockBedrockium("bedrockium_block", Material.field_151573_f);
	public static final BlockDrunkium BLOCK_DRUNKIUM = new BlockDrunkium("drunkium_block", Material.field_151573_f);
	public static final BlockSadistium BLOCK_SADISTIUM = new BlockSadistium("sadistium_block", Material.field_151573_f);
	public static final BlockUselessium BLOCK_USELESSIUM = new BlockUselessium("uselessium_block", Material.field_151573_f);
	public static final BlockGremorium BLOCK_GREMORIUM = new BlockGremorium("gremorium_block", Material.field_151573_f);
	public static final BlockHimejimarium BLOCK_HIMEJIMARIUM = new BlockHimejimarium("himejimarium_block", Material.field_151573_f);
	public static final BlockToujourium BLOCK_TOUJOURIUM = new BlockToujourium("toujourium_block", Material.field_151573_f);
	public static final BlockArgentorium BLOCK_ARGENTORIUM = new BlockArgentorium("argentorium_block", Material.field_151573_f);
	public static final BlockQuartarium BLOCK_QUARTARIUM = new BlockQuartarium("quartarium_block", Material.field_151573_f);
	
	public static final BlockGemBase BLOCK_GEM_BASE = new BlockGemBase("gem_base_block", Material.field_151573_f);
	
	public static final BlockOedldoedlOre BLOCK_OEDLDOEDL_ORE = new BlockOedldoedlOre("oedldoedl_ore", Material.field_151576_e);
	public static final BlockSaltOre BLOCK_SALT_ORE = new BlockSaltOre("salt_ore", Material.field_151576_e);
	
	public static final BlockGremoriumGemOre BLOCK_GREMORIUM_GEM_ORE = new BlockGremoriumGemOre("gremorium_gem_ore", Material.field_151576_e);
	public static final BlockHimejimariumGemOre BLOCK_HIMEJIMARIUM_GEM_ORE = new BlockHimejimariumGemOre("himejimarium_gem_ore", Material.field_151576_e);
	public static final BlockToujouriumGemOre BLOCK_TOUJOURIUM_GEM_ORE = new BlockToujouriumGemOre("toujourium_gem_ore", Material.field_151576_e);
	public static final BlockArgentoriumGemOre BLOCK_ARGENTORIUM_GEM_ORE = new BlockArgentoriumGemOre("argentorium_gem_ore", Material.field_151576_e);
	public static final BlockQuartariumGemOre BLOCK_QUARTARIUM_GEM_ORE = new BlockQuartariumGemOre("quartarium_gem_ore", Material.field_151576_e);
}