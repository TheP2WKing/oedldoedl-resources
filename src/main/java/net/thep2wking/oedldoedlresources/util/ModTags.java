package net.thep2wking.oedldoedlresources.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.Tags.IOptionalNamedTag;
import net.thep2wking.oedldoedlresources.OedldoedlResources;

public class ModTags 
{
	public static class BLocks
	{
		@SuppressWarnings("unused")
		private static Tags.IOptionalNamedTag<Block> createTag(String name)
		{
			return BlockTags.createOptional(new ResourceLocation(OedldoedlResources.MODID, name));
		}
		
		private static Tags.IOptionalNamedTag<Block> createForgeTag(String name)
		{
			return BlockTags.createOptional(new ResourceLocation("forge", name));
		}
		
		//universal
		public static final Tags.IOptionalNamedTag<Block> FORGE_ORES = createForgeTag("ores");
		public static final Tags.IOptionalNamedTag<Block> FORGE_STORAGE_BLOCKS = createForgeTag("storage_blocks");
		
		//blocks
		public static final Tags.IOptionalNamedTag<Block> ORES_BASE = createForgeTag("ores/base");
		public static final Tags.IOptionalNamedTag<Block> ORES_RANDOMITE = createForgeTag("ores/randomite");
		public static final Tags.IOptionalNamedTag<Block> ORES_OEDLDOEDL = createForgeTag("ores/oedldoedl");
		public static final Tags.IOptionalNamedTag<Block> ORES_ENDER = createForgeTag("ores/ender");
		public static final Tags.IOptionalNamedTag<Block> ORES_ENDER_PEARL = createForgeTag("ores/ender_pearl");
		public static final Tags.IOptionalNamedTag<Block> ORES_GUNPOWDER = createForgeTag("ores/gunpowder");
		public static final Tags.IOptionalNamedTag<Block> ORES_SALT = createForgeTag("ores/salt");
		public static final Tags.IOptionalNamedTag<Block> ORES_GREMORIUM_SHARD = createForgeTag("ores/gremorium_shard");
		public static final Tags.IOptionalNamedTag<Block> ORES_HIMEJIMARIUM_SHARD = createForgeTag("ores/himejimarium_shard");
		public static final Tags.IOptionalNamedTag<Block> ORES_TOUJOURIUM_SHARD = createForgeTag("ores/toujourium_shard");
		public static final Tags.IOptionalNamedTag<Block> ORES_ARGENTORIUM_SHARD = createForgeTag("ores/argentorium_shard");
		public static final Tags.IOptionalNamedTag<Block> ORES_QUARTARIUM_SHARD = createForgeTag("ores/quartarium_shard");
		public static final Tags.IOptionalNamedTag<Block> ORES_NAGATORIUM_SHARD = createForgeTag("ores/nagatorium_shard");
		public static final Tags.IOptionalNamedTag<Block> ORES_SAKURAJIMARIUM_SHARD = createForgeTag("ores/sakurajimarium_shard");
		public static final Tags.IOptionalNamedTag<Block> ORES_ELEMEND_OD = createForgeTag("ores/element_od");

		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_BASE = createForgeTag("storage_blocks/base");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_OEDLDOEDL = createForgeTag("storage_blocks/oedldoedl");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_BEDROCKIUM = createForgeTag("storage_blocks/bedrockium");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_CLOUDIUM = createForgeTag("storage_blocks/cloudium");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_ELEVATIUM = createForgeTag("storage_blocks/elevatium");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_DRUNKIUM = createForgeTag("storage_blocks/drunkium");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_MONEY = createForgeTag("storage_blocks/money");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_CRYSTAL_MATRIX = createForgeTag("storage_blocks/crystal_matrix");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_NEUTRONIUM = createForgeTag("storage_blocks/neutronium");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_GREMORIUM = createForgeTag("storage_blocks/gremorium");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_HIMEJIMARIUM = createForgeTag("storage_blocks/himejimarium");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_TOUJOURIUM = createForgeTag("storage_blocks/toujourium");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_ARGENTORIUM = createForgeTag("storage_blocks/argentorium");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_QUARTARIUM = createForgeTag("storage_blocks/quartarium");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_NAGATORIUM = createForgeTag("storage_blocks/nagatorium");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_SAKURAJIMARIUM = createForgeTag("storage_blocks/sakurajimarium");
		
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_BASE_GEM = createForgeTag("storage_blocks/base_gem");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_OEDLDOEDL_GEM = createForgeTag("storage_blocks/oedldoedl_gem");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_TIMOFIUM_GEM = createForgeTag("storage_blocks/timofium_gem");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_FLOFINIUM_GEM = createForgeTag("storage_blocks/flofinium_gem");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_LAARSIUM_GEM = createForgeTag("storage_blocks/laarsium_gem");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_KLAARSIUM_GEM = createForgeTag("storage_blocks/klaarsium_gem");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_SHARANIUM_GEM = createForgeTag("storage_blocks/sharanium_gem");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_MAKERIUM_GEM = createForgeTag("storage_blocks/makerium_gem");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_INDERIUM_GEM = createForgeTag("storage_blocks/inderium_gem");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_PUMARIUM_GEM = createForgeTag("storage_blocks/pumarium_gem");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_CALLAXIUM_GEM = createForgeTag("storage_blocks/callaxium_gem");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_SKORPIUM_GEM = createForgeTag("storage_blocks/skorpium_gem");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_STUPIDIUM_GEM = createForgeTag("storage_blocks/stupidium_gem");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_SALT = createForgeTag("storage_blocks/salt");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_GREMORIUM_GEM = createForgeTag("storage_blocks/gremorium_gem");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_HIMEJIMARIUM_GEM = createForgeTag("storage_blocks/himejimarium_gem");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_TOUJOURIUM_GEM = createForgeTag("storage_blocks/toujourium_gem");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_ARGENTORIUM_GEM = createForgeTag("storage_blocks/argentorium_gem");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_QUARTARIUM_GEM = createForgeTag("storage_blocks/quartarium_gem");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_NAGATORIUM_GEM = createForgeTag("storage_blocks/nagatorium_gem");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_SAKURAJIMARIUM_GEM = createForgeTag("storage_blocks/sakurajimarium_gem");
		
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_BASE_STARS = createForgeTag("storage_blocks/base_stars");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_NETHER_STARS = createForgeTag("storage_blocks/nether_stars");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_OEDLDOEDL_STARS = createForgeTag("storage_blocks/oedldoedl_stars");
		public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_INFINITY_STARS = createForgeTag("storage_blocks/infinity_stars");
		
