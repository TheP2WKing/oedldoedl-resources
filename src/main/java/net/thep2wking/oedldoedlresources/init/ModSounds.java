package net.thep2wking.oedldoedlresources.init;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.thep2wking.oedldoedlcore.config.CoreConfig;
import net.thep2wking.oedldoedlresources.OedldoedlResources;

public class ModSounds 
{
	//deferred register
	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, OedldoedlResources.MODID);
	
	//sounds
	public static final RegistryObject<SoundEvent> MONEY = registerSoundEvent("money");
	public static final RegistryObject<SoundEvent> APPLAUSE = registerSoundEvent("applause");
	
	private static RegistryObject<SoundEvent> registerSoundEvent(String name)
	{
		return SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(OedldoedlResources.MODID, name)));
	}
	
	public static void register(IEventBus eventBus)
	{
		SOUNDS.register(eventBus);
		
		if (CoreConfig.general_logging.get()) {OedldoedlResources.LOGGER.info("Registerd Sounds for " + OedldoedlResources.MODID + "!");}
	}
}
