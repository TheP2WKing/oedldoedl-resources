package com.thep2wking.oedldoedl.resources.blocks.ores;

import java.util.List;
import java.util.Random;

import com.thep2wking.oedldoedl.core.OedldoedlCore;
import com.thep2wking.oedldoedl.core.config.CoreConfig;
import com.thep2wking.oedldoedl.core.util.interfaces.IHasModel;
import com.thep2wking.oedldoedl.core.util.tooltips.TooltipAltOriginInfo;
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
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockSulfurOre extends Block implements IHasModel
{
    public BlockSulfurOre(String name, Material material)
	{
		super(material);
		setUnlocalizedName(ReferenceResources.MODID+":"+name);
		setRegistryName(ReferenceResources.MODID+":"+name);
		setSoundType(SoundType.STONE);
		setHardness(6.0F);
		setResistance(20.0F);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(0F);
		setLightOpacity(0);
		setCreativeTab(OedldoedlResources.TAB);
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
    
	@Override
	@SideOnly (Side.CLIENT)
	public void registerModels() 
	{
		OedldoedlCore.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return ItemInit.ITEM_SULFUR_DUST;
	}
	
	@Override
	public int quantityDropped(Random rand) 
	{
		int max = 3;
		int min = 1;
		return rand.nextInt(max) + min;
	}
	
	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune)
	{
		Random rand = world instanceof World ? ((World)world).rand : new Random();
			if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this))
				{
					int i = 0;
					if (this == BlockInit.BLOCK_SULFUR_ORE)
					{
						i = MathHelper.getInt(rand, 1, 3);
					}
					return i;
				}
				return 0;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag advanced) 
	{
  		if (CoreConfig.GENEREL.tooltips.itemInformation) 
  		{
  			TooltipShiftInfo.addTooltipText(tooltip, new String[] 
  			{
  				TextFormatting.GREEN+I18n.format("item.oedldoedl.sulfur_ore.tip"),
  			});
  		}
  		
  		if (CoreConfig.GENEREL.tooltips.originInformation) 
  		{
  			TooltipAltOriginInfo.addTooltipText(tooltip, new String[] 
  			{
  				TextFormatting.DARK_AQUA+""+TextFormatting.ITALIC+I18n.format("item.oedldoedl.rail.origin.tip"),
  			});
  		}
	}
}