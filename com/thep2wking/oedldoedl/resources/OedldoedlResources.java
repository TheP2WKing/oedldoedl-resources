package com.thep2wking.oedldoedl.resources;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.thep2wking.oedldoedl.core.config.constants.CoreConst;
import com.thep2wking.oedldoedl.resources.util.handler.OreDictionaryHandler;
import com.thep2wking.oedldoedl.resources.util.handler.RegistryHandler;
import com.thep2wking.oedldoedl.resources.util.proxy.CommonProxy;
import com.thep2wking.oedldoedl.resources.util.recipes.FurnaceRecipes;
import com.thep2wking.oedldoedl.resources.util.tabs.TabOedldoedlResources;
import com.thep2wking.oedldoedl.resources.util.world.WorldGenNetherOres;
import com.thep2wking.oedldoedl.resources.util.world.WorldGenOverworldOres;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = ReferenceResources.MODID, name = ReferenceResources.NAME, version = ReferenceResources.VERSION, dependencies = ReferenceResources.DEPENDENCIES)

public class OedldoedlResources 
{
	public static final Logger logger = LogManager.getLogger(ReferenceResources.NAME);
	
	@SidedProxy(clientSide = ReferenceResources.CLIENT_PROXY_CLASS, serverSide = ReferenceResources.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
    @Instance
    public static OedldoedlResources instance;
    
    public static final CreativeTabs TAB = new TabOedldoedlResources("tab_oedldoedl_resources");
	
	@EventHandler
	public static void preInt(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);
		logger.info("Starting FML Pre-Initialization");
		RegistryHandler.preInitRegistries(event);
		GameRegistry.registerWorldGenerator(new WorldGenOverworldOres(), 1);
		GameRegistry.registerWorldGenerator(new WorldGenNetherOres(), 1);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		proxy.Init(event);
		logger.info("Starting FML Initialization");
  		if (CoreConst.OREDICT_ENTRIES) 
  		{
  			OreDictionaryHandler.registerOreDictionary();
  		}
  		if (CoreConst.FURNACE_RECIPES) 
  		{
  			FurnaceRecipes.init();
  		}
		System.out.println("Oedldoedl Core Mod is installed: "+Loader.isModLoaded("oedldoedlcore"));
		System.out.println("TOP is installed: "+Loader.isModLoaded("theoneprobe"));
		System.out.println("CCL is installed: "+Loader.isModLoaded("codechickenlib"));
		System.out.println("Avaritia is installed: "+Loader.isModLoaded("avaritia"));
	}
   
	@EventHandler
	public static void postinit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
		logger.info("Starting FML Post-Initialization");
	}	
	
	@EventHandler
	public void loadComplete(FMLLoadCompleteEvent event) 
	{
		logger.info(ReferenceResources.NAME+" "+ReferenceResources.VERSION+" loaded!");
	}  
}