package com.thep2wking.oedldoedl.resources.blocks.ores;

import java.util.ArrayList;
import java.util.List;

import com.thep2wking.oedldoedl.core.OedldoedlCore;
import com.thep2wking.oedldoedl.core.config.constants.CoreConst;
import com.thep2wking.oedldoedl.core.config.constants.ResourcesConst;
import com.thep2wking.oedldoedl.core.util.interfaces.IHasModel;
import com.thep2wking.oedldoedl.core.util.tooltips.TooltipShiftInfo;
import com.thep2wking.oedldoedl.resources.OedldoedlResources;
import com.thep2wking.oedldoedl.resources.ReferenceResources;
import com.thep2wking.oedldoedl.resources.init.BlockInit;
import com.thep2wking.oedldoedl.resources.init.ItemInit;
import com.thep2wking.oedldoedl.resources.integration.top.TOPInfoProvider;

import mcjty.theoneprobe.api.ElementAlignment;
import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockToujouriumGemOre extends Block implements IHasModel, TOPInfoProvider
{
    public BlockToujouriumGemOre(String name, Material material)
	{
		super(material);
		func_149663_c(ReferenceResources.MODID+":"+name);
		setRegistryName(ReferenceResources.MODID+":"+name);
		func_149672_a(SoundType.field_185851_d);
		func_149711_c(30.0F);
		func_149752_b(50.0F);
		setHarvestLevel("pickaxe", 3);
		func_149715_a(0.0F);
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
	public ArrayList<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState blockstate, int fortune)
	{
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		
		drops.add(new ItemStack(Items.field_190931_a, RANDOM.nextInt(100)+1));
		if(RANDOM.nextFloat()>0.99f) 
		{
			drops.add(new ItemStack(ItemInit.ITEM_TOUJOURIUM_GEM, 1));
		}
		return drops;
	}
    
	@Override
	@SideOnly(Side.CLIENT)
	public void func_190948_a(ItemStack stack, World world, List<String> tooltip, ITooltipFlag advanced) 
	{
  		if (CoreConst.ITEM_INFORMATION) 
  		{
  			TooltipShiftInfo.addTooltipText(tooltip, new String[] 
  			{
  				TextFormatting.GREEN+I18n.func_135052_a("item.oedldoedl.toujourium_gem_ore.tip"),
  				TextFormatting.RED+I18n.func_135052_a("item.oedldoedl.toujourium_gem_ore.tip2"),
  			});
  		}
	}
	
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) 
    {
  		if (CoreConst.ITEM_INFORMATION  && ResourcesConst.TOUJOURIUM_GEM_ORE) 
  		{
  			probeInfo.horizontal(probeInfo.defaultLayoutStyle().alignment(ElementAlignment.ALIGN_CENTER))
  			.text(TextFormatting.RED+"1 in 100 Chance --> ")
  			.item(new ItemStack(Item.func_111206_d("oedldoedlresources:toujourium_gem")));
  		}
    }
}