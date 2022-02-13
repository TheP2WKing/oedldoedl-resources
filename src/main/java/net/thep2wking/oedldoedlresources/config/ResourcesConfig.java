package net.thep2wking.oedldoedlresources.config;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.common.ForgeConfigSpec.IntValue;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class ResourcesConfig 
{ 
	//worldgen
    public static BooleanValue enable_overworld_ores;
    public static BooleanValue enable_nether_ores;
    public static BooleanValue enable_end_ores;
    
    public static IntValue randomite_ore_max_vein_size;
    public static IntValue randomite_ore_veins_per_chunk;
    public static IntValue oedldoedl_ore_max_vein_size;
    public static IntValue oedldoedl_ore_veins_per_chunk;
    public static IntValue ender_ore_max_vein_size;
    public static IntValue ender_ore_veins_per_chunk;
    public static IntValue gunpowder_ore_max_vein_size;
    public static IntValue gunpowder_ore_veins_per_chunk;
    public static IntValue salt_ore_max_vein_size;
    public static IntValue salt_ore_veins_per_chunk;
    
    public static IntValue gremorium_ore_max_vein_size;
    public static IntValue gremorium_ore_veins_per_chunk;
    public static IntValue himejimarium_ore_max_vein_size;
    public static IntValue himejimarium_ore_veins_per_chunk;
    public static IntValue toujourium_ore_max_vein_size;
    public static IntValue toujourium_ore_veins_per_chunk;
    public static IntValue argentorium_ore_max_vein_size;
    public static IntValue argentorium_ore_veins_per_chunk;
    public static IntValue quartarium_ore_max_vein_size;
    public static IntValue quartarium_ore_veins_per_chunk;
    public static IntValue nagatorium_ore_max_vein_size;
    public static IntValue nagatorium_ore_veins_per_chunk;
    public static IntValue sakurajimarium_ore_max_vein_size;
    public static IntValue sakurajimarium_ore_veins_per_chunk;
    
    public static IntValue element_od_max_vein_size;
    public static IntValue element_od_veins_per_chunk;
    
    //effects
    public static BooleanValue effects_enabled;
    
    public static BooleanValue ingot_effects_enabled;
    public static IntValue ingot_base_amplifier;
    public static IntValue ingot_base_duration;
    
    public static BooleanValue nugget_effects_enabled;
    public static IntValue nugget_base_amplifier;
    public static IntValue nugget_base_duration;
    
    public static BooleanValue block_effects_enabled;
    public static IntValue block_base_amplifier;
    public static IntValue block_base_duration;
    
    public static BooleanValue block_walking_effects_enabled;
    public static IntValue block_walking_base_amplifier;
    public static IntValue block_walking_base_duration;
    
    //content
    public static BooleanValue ore_particles;
    
    public static BooleanValue enable_unstable_explosion;
    public static BooleanValue enable_chaos_plank_sound;
    public static BooleanValue enable_money_sound;
    
    //integration
    public static BooleanValue jei_descriptions;
    public static BooleanValue top_tooltips;

    public static void init() 
    {
        Pair<ConfigLoder, ForgeConfigSpec> resources_common_config = new ForgeConfigSpec.Builder().configure(ConfigLoder::new); 
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, resources_common_config.getRight());
    }

    public static class ConfigLoder 
    {
        public ConfigLoder(ForgeConfigSpec.Builder builder) 
        {
            builder.push("Worldgen");
            builder.push("Values");
            builder.push("Overworld");
            randomite_ore_max_vein_size = builder.comment("Set randomite ore vein size (0 means disabled). [Default: 5]").defineInRange("randomite_ore_max_vein_size", 5, 0, 100);
            randomite_ore_veins_per_chunk = builder.comment("Set randomite ore vein size (0 means disabled). [Default: 12]").defineInRange("randomite_ore_veins_per_chunk", 12, 0, 100);
            oedldoedl_ore_max_vein_size = builder.comment("Set oedldoedl ore vein size (0 means disabled). [Default: 3]").defineInRange("oedldoedl_ore_max_vein_size", 3, 0, 100);
            oedldoedl_ore_veins_per_chunk = builder.comment("Set oedldoedl ore vein size (0 means disabled). [Default: 6]").defineInRange("oedldoedl_ore_veins_per_chunk", 6, 0, 100);
            ender_ore_max_vein_size = builder.comment("Set ender ore vein size (0 means disabled). [Default: 4]").defineInRange("ender_ore_max_vein_size", 4, 0, 100);
            ender_ore_veins_per_chunk = builder.comment("Set ender ore vein size (0 means disabled). [Default: 6]").defineInRange("ender_ore_veins_per_chunk", 6, 0, 100);
            gunpowder_ore_max_vein_size = builder.comment("Set gunpowder ore vein size (0 means disabled). [Default: 7]").defineInRange("gunpowder_ore_max_vein_size", 7, 0, 100);
            gunpowder_ore_veins_per_chunk = builder.comment("Set gunpowder ore vein size (0 means disabled). [Default: 10]").defineInRange("gunpowder_ore_veins_per_chunk", 10, 0, 100);
            salt_ore_max_vein_size = builder.comment("Set salt ore vein size (0 means disabled).. [Default: 12]").defineInRange("salt_ore_max_vein_size", 12, 0, 100);
            salt_ore_veins_per_chunk = builder.comment("Set salt ore vein size (0 means disabled).. [Default: 22]").defineInRange("salt_ore_veins_per_chunk", 22, 0, 100);
            builder.pop();
            
            builder.push("Nether");
            gremorium_ore_max_vein_size = builder.comment("Set gremorium ore vein size (0 means disabled). [Default: 3]").defineInRange("gremorium_ore_max_vein_size", 3, 0, 100);
            gremorium_ore_veins_per_chunk = builder.comment("Set gremorium ore vein size (0 means disabled). [Default: 5]").defineInRange("gremorium_ore_veins_per_chunk", 5, 0, 100);
            himejimarium_ore_max_vein_size = builder.comment("Set himejimarium ore vein size (0 means disabled). [Default: 3]").defineInRange("himejimarium_ore_max_vein_size", 3, 0, 100);
            himejimarium_ore_veins_per_chunk = builder.comment("Set himejimarium ore vein size (0 means disabled). [Default: 5]").defineInRange("himejimarium_ore_veins_per_chunk", 5, 0, 100);   
            toujourium_ore_max_vein_size = builder.comment("Set toujourium ore vein size (0 means disabled). [Default: 3]").defineInRange("toujourium_ore_max_vein_size", 3, 0, 100);
            toujourium_ore_veins_per_chunk = builder.comment("Set toujourium ore vein size (0 means disabled). [Default: 5]").defineInRange("toujourium_ore_veins_per_chunk", 5, 0, 100);  
            argentorium_ore_max_vein_size = builder.comment("Set argentorium ore vein size (0 means disabled). [Default: 3]").defineInRange("argentorium_ore_max_vein_size", 3, 0, 100);
            argentorium_ore_veins_per_chunk = builder.comment("Set argentorium ore vein size (0 means disabled). [Default: 5]").defineInRange("argentorium_ore_veins_per_chunk", 5, 0, 100);
            quartarium_ore_max_vein_size = builder.comment("Set quartarium ore vein size (0 means disabled). [Default: 3]").defineInRange("quartarium_ore_max_vein_size", 3, 0, 100);
            quartarium_ore_veins_per_chunk = builder.comment("Set quartarium ore vein size (0 means disabled). [Default: 5]").defineInRange("quartarium_ore_veins_per_chunk", 5, 0, 100);
            nagatorium_ore_max_vein_size = builder.comment("Set nagatorium ore vein size (0 means disabled). [Default: 4]").defineInRange("nagatorium_ore_max_vein_size", 4, 0, 100);
            nagatorium_ore_veins_per_chunk = builder.comment("Set nagatorium ore vein size (0 means disabled). [Default: 7]").defineInRange("nagatorium_ore_veins_per_chunk", 7, 0, 100);
            sakurajimarium_ore_max_vein_size = builder.comment("Set sakurajimarium ore vein size (0 means disabled). [Default: 3]").defineInRange("sakurajimarium_ore_max_vein_size", 3, 0, 100);
            sakurajimarium_ore_veins_per_chunk = builder.comment("Set sakurajimarium ore vein size (0 means disabled). [Default: 5]").defineInRange("sakurajimarium_ore_veins_per_chunk", 5, 0, 100);
            builder.pop();
            
            builder.push("End");
            element_od_max_vein_size = builder.comment("Set element od vein size (0 means disabled). [Default: 3]").defineInRange("element_od_max_vein_size", 3, 0, 100);
            element_od_veins_per_chunk = builder.comment("Set element od vein size (0 means disabled). [Default: 6]").defineInRange("element_od_veins_per_chunk", 6, 0, 100);
            builder.pop();
            builder.pop();
            
            enable_overworld_ores = builder.comment("Toggle generation of ores in the overworld dimension. [Default: true]").define("enable_overworld_ores", true);
            enable_nether_ores = builder.comment("Toggle generation of ores in the nether dimension. [Default: true]").define("enable_nether_ores", true);
            enable_end_ores = builder.comment("Toggle generation of ores in the end dimension. [Default: true]").define("enable_end_ores", true);
            builder.pop();

            builder.push("Content"); 
            builder.push("Ores");
            ore_particles = builder.comment("Toggle all particles from ores. [Default: true]").define("ore_particles", true);
            builder.pop();
            
            builder.push("Unstable");
            enable_unstable_explosion = builder.comment("Toggle explosions from unstable ingots after crafting, droppring and closing gui. To add an explosion timer to ingots you need to create a recipe with the nbt tag {Timer:TIME_IN_TICKS}. [Default: true]").define("enable_unstable_explosion", true);
            builder.pop();
            
            builder.push("Money");
            enable_money_sound = builder.comment("Toggle sounds from money when right clicked. [Default: true]").define("enable_money_sound", true);
            builder.pop();
            
            builder.push("Chaos Plank");
            enable_chaos_plank_sound = builder.comment("Toggle sounds from chaos plank when right clicked. [Default: true]").define("enable_chaos_plank_sound", true);
            builder.pop();
            builder.pop();
   
            builder.push("Integration");
            jei_descriptions = builder.comment("Toggle JEI descriptions. [Default: true]").define("jei_descriptions", true);
            top_tooltips = builder.comment("Toggle TOP tooltips. [Default: true]").define("top_tooltips", true);
            builder.pop();
            
            builder.push("Potion Effects");
            effects_enabled = builder.comment("Toggle all effects given by items. [Default: true]").define("all_potion_effects_enabled", true);
            
            ingot_effects_enabled = builder.comment("Toggle all ingot effects. [Default: true]").define("ingot_effects_enabled", true);
            ingot_base_amplifier = builder.comment("Set the base effect amplifier for ingots. [Default: 1]").defineInRange("ingot_base_amplifier", 1, 1, 255);
            ingot_base_duration = builder.comment("Set the base effect duration for ingots. [Default: 100]").defineInRange("ingot_base_duration", 100, 10, 72000);
            
            nugget_effects_enabled = builder.comment("Toggle all ingot effects. [Default: true]").define("nugget_effects_enabled", true);
            nugget_base_amplifier = builder.comment("Set the base effect amplifier for nuggets. [Default: 1]").defineInRange("nugget_base_amplifier", 1, 1, 255);
            nugget_base_duration = builder.comment("Set the base effect duration for nuggets. [Default: 40]").defineInRange("nugget_base_duration", 40, 10, 72000);
            
            block_effects_enabled = builder.comment("Toggle all block effects. [Default: true]").define("block_effects_enabled", true);
            block_base_amplifier = builder.comment("Set the base effect amplifier for blocks. [Default: 2]").defineInRange("block_base_amplifier", 2, 1, 255);
            block_base_duration = builder.comment("Set the base effect duration for blocks. [Default: 200]").defineInRange("block_base_duration", 200, 10, 72000);
          
            block_walking_effects_enabled = builder.comment("Toggle all block walking effects. [Default: true]").define("block_walking_effects_enabled", true);
            block_walking_base_amplifier = builder.comment("Set the base effect amplifier for block walking. [Default: 3]").defineInRange("block_walking_base_amplifier", 3, 1, 255);
            block_walking_base_duration = builder.comment("Set the base effect duration for block walking. [Default: 100]").defineInRange("block_walking_base_duration", 100, 10, 72000);
            builder.pop();
        }
    }
}