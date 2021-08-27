package com.thep2wking.oedldoedl.resources.blocks.ores;

import java.util.List;
import java.util.Random;

import com.thep2wking.oedldoedl.core.OedldoedlCore;
import com.thep2wking.oedldoedl.core.config.constants.CoreConst;
import com.thep2wking.oedldoedl.core.util.interfaces.IHasModel;
import com.thep2wking.oedldoedl.core.util.tooltips.TooltipShiftInfo;
import com.thep2wking.oedldoedl.resources.OedldoedlResources;
import com.thep2wking.oedldoedl.resources.ReferenceResources;
import com.thep2wking.oedldoedl.resources.init.BlockInit;
import com.thep2wking.oedldoedl.resources.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockSaltOre extends Block implements IHasModel
{
    public BlockSaltOre(String name, Material material)
	{
		super(material);
		func_149663_c(ReferenceResources.MODID+":"+name);
		setRegistryName(ReferenceResources.MODID+":"+name);
		func_149672_a(SoundType.field_185851_d);
		func_149711_c(3.0F);
		func_149752_b(10.0F);
		func_149715_a(0F);
		func_149713_g(0);
		func_149647_a(OedldoedlResources.TAB);
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
    
	@Override
	@SideOnly (Side.CLIENT)
	public void registerModels() 
	{
		OedldoedlCore.proxy.registerItemRenderer(Item.func_150898_a(this), 0, "inventory");
	}
	
	@Override
	public Item func_180660_a(IBlockState state, Random rand, int fortune) 
	{
		return ItemInit.ITEM_SALT_DUST;
	}
	
	@Override
	public int func_149745_a(Random rand) 
	{
		int max = 4;
		int min = 2;
		return rand.nextInt(max) + min;
	}
	
	@Override
	public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
	{
		Random rand = world instanceof World ? ((World)world).field_73012_v : new Random();
			if (this.func_180660_a(state, rand, fortune) != Item.func_150898_a(this))
				{
					int i = 0;
					if (this == BlockInit.BLOCK_SALT_ORE)
					{
						i = MathHelper.func_76136_a(rand, 0, 3);
					}
					return i;
				}
				return 0;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void func_190948_a(ItemStack stack, World world, List<String> tooltip, ITooltipFlag advanced) 
	{
  		if (CoreConst.ITEM_INFORMATION) 
  		{
  			TooltipShiftInfo.addTooltipText(tooltip, new String[] 
  			{
  				TextFormatting.GREEN+I18n.func_135052_a("item.oedldoedl.salt_ore.tip"),
  			});
  		}
	}
}