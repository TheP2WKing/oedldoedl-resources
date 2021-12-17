package com.thep2wking.oedldoedl.resources.blocks.ores;

import java.util.ArrayList;
import java.util.List;

import com.thep2wking.oedldoedl.core.OedldoedlCore;
import com.thep2wking.oedldoedl.core.config.CoreConfig;
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
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockElementOD extends Block implements IHasModel
{
    public BlockElementOD(String name, Material material)
	{
		super(material);
		setUnlocalizedName(ReferenceResources.MODID+":"+name);
		setRegistryName(ReferenceResources.MODID+":"+name);
		setSoundType(SoundType.STONE);
		setHardness(40.0F);
		setResistance(100.0F);
		setHarvestLevel("pickaxe", 4);
		setLightLevel(0.5F);
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
	public ArrayList<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState blockstate, int fortune)
	{
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();

		if(RANDOM.nextFloat()>0.80f) 
		{
			drops.add(new ItemStack(ItemInit.ITEM_TIMOFIUM_FRAGMENT, 1));
		}
		if(RANDOM.nextFloat()>0.80f) 
		{
			drops.add(new ItemStack(ItemInit.ITEM_FLOFINIUM_FRAGMENT, 1));
		}
		if(RANDOM.nextFloat()>0.80f) 
		{
			drops.add(new ItemStack(ItemInit.ITEM_LAARSIUM_FRAGMENT, 1));
		}
		if(RANDOM.nextFloat()>0.80f) 
		{
			drops.add(new ItemStack(ItemInit.ITEM_KLAARSIUM_FRAGMENT, 1));
		}
		if(RANDOM.nextFloat()>0.80f) 
		{
			drops.add(new ItemStack(ItemInit.ITEM_SHARANIUM_FRAGMENT, 1));
		}
		if(RANDOM.nextFloat()>0.80f) 
		{
			drops.add(new ItemStack(ItemInit.ITEM_MAKERIUM_FRAGMENT, 1));
		}
		if(RANDOM.nextFloat()>0.80f) 
		{
			drops.add(new ItemStack(ItemInit.ITEM_INDERIUM_FRAGMENT, 1));
		}
		if(RANDOM.nextFloat()>0.80f) 
		{
			drops.add(new ItemStack(ItemInit.ITEM_PUMARIUM_FRAGMENT, 1));
		}
		if(RANDOM.nextFloat()>0.80f) 
		{
			drops.add(new ItemStack(ItemInit.ITEM_CALLAXIUM_FRAGMENT, 1));
		}
		if(RANDOM.nextFloat()>0.80f) 
		{
			drops.add(new ItemStack(ItemInit.ITEM_SKORPIUM_FRAGMENT, 1));
		}
		if(RANDOM.nextFloat()>0.80f) 
		{
			drops.add(new ItemStack(ItemInit.ITEM_STUPIDIUM_FRAGMENT, 1));
		}
		return drops;
	}
    
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag advanced) 
	{
  		if (CoreConfig.GENEREL.tooltips.itemInformation) 
  		{
  			TooltipShiftInfo.addTooltipText(tooltip, new String[] 
  			{
  				TextFormatting.GREEN+I18n.format("item.oedldoedl.element_od.tip"),
  				TextFormatting.GREEN+I18n.format("item.oedldoedl.element_od.tip2"),
  			});
  		}
	}
}