package net.thep2wking.oedldoedlresources;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.thep2wking.oedldoedlcore.config.CoreConfig;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;
import net.thep2wking.oedldoedlresources.init.ModBlocks;
import net.thep2wking.oedldoedlresources.init.ModItems;
import net.thep2wking.oedldoedlresources.init.ModSounds;
import net.thep2wking.oedldoedlresources.integration.TOPCompat;

@Mod(OedldoedlResources.MODID)
public class OedldoedlResources
{
	public static final String MODID = "oedldoedlresources";
	public static final String NAME = "Oedldoedl Resources";
	public static final String VERSION = "1.16.5-3.2.0";
	
	public static OedldoedlResources INSTANCE;
	
    public static final Logger LOGGER = LogManager.getLogger();

    public OedldoedlResources() 
    {
    	ResourcesConfig.init();
    	
    	if (CoreConfig.general_logging.get()) {LOGGER.info("Registerd Config for" + MODID + "!");}
    	
    	IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	
    	ModBlocks.register(eventBus);
    	ModItems.register(eventBus);
    	ModSounds.register(eventBus);
    	
    	eventBus.addListener(this::onCommonSetup);
    	eventBus.addListener(this::onClientSetup);
    	eventBus.addListener(this::onEnqueueIMC);
    	eventBus.addListener(this::onLoadComplete);
        
        MinecraftForge.EVENT_BUS.register(this);
    }

	private void onCommonSetup(final FMLCommonSetupEvent event)
    {	
    	if (CoreConfig.general_logging.get()) {LOGGER.info("Registerd Common Setup for" + MODID + "!");}
    }

	private void onClientSetup(final FMLClientSetupEvent event) 
    {
		RenderTypeLookup.setRenderLayer(ModBlocks.DRUNKIUM.get(), RenderType.getTranslucent());
		
    	if (CoreConfig.general_logging.get()) {LOGGER.info("Registerd Client Setup for" + MODID + "!");}
    }
	
	private void onEnqueueIMC(final InterModEnqueueEvent event) 
    {
        if (ModList.get().isLoaded("theoneprobe"))
        {
            TOPCompat.register();
        }
    }
	
	private void onLoadComplete(final FMLLoadCompleteEvent event) 
	{
    	if (CoreConfig.integrations_logging.get() && ModList.get().isLoaded("jei")) {LOGGER.info("Loaded JEI Compat for" + MODID + "!");}
    	if (CoreConfig.integrations_logging.get() && ModList.get().isLoaded("theoneprobe")) {LOGGER.info("Loaded TOP Compat for" + MODID + "!");}
    	if (CoreConfig.integrations_logging.get() && ModList.get().isLoaded("ctm")) {LOGGER.info("Loaded CTM Compat for" + MODID + "!");}
    	if (CoreConfig.integrations_logging.get() && ModList.get().isLoaded("configured")) {LOGGER.info("Loaded Configured Compat for" + MODID + "!");}
    	
    	if (CoreConfig.general_logging.get()) {LOGGER.info(NAME + " " + VERSION + " successfully loaded!");}
	}
}