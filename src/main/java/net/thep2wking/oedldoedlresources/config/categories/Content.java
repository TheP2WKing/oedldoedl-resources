package net.thep2wking.oedldoedlresources.config.categories;

import net.minecraftforge.common.config.Config;

public class Content {
	@Config.Name("Money Sound")
	public boolean MONEY_SOUND = true;

	@Config.Name("Chaos Plank Sound")
	public boolean CHAOS_PLANK_SOUND = true;

	@Config.Name("Ender Ore Particles")
	public boolean ENDER_ORE_PARTICLES = true;

	@Config.Name("Randomite Random Drops")
	public boolean RANDOMITE_RANDOM_DROPS = true;

	@Config.Name("Element OD Random Drops")
	public boolean ELEMENT_OD_RANDOM_DROPS = true;

	@Config.Name("Element OD Max Drop")
	@Config.RangeInt(min = 0, max = 100)
	public int ELEMENT_OD_MAX_DROP = 4;

	@Config.Name("Uranium Powder Ore Explodes")
	public boolean URANIUM_POWER_ORE_EXPLODES = true;

	@Config.Name("Uranium Powder Ore Drop Chance")
	@Config.RangeDouble(min = 0, max = 1)
	public double URANIUM_POWER_ORE_DROP_CHANCE = 0.3;
}