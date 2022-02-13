package net.thep2wking.oedldoedlresources.content.block.ore;

import java.util.Random;

import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;
import net.thep2wking.oedldoedlcore.base.ModOreBlockBase;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;

public class EnderOreBlock extends ModOreBlockBase
{
	public EnderOreBlock(SoundType sound, int harvestLevel, float hardness, float resistance, ToolType toolType, int lightLevel, int minXp, int maxXp, Properties properties) 
	{
		super(sound, harvestLevel, hardness, resistance, toolType, lightLevel, minXp, maxXp, properties);
	}

	@OnlyIn(Dist.CLIENT)
	public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) 
	{
		if (ResourcesConfig.ore_particles.get())
		{
			spawnParticles(worldIn, pos);
		}
	}
	
	private static void spawnParticles(World world, BlockPos worldIn) 
	{
		Random random = world.rand;
		for(Direction direction : Direction.values()) 
		{
			BlockPos blockpos = worldIn.offset(direction);
	        if (!world.getBlockState(blockpos).isOpaqueCube(world, blockpos)) 
	        {
	        	Direction.Axis direction$axis = direction.getAxis();
	            double d1 = direction$axis == Direction.Axis.X ? 0.5D + 0.5625D * (double)direction.getXOffset() : (double)random.nextFloat();
	            double d2 = direction$axis == Direction.Axis.Y ? 0.5D + 0.5625D * (double)direction.getYOffset() : (double)random.nextFloat();
	            double d3 = direction$axis == Direction.Axis.Z ? 0.5D + 0.5625D * (double)direction.getZOffset() : (double)random.nextFloat();
	            world.addParticle(ParticleTypes.PORTAL, (double)worldIn.getX() + d1, (double)worldIn.getY() + d2, (double)worldIn.getZ() + d3, 0.0D, 0.0D, 0.0D);
	        }
		}
	}
}