		public static final Tags.IOptionalNamedTag<Block> CHAOS_PLANK = createForgeTag("chaos_plank");
	}
	
	public static class Items
	{
		private static IOptionalNamedTag<Item> createTag(String name)
		{
			return ItemTags.createOptional(new ResourceLocation(OedldoedlResources.MODID, name));
		}
		
		//randomite drops
		public static final Tags.IOptionalNamedTag<Item> OEDLDOEDL_RANDOMITE_DROPS = createTag("randomite_drop");
		
		private static IOptionalNamedTag<Item> createForgeTag(String name)
		{
			return ItemTags.createOptional(new ResourceLocation("forge", name));
		}
		
		//universal
		public static final Tags.IOptionalNamedTag<Item> FORGE_ORES = createForgeTag("ores");
		public static final Tags.IOptionalNamedTag<Item> FORGE_STORAGE_BLOCKS = createForgeTag("storage_blocks");
		public static final Tags.IOptionalNamedTag<Item> FORGE_INGOTS = createForgeTag("ingots");
		public static final Tags.IOptionalNamedTag<Item> FORGE_GEMS = createForgeTag("gems");
		public static final Tags.IOptionalNamedTag<Item> FORGE_ELEMENTS = createForgeTag("elements");
		public static final Tags.IOptionalNamedTag<Item> FORGE_DUSTS = createForgeTag("dusts");
		public static final Tags.IOptionalNamedTag<Item> FORGE_NUGGETS = createForgeTag("nuggets");
		public static final Tags.IOptionalNamedTag<Item> FORGE_SHARDS = createForgeTag("shards");
		public static final Tags.IOptionalNamedTag<Item> FORGE_FRAGMENTS = createForgeTag("fragments");
		public static final Tags.IOptionalNamedTag<Item> FORGE_SINGULARITIES = createForgeTag("singularities");
		
