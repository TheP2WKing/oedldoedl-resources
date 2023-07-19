package net.thep2wking.oedldoedlresources.content.block.ore;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.thep2wking.oedldoedlcore.api.block.ModBlockOreBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;

public class BlockRandomiteOre extends ModBlockOreBase {
	public BlockRandomiteOre(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material, SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness, float resistance, float lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance, lightLevel);
	}
}