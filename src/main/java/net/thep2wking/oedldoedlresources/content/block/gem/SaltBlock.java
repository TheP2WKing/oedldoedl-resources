package net.thep2wking.oedldoedlresources.content.block.gem;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class SaltBlock extends Block
{
	public SoundType sound = SoundType.STONE;
	public float hardness;
	public float resistance;
	public ToolType toolType;
	public int lightLevel;
	
	public SaltBlock(SoundType sound, float hardness, float resistance, ToolType toolType, int lightLevel, Properties properties) 
	{
		super(properties.harvestTool(toolType).setRequiresTool().hardnessAndResistance(hardness, resistance));
		this.sound = sound;
		this.hardness = hardness;
		this.resistance = resistance;
		this.toolType = toolType;
		this.lightLevel = lightLevel;
	}

    @Override
    public SoundType getSoundType(BlockState state) 
    {
    	return sound;
    }
    
	@Override
	public int getLightValue(BlockState state, IBlockReader world, BlockPos pos) 
	{
		return lightLevel;
	}
}