package net.thep2wking.oedldoedlresources.util.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.thep2wking.oedldoedlcore.api.integration.ModJERPluginBase;
import net.thep2wking.oedldoedlresources.integration.jer.OedldoedlResourcesJERPlugin;

public class ClientProxy extends CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}

	public void init(FMLInitializationEvent event) {
		super.init(event);
		ModJERPluginBase.registerPlugin(new OedldoedlResourcesJERPlugin());
	}

	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}