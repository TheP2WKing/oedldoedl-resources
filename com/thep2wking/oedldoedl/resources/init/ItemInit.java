package com.thep2wking.oedldoedl.resources.init;

import java.util.ArrayList;
import java.util.List;

import com.thep2wking.oedldoedl.resources.items.dusts.ItemDustBase;
import com.thep2wking.oedldoedl.resources.items.dusts.ItemOedldoedlDust;
import com.thep2wking.oedldoedl.resources.items.dusts.ItemSaltDust;
import com.thep2wking.oedldoedl.resources.items.gems.ItemArgentoriumGem;
import com.thep2wking.oedldoedl.resources.items.gems.ItemCallaxiumGem;
import com.thep2wking.oedldoedl.resources.items.gems.ItemFlofiniumGem;
import com.thep2wking.oedldoedl.resources.items.gems.ItemGemBase;
import com.thep2wking.oedldoedl.resources.items.gems.ItemGremoriumGem;
import com.thep2wking.oedldoedl.resources.items.gems.ItemHimejimariumGem;
import com.thep2wking.oedldoedl.resources.items.gems.ItemInderiumGem;
import com.thep2wking.oedldoedl.resources.items.gems.ItemKlaarsiumGem;
import com.thep2wking.oedldoedl.resources.items.gems.ItemLaarsiumGem;
import com.thep2wking.oedldoedl.resources.items.gems.ItemMakeriumGem;
import com.thep2wking.oedldoedl.resources.items.gems.ItemOedldoedlGem;
import com.thep2wking.oedldoedl.resources.items.gems.ItemPumariumGem;
import com.thep2wking.oedldoedl.resources.items.gems.ItemQuartariumGem;
import com.thep2wking.oedldoedl.resources.items.gems.ItemSharaniumGem;
import com.thep2wking.oedldoedl.resources.items.gems.ItemSkorpiumGem;
import com.thep2wking.oedldoedl.resources.items.gems.ItemStupidiumGem;
import com.thep2wking.oedldoedl.resources.items.gems.ItemTimofiumGem;
import com.thep2wking.oedldoedl.resources.items.gems.ItemToujouriumGem;
import com.thep2wking.oedldoedl.resources.items.ingots.ItemArgentoriumIngot;
import com.thep2wking.oedldoedl.resources.items.ingots.ItemBedrockiumIngot;
import com.thep2wking.oedldoedl.resources.items.ingots.ItemChaosIngot;
import com.thep2wking.oedldoedl.resources.items.ingots.ItemDrunkiumIngot;
import com.thep2wking.oedldoedl.resources.items.ingots.ItemGremoriumIngot;
import com.thep2wking.oedldoedl.resources.items.ingots.ItemHimejimariumIngot;
import com.thep2wking.oedldoedl.resources.items.ingots.ItemIngotBase;
import com.thep2wking.oedldoedl.resources.items.ingots.ItemOedldoedlIngot;
import com.thep2wking.oedldoedl.resources.items.ingots.ItemQuartariumIngot;
import com.thep2wking.oedldoedl.resources.items.ingots.ItemSadistiumIngot;
import com.thep2wking.oedldoedl.resources.items.ingots.ItemToujouriumIngot;
import com.thep2wking.oedldoedl.resources.items.ingots.ItemUselessiumIngot;
import com.thep2wking.oedldoedl.resources.items.nuggets.ItemArgentoriumNugget;
import com.thep2wking.oedldoedl.resources.items.nuggets.ItemBedrockiumNugget;
import com.thep2wking.oedldoedl.resources.items.nuggets.ItemDrunkiumNugget;
import com.thep2wking.oedldoedl.resources.items.nuggets.ItemGremoriumNugget;
import com.thep2wking.oedldoedl.resources.items.nuggets.ItemHimejimariumNugget;
import com.thep2wking.oedldoedl.resources.items.nuggets.ItemNuggetBase;
import com.thep2wking.oedldoedl.resources.items.nuggets.ItemOedldoedlNugget;
import com.thep2wking.oedldoedl.resources.items.nuggets.ItemQuartariumNugget;
import com.thep2wking.oedldoedl.resources.items.nuggets.ItemSadistiumNugget;
import com.thep2wking.oedldoedl.resources.items.nuggets.ItemToujouriumNugget;
import com.thep2wking.oedldoedl.resources.items.nuggets.ItemUselessiumNugget;
import com.thep2wking.oedldoedl.resources.items.shards.ItemInfinityShard;
import com.thep2wking.oedldoedl.resources.items.shards.ItemOedldoedlShard;
import com.thep2wking.oedldoedl.resources.items.shards.ItemShardBase;
import com.thep2wking.oedldoedl.resources.items.singularities.ItemArgentoriumSingularity;
import com.thep2wking.oedldoedl.resources.items.singularities.ItemGremoriumSingularity;
import com.thep2wking.oedldoedl.resources.items.singularities.ItemHimejimariumSingularity;
import com.thep2wking.oedldoedl.resources.items.singularities.ItemOedldoedlSingularity;
import com.thep2wking.oedldoedl.resources.items.singularities.ItemQuartariumSingularity;
import com.thep2wking.oedldoedl.resources.items.singularities.ItemSingularityBase;
import com.thep2wking.oedldoedl.resources.items.singularities.ItemToujouriumSingularity;
import com.thep2wking.oedldoedl.resources.items.stars.ItemInfinityStar;
import com.thep2wking.oedldoedl.resources.items.stars.ItemOedldoedlStar;
import com.thep2wking.oedldoedl.resources.items.stars.ItemStarBase;

