package com.thep2wking.oedldoedl.resources.config;

import com.thep2wking.oedldoedl.resources.ReferenceResources;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = ReferenceResources.MODID, name = "oedldoedlresources", category = ReferenceResources.MODID)
public class ResourcesConfig 
{
	//----------------------------------------------------------------------------------------------------------------
	
	@Config.Name("Generel")
	public static final Generel GENEREL = new Generel();
	
	public static class Generel
	{	
		@Config.Name("CCL Properties")
		@Config.Comment("Enable or Disable Avaritias halo textures, pulse and immortal itemstates.")
		public boolean cclProperties = true;
		
		@Config.Name("Items Give Effects")
		@Config.Comment("Enable or Disable potion effects given by items.")
		public boolean itemsGiveEffects = true;
		
		@Config.Name("Worldgen")
		public Worldgen worldgen = new Worldgen();
		
		@Config.Name("Recipes")
		public Recipes recipes = new Recipes();
	}
	
	//----------------------------------------------------------------------------------------------------------------

	public static class Worldgen
	{
		@Config.Name("World Gen Overworld")
		@Config.Comment("Enable or Disable all overworld world generations.")
		public boolean worldGenOverworld = true;
		
		@Config.Name("World Gen Nether")
		@Config.Comment("Enable or Disable all nether world generations.")
		public boolean worldGenNether = true;
		
		@Config.Name("World Gen End")
		@Config.Comment("Enable or Disable all end world generations.")
		public boolean worldGenEnd = true;
	}
	
	//----------------------------------------------------------------------------------------------------------------

	@Config.Name("Resources")
	public static final Resources RESOURCES = new Resources();
	
	public static class Resources
	{
		@Config.Name("Stars")
		public Stars stars = new Stars();
		
		@Config.Name("Metals")
		public Metals metals = new Metals();
		
		@Config.Name("Dusts")
		public Dusts dusts = new Dusts();
		
