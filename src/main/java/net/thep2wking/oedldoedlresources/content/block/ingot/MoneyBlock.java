package net.thep2wking.oedldoedlresources.content.block.ingot;


import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.thep2wking.oedldoedlcore.base.ModBlockBase;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;
import net.thep2wking.oedldoedlresources.init.ModSounds;

public class MoneyBlock extends ModBlockBase 
{
	public MoneyBlock(SoundType sound, int harvestLevel, float hardness, float resistance, ToolType toolType, int lightLevel, Properties properties) 
	{
		super(sound, harvestLevel, hardness, resistance, toolType, lightLevel, properties);
	}

	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) 
	{
		if (ResourcesConfig.enable_money_sound.get())
		{
			if (!worldIn.isRemote)
			{
				if (handIn == Hand.MAIN_HAND)
				{
					worldIn.playSound(null, pos, ModSounds.MONEY.get(), SoundCategory.BLOCKS, 1f, 1f);
				}
			}
			return ActionResultType.SUCCESS;
		}
        return ActionResultType.PASS;
	}
}