		//blockitems
		public static final Tags.IOptionalNamedTag<Item> ORES_BASE = createForgeTag("ores/base");
		public static final Tags.IOptionalNamedTag<Item> ORES_RANDOMITE = createForgeTag("ores/randomite");
		public static final Tags.IOptionalNamedTag<Item> ORES_OEDLDOEDL = createForgeTag("ores/oedldoedl");
		public static final Tags.IOptionalNamedTag<Item> ORES_ENDER = createForgeTag("ores/ender");
		public static final Tags.IOptionalNamedTag<Item> ORES_ENDER_PEARL = createForgeTag("ores/ender_pearl");
		public static final Tags.IOptionalNamedTag<Item> ORES_GUNPOWDER = createForgeTag("ores/gunpowder");
		public static final Tags.IOptionalNamedTag<Item> ORES_SALT = createForgeTag("ores/salt");
		public static final Tags.IOptionalNamedTag<Item> ORES_GREMORIUM_SHARD = createForgeTag("ores/gremorium_shard");
		public static final Tags.IOptionalNamedTag<Item> ORES_HIMEJIMARIUM_SHARD = createForgeTag("ores/himejimarium_shard");
		public static final Tags.IOptionalNamedTag<Item> ORES_TOUJOURIUM_SHARD = createForgeTag("ores/toujourium_shard");
		public static final Tags.IOptionalNamedTag<Item> ORES_ARGENTORIUM_SHARD = createForgeTag("ores/argentorium_shard");
		public static final Tags.IOptionalNamedTag<Item> ORES_QUARTARIUM_SHARD = createForgeTag("ores/quartarium_shard");
		public static final Tags.IOptionalNamedTag<Item> ORES_NAGATORIUM_SHARD = createForgeTag("ores/nagatorium_shard");
		public static final Tags.IOptionalNamedTag<Item> ORES_SAKURAJIMARIUM_SHARD = createForgeTag("ores/sakurajimarium_shard");
		
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_BASE = createForgeTag("storage_blocks/base");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_OEDLDOEDL = createForgeTag("storage_blocks/oedldoedl");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_BEDROCKIUM = createForgeTag("storage_blocks/bedrockium");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_CLOUDIUM = createForgeTag("storage_blocks/cloudium");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_ELEVATIUM = createForgeTag("storage_blocks/elevatium");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_DRUNKIUM = createForgeTag("storage_blocks/drunkium");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_MONEY = createForgeTag("storage_blocks/money");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_CRYSTAL_MATRIX = createForgeTag("storage_blocks/crystal_matrix");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_NEUTRONIUM = createForgeTag("storage_blocks/neutronium");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_GREMORIUM = createForgeTag("storage_blocks/gremorium");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_HIMEJIMARIUM = createForgeTag("storage_blocks/himejimarium");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_TOUJOURIUM = createForgeTag("storage_blocks/toujourium");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_ARGENTORIUM = createForgeTag("storage_blocks/argentorium");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_QUARTARIUM = createForgeTag("storage_blocks/quartarium");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_NAGATORIUM = createForgeTag("storage_blocks/nagatorium");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_SAKURAJIMARIUM = createForgeTag("storage_blocks/sakurajimarium");
		
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_BASE_GEM = createForgeTag("storage_blocks/base_gem");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_OEDLDOEDL_GEM = createForgeTag("storage_blocks/oedldoedl_gem");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_TIMOFIUM_GEM = createForgeTag("storage_blocks/timofium_gem");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_FLOFINIUM_GEM = createForgeTag("storage_blocks/flofinium_gem");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_LAARSIUM_GEM = createForgeTag("storage_blocks/laarsium_gem");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_KLAARSIUM_GEM = createForgeTag("storage_blocks/klaarsium_gem");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_SHARANIUM_GEM = createForgeTag("storage_blocks/sharanium_gem");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_MAKERIUM_GEM = createForgeTag("storage_blocks/makerium_gem");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_INDERIUM_GEM = createForgeTag("storage_blocks/inderium_gem");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_PUMARIUM_GEM = createForgeTag("storage_blocks/pumarium_gem");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_CALLAXIUM_GEM = createForgeTag("storage_blocks/callaxium_gem");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_SKORPIUM_GEM = createForgeTag("storage_blocks/skorpium_gem");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_STUPIDIUM_GEM = createForgeTag("storage_blocks/stupidium_gem");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_SALT = createForgeTag("storage_blocks/salt");
		
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_BASE_STARS = createForgeTag("storage_blocks/base_star");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_NETHER_STARS = createForgeTag("storage_blocks/nether_star");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_OEDLDOEDL_STARS = createForgeTag("storage_blocks/oedldoedl_star");
		public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_INFINITY_STARS = createForgeTag("storage_blocks/infinity_star");
		
