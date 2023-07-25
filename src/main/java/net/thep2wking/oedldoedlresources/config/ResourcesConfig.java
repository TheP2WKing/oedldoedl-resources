package net.thep2wking.oedldoedlresources.config;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thep2wking.oedldoedlcore.util.ModReferences;
import net.thep2wking.oedldoedlresources.OedldoedlResources;
import net.thep2wking.oedldoedlresources.config.categories.Content;
import net.thep2wking.oedldoedlresources.config.categories.Properties;
import net.thep2wking.oedldoedlresources.config.categories.Recipes;
import net.thep2wking.oedldoedlresources.config.categories.World;

@Config(modid = OedldoedlResources.MODID, name = ModReferences.BASE_MODID + "/"
        + OedldoedlResources.MODID, category = OedldoedlResources.MODID)
public class ResourcesConfig {
    @Config.Name("content")
    public static final Content CONTENT = new Content();

    @Config.Name("properties")
    public static final Properties PROPERTIES = new Properties();

    @Config.Name("recipes")
    public static final Recipes RECIPES = new Recipes();

    @Config.Name("world")
    public static final World WORLD = new World();
    
    @Mod.EventBusSubscriber
    public static class ConfigHolder {
        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(OedldoedlResources.MODID)) {
                ConfigManager.sync(OedldoedlResources.MODID, Config.Type.INSTANCE);
            }
        }
    }
}