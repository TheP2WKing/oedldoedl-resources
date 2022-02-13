package net.thep2wking.oedldoedlresources.world;

import net.minecraft.block.Block;
import net.minecraftforge.common.util.Lazy;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;
import net.thep2wking.oedldoedlresources.init.ModBlocks;

public enum ModOreType 
{
	//overworld
	RANDOMITE_ORE(Lazy.of(ModBlocks.RANDOMITE_ORE), ResourcesConfig.randomite_ore_max_vein_size.get(), 1, 256, ResourcesConfig.randomite_ore_veins_per_chunk.get()),
	OEDLDOEDL_ORE(Lazy.of(ModBlocks.OEDLDOEDL_ORE), ResourcesConfig.oedldoedl_ore_max_vein_size.get(), 1, 10, ResourcesConfig.oedldoedl_ore_veins_per_chunk.get()),
	ENDER_ORE(Lazy.of(ModBlocks.ENDER_ORE), ResourcesConfig.ender_ore_max_vein_size.get(), 10, 20, ResourcesConfig.ender_ore_veins_per_chunk.get()),
	GUNPOWDER_ORE(Lazy.of(ModBlocks.GUNPOWDER_ORE), ResourcesConfig.gunpowder_ore_max_vein_size.get(), 40, 70, ResourcesConfig.gunpowder_ore_veins_per_chunk.get()),
	SALT_ORE(Lazy.of(ModBlocks.SALT_ORE), ResourcesConfig.salt_ore_max_vein_size.get(), 1, 256, ResourcesConfig.salt_ore_veins_per_chunk.get()),
	
	//nether
	NETHER_GREMORIUM_ORE(Lazy.of(ModBlocks.NETHER_GREMORIUM_ORE), ResourcesConfig.gremorium_ore_max_vein_size.get(), 4, 9, ResourcesConfig.gremorium_ore_veins_per_chunk.get()),
	NETHER_HIMEJIMARIUM_ORE(Lazy.of(ModBlocks.NETHER_HIMEJIMARIUM_ORE), ResourcesConfig.himejimarium_ore_max_vein_size.get(), 9, 21, ResourcesConfig.himejimarium_ore_veins_per_chunk.get()),
	NETHER_TOUJOURIUM_ORE(Lazy.of(ModBlocks.NETHER_TOUJOURIUM_ORE), ResourcesConfig.toujourium_ore_max_vein_size.get(), 11, 29, ResourcesConfig.toujourium_ore_veins_per_chunk.get()),
	NETHER_ARGENTORIUM_ORE(Lazy.of(ModBlocks.NETHER_ARGENTORIUM_ORE), ResourcesConfig.argentorium_ore_max_vein_size.get(), 5, 11, ResourcesConfig.argentorium_ore_veins_per_chunk.get()),
	NETHER_QUARTARIUM_ORE(Lazy.of(ModBlocks.NETHER_QUARTARIUM_ORE), ResourcesConfig.quartarium_ore_max_vein_size.get(), 2, 14, ResourcesConfig.quartarium_ore_veins_per_chunk.get()),
	NETHER_NAGATORIUM_ORE(Lazy.of(ModBlocks.NETHER_NAGATORIUM_ORE), ResourcesConfig.nagatorium_ore_max_vein_size.get(), 1, 4, ResourcesConfig.nagatorium_ore_veins_per_chunk.get()),
	NETHER_SAKURAJIMARIUM_ORE(Lazy.of(ModBlocks.NETHER_SAKURAJIMARIUM_ORE), ResourcesConfig.sakurajimarium_ore_max_vein_size.get(), 2, 12, ResourcesConfig.sakurajimarium_ore_veins_per_chunk.get()),
	
	//end
	END_ELEMENT_OD(Lazy.of(ModBlocks.END_ELEMENT_OD), ResourcesConfig.element_od_max_vein_size.get(), 1, 256, ResourcesConfig.element_od_veins_per_chunk.get()),
	;
	
    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;
    private final int veinsPerChunk;

	ModOreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight, int veinsPerChunk) 
	{
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.veinsPerChunk = veinsPerChunk;
    }
	
    public Lazy<Block> getBlock() 
    {
        return block;
    }
	
    public int getMaxVeinSize() 
    {
    	
        return maxVeinSize;
    }

    public int getMinHeight() 
    {
        return minHeight;
    }

    public int getMaxHeight() 
    {
        return maxHeight;
    }
    
    public int getVeinsPerChunk() 
    {
        return veinsPerChunk;
    }

    public static ModOreType get(Block block) 
    {
        for (ModOreType ore : values()) 
        {
            if(block == ore.block) 
            {
                return ore;
            }
        }
        return null;
    }
}