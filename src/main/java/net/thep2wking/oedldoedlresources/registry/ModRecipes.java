package net.thep2wking.oedldoedlresources.registry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.ModRecipeHelper;
import net.thep2wking.oedldoedlresources.OedldoedlResources;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;
import net.thep2wking.oedldoedlresources.init.ModBlocks;
import net.thep2wking.oedldoedlresources.init.ModItems;
import net.thep2wking.oedldoedlresources.util.ModResourceRecipeHelper;

public class ModRecipes {
	public static void registerOreDict() {
		ModLogger.registeredOreDictLogger(OedldoedlResources.MODID);

		if (ResourcesConfig.RECIPES.DEFAULT_OREDICT) {
			ModRecipeHelper.addOreDict("oreBase", ModBlocks.BASE_ORE, 0);
			ModRecipeHelper.addOreDict("oreOedldoedl", ModBlocks.OEDLDOEDL_ORE, 0);
			ModRecipeHelper.addOreDict("oreRandomite", ModBlocks.RANDOMITE_ORE, 0);
			ModRecipeHelper.addOreDict("oreEnder", ModBlocks.ENDER_ORE, 0);
			ModRecipeHelper.addOreDict("oreEnderPearl", ModBlocks.ENDER_ORE, 0);
			ModRecipeHelper.addOreDict("oreGunpowder", ModBlocks.GUNPOWDER_ORE, 0);
			ModRecipeHelper.addOreDict("oreSalt", ModBlocks.SALT_ORE, 0);

			ModRecipeHelper.addOreDict("oreGremoriumShard", ModBlocks.NETHER_GREMORIUM_ORE, 0);
			ModRecipeHelper.addOreDict("oreHimejimariumShard", ModBlocks.NETHER_HIMEJIMARIUM_ORE, 0);
			ModRecipeHelper.addOreDict("oreToujouriumShard", ModBlocks.NETHER_TOUJOURIUM_ORE, 0);
			ModRecipeHelper.addOreDict("oreArgentoriumShard", ModBlocks.NETHER_ARGENTORIUM_ORE, 0);
			ModRecipeHelper.addOreDict("oreQuartariumShard", ModBlocks.NETHER_QUARTARIUM_ORE, 0);
			ModRecipeHelper.addOreDict("oreNagatoriumShard", ModBlocks.NETHER_NAGATORIUM_ORE, 0);
			ModRecipeHelper.addOreDict("oreSakurajimariumShard", ModBlocks.NETHER_SAKURAJIMARIUM_ORE, 0);

			ModRecipeHelper.addOreDict("oreElementOD", ModBlocks.END_ELEMENT_OD, 0);

			ModRecipeHelper.addOreDict("blockBase", ModBlocks.BASE, 0);
			ModRecipeHelper.addOreDict("blockOedldoedl", ModBlocks.OEDLDOEDL, 0);
			ModRecipeHelper.addOreDict("blockBedrockium", ModBlocks.BEDROCKIUM, 0);
			ModRecipeHelper.addOreDict("blockCloudium", ModBlocks.CLOUDIUM, 0);
			ModRecipeHelper.addOreDict("blockElevatium", ModBlocks.ELEVATIUM, 0);
			ModRecipeHelper.addOreDict("blockSadistium", ModBlocks.SADISTIUM, 0);
			ModRecipeHelper.addOreDict("blockDrunkium", ModBlocks.DRUNKIUM, 0);
			ModRecipeHelper.addOreDict("blockMoney", ModBlocks.MONEY, 0);

			ModRecipeHelper.addOreDict("blockGremorium", ModBlocks.GREMORIUM, 0);
			ModRecipeHelper.addOreDict("blockHimejimarium", ModBlocks.HIMEJIMARIUM, 0);
			ModRecipeHelper.addOreDict("blockToujourium", ModBlocks.TOUJOURIUM, 0);
			ModRecipeHelper.addOreDict("blockArgentorium", ModBlocks.ARGENTORIUM, 0);
			ModRecipeHelper.addOreDict("blockQuartarium", ModBlocks.QUARTARIUM, 0);
			ModRecipeHelper.addOreDict("blockNagatorium", ModBlocks.NAGATORIUM, 0);
			ModRecipeHelper.addOreDict("blockSakurajimarium", ModBlocks.SAKURAJIMARIUM, 0);

			ModRecipeHelper.addOreDict("blockBaseGem", ModBlocks.BASE_GEM, 0);
			ModRecipeHelper.addOreDict("blockOedldoedlGem", ModBlocks.OEDLDOEDL_GEM, 0);
			ModRecipeHelper.addOreDict("blockTimofiumGem", ModBlocks.TIMOFIUM_GEM, 0);
			ModRecipeHelper.addOreDict("blockFlofiniumGem", ModBlocks.FLOFINIUM_GEM, 0);
			ModRecipeHelper.addOreDict("blockLaarsiumGem", ModBlocks.LAARSIUM_GEM, 0);
			ModRecipeHelper.addOreDict("blockKlaarsiumGem", ModBlocks.KLAARSIUM_GEM, 0);
			ModRecipeHelper.addOreDict("blockSharaniumGem", ModBlocks.SHARANIUM_GEM, 0);
			ModRecipeHelper.addOreDict("blockMakeriumGem", ModBlocks.MAKERIUM_GEM, 0);
			ModRecipeHelper.addOreDict("blockInderiumGem", ModBlocks.INDERIUM_GEM, 0);
			ModRecipeHelper.addOreDict("blockPumariumGem", ModBlocks.PUMARIUM_GEM, 0);
			ModRecipeHelper.addOreDict("blockCallaxiumGem", ModBlocks.CALLAXIUM_GEM, 0);
			ModRecipeHelper.addOreDict("blockSkorpiumGem", ModBlocks.SKORPIUM_GEM, 0);
			ModRecipeHelper.addOreDict("blockStupidiumGem", ModBlocks.STUPIDIUM_GEM, 0);

			ModRecipeHelper.addOreDict("blockGremoriumGem", ModBlocks.GREMORIUM_GEM, 0);
			ModRecipeHelper.addOreDict("blockHimejimariumGem", ModBlocks.HIMEJIMARIUM_GEM, 0);
			ModRecipeHelper.addOreDict("blockToujouriumGem", ModBlocks.TOUJOURIUM_GEM, 0);
			ModRecipeHelper.addOreDict("blockArgentoriumGem", ModBlocks.ARGENTORIUM_GEM, 0);
			ModRecipeHelper.addOreDict("blockQuartariumGem", ModBlocks.QUARTARIUM_GEM, 0);
			ModRecipeHelper.addOreDict("blockNagatoriumGem", ModBlocks.NAGATORIUM_GEM, 0);
			ModRecipeHelper.addOreDict("blockSakurajimariumGem", ModBlocks.SAKURAJIMARIUM_GEM, 0);

			ModRecipeHelper.addOreDict("blockBaseStar", ModBlocks.BASE_STAR, 0);
			ModRecipeHelper.addOreDict("blockNetherStar", ModBlocks.NETHER_STAR, 0);
			ModRecipeHelper.addOreDict("blockOedldoedlStar", ModBlocks.OEDLDOEDL_STAR, 0);
			ModRecipeHelper.addOreDict("blockInfinityStar", ModBlocks.INFINITY_STAR, 0);

			ModRecipeHelper.addOreDict("balancedClay", ModBlocks.BALANCED_CLAY, 0);
			ModRecipeHelper.addOreDict("chaosPlank", ModBlocks.CHAOS_PLANK, 0);

			ModRecipeHelper.addOreDict("ingotBase", ModItems.BASE_INGOT, 0);
			ModRecipeHelper.addOreDict("ingotOedldoedl", ModItems.OEDLDOEDL_INGOT, 0);
			ModRecipeHelper.addOreDict("ingotBedrockium", ModItems.BEDROCKIUM_INGOT, 0);
			ModRecipeHelper.addOreDict("ingotCloudium", ModItems.CLOUDIUM_INGOT, 0);
			ModRecipeHelper.addOreDict("ingotElevatium", ModItems.ELEVATIUM_INGOT, 0);
			ModRecipeHelper.addOreDict("ingotSadistium", ModItems.SADISTIUM_INGOT, 0);
			ModRecipeHelper.addOreDict("ingotDrunkium", ModItems.DRUNKIUM_INGOT, 0);
			ModRecipeHelper.addOreDict("ingotMoney", ModItems.MONEY_INGOT, 0);

			ModRecipeHelper.addOreDict("ingotGremorium", ModItems.GREMORIUM_INGOT, 0);
			ModRecipeHelper.addOreDict("ingotHimejimarium", ModItems.HIMEJIMARIUM_INGOT, 0);
			ModRecipeHelper.addOreDict("ingotToujourium", ModItems.TOUJOURIUM_INGOT, 0);
			ModRecipeHelper.addOreDict("ingotArgentorium", ModItems.ARGENTORIUM_INGOT, 0);
			ModRecipeHelper.addOreDict("ingotQuartarium", ModItems.QUARTARIUM_INGOT, 0);
			ModRecipeHelper.addOreDict("ingotNagatorium", ModItems.NAGATORIUM_INGOT, 0);
			ModRecipeHelper.addOreDict("ingotSakurajimarium", ModItems.SAKURAJIMARIUM_INGOT, 0);

			ModRecipeHelper.addOreDict("gemBase", ModItems.BASE_GEM, 0);
			ModRecipeHelper.addOreDict("gemOedldoedl", ModItems.OEDLDOEDL_GEM, 0);
			ModRecipeHelper.addOreDict("gemTimofium", ModItems.TIMOFIUM_GEM, 0);
			ModRecipeHelper.addOreDict("gemFlofinium", ModItems.FLOFINIUM_GEM, 0);
			ModRecipeHelper.addOreDict("gemLaarsium", ModItems.LAARSIUM_GEM, 0);
			ModRecipeHelper.addOreDict("gemKlaarsium", ModItems.KLAARSIUM_GEM, 0);
			ModRecipeHelper.addOreDict("gemSharanium", ModItems.SHARANIUM_GEM, 0);
			ModRecipeHelper.addOreDict("gemMakerium", ModItems.MAKERIUM_GEM, 0);
			ModRecipeHelper.addOreDict("gemInderium", ModItems.INDERIUM_GEM, 0);
			ModRecipeHelper.addOreDict("gemPumarium", ModItems.PUMARIUM_GEM, 0);
			ModRecipeHelper.addOreDict("gemCallaxium", ModItems.CALLAXIUM_GEM, 0);
			ModRecipeHelper.addOreDict("gemSkorpium", ModItems.SKORPIUM_GEM, 0);
			ModRecipeHelper.addOreDict("gemStupidium", ModItems.STUPIDIUM_GEM, 0);

			ModRecipeHelper.addOreDict("gemGremorium", ModItems.GREMORIUM_GEM, 0);
			ModRecipeHelper.addOreDict("gemHimejimarium", ModItems.HIMEJIMARIUM_GEM, 0);
			ModRecipeHelper.addOreDict("gemToujourium", ModItems.TOUJOURIUM_GEM, 0);
			ModRecipeHelper.addOreDict("gemArgentorium", ModItems.ARGENTORIUM_GEM, 0);
			ModRecipeHelper.addOreDict("gemQuartarium", ModItems.QUARTARIUM_GEM, 0);
			ModRecipeHelper.addOreDict("gemNagatorium", ModItems.NAGATORIUM_GEM, 0);
			ModRecipeHelper.addOreDict("gemSakurajimarium", ModItems.SAKURAJIMARIUM_GEM, 0);

			ModRecipeHelper.addOreDict("baseStar", ModItems.BASE_STAR, 0);
			ModRecipeHelper.addOreDict("oedldoedlStar", ModItems.OEDLDOEDL_STAR, 0);
			ModRecipeHelper.addOreDict("infinityStar", ModItems.INFINITY_STAR, 0);

			ModRecipeHelper.addOreDict("elementBase", ModItems.BASE_ELEMENT, 0);
			ModRecipeHelper.addOreDict("elementOedldoedl", ModItems.OEDLDOEDL_ELEMENT, 0);
			ModRecipeHelper.addOreDict("elementTimofium", ModItems.TIMOFIUM_ELEMENT, 0);
			ModRecipeHelper.addOreDict("elementFlofinium", ModItems.FLOFINIUM_ELEMENT, 0);
			ModRecipeHelper.addOreDict("elementLaarsium", ModItems.LAARSIUM_ELEMENT, 0);
			ModRecipeHelper.addOreDict("elementKlaarsium", ModItems.KLAARSIUM_ELEMENT, 0);
			ModRecipeHelper.addOreDict("elementSharanium", ModItems.SHARANIUM_ELEMENT, 0);
			ModRecipeHelper.addOreDict("elementMakerium", ModItems.MAKERIUM_ELEMENT, 0);
			ModRecipeHelper.addOreDict("elementInderium", ModItems.INDERIUM_ELEMENT, 0);
			ModRecipeHelper.addOreDict("elementPumarium", ModItems.PUMARIUM_ELEMENT, 0);
			ModRecipeHelper.addOreDict("elementCallaxium", ModItems.CALLAXIUM_ELEMENT, 0);
			ModRecipeHelper.addOreDict("elementSkorpium", ModItems.SKORPIUM_ELEMENT, 0);
			ModRecipeHelper.addOreDict("elementStupidium", ModItems.STUPIDIUM_ELEMENT, 0);

			ModRecipeHelper.addOreDict("dustBase", ModItems.BASE_DUST, 0);
			ModRecipeHelper.addOreDict("dustOedldoedl", ModItems.OEDLDOEDL_DUST, 0);
			ModRecipeHelper.addOreDict("dustEnder", ModItems.ENDER_DUST, 0);
			ModRecipeHelper.addOreDict("dustEnderPearl", ModItems.ENDER_DUST, 0);
			ModRecipeHelper.addOreDict("dustSalt", ModItems.SALT_DUST, 0);

			ModRecipeHelper.addOreDict("nuggetCoal", ModItems.COAL_NUGGET, 0);
			ModRecipeHelper.addOreDict("nuggetCharcoal", ModItems.CHARCOAL_NUGGET, 0);
			ModRecipeHelper.addOreDict("nuggetDiamond", ModItems.DIAMOND_NUGGET, 0);
			ModRecipeHelper.addOreDict("nuggetLapis", ModItems.LAPIS_NUGGET, 0);
			ModRecipeHelper.addOreDict("nuggetEmerald", ModItems.EMERALD_NUGGET, 0);
			ModRecipeHelper.addOreDict("nuggetQuartz", ModItems.QUARTZ_NUGGET, 0);
			ModRecipeHelper.addOreDict("nuggetEnder", ModItems.ENDER_NUGGET, 0);
			ModRecipeHelper.addOreDict("nuggetEnderPearl", ModItems.ENDER_NUGGET, 0);
			ModRecipeHelper.addOreDict("nuggetBase", ModItems.BASE_NUGGET, 0);
			ModRecipeHelper.addOreDict("nuggetOedldoedl", ModItems.OEDLDOEDL_NUGGET, 0);
			ModRecipeHelper.addOreDict("nuggetBedrockium", ModItems.BEDROCKIUM_NUGGET, 0);
			ModRecipeHelper.addOreDict("nuggetCloudium", ModItems.CLOUDIUM_NUGGET, 0);
			ModRecipeHelper.addOreDict("nuggetElevatium", ModItems.ELEVATIUM_NUGGET, 0);
			ModRecipeHelper.addOreDict("nuggetSadistium", ModItems.SADISTIUM_NUGGET, 0);
			ModRecipeHelper.addOreDict("nuggetDrunkium", ModItems.DRUNKIUM_NUGGET, 0);
			ModRecipeHelper.addOreDict("nuggetMoney", ModItems.MONEY_NUGGET, 0);

			ModRecipeHelper.addOreDict("nuggetGremorium", ModItems.GREMORIUM_NUGGET, 0);
			ModRecipeHelper.addOreDict("nuggetHimejimarium", ModItems.HIMEJIMARIUM_NUGGET, 0);
			ModRecipeHelper.addOreDict("nuggetToujourium", ModItems.TOUJOURIUM_NUGGET, 0);
			ModRecipeHelper.addOreDict("nuggetArgentorium", ModItems.ARGENTORIUM_NUGGET, 0);
			ModRecipeHelper.addOreDict("nuggetQuartarium", ModItems.QUARTARIUM_NUGGET, 0);
			ModRecipeHelper.addOreDict("nuggetNagatorium", ModItems.NAGATORIUM_NUGGET, 0);
			ModRecipeHelper.addOreDict("nuggetSakurajimarium", ModItems.SAKURAJIMARIUM_NUGGET, 0);

			ModRecipeHelper.addOreDict("shardGremorium", ModItems.GREMORIUM_SHARD, 0);
			ModRecipeHelper.addOreDict("shardHimejimarium", ModItems.HIMEJIMARIUM_SHARD, 0);
			ModRecipeHelper.addOreDict("shardToujourium", ModItems.TOUJOURIUM_SHARD, 0);
			ModRecipeHelper.addOreDict("shardArgentorium", ModItems.ARGENTORIUM_SHARD, 0);
			ModRecipeHelper.addOreDict("shardQuartarium", ModItems.QUARTARIUM_SHARD, 0);
			ModRecipeHelper.addOreDict("shardNagatorium", ModItems.NAGATORIUM_SHARD, 0);
			ModRecipeHelper.addOreDict("shardSakurajimarium", ModItems.SAKURAJIMARIUM_SHARD, 0);

			ModRecipeHelper.addOreDict("shardBaseStar", ModItems.BASE_STAR_SHARD, 0);
			ModRecipeHelper.addOreDict("shardNetherStar", ModItems.NETHER_STAR_SHARD, 0);
			ModRecipeHelper.addOreDict("shardOedldoedlStar", ModItems.OEDLDOEDL_STAR_SHARD, 0);
			ModRecipeHelper.addOreDict("shardInfinityStar", ModItems.INFINITY_STAR_SHARD, 0);

			ModRecipeHelper.addOreDict("fragmentBase", ModItems.BASE_FRAGMENT, 0);
			ModRecipeHelper.addOreDict("fragmentOedldoedl", ModItems.OEDLDOEDL_FRAGMENT, 0);
			ModRecipeHelper.addOreDict("fragmentTimofium", ModItems.TIMOFIUM_FRAGMENT, 0);
			ModRecipeHelper.addOreDict("fragmentFlofinium", ModItems.FLOFINIUM_FRAGMENT, 0);
			ModRecipeHelper.addOreDict("fragmentLaarsium", ModItems.LAARSIUM_FRAGMENT, 0);
			ModRecipeHelper.addOreDict("fragmentKlaarsium", ModItems.KLAARSIUM_FRAGMENT, 0);
			ModRecipeHelper.addOreDict("fragmentSharanium", ModItems.SHARANIUM_FRAGMENT, 0);
			ModRecipeHelper.addOreDict("fragmentMakerium", ModItems.MAKERIUM_FRAGMENT, 0);
			ModRecipeHelper.addOreDict("fragmentInderium", ModItems.INDERIUM_FRAGMENT, 0);
			ModRecipeHelper.addOreDict("fragmentPumarium", ModItems.PUMARIUM_FRAGMENT, 0);
			ModRecipeHelper.addOreDict("fragmentCallaxium", ModItems.CALLAXIUM_FRAGMENT, 0);
			ModRecipeHelper.addOreDict("fragmentSkorpium", ModItems.SKORPIUM_FRAGMENT, 0);
			ModRecipeHelper.addOreDict("fragmentStupidium", ModItems.STUPIDIUM_FRAGMENT, 0);

			ModRecipeHelper.addOreDict("singularityBase", ModItems.BASE_SINGULARITY, 0);
			ModRecipeHelper.addOreDict("singularityOedldoedl", ModItems.OEDLDOEDL_SINGULARITY, 0);
			ModRecipeHelper.addOreDict("singularityGremorium", ModItems.GREMORIUM_SINGULARITY, 0);
			ModRecipeHelper.addOreDict("singularityHimejimarium", ModItems.HIMEJIMARIUM_SINGULARITY, 0);
			ModRecipeHelper.addOreDict("singularityToujourium", ModItems.TOUJOURIUM_SINGULARITY, 0);
			ModRecipeHelper.addOreDict("singularityArgentorium", ModItems.ARGENTORIUM_SINGULARITY, 0);
			ModRecipeHelper.addOreDict("singularityQuartarium", ModItems.QUARTARIUM_SINGULARITY, 0);
			ModRecipeHelper.addOreDict("singularityNagatorium", ModItems.NAGATORIUM_SINGULARITY, 0);
			ModRecipeHelper.addOreDict("singularitySakurajimarium", ModItems.SAKURAJIMARIUM_SINGULARITY, 0);

			ModRecipeHelper.addOreDict("catalystOedldoedl", ModItems.OEDLDOEDL_CATALYST, 0);
			ModRecipeHelper.addOreDict("catalystChaos", ModItems.CHAOS_CATALYST, 0);

			ModRecipeHelper.addOreDict("balancedClayball", ModItems.BALANCED_CLAY_BALL, 0);
		}

		if (ResourcesConfig.CONTENT.RANDOMITE_RANDOM_DROPS) {
			ModRecipeHelper.addOreDict("randomiteDrop", Items.COAL, 0);
			ModRecipeHelper.addOreDict("randomiteDrop", Items.DYE, 4);
			ModRecipeHelper.addOreDict("randomiteDrop", Items.REDSTONE, 0);
			ModRecipeHelper.addOreDict("randomiteDrop", Items.QUARTZ, 0);
			ModRecipeHelper.addOreDict("randomiteDrop", Items.DIAMOND, 0);
			ModRecipeHelper.addOreDict("randomiteDrop", Items.EMERALD, 0);
			ModRecipeHelper.addOreDict("randomiteDrop", Blocks.IRON_ORE, 0);
			ModRecipeHelper.addOreDict("randomiteDrop", Blocks.GOLD_ORE, 0);
			ModRecipeHelper.addOreDict("randomiteDrop", Items.EGG, 0);
			ModRecipeHelper.addOreDict("randomiteDrop", Items.SLIME_BALL, 0);
			ModRecipeHelper.addOreDict("randomiteDrop", Items.PRISMARINE_CRYSTALS, 0);
			ModRecipeHelper.addOreDict("randomiteDrop", Items.PRISMARINE_SHARD, 0);
			ModRecipeHelper.addOreDict("randomiteDrop", Items.CLAY_BALL, 0);
			ModRecipeHelper.addOreDict("randomiteDrop", Items.GUNPOWDER, 0);
			ModRecipeHelper.addOreDict("randomiteDrop", ModItems.ENDER_DUST, 0);
			ModRecipeHelper.addOreDict("randomiteDrop", ModItems.SALT_DUST, 0);
			ModRecipeHelper.addOreDict("randomiteDrop", ModBlocks.BASE_ORE, 0);
			ModRecipeHelper.addOreDict("randomiteDrop", ModBlocks.OEDLDOEDL_ORE, 0);
		}
	}

