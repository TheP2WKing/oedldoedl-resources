package net.thep2wking.oedldoedlresources.config.categories;

import net.minecraftforge.common.config.Config;

public class Integration {
	@Config.Name("jei")
	public final JEI JEI = new JEI();

	public static class JEI {
		@Config.Name("Randomite Drops Recipe Category")
		public boolean RANDOMITE_DROPS_RECIPE_CATEGORY = true;
	}
}