		public static final Tags.IOptionalNamedTag<Item> CHAOS_PLANK = createForgeTag("chaos_plank");
		
		//items
		public static final Tags.IOptionalNamedTag<Item> INGOTS_BASE = createForgeTag("ingots/base");
		public static final Tags.IOptionalNamedTag<Item> INGOTS_OEDLDOEDL = createForgeTag("ingots/oedldoedl");
		public static final Tags.IOptionalNamedTag<Item> INGOTS_BEDROCKIUM = createForgeTag("ingots/bedrockium");
		public static final Tags.IOptionalNamedTag<Item> INGOTS_CLOUDIUM = createForgeTag("ingots/cloudium");
		public static final Tags.IOptionalNamedTag<Item> INGOTS_ELEVATIUM = createForgeTag("ingots/elevatium");
		public static final Tags.IOptionalNamedTag<Item> INGOTS_DRUNKIUM = createForgeTag("ingots/drunkium");
		public static final Tags.IOptionalNamedTag<Item> INGOTS_MONEY = createForgeTag("ingots/money");
		public static final Tags.IOptionalNamedTag<Item> INGOTS_CRYSTAL_MATRIX = createForgeTag("ingots/crystal_matrix");
		public static final Tags.IOptionalNamedTag<Item> INGOTS_NEUTRONIUM = createForgeTag("ingots/neutronium");
		public static final Tags.IOptionalNamedTag<Item> INGOTS_GREMORIUM = createForgeTag("ingots/gremorium");
		public static final Tags.IOptionalNamedTag<Item> INGOTS_HIMEJIMARIUM = createForgeTag("ingots/himejimarium");
		public static final Tags.IOptionalNamedTag<Item> INGOTS_TOUJOURIUM = createForgeTag("ingots/toujourium");
		public static final Tags.IOptionalNamedTag<Item> INGOTS_ARGENTORIUM = createForgeTag("ingots/argentorium");
		public static final Tags.IOptionalNamedTag<Item> INGOTS_QUARTARIUM = createForgeTag("ingots/quartarium");
		public static final Tags.IOptionalNamedTag<Item> INGOTS_NAGATORIUM = createForgeTag("ingots/nagatorium");
		public static final Tags.IOptionalNamedTag<Item> INGOTS_SAKURAJIMARIUM = createForgeTag("ingots/sakurajimarium");
		public static final Tags.IOptionalNamedTag<Item> INGOTS_UNSTABLE = createForgeTag("ingots/unstable");
		public static final Tags.IOptionalNamedTag<Item> INGOTS_INFINITY = createForgeTag("ingots/infinity");
		public static final Tags.IOptionalNamedTag<Item> INGOTS_CHAOS = createForgeTag("ingots/chaos");
		