	public static void registerRecipes() {
		ModLogger.registeredRecipesLogger(OedldoedlResources.MODID);

		if (ResourcesConfig.RECIPES.DEFAULT_RECIPES) {
		}

		if (ResourcesConfig.RECIPES.SMELTING_RECIPES) {
			ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.BASE_INGOT, 1, 0), "dustBase", 0.7f);
			ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.OEDLDOEDL_INGOT, 1, 0), "dustOedldoedl",
					0.7f);
			ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.BASE_INGOT, 1, 0), "oreBase", 0.7f);
			ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.OEDLDOEDL_INGOT, 1, 0), "oreOedldoedl",
					0.7f);
			ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(Blocks.STONE, 1, 0), "oreRandomite", 0.7f);
			ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.ENDER_DUST, 1, 0), "oreEnder", 0.7f);
			ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(Items.GUNPOWDER, 1, 0), "oreGunpowder", 0.7f);
			ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.SALT_DUST, 1, 0), "oreSalt", 0.7f);
			ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.GREMORIUM_SHARD, 1, 0), "oreGremoriumShard",
					0.7f);
			ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.HIMEJIMARIUM_SHARD, 1, 0),
					"oreHimejimariumShard", 0.7f);
			ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.TOUJOURIUM_SHARD, 1, 0),
					"oreToujouriumShard", 0.7f);
			ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.ARGENTORIUM_SHARD, 1, 0),
					"oreArgentoriumShard", 0.7f);
			ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.QUARTARIUM_SHARD, 1, 0),
					"oreQuartariumShard", 0.7f);
			ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.NAGATORIUM_SHARD, 1, 0),
					"oreNagatoriumShard", 0.7f);
			ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.SAKURAJIMARIUM_SHARD, 1, 0),
					"oreSakurajimariumShard", 0.7f);
			ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(Blocks.END_STONE, 1, 0), "oreElementOD", 0.7f);
		}

		if (ResourcesConfig.RECIPES.CONVERSION_RECIPES) {
			ModResourceRecipeHelper.addMetalConversion(OedldoedlResources.MODID, "base", ModItems.BASE_NUGGET,
					ModItems.BASE_INGOT, ModBlocks.BASE);
			ModResourceRecipeHelper.addMetalConversion(OedldoedlResources.MODID, "oedldoedl", ModItems.OEDLDOEDL_NUGGET,
					ModItems.OEDLDOEDL_INGOT, ModBlocks.OEDLDOEDL);
			ModResourceRecipeHelper.addMetalConversion(OedldoedlResources.MODID, "bedrockium",
					ModItems.BEDROCKIUM_NUGGET, ModItems.BEDROCKIUM_INGOT, ModBlocks.BEDROCKIUM);
			ModResourceRecipeHelper.addMetalConversion(OedldoedlResources.MODID, "cloudium", ModItems.CLOUDIUM_NUGGET,
					ModItems.CLOUDIUM_INGOT, ModBlocks.CLOUDIUM);
			ModResourceRecipeHelper.addMetalConversion(OedldoedlResources.MODID, "elevatium", ModItems.ELEVATIUM_NUGGET,
					ModItems.ELEVATIUM_INGOT, ModBlocks.ELEVATIUM);
			ModResourceRecipeHelper.addMetalConversion(OedldoedlResources.MODID, "sadistium", ModItems.SADISTIUM_NUGGET,
					ModItems.SADISTIUM_INGOT, ModBlocks.SADISTIUM);
			ModResourceRecipeHelper.addMetalConversion(OedldoedlResources.MODID, "drunkium", ModItems.DRUNKIUM_NUGGET,
					ModItems.DRUNKIUM_INGOT, ModBlocks.DRUNKIUM);
			ModResourceRecipeHelper.addMetalConversion(OedldoedlResources.MODID, "money", ModItems.MONEY_NUGGET,
					ModItems.MONEY_INGOT, ModBlocks.MONEY);

			ModResourceRecipeHelper.addMetalConversion(OedldoedlResources.MODID, "gremorium", ModItems.GREMORIUM_NUGGET,
					ModItems.GREMORIUM_INGOT, ModBlocks.GREMORIUM);
			ModResourceRecipeHelper.addMetalConversion(OedldoedlResources.MODID, "himejimarium",
					ModItems.HIMEJIMARIUM_NUGGET, ModItems.HIMEJIMARIUM_INGOT, ModBlocks.HIMEJIMARIUM);
			ModResourceRecipeHelper.addMetalConversion(OedldoedlResources.MODID, "toujourium",
					ModItems.TOUJOURIUM_NUGGET, ModItems.TOUJOURIUM_INGOT, ModBlocks.TOUJOURIUM);
			ModResourceRecipeHelper.addMetalConversion(OedldoedlResources.MODID, "argentorium",
					ModItems.ARGENTORIUM_NUGGET, ModItems.ARGENTORIUM_INGOT, ModBlocks.ARGENTORIUM);
			ModResourceRecipeHelper.addMetalConversion(OedldoedlResources.MODID, "quartarium",
					ModItems.QUARTARIUM_NUGGET, ModItems.QUARTARIUM_INGOT, ModBlocks.QUARTARIUM);
			ModResourceRecipeHelper.addMetalConversion(OedldoedlResources.MODID, "nagatorium",
					ModItems.NAGATORIUM_NUGGET, ModItems.NAGATORIUM_INGOT, ModBlocks.NAGATORIUM);
			ModResourceRecipeHelper.addMetalConversion(OedldoedlResources.MODID, "sakurajimarium",
					ModItems.SAKURAJIMARIUM_NUGGET, ModItems.SAKURAJIMARIUM_INGOT, ModBlocks.SAKURAJIMARIUM);

			ModResourceRecipeHelper.addGemConversion(OedldoedlResources.MODID, "base", null, ModItems.BASE_GEM,
					ModBlocks.BASE_GEM);
			ModResourceRecipeHelper.addGemConversion(OedldoedlResources.MODID, "oedldoedl", null,
					ModItems.OEDLDOEDL_GEM, ModBlocks.OEDLDOEDL_GEM);
			ModResourceRecipeHelper.addGemConversion(OedldoedlResources.MODID, "timofium", null, ModItems.TIMOFIUM_GEM,
					ModBlocks.TIMOFIUM_GEM);
			ModResourceRecipeHelper.addGemConversion(OedldoedlResources.MODID, "flofinium", null,
					ModItems.FLOFINIUM_GEM, ModBlocks.FLOFINIUM_GEM);
			ModResourceRecipeHelper.addGemConversion(OedldoedlResources.MODID, "laarsium", null, ModItems.LAARSIUM_GEM,
					ModBlocks.LAARSIUM_GEM);
			ModResourceRecipeHelper.addGemConversion(OedldoedlResources.MODID, "klaarsium", null,
					ModItems.KLAARSIUM_GEM, ModBlocks.KLAARSIUM_GEM);
			ModResourceRecipeHelper.addGemConversion(OedldoedlResources.MODID, "sharanium", null,
					ModItems.SHARANIUM_GEM, ModBlocks.SHARANIUM_GEM);
			ModResourceRecipeHelper.addGemConversion(OedldoedlResources.MODID, "makerium", null, ModItems.MAKERIUM_GEM,
					ModBlocks.MAKERIUM_GEM);
			ModResourceRecipeHelper.addGemConversion(OedldoedlResources.MODID, "inderium", null, ModItems.INDERIUM_GEM,
					ModBlocks.INDERIUM_GEM);
			ModResourceRecipeHelper.addGemConversion(OedldoedlResources.MODID, "pumarium", null, ModItems.PUMARIUM_GEM,
					ModBlocks.PUMARIUM_GEM);
			ModResourceRecipeHelper.addGemConversion(OedldoedlResources.MODID, "callaxium", null,
					ModItems.CALLAXIUM_GEM, ModBlocks.CALLAXIUM_GEM);
			ModResourceRecipeHelper.addGemConversion(OedldoedlResources.MODID, "skorpium", null, ModItems.SKORPIUM_GEM,
					ModBlocks.SKORPIUM_GEM);
			ModResourceRecipeHelper.addGemConversion(OedldoedlResources.MODID, "stupidium", null,
					ModItems.STUPIDIUM_GEM, ModBlocks.STUPIDIUM_GEM);

			ModResourceRecipeHelper.addGemConversion(OedldoedlResources.MODID, "gremorium", ModItems.GREMORIUM_SHARD,
					ModItems.GREMORIUM_GEM, ModBlocks.GREMORIUM_GEM);
			ModResourceRecipeHelper.addGemConversion(OedldoedlResources.MODID, "himejimarium",
					ModItems.HIMEJIMARIUM_SHARD, ModItems.HIMEJIMARIUM_GEM, ModBlocks.HIMEJIMARIUM_GEM);
			ModResourceRecipeHelper.addGemConversion(OedldoedlResources.MODID, "toujourium", ModItems.TOUJOURIUM_SHARD,
					ModItems.TOUJOURIUM_GEM, ModBlocks.TOUJOURIUM_GEM);
			ModResourceRecipeHelper.addGemConversion(OedldoedlResources.MODID, "argentorium",
					ModItems.ARGENTORIUM_SHARD, ModItems.ARGENTORIUM_GEM, ModBlocks.ARGENTORIUM_GEM);
			ModResourceRecipeHelper.addGemConversion(OedldoedlResources.MODID, "quartarium", ModItems.QUARTARIUM_SHARD,
					ModItems.QUARTARIUM_GEM, ModBlocks.QUARTARIUM_GEM);
			ModResourceRecipeHelper.addGemConversion(OedldoedlResources.MODID, "nagatorium", ModItems.NAGATORIUM_SHARD,
					ModItems.NAGATORIUM_GEM, ModBlocks.NAGATORIUM_GEM);
			ModResourceRecipeHelper.addGemConversion(OedldoedlResources.MODID, "sakurajimarium",
					ModItems.SAKURAJIMARIUM_SHARD, ModItems.SAKURAJIMARIUM_GEM, ModBlocks.SAKURAJIMARIUM_GEM);

			ModResourceRecipeHelper.addStarConversion(OedldoedlResources.MODID, "baseStar", ModItems.BASE_STAR_SHARD,
					ModItems.BASE_STAR, ModBlocks.BASE_STAR);
			ModResourceRecipeHelper.addStarConversion(OedldoedlResources.MODID, "netherStar",
					ModItems.NETHER_STAR_SHARD, Items.NETHER_STAR, ModBlocks.NETHER_STAR);
			ModResourceRecipeHelper.addStarConversion(OedldoedlResources.MODID, "oedldoedlStar",
					ModItems.OEDLDOEDL_STAR_SHARD, ModItems.OEDLDOEDL_STAR, ModBlocks.OEDLDOEDL_STAR);
			ModResourceRecipeHelper.addStarConversion(OedldoedlResources.MODID, "infinityStar",
					ModItems.INFINITY_STAR_SHARD, ModItems.INFINITY_STAR, ModBlocks.INFINITY_STAR);

			ModResourceRecipeHelper.addElementConversion(OedldoedlResources.MODID, "base", ModItems.BASE_FRAGMENT,
					ModItems.BASE_ELEMENT, null);
			ModResourceRecipeHelper.addElementConversion(OedldoedlResources.MODID, "oedldoedl",
					ModItems.OEDLDOEDL_FRAGMENT, ModItems.OEDLDOEDL_ELEMENT, null);
			ModResourceRecipeHelper.addElementConversion(OedldoedlResources.MODID, "timofium",
					ModItems.TIMOFIUM_FRAGMENT, ModItems.TIMOFIUM_ELEMENT, null);
			ModResourceRecipeHelper.addElementConversion(OedldoedlResources.MODID, "flofinium",
					ModItems.FLOFINIUM_FRAGMENT, ModItems.FLOFINIUM_ELEMENT, null);
			ModResourceRecipeHelper.addElementConversion(OedldoedlResources.MODID, "laarsium",
					ModItems.LAARSIUM_FRAGMENT, ModItems.LAARSIUM_ELEMENT, null);
			ModResourceRecipeHelper.addElementConversion(OedldoedlResources.MODID, "klaarsium",
					ModItems.KLAARSIUM_FRAGMENT, ModItems.KLAARSIUM_ELEMENT, null);
			ModResourceRecipeHelper.addElementConversion(OedldoedlResources.MODID, "sharanium",
					ModItems.SHARANIUM_FRAGMENT, ModItems.SHARANIUM_ELEMENT, null);
			ModResourceRecipeHelper.addElementConversion(OedldoedlResources.MODID, "makerium",
					ModItems.MAKERIUM_FRAGMENT, ModItems.MAKERIUM_ELEMENT, null);
			ModResourceRecipeHelper.addElementConversion(OedldoedlResources.MODID, "inderium",
					ModItems.INDERIUM_FRAGMENT, ModItems.INDERIUM_ELEMENT, null);
			ModResourceRecipeHelper.addElementConversion(OedldoedlResources.MODID, "pumarium",
					ModItems.PUMARIUM_FRAGMENT, ModItems.PUMARIUM_ELEMENT, null);
			ModResourceRecipeHelper.addElementConversion(OedldoedlResources.MODID, "callaxium",
					ModItems.CALLAXIUM_FRAGMENT, ModItems.CALLAXIUM_ELEMENT, null);
			ModResourceRecipeHelper.addElementConversion(OedldoedlResources.MODID, "skorpium",
					ModItems.SKORPIUM_FRAGMENT, ModItems.SKORPIUM_ELEMENT, null);
			ModResourceRecipeHelper.addElementConversion(OedldoedlResources.MODID, "stupidium",
					ModItems.STUPIDIUM_FRAGMENT, ModItems.STUPIDIUM_ELEMENT, null);

			ModRecipeHelper.addShapedRecipe(OedldoedlResources.MODID, "conversion/coal_nugget_from_gem",
					new ItemStack(ModItems.COAL_NUGGET, 8, 0), "A", 'A', "gemCoal");
			ModRecipeHelper.addShapedRecipe(OedldoedlResources.MODID, "conversion/charcoal_nugget_from_gem",
					new ItemStack(ModItems.CHARCOAL_NUGGET, 8, 0), "A", 'A', "gemCharcoal");
			ModRecipeHelper.addShapedRecipe(OedldoedlResources.MODID, "conversion/diamond_nugget_from_gem",
					new ItemStack(ModItems.DIAMOND_NUGGET, 9, 0), "A", 'A', "gemDiamond");
			ModRecipeHelper.addShapedRecipe(OedldoedlResources.MODID, "conversion/lapis_nugget_from_gem",
					new ItemStack(ModItems.LAPIS_NUGGET, 9, 0), "A", 'A', "gemLapis");
			ModRecipeHelper.addShapedRecipe(OedldoedlResources.MODID, "conversion/emerald_nugget_from_gem",
					new ItemStack(ModItems.EMERALD_NUGGET, 9, 0), "A", 'A', "gemEmerald");
			ModRecipeHelper.addShapedRecipe(OedldoedlResources.MODID, "conversion/quartz_nugget_from_gem",
					new ItemStack(ModItems.QUARTZ_NUGGET, 9, 0), "A", 'A', "gemQuartz");
			ModRecipeHelper.addShapedRecipe(OedldoedlResources.MODID, "conversion/ender_nugget_from_pearl",
					new ItemStack(ModItems.ENDER_NUGGET, 9, 0), "A", 'A', "enderpearl");

			ModRecipeHelper.addShapedRecipe(OedldoedlResources.MODID, "conversion/coal_gem_from_nugget",
					new ItemStack(Items.COAL, 1, 0), "AAA", "AAA", "AA ", 'A', "nuggetCoal");
			ModRecipeHelper.addShapedRecipe(OedldoedlResources.MODID, "conversion/charcoal_gem_from_nugget",
					new ItemStack(Items.COAL, 1, 1), "AAA", "AAA", "AA ", 'A', "nuggetCharcoal");
			ModRecipeHelper.addShapedRecipe(OedldoedlResources.MODID, "conversion/diamond_gem_from_nugget",
					new ItemStack(Items.DIAMOND, 1, 0), "AAA", "AAA", "AAA", 'A', "nuggetDiamond");
			ModRecipeHelper.addShapedRecipe(OedldoedlResources.MODID, "conversion/lapis_gem_from_nugget",
					new ItemStack(Items.DYE, 1, 4), "AAA", "AAA", "AAA", 'A', "nuggetLapis");
			ModRecipeHelper.addShapedRecipe(OedldoedlResources.MODID, "conversion/emerald_gem_from_nugget",
					new ItemStack(Items.EMERALD, 1, 0), "AAA", "AAA", "AAA", 'A', "nuggetEmerald");
			ModRecipeHelper.addShapedRecipe(OedldoedlResources.MODID, "conversion/quartz_gem_from_nugget",
					new ItemStack(Items.QUARTZ, 1, 0), "AAA", "AAA", "AAA", 'A', "nuggetQuartz");
			ModRecipeHelper.addShapedRecipe(OedldoedlResources.MODID, "conversion/pearl_from_nugget",
					new ItemStack(Items.ENDER_PEARL, 1, 0), "AAA", "AAA", "AAA", 'A', "nuggetEnder");

			ModRecipeHelper.addShapedRecipe(OedldoedlResources.MODID, "conversion/balanced_clayball_from_clay",
					new ItemStack(ModItems.BALANCED_CLAY_BALL, 4, 0), "A", 'A', "balancedClay");
			ModRecipeHelper.addShapedRecipe(OedldoedlResources.MODID, "conversion/balanced_clay_from_clayball",
					new ItemStack(ModBlocks.BALANCED_CLAY, 1, 0), "AA", "AA", 'A', "balancedClayball");
		}
	}
}