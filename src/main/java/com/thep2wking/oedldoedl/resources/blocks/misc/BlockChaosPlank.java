package com.thep2wking.oedldoedl.resources.blocks.misc;

import java.util.List;

import com.thep2wking.oedldoedl.core.OedldoedlCore;
import com.thep2wking.oedldoedl.core.config.CoreConfig;
import com.thep2wking.oedldoedl.core.util.interfaces.IHasModel;
import com.thep2wking.oedldoedl.core.util.tooltips.TooltipAltOriginInfo;
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
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockChaosPlank extends Block implements IHasModel, TOPInfoProvider
{
    public BlockChaosPlank(String name, Material material)
	{
    	super(material);
		setUnlocalizedName(ReferenceResources.MODID+":"+name);
		setRegistryName(ReferenceResources.MODID+":"+name);
		setSoundType(SoundType.ANVIL);
		setHardness(10000.0F);
		setResistance(100000.0F);
		setHarvestLevel("Unbreakable", 10);
		setLightLevel(0.0F);
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
    public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon) 
    {
        return true;
    }
    
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag advanced) 
	{
  		if (CoreConfig.GENEREL.tooltips.itemInformation) 
  		{
  			TooltipShiftInfo.addTooltipText(tooltip, new String[] 
  			{
  				TextFormatting.GREEN+I18n.format("item.oedldoedl.chaos_plank.tip"),
  				TextFormatting.GREEN+I18n.format("item.oedldoedl.chaos_plank.tip2"),
  				TextFormatting.GREEN+I18n.format("item.oedldoedl.chaos_plank.tip3"),
  				TextFormatting.GREEN+I18n.format("item.oedldoedl.chaos_plank.tip4"),
  				TextFormatting.GREEN+I18n.format("item.oedldoedl.chaos_plank.tip5"),
  			});
  		}
  		
  		if (CoreConfig.GENEREL.tooltips.originInformation) 
  		{
  			TooltipAltOriginInfo.addTooltipText(tooltip, new String[] 
  			{
  				TextFormatting.DARK_AQUA+""+TextFormatting.ITALIC+I18n.format("item.oedldoedl.po3.origin.tip"),
  			});
  		}
	}
	
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) 
    {
  		if (CoreConfig.GENEREL.tooltips.itemInformation) 
  		{
  			probeInfo.horizontal(probeInfo.defaultLayoutStyle().alignment(ElementAlignment.ALIGN_CENTER))
  			.text(TextFormatting.GRAY+"Sharan did nothing, AGAIN!");
  		}
    }
}