		@Config.Name("Misc")
		public Misc misc = new Misc();
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class Recipes
	{
		@Config.Name("Crafting")
		public Crafting crafting = new Crafting();
		
		@Config.Name("Smelting")
		public Smelting smelting = new Smelting();
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class Crafting
	{	
		@Config.Name("Nugget / Ingot / Block Conversion")
		@Config.Comment("Enable or Disable conversion between nuggets, ingots, blocks etc (NOTE: Some recipes might not work if the resource is diabled).")
		public boolean conversionEnabled = true;
		
		@Config.Name("Non Tweaked Modpack Recipes")
		@Config.Comment("Enable or Disable crafting recipes for playing in non tweaked modpacks (NOTE: Some recipes might not work if required resources are diabled).")
		public boolean nonTweakedModpackEnabled = true;
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class Smelting
	{	
		@Config.Name("Ores To Dust / Ingot / Gem")
		@Config.Comment("Enable or Disable the smelting of ores to dusts, ingots, gems etc (NOTE: Some recipes might not work if the resource is diabled).")
		public boolean oresEnabled = true;
		
		@Config.Name("Non Tweaked Modpack Recipes")
		@Config.Comment("Enable or Disable selting recipes for playing in non tweaked modpacks (NOTE: Some recipes might not work if required resources are diabled).")
		public boolean nonTweakedModpackEnabled = true;
		
		@Config.Name("Bedrock Smelting")
		@Config.Comment("Enable or Disable the selting recipe for bedrock.")
		public boolean bedrockEnabled = true;
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	@Config.Name("Integration")
	public static final Integration INTEGRATION = new Integration();
	
	public static class Integration
	{	
		@Config.Name("[JEI] Show Descriptions")
		@Config.Comment("Enable or Disable descriptions for some blocks / items in JEI.")
		public boolean jeiShowDescriptions = true;
		
		@Config.Name("[TOP] Developer References")
		@Config.Comment("Enable or Disable developer references in TOP tooltips.")
		public boolean topDeveloperReferences = false;
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class Stars
	{
		@Config.Name("OedldoedlStar")
		public OedldoedlStar oedldoedlStar = new OedldoedlStar();
		
		@Config.Name("InfinityStar")
		public InfinityStar infinityStar = new InfinityStar();
	}
	
	//----------------------------------------------------------------------------------------------------------------

	public static class Metals
	{	
		@Config.Name("Base")
		public Base base = new Base();
		
		@Config.Name("Oedldoedl")
		public Oedldoedl oedldoedl = new Oedldoedl();
		
		@Config.Name("Bedrockium")
		public Bedrockium bedrockium = new Bedrockium();
		
		@Config.Name("Drunkium")
		public Drunkium drunkium = new Drunkium();
		
		@Config.Name("Sadistium")
		public Sadistium sadistium = new Sadistium();
		
		@Config.Name("Dimension")
		public Dimension dimension = new Dimension();
		
		@Config.Name("Gremorium")
		public Gremorium gremorium = new Gremorium();
		
		@Config.Name("Himejimarium")
		public Himejimarium himejimarium = new Himejimarium();
		
		@Config.Name("Toujourium")
		public Toujourium toujourium = new Toujourium();
		
		@Config.Name("Argentorium")
		public Argentorium argentorium = new Argentorium();
		
		@Config.Name("Quartarium")
		public Quartarium quartarium = new Quartarium();
		
		@Config.Name("Chaos")
		public Chaos chaos = new Chaos();
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class Dusts
	{
		@Config.Name("Ender")
		public Ender ender = new Ender();
		
		@Config.Name("Sulfur")
		public Sulfur sulfur = new Sulfur();
		
		@Config.Name("Saltpeter")
		public Saltpeter saltpeter = new Saltpeter();
		
		@Config.Name("Salt")
		public Salt salt = new Salt();
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class Base
	{	
		@Config.Name("Enabled")
		@Config.Comment("Enable or Disable all resources related to base.")
		public boolean enabled = true;
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class OedldoedlStar
	{	
		@Config.Name("Enabled")
		@Config.Comment("Enable or Disable all resources related to oedldoedl star.")
		public boolean enabled = true;
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class InfinityStar
	{	
		@Config.Name("Enabled")
		@Config.Comment("Enable or Disable all resources related to infinity star.")
		public boolean enabled = true;
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class Oedldoedl
	{	
		@Config.Name("Enabled")
		@Config.Comment("Enable or Disable all resources related to oedldoedl.")
		public boolean enabled = true;

		@Config.Name("Ore Gen Enabled")
		@Config.Comment("Enable or Disable oedldoedl ore gen.")
		public boolean oreGenEnabled = true;
		
		@Config.Name("Ore Rarity")
		@Config.Comment("Set the rarity of oedldoedl ore.")
		@Config.RangeInt(min = 0, max = 100)
		public int oreRarity = 6;
		
		@Config.Name("[GEM] Effects")
		@Config.Comment("Enable or Disable all effects from oedldoedl gem.")
		public boolean effectsEnabled = true;
		
		@Config.Name("[GEM] Effect Amplifier")
		@Config.Comment("Set the amplifier of effects given by the oedldoedl gem.")
		@Config.RangeInt(min = 1, max = 255)
		public int effectsAmplifierGem = 5;
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class Bedrockium
	{	
		@Config.Name("Enabled")
		@Config.Comment("Enable or Disable all resources related to bedrockium.")
		public boolean enabled = true;
		
		@Config.Name("Effects")
		@Config.Comment("Enable or Disable all effects from bedrockium ingot.")
		public boolean effectsEnabled = true;
		
		@Config.Name("[INGOT] Slowness Effect Amplifier")
		@Config.Comment("Set the amplifier of the slowness effect given by the bedrockium ingot.")
		@Config.RangeInt(min = 1, max = 255)
		public int slownessAmplifierIngot = 6;
		
		@Config.Name("[INGOT] Hunger Effect Amplifier")
		@Config.Comment("Set the amplifier of the hunger effect given by the bedrockium ingot.")
		@Config.RangeInt(min = 1, max = 255)
		public int hungerAmplifierIngot = 3;
		
		@Config.Name("[NUGGET] Slowness Effect Amplifier")
		@Config.Comment("Set the amplifier of the slowness effect given by the bedrockium ingot.")
		@Config.RangeInt(min = 1, max = 255)
		public int slownessAmplifierNugget = 4;
		
		@Config.Name("[NUGGET] Hunger Effect Amplifier")
		@Config.Comment("Set the amplifier of the hunger effect given by the bedrockium ingot.")
		@Config.RangeInt(min = 1, max = 255)
		public int hungerAmplifierNugget = 1;
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class Drunkium
	{	
		@Config.Name("Enabled")
		@Config.Comment("Enable or Disable all resources sadistium to drunkium.")
		public boolean enabled = true;
		
		@Config.Name("Effects")
		@Config.Comment("Enable or Disable all effects from sadistium ingot.")
		public boolean effectsEnabled = true;
		
		@Config.Name("[INGOT] Slowness Effect Amplifier")
		@Config.Comment("Set the amplifier of the slowness effect given by the drunkium ingot.")
		@Config.RangeInt(min = 1, max = 255)
		public int slownessAmplifierIngot = 3;
		
		@Config.Name("[INGOT] Blindness Effect Amplifier")
		@Config.Comment("Set the amplifier of the blindness effect given by the drunkium ingot.")
		@Config.RangeInt(min = 1, max = 255)
		public int blindnessAmplifierIngot = 4;
		
		@Config.Name("[INGOT] Nausea Effect Nausea")
		@Config.Comment("Set the amplifier of the nausea effect given by the drunkium ingot.")
		@Config.RangeInt(min = 1, max = 255)
		public int nauseaAmplifierIngot = 5;
		
		@Config.Name("[NUGGET] Slowness Effect Amplifier")
		@Config.Comment("Set the amplifier of the slowness effect given by the drunkium ingot.")
		@Config.RangeInt(min = 1, max = 255)
		public int slownessAmplifierNugget = 1;
		
		@Config.Name("[NUGGET] Blindness Effect Amplifier")
		@Config.Comment("Set the amplifier of the blindness effect given by the drunkium ingot.")
		@Config.RangeInt(min = 1, max = 255)
		public int blindnessAmplifierNugget = 2;
		
		@Config.Name("[NUGGET] Nausea Effect Amplifier")
		@Config.Comment("Set the amplifier of the nausea effect given by the drunkium ingot.")
		@Config.RangeInt(min = 1, max = 255)
		public int nauseaAmplifierNugget = 3;
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class Sadistium
	{	
		@Config.Name("Enabled")
		@Config.Comment("Enable or Disable all resources related to sadistium.")
		public boolean enabled = true;
		
		@Config.Name("Effects")
		@Config.Comment("Enable or Disable all effects from drunkium ingot.")
		public boolean effectsEnabled = true;
		
		@Config.Name("[INGOT] Mining Fatigue Effect Amplifier")
		@Config.Comment("Set the amplifier of the mining fatigue effect given by the sadistium ingot.")
		@Config.RangeInt(min = 1, max = 255)
		public int miningFatigueAmplifierIngot = 5;
		
		@Config.Name("[INGOT] Weakness Effect Amplifier")
		@Config.Comment("Set the amplifier of the weakness effect given by the sadistium ingot.")
		@Config.RangeInt(min = 1, max = 255)
		public int weaknessAmplifierIngot = 4;
		
		@Config.Name("[INGOT] Bad Luck Effect Amplifier")
		@Config.Comment("Set the amplifier of the bad luck effect given by the sadistium ingot.")
		@Config.RangeInt(min = 1, max = 255)
		public int unluckAmplifierIngot = 5;
		
		@Config.Name("[INGOT] Glowing Effect Amplifier")
		@Config.Comment("Set the amplifier of the glowing effect given by the sadistium ingot.")
		@Config.RangeInt(min = 1, max = 255)
		public int glowingAmplifierIngot = 1;
		
		@Config.Name("[NUGGET] Mining Fatigue Effect Amplifier")
		@Config.Comment("Set the amplifier of the mining fatigue effect given by the sadistium nugget.")
		@Config.RangeInt(min = 1, max = 255)
		public int miningFatigueAmplifierNugget = 3;
		
		@Config.Name("[NUGGET] Weakness Effect Amplifier")
		@Config.Comment("Set the amplifier of the weakness effect given by the sadistium nugget.")
		@Config.RangeInt(min = 1, max = 255)
		public int weaknessAmplifierNugget = 2;
		
		@Config.Name("[NUGGET] Bad Luck Effect Amplifier")
		@Config.Comment("Set the amplifier of the bad luck effect given by the sadistium nugget.")
		@Config.RangeInt(min = 1, max = 255)
		public int unluckAmplifierNugget = 3;
		
		@Config.Name("[NUGGET] Glowing Effect Amplifier")
		@Config.Comment("Set the amplifier of the glowing effect given by the sadistium nugget.")
		@Config.RangeInt(min = 1, max = 255)
		public int glowingAmplifierNugget = 1;
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class Gremorium
	{	
		@Config.Name("Enabled")
		@Config.Comment("Enable or Disable all resources related to gremorium.")
		public boolean enabled = true;

		@Config.Name("Ore Gen Enabled")
		@Config.Comment("Enable or Disable gremorium ore gen.")
		public boolean oreGenEnabled = true;
		
		@Config.Name("[GEM] Ore Rarity")
		@Config.Comment("Set the rarity of gremorium gem ore.")
		@Config.RangeInt(min = 0, max = 100)
		public int oreRarity = 1;
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class Himejimarium
	{	
		@Config.Name("Enabled")
		@Config.Comment("Enable or Disable all resources related to himejimarium.")
		public boolean enabled = true;

		@Config.Name("Ore Gen Enabled")
		@Config.Comment("Enable or Disable himejimarium ore gen.")
		public boolean oreGenEnabled = true;
		
		@Config.Name("[GEM] Ore Rarity")
		@Config.Comment("Set the rarity of himejimarium gem ore.")
		@Config.RangeInt(min = 0, max = 100)
		public int oreRarity = 1;
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class Toujourium
	{	
		@Config.Name("Enabled")
		@Config.Comment("Enable or Disable all resources related to toujourium.")
		public boolean enabled = true;

		@Config.Name("Ore Gen Enabled")
		@Config.Comment("Enable or Disable toujourium ore gen.")
		public boolean oreGenEnabled = true;
		
		@Config.Name("[GEM] Ore Rarity")
		@Config.Comment("Set the rarity of toujourium gem ore.")
		@Config.RangeInt(min = 0, max = 100)
		public int oreRarity = 1;
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class Argentorium
	{	
		@Config.Name("Enabled")
		@Config.Comment("Enable or Disable all resources related to argentorium.")
		public boolean enabled = true;

		@Config.Name("Ore Gen Enabled")
		@Config.Comment("Enable or Disable argentorium ore gen.")
		public boolean oreGenEnabled = true;
		
		@Config.Name("[GEM] Ore Rarity")
		@Config.Comment("Set the rarity of argentorium gem ore.")
		@Config.RangeInt(min = 0, max = 100)
		public int oreRarity = 1;
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class Quartarium
	{	
		@Config.Name("Enabled")
		@Config.Comment("Enable or Disable all resources related to quartarium.")
		public boolean enabled = true;

		@Config.Name("Ore Gen Enabled")
		@Config.Comment("Enable or Disable quartarium ore gen.")
		public boolean oreGenEnabled = true;
		
		@Config.Name("[GEM] Ore Rarity")
		@Config.Comment("Set the rarity of quartarium gem ore.")
		@Config.RangeInt(min = 0, max = 100)
		public int oreRarity = 1;
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class Chaos
	{	
		@Config.Name("Enabled")
		@Config.Comment("Enable or Disable all resources related to chaos.")
		public boolean enabled = true;
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class Dimension
	{	
		@Config.Name("Overworld Enabled")
		@Config.Comment("Enable or Disable overworld resources.")
		public boolean overworldEnabled = true;
		
		@Config.Name("Nether Enabled")
		@Config.Comment("Enable or Disable nether resources.")
		public boolean netherEnabled = true;
		
		@Config.Name("End Enabled")
		@Config.Comment("Enable or Disable end resources.")
		public boolean endEnabled = true;
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class Ender
	{	
		@Config.Name("Enabled")
		@Config.Comment("Enable or Disable all resources related to ender.")
		public boolean enabled = true;
		
		@Config.Name("Ore Gen Enabled")
		@Config.Comment("Enable or Disable ender ore gen.")
		public boolean oreGenEnabled = true;
		
		@Config.Name("Ore Rarity")
		@Config.Comment("Set the rarity of ender ore.")
		@Config.RangeInt(min = 0, max = 100)
		public int oreRarity = 3;
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class Sulfur
	{	
		@Config.Name("Enabled")
		@Config.Comment("Enable or Disable all resources related to sulfur.")
		public boolean enabled = true;
		
		@Config.Name("Ore Gen Enabled")
		@Config.Comment("Enable or Disable sulfur ore gen.")
		public boolean oreGenEnabled = true;
		
		@Config.Name("Ore Rarity")
		@Config.Comment("Set the rarity of sulfur ore.")
		@Config.RangeInt(min = 0, max = 100)
		public int oreRarity = 7;
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class Saltpeter
	{	
		@Config.Name("Enabled")
		@Config.Comment("Enable or Disable all resources related to saltpeter.")
		public boolean enabled = true;
		
		@Config.Name("Ore Gen Enabled")
		@Config.Comment("Enable or Disable saltpeter ore gen.")
		public boolean oreGenEnabled = true;
		
		@Config.Name("Ore Rarity")
		@Config.Comment("Set the rarity of saltpeter ore.")
		@Config.RangeInt(min = 0, max = 100)
		public int oreRarity = 7;
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class Salt
	{	
		@Config.Name("Enabled")
		@Config.Comment("Enable or Disable all resources related to salt.")
		public boolean enabled = true;
		
		@Config.Name("Ore Gen Enabled")
		@Config.Comment("Enable or Disable salt ore gen.")
		public boolean oreGenEnabled = true;
		
		@Config.Name("Ore Rarity")
		@Config.Comment("Set the rarity of salt ore.")
		@Config.RangeInt(min = 0, max = 100)
		public int oreRarity = 14;
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class Misc
	{
		@Config.Name("DeveloperGems")
		public DeveloperGems developerGems = new DeveloperGems();
		
		@Config.Name("DeveloperElements")
		public DeveloperElements developerElements = new DeveloperElements();
		
		@Config.Name("BalancedClay")
		public BalancedClay balancedClay = new BalancedClay();
		
		@Config.Name("ChaosPlank")
		public ChaosPlank chaosPlank = new ChaosPlank();
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class DeveloperGems
	{	
		@Config.Name("Enabled")
		@Config.Comment("Enable or Disable all developer gems.")
		public boolean enabled = true;
		
		@Config.Name("Effects")
		@Config.Comment("Enable or Disable all effects from sadistium ingot.")
		public boolean effectsEnabled = true;
		
		@Config.Name("[TIMOFIUM] Absorption Effect Amplifier")
		@Config.Comment("Set the amplifier of the absorption effect given by the oedldoedl gem.")
		@Config.RangeInt(min = 1, max = 255)
		public int absorptionAmplifier = 2;
		
		@Config.Name("[FLOFINIUM] Saturation Effect Amplifier")
		@Config.Comment("Set the amplifier of the fire saturation effect given by the oedldoedl gem.")
		@Config.RangeInt(min = 1, max = 255)
		public int saturationAmplifier = 2;
		
		@Config.Name("[LAARSIUM] Luck Effect Amplifier")
		@Config.Comment("Set the amplifier of the luck effect given by the oedldoedl gem.")
		@Config.RangeInt(min = 1, max = 255)
		public int luckAmplifier = 2;
		
		@Config.Name("[KLAARSIUM] Speed Effect Amplifier")
		@Config.Comment("Set the amplifier of the speed effect given by the oedldoedl gem.")
		@Config.RangeInt(min = 1, max = 255)
		public int speedAmplifier = 2;
		
		@Config.Name("[SHARANIUM] Bad Luck Effect Amplifier")
		@Config.Comment("Set the amplifier of the bad luck effect given by the oedldoedl gem.")
		@Config.RangeInt(min = 1, max = 255)
		public int badLuckAmplifier = 2;
		
		@Config.Name("[MAKERIUM] Strenght Effect Amplifier")
		@Config.Comment("Set the amplifier of the strenght effect given by the oedldoedl gem.")
		@Config.RangeInt(min = 1, max = 255)
		public int strenghtAmplifier = 2;
		
		@Config.Name("[INDERIUM] Slowness Effect Amplifier")
		@Config.Comment("Set the amplifier of the slowness effect given by the oedldoedl gem.")
		@Config.RangeInt(min = 1, max = 255)
		public int slownessAmplifier = 2;
		
		@Config.Name("[PUMARIUM] Resistance Effect Amplifier")
		@Config.Comment("Set the amplifier of the resistance effect given by the oedldoedl gem.")
		@Config.RangeInt(min = 1, max = 255)
		public int resistanceAmplifier = 2;
		
		@Config.Name("[CALLAXIUM] Poison Effect Amplifier")
		@Config.Comment("Set the amplifier of the poison effect given by the oedldoedl gem.")
		@Config.RangeInt(min = 1, max = 255)
		public int witherAmplifier = 2;
		
		@Config.Name("[SKORPIUM] Haste Effect Amplifier")
		@Config.Comment("Set the amplifier of the haste effect given by the oedldoedl gem.")
		@Config.RangeInt(min = 1, max = 255)
		public int hasteAmplifier = 2;
		
		@Config.Name("[STUPIDIUM] Mining Fatigue Effect Amplifier")
		@Config.Comment("Set the amplifier of the mining fatigue effect given by the oedldoedl gem.")
		@Config.RangeInt(min = 1, max = 255)
		public int miningFatigueAmplifier = 2;
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class DeveloperElements
	{	
		@Config.Name("Enabled")
		@Config.Comment("Enable or Disable all developer elements.")
		public boolean enabled = true;
		
		@Config.Name("Ore Gen Enabled")
		@Config.Comment("Enable or Disable element od gen.")
		public boolean oreGenEnabled = true;
		
		@Config.Name("Ore Rarity")
		@Config.Comment("Set the rarity of element od.")
		@Config.RangeInt(min = 0, max = 100)
		public int oreRarity = 5;
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public static class BalancedClay
	{	
		@Config.Name("Enabled")
		@Config.Comment("Enable or Disable balanced clay.")
		public boolean enabled = true;
	}

	//----------------------------------------------------------------------------------------------------------------
	
	public static class ChaosPlank
	{	
		@Config.Name("Enabled")
		@Config.Comment("Enable or Disable the chaos plank.")
		public boolean enabled = true;
	}

	//----------------------------------------------------------------------------------------------------------------

    @Mod.EventBusSubscriber
    public static class ConfigHolder 
    {
        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) 
        {
            if (event.getModID().equals(ReferenceResources.MODID)) 
            {
                ConfigManager.sync(ReferenceResources.MODID, Config.Type.INSTANCE);
            }
        }
    }
}