import net.minecraft.item.Item;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final ItemStarBase ITEM_STAR_BASE = new ItemStarBase("star_base");
	public static final ItemOedldoedlStar ITEM_OEDLDOEDL_STAR = new ItemOedldoedlStar("oedldoedl_star");
	public static final ItemInfinityStar ITEM_INFINITY_STAR = new ItemInfinityStar("infinity_star");
	
	public static final ItemIngotBase ITEM_INGOT_BASE = new ItemIngotBase("ingot_base");
	public static final ItemOedldoedlIngot ITEM_OEDLDOEDL_INGOT = new ItemOedldoedlIngot("oedldoedl_ingot");
	public static final ItemBedrockiumIngot ITEM_BEDROCKIUM_INGOT = new ItemBedrockiumIngot("bedrockium_ingot");
	public static final ItemDrunkiumIngot ITEM_DRUNKIUM_INGOT = new ItemDrunkiumIngot("drunkium_ingot");
	public static final ItemSadistiumIngot ITEM_SADISTIUM_INGOT = new ItemSadistiumIngot("sadistium_ingot");
	public static final ItemUselessiumIngot ITEM_USELESSIUM_INGOT = new ItemUselessiumIngot("uselessium_ingot");
	public static final ItemGremoriumIngot ITEM_GREMORIUM_INGOT = new ItemGremoriumIngot("gremorium_ingot");
	public static final ItemHimejimariumIngot ITEM_HIMEJIMARIUM_INGOT = new ItemHimejimariumIngot("himejimarium_ingot");
	public static final ItemToujouriumIngot ITEM_TOUJOURIUM_INGOT = new ItemToujouriumIngot("toujourium_ingot");
	public static final ItemArgentoriumIngot ITEM_ARGENTORIUM_INGOT = new ItemArgentoriumIngot("argentorium_ingot");
	public static final ItemQuartariumIngot ITEM_QUARTARIUM_INGOT = new ItemQuartariumIngot("quartarium_ingot");
	public static final ItemChaosIngot ITEM_CHAOS_INGOT = new ItemChaosIngot("chaos_ingot");
	
	public static final ItemGemBase ITEM_GEM_BASE = new ItemGemBase("gem_base");
	public static final ItemOedldoedlGem ITEM_OEDLDOEDL_GEM = new ItemOedldoedlGem("oedldoedl_gem");
	public static final ItemTimofiumGem ITEM_TIMOFIUM_GEM = new ItemTimofiumGem("timofium_gem");
	public static final ItemFlofiniumGem ITEM_FLOFINIUM_GEM = new ItemFlofiniumGem("flofinium_gem");
	public static final ItemLaarsiumGem ITEM_LAARSIUM_GEM = new ItemLaarsiumGem("laarsium_gem");
	public static final ItemKlaarsiumGem ITEM_KLAARSIUM_GEM = new ItemKlaarsiumGem("klaarsium_gem");
	public static final ItemSharaniumGem ITEM_SHARANIUM_GEM = new ItemSharaniumGem("sharanium_gem");
	public static final ItemMakeriumGem ITEM_MAKERIUM_GEM = new ItemMakeriumGem("makerium_gem");
	public static final ItemInderiumGem ITEM_INDERIUM_GEM = new ItemInderiumGem("inderium_gem");
	public static final ItemPumariumGem ITEM_PUMARIUM_GEM = new ItemPumariumGem("pumarium_gem");
	public static final ItemCallaxiumGem ITEM_CALLAXIUM_GEM = new ItemCallaxiumGem("callaxium_gem");
	public static final ItemSkorpiumGem ITEM_SKORPIUM_GEM = new ItemSkorpiumGem("skorpium_gem");
	public static final ItemStupidiumGem ITEM_STUPIDIUM_GEM = new ItemStupidiumGem("stupidium_gem");
	public static final ItemGremoriumGem ITEM_GREMORIUM_GEM = new ItemGremoriumGem("gremorium_gem");
	public static final ItemHimejimariumGem ITEM_HIMEJIMARIUM_GEM = new ItemHimejimariumGem("himejimarium_gem");
	public static final ItemToujouriumGem ITEM_TOUJOURIUM_GEM = new ItemToujouriumGem("toujourium_gem");
	public static final ItemArgentoriumGem ITEM_ARGENTORIUM_GEM = new ItemArgentoriumGem("argentorium_gem");
	public static final ItemQuartariumGem ITEM_QUARTARIUM_GEM = new ItemQuartariumGem("quartarium_gem");

	public static final ItemShardBase ITEM_SHARD_BASE = new ItemShardBase("shard_base");
	public static final ItemOedldoedlShard ITEM_OEDLDOEDL_SHARD = new ItemOedldoedlShard("oedldoedl_shard");
	public static final ItemInfinityShard ITEM_INFINITY_SHARD = new ItemInfinityShard("infinity_shard");
	
	public static final ItemNuggetBase ITEM_NUGGET_BASE = new ItemNuggetBase("nugget_base");
	public static final ItemOedldoedlNugget ITEM_OEDLDOEDL_NUGGET = new ItemOedldoedlNugget("oedldoedl_nugget");
	public static final ItemBedrockiumNugget ITEM_BEDROCKIUM_NUGGET = new ItemBedrockiumNugget("bedrockium_nugget");
	public static final ItemDrunkiumNugget ITEM_DRUNKIUM_NUGGET = new ItemDrunkiumNugget("drunkium_nugget");
	public static final ItemSadistiumNugget ITEM_SADISTIUM_NUGGET = new ItemSadistiumNugget("sadistium_nugget");
	public static final ItemUselessiumNugget ITEM_USELESSIUM_NUGGET = new ItemUselessiumNugget("uselessium_nugget");
	public static final ItemGremoriumNugget ITEM_GREMORIUM_NUGGET = new ItemGremoriumNugget("gremorium_nugget");
	public static final ItemHimejimariumNugget ITEM_HIMEJIMARIUM_NUGGET = new ItemHimejimariumNugget("himejimarium_nugget");
	public static final ItemToujouriumNugget ITEM_TOUJOURIUM_NUGGET = new ItemToujouriumNugget("toujourium_nugget");
	public static final ItemArgentoriumNugget ITEM_ARGENTORIUM_NUGGET = new ItemArgentoriumNugget("argentorium_nugget");
	public static final ItemQuartariumNugget ITEM_QUARTARIUM_NUGGET = new ItemQuartariumNugget("quartarium_nugget");
	
	public static final ItemDustBase ITEM_DUST_BASE = new ItemDustBase("dust_base");
	public static final ItemOedldoedlDust ITEM_OEDLDOEDL_DUST = new ItemOedldoedlDust("oedldoedl_dust");
	public static final ItemSaltDust ITEM_SALT_DUST = new ItemSaltDust("salt_dust");
	
	public static final ItemSingularityBase ITEM_SINGULARITY_BASE = new ItemSingularityBase("singularity_base");
	public static final ItemOedldoedlSingularity ITEM_OEDLDOEDL_SINGULARITY = new ItemOedldoedlSingularity("oedldoedl_singularity");
	public static final ItemGremoriumSingularity ITEM_GREMORIUM_SINGULARITY = new ItemGremoriumSingularity("gremorium_singularity");
	public static final ItemHimejimariumSingularity ITEM_HIMEJIMARIUM_SINGULARITY = new ItemHimejimariumSingularity("himejimarium_singularity");
	public static final ItemToujouriumSingularity ITEM_TOUJOURIUM_SINGULARITY = new ItemToujouriumSingularity("toujourium_singularity");
	public static final ItemArgentoriumSingularity ITEM_ARGENTORIUM_SINGULARITY = new ItemArgentoriumSingularity("argentorium_singularity");
	public static final ItemQuartariumSingularity ITEM_QUARTARIUM_SINGULARITY = new ItemQuartariumSingularity("quartarium_singularity");
}