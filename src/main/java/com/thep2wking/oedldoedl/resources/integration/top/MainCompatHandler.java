package com.thep2wking.oedldoedl.resources.integration.top;

import net.minecraftforge.fml.common.Loader;

public class MainCompatHandler 
{
    public static void registerTOP() 
    {
        if (Loader.isModLoaded("theoneprobe")) 
        {
            TOPCompatibility.register();
        }
    }
}