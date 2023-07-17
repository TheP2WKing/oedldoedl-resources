package net.thep2wking.oedldoedlresources;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.OedldoedlCore;
import net.thep2wking.oedldoedlcore.config.CoreConfig;
import net.thep2wking.oedldoedlcore.init.ModItems;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.ModReferences;
import net.thep2wking.oedldoedlresources.util.proxy.CommonProxy;

@Mod(modid = OedldoedlResources.MODID, name = OedldoedlResources.NAME, version = OedldoedlResources.VERSION, dependencies = OedldoedlResources.DEPENDENCIES)
public class OedldoedlResources {
    public static final String MODID = "oedldoedlresources";
    public static final String PREFIX = MODID + ":";
    public static final String MC_VERSION = "1.12.2";
    public static final String NAME = "Oedldoedl Resources";
    public static final String VERSION = MC_VERSION + "-" + "3.0.0";
    public static final String DEPENDENCIES = "required-after:forge@[14.23.5.2847,);required-after:oedldoedlcore@[1.12.2-3.0.0,);";
    public static final String CLIENT_PROXY_CLASS = "net.thep2wking.oedldoedlresources.util.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "net.thep2wking.oedldoedlresources.util.proxy.ServerProxy";

    @Instance
    public static OedldoedlResources INSTANCE;

    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
    public static CommonProxy PROXY;

	public static final CreativeTabs TAB = new CreativeTabs(OedldoedlResources.MODID + ".name") {
		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.RESOURCES_ICON, 1, 0);
		}

		@Override
		@SideOnly(Side.CLIENT)
		public ResourceLocation getBackgroundImage() {
			return ModReferences.CREATIVE_TAB_DARK;
		}
	};
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModLogger.preInitLogger(MODID);
        PROXY.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModLogger.initLogger(MODID);
        PROXY.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        ModLogger.postInitLogger(MODID);
        PROXY.postInit(event);
    }

    @Mod.EventHandler
    public void loadComplete(FMLLoadCompleteEvent event) {
        ModLogger.loadCompleteLogger(MODID, VERSION);
    }

    @Mod.EventBusSubscriber
    public static class ModJoinMessage {
        @SubscribeEvent
        public static void addJoinMessage(PlayerLoggedInEvent event) {
            if (CoreConfig.LOGGING.JOIN_MESSAGES) {
                event.player.sendMessage(ModReferences.defaultJoinMessage(NAME, OedldoedlCore.MODID, VERSION));
            }
        }
    }
}