package com.thep2wking.oedldoedl.resources.util.proxy;

import com.thep2wking.oedldoedl.resources.config.ResourcesConfig;
import com.thep2wking.oedldoedl.resources.integration.top.MainCompatHandler;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy 
{
	public void preInit(FMLPreInitializationEvent event) 
	{
		if (ResourcesConfig.INTEGRATION.topDeveloperReferences)
		{
			MainCompatHandler.registerTOP();
		}	
	}

	public void Init(FMLInitializationEvent event) 
	{

	}

	public void postInit(FMLPostInitializationEvent event) 
	{

	}
}