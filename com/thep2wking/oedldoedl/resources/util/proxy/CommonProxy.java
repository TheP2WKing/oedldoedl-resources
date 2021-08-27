package com.thep2wking.oedldoedl.resources.util.proxy;

import com.thep2wking.oedldoedl.resources.integration.top.MainCompatHandler;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CommonProxy 
{
	public void preInit(FMLPreInitializationEvent event) 
	{
		MainCompatHandler.registerTOP();
	}

	public void Init(FMLInitializationEvent event) 
	{

	}

	public void postInit(FMLPostInitializationEvent event) 
	{

	}
}