		public static final Tags.IOptionalNamedTag<Item> GEMS_BASE = createForgeTag("gems/base");
		public static final Tags.IOptionalNamedTag<Item> GEMS_OEDLDOEDL = createForgeTag("gems/oedldoedl");
		public static final Tags.IOptionalNamedTag<Item> GEMS_TIMOFIUM = createForgeTag("gems/timofium");
		public static final Tags.IOptionalNamedTag<Item> GEMS_FLOFINIUM = createForgeTag("gems/flofinium");
		public static final Tags.IOptionalNamedTag<Item> GEMS_LAARSIUM = createForgeTag("gems/laarsium");
		public static final Tags.IOptionalNamedTag<Item> GEMS_KLAARSIUM = createForgeTag("gems/klaarsium");
		public static final Tags.IOptionalNamedTag<Item> GEMS_SHARANIUM = createForgeTag("gems/sharanium");
		public static final Tags.IOptionalNamedTag<Item> GEMS_MAKERIUM = createForgeTag("gems/makerium");
		public static final Tags.IOptionalNamedTag<Item> GEMS_INDERIUM = createForgeTag("gems/inderium");
		public static final Tags.IOptionalNamedTag<Item> GEMS_PUMARIUM = createForgeTag("gems/pumarium");
		public static final Tags.IOptionalNamedTag<Item> GEMS_CALLAXIUM = createForgeTag("gems/callaxium");
		public static final Tags.IOptionalNamedTag<Item> GEMS_SKORPIUM = createForgeTag("gems/skorpium");
		public static final Tags.IOptionalNamedTag<Item> GEMS_STUPIDIUM = createForgeTag("gems/stupidium");
		public static final Tags.IOptionalNamedTag<Item> GEMS_GREMORIUM = createForgeTag("gems/gremorium");
		public static final Tags.IOptionalNamedTag<Item> GEMS_HIMEJIMARIUM = createForgeTag("gems/himejimarium");
		public static final Tags.IOptionalNamedTag<Item> GEMS_TOUJOURIUM = createForgeTag("gems/toujourium");
		public static final Tags.IOptionalNamedTag<Item> GEMS_ARGENTORIUM = createForgeTag("gems/argentorium");
		public static final Tags.IOptionalNamedTag<Item> GEMS_QUARTARIUM = createForgeTag("gems/quartarium");
		public static final Tags.IOptionalNamedTag<Item> GEMS_NAGATORIUM = createForgeTag("gems/nagatorium");
		public static final Tags.IOptionalNamedTag<Item> GEMS_SAKURAJIMARIUM = createForgeTag("gems/sakurajimarium");
		public static final Tags.IOptionalNamedTag<Item> GEMS_SALT = createForgeTag("gems/salt");
		
		public static final Tags.IOptionalNamedTag<Item> BASE_STARS = createForgeTag("base_stars");
		public static final Tags.IOptionalNamedTag<Item> OEDLDOEDL_STARS = createForgeTag("oedldoedl_stars");
		public static final Tags.IOptionalNamedTag<Item> INFINITY_STARS = createForgeTag("infinity_stars");
		
		public static final Tags.IOptionalNamedTag<Item> ELEMENTS_BASE = createForgeTag("elements/base");
		public static final Tags.IOptionalNamedTag<Item> ELEMENTS_OEDLDOEDL = createForgeTag("elements/oedldoedl");
		public static final Tags.IOptionalNamedTag<Item> ELEMENTS_TIMOFIUM = createForgeTag("elements/timofium");
		public static final Tags.IOptionalNamedTag<Item> ELEMENTS_FLOFINIUM = createForgeTag("elements/flofinium");
		public static final Tags.IOptionalNamedTag<Item> ELEMENTS_LAARSIUM = createForgeTag("elements/laarsium");
		public static final Tags.IOptionalNamedTag<Item> ELEMENTS_KLAARSIUM = createForgeTag("elements/klaarsium");
		public static final Tags.IOptionalNamedTag<Item> ELEMENTS_SHARANIUM = createForgeTag("elements/sharanium");
		public static final Tags.IOptionalNamedTag<Item> ELEMENTS_MAKERIUM = createForgeTag("elements/makerium");
		public static final Tags.IOptionalNamedTag<Item> ELEMENTS_INDERIUM = createForgeTag("elements/inderium");
		public static final Tags.IOptionalNamedTag<Item> ELEMENTS_PUMARIUM = createForgeTag("elements/pumarium");
		public static final Tags.IOptionalNamedTag<Item> ELEMENTS_CALLAXIUM = createForgeTag("elements/callaxium");
		public static final Tags.IOptionalNamedTag<Item> ELEMENTS_SKORPIUM = createForgeTag("elements/skorpium");
		public static final Tags.IOptionalNamedTag<Item> ELEMENTS_STUPIDIUM = createForgeTag("elements/stupidium");
		
