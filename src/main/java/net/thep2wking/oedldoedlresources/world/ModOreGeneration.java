package net.thep2wking.oedldoedlresources.world;

import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.Dimension;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;

public class ModOreGeneration 
{
    public static void generateOres(final BiomeLoadingEvent event) 
    {
    	//overworld
    	if (ResourcesConfig.enable_overworld_ores.get())
    	{
	        spawnOreInAllBiomes(ModOreType.RANDOMITE_ORE, event, Dimension.OVERWORLD.toString());
	        spawnOreInAllBiomes(ModOreType.SALT_ORE, event, Dimension.OVERWORLD.toString());
	        spawnOreInAllBiomes(ModOreType.GUNPOWDER_ORE, event, Dimension.OVERWORLD.toString());
	        spawnOreInAllBiomes(ModOreType.ENDER_ORE, event, Dimension.OVERWORLD.toString());
	        spawnOreInAllBiomes(ModOreType.OEDLDOEDL_ORE, event, Dimension.OVERWORLD.toString());
    	}
        
        //nether
    	if (ResourcesConfig.enable_nether_ores.get())
    	{
	        spawnOreInAllBiomes(ModOreType.NETHER_GREMORIUM_ORE, event, Dimension.THE_NETHER.toString());
	        spawnOreInAllBiomes(ModOreType.NETHER_HIMEJIMARIUM_ORE, event, Dimension.THE_NETHER.toString());
	        spawnOreInAllBiomes(ModOreType.NETHER_TOUJOURIUM_ORE, event, Dimension.THE_NETHER.toString());
	        spawnOreInAllBiomes(ModOreType.NETHER_ARGENTORIUM_ORE, event, Dimension.THE_NETHER.toString());
	        spawnOreInAllBiomes(ModOreType.NETHER_QUARTARIUM_ORE, event, Dimension.THE_NETHER.toString());
	        spawnOreInAllBiomes(ModOreType.NETHER_NAGATORIUM_ORE, event, Dimension.THE_NETHER.toString());
	        spawnOreInAllBiomes(ModOreType.NETHER_SAKURAJIMARIUM_ORE, event, Dimension.THE_NETHER.toString());
    	}
        
        //end
    	if (ResourcesConfig.enable_end_ores.get())
    	{
    		spawnOreInAllBiomes(ModOreType.END_ELEMENT_OD, event, Dimension.THE_END.toString());
    	}
    }

    private static OreFeatureConfig getOverworldFeatureConfig(ModOreType ore) 
    {
        return new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ore.getBlock().get().getDefaultState(), ore.getMaxVeinSize());
    }

    private static OreFeatureConfig getNetherFeatureConfig(ModOreType ore) 
    {
        return new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, ore.getBlock().get().getDefaultState(), ore.getMaxVeinSize());
    }

    private static OreFeatureConfig getEndFeatureConfig(ModOreType ore) 
    {
        return new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), ore.getBlock().get().getDefaultState(), ore.getMaxVeinSize());
    }

    private static ConfiguredFeature<?, ?> makeOreFeature(ModOreType ore, String dimensionToSpawnIn) 
    {
        OreFeatureConfig oreFeatureConfig = null;

        if(dimensionToSpawnIn.equals(Dimension.OVERWORLD.toString()))
        {
        	oreFeatureConfig = getOverworldFeatureConfig(ore);
        } 
        else if(dimensionToSpawnIn.equals(Dimension.THE_NETHER.toString()) && ResourcesConfig.enable_nether_ores.get())
        {
            oreFeatureConfig = getNetherFeatureConfig(ore);
        } 
        else if(dimensionToSpawnIn.equals(Dimension.THE_END.toString()) && ResourcesConfig.enable_end_ores.get())
        {
            oreFeatureConfig = getEndFeatureConfig(ore);
        }

        ConfiguredPlacement<TopSolidRangeConfig> configuredPlacement = Placement.RANGE.configure(new TopSolidRangeConfig(ore.getMinHeight(), ore.getMinHeight(), ore.getMaxHeight()));
        return registerOreFeature(ore, oreFeatureConfig, configuredPlacement);
    }

    private static void spawnOreInAllBiomes(ModOreType currentOreType, final BiomeLoadingEvent event, String dimension) 
    {
        event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, makeOreFeature(currentOreType, dimension));
    }

    private static ConfiguredFeature<?, ?> registerOreFeature(ModOreType ore, OreFeatureConfig oreFeatureConfig, @SuppressWarnings("rawtypes") ConfiguredPlacement configuredPlacement) 
    {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, ore.getBlock().get().getRegistryName(), 
        		Feature.ORE.withConfiguration(oreFeatureConfig).withPlacement(configuredPlacement).square().count(ore.getVeinsPerChunk()));
    }
}