		public static final Tags.IOptionalNamedTag<Item> DUSTS_BASE = createForgeTag("dusts/base");
		public static final Tags.IOptionalNamedTag<Item> DUSTS_OEDLDOEDL = createForgeTag("dusts/oedldoedl");
		public static final Tags.IOptionalNamedTag<Item> DUSTS_ENDER = createForgeTag("dusts/ender");
		public static final Tags.IOptionalNamedTag<Item> DUSTS_ENDERPEARL = createForgeTag("dusts/ender_pearl");
		public static final Tags.IOptionalNamedTag<Item> DUSTS_SALT = createForgeTag("dusts/salt");
		public static final Tags.IOptionalNamedTag<Item> SALT = createForgeTag("salt");
		
		public static final Tags.IOptionalNamedTag<Item> NUGGETS_DIAMOND = createForgeTag("nuggets/diamond");
		public static final Tags.IOptionalNamedTag<Item> NUGGETS_EMERALD = createForgeTag("nuggets/emerald");
		public static final Tags.IOptionalNamedTag<Item> NUGGETS_NETHERITE = createForgeTag("nuggets/netherite");
		public static final Tags.IOptionalNamedTag<Item> NUGGETS_BASE = createForgeTag("nuggets/base");
		public static final Tags.IOptionalNamedTag<Item> NUGGETS_OEDLDOEDL = createForgeTag("nuggets/oedldoedl");
		public static final Tags.IOptionalNamedTag<Item> NUGGETS_BEDROCKIUM = createForgeTag("nuggets/bedrockium");
		public static final Tags.IOptionalNamedTag<Item> NUGGETS_CLOUDIUM = createForgeTag("nuggets/cloudium");
		public static final Tags.IOptionalNamedTag<Item> NUGGETS_ELEVATIUM = createForgeTag("nuggets/elevatium");
		public static final Tags.IOptionalNamedTag<Item> NUGGETS_DRUNKIUM = createForgeTag("nuggets/drunkium");
		public static final Tags.IOptionalNamedTag<Item> NUGGETS_MONEY = createForgeTag("nuggets/money");
		public static final Tags.IOptionalNamedTag<Item> NUGGETS_CRYSTAL_MATRIX = createForgeTag("nuggets/crystal_matrix");
		public static final Tags.IOptionalNamedTag<Item> NUGGETS_NEUTRONIUM = createForgeTag("nuggets/neutronium");
		public static final Tags.IOptionalNamedTag<Item> NUGGETS_GREMORIUM = createForgeTag("nuggets/gremorium");
		public static final Tags.IOptionalNamedTag<Item> NUGGETS_HIMEJIMARIUM = createForgeTag("nuggets/himejimarium");
		public static final Tags.IOptionalNamedTag<Item> NUGGETS_TOUJOURIUM = createForgeTag("nuggets/toujourium");
		public static final Tags.IOptionalNamedTag<Item> NUGGETS_ARGENTORIUM = createForgeTag("nuggets/argentorium");
		public static final Tags.IOptionalNamedTag<Item> NUGGETS_QUARTARIUM = createForgeTag("nuggets/quartarium");
		public static final Tags.IOptionalNamedTag<Item> NUGGETS_NAGATORIUM = createForgeTag("nuggets/nagatorium");
		public static final Tags.IOptionalNamedTag<Item> NUGGETS_SAKURAJIMARIUM = createForgeTag("nuggets/sakurajimarium");
		
		public static final Tags.IOptionalNamedTag<Item> SHARDS_GREMORIUM = createForgeTag("shards/gremorium");
		public static final Tags.IOptionalNamedTag<Item> SHARDS_HIMEJIMARIUM = createForgeTag("shards/himejimarium");
		public static final Tags.IOptionalNamedTag<Item> SHARDS_TOUJOURIUM = createForgeTag("shards/toujourium");
		public static final Tags.IOptionalNamedTag<Item> SHARDS_ARGENTORIUM = createForgeTag("shards/argentorium");
		public static final Tags.IOptionalNamedTag<Item> SHARDS_QUARTARIUM = createForgeTag("shards/quartarium");
		public static final Tags.IOptionalNamedTag<Item> SHARDS_NAGATORIUM = createForgeTag("shards/nagatorium");
		public static final Tags.IOptionalNamedTag<Item> SHARDS_SAKURAJIMARIUM = createForgeTag("shards/sakurajimarium");
		public static final Tags.IOptionalNamedTag<Item> SHARDS_BASE_STARS = createForgeTag("shards/base_stars");
        public static final Tags.IOptionalNamedTag<Item> SHARDS_NETHER_STARS = createForgeTag("shards/nether_stars");
		public static final Tags.IOptionalNamedTag<Item> SHARDS_OEDLDOEDL_STARS = createForgeTag("shards/oedldoedl_stars");
		public static final Tags.IOptionalNamedTag<Item> SHARDS_INFINITY_STARS = createForgeTag("shards/infinity_stars");

		public static final Tags.IOptionalNamedTag<Item> FRAGMENTS_BASE = createForgeTag("fragments/base");
		public static final Tags.IOptionalNamedTag<Item> FRAGMENTS_OEDLDOEDL = createForgeTag("fragments/oedldoedl");
		public static final Tags.IOptionalNamedTag<Item> FRAGMENTS_TIMOFIUM = createForgeTag("fragments/timofium");
		public static final Tags.IOptionalNamedTag<Item> FRAGMENTS_FLOFINIUM = createForgeTag("fragments/flofinium");
		public static final Tags.IOptionalNamedTag<Item> FRAGMENTS_LAARSIUM = createForgeTag("fragments/laarsium");
		public static final Tags.IOptionalNamedTag<Item> FRAGMENTS_KLAARSIUM = createForgeTag("fragments/klaarsium");
		public static final Tags.IOptionalNamedTag<Item> FRAGMENTS_SHARANIUM = createForgeTag("fragments/sharanium");
		public static final Tags.IOptionalNamedTag<Item> FRAGMENTS_MAKERIUM = createForgeTag("fragments/makerium");
		public static final Tags.IOptionalNamedTag<Item> FRAGMENTS_INDERIUM = createForgeTag("fragments/inderium");
		public static final Tags.IOptionalNamedTag<Item> FRAGMENTS_PUMARIUM = createForgeTag("fragments/pumarium");
		public static final Tags.IOptionalNamedTag<Item> FRAGMENTS_CALLAXIUM = createForgeTag("fragments/callaxium");
		public static final Tags.IOptionalNamedTag<Item> FRAGMENTS_SKORPIUM = createForgeTag("fragments/skorpium");
		public static final Tags.IOptionalNamedTag<Item> FRAGMENTS_STUPIDIUM = createForgeTag("fragments/stupidium");
		
		public static final Tags.IOptionalNamedTag<Item> SINGULARITIES_BASE = createForgeTag("singularities/base");
		public static final Tags.IOptionalNamedTag<Item> SINGULARITIES_OEDLDOEDL = createForgeTag("singularities/oedldoedl");
		public static final Tags.IOptionalNamedTag<Item> SINGULARITIES_GREMORIUM = createForgeTag("singularities/gremorium");
		public static final Tags.IOptionalNamedTag<Item> SINGULARITIES_HIMEJIMARIUM = createForgeTag("singularities/himejimarium");
		public static final Tags.IOptionalNamedTag<Item> SINGULARITIES_TOUJOURIUM = createForgeTag("singularities/toujourium");
		public static final Tags.IOptionalNamedTag<Item> SINGULARITIES_ARGENTORIUM = createForgeTag("singularities/argentorium");
		public static final Tags.IOptionalNamedTag<Item> SINGULARITIES_QUARTARIUM = createForgeTag("singularities/quartarium");
		public static final Tags.IOptionalNamedTag<Item> SINGULARITIES_NAGATORIUM = createForgeTag("singularities/nagatorium");
		public static final Tags.IOptionalNamedTag<Item> SINGULARITIES_SAKURAJIMARIUM = createForgeTag("singularities/sakurajimarium");
		
		public static final Tags.IOptionalNamedTag<Item> OEDLDOEDL_CATALYSTS = createForgeTag("oedldoedl_catalysts");
		public static final Tags.IOptionalNamedTag<Item> INFINITY_CATALYSTS = createForgeTag("infinity_catalysts");
		public static final Tags.IOptionalNamedTag<Item> CHAOS_CATALYSTS = createForgeTag("chaos_catalysts");
		
		public static final Tags.IOptionalNamedTag<Item> BALANCED_CLAYBALLS = createForgeTag("balanced_clayballs");
	}
}