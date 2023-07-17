package net.thep2wking.oedldoedlresources.config.categories;

import net.minecraftforge.common.config.Config;

public class Properties {
	@Config.Name("effects")
	public final Effects EFFECTS = new Effects();

	public static class Effects {
		@Config.Name("Potion Effects Enabled")
		public boolean EFFECTS_EBALED = true;

		@Config.Name("blocks")
		public final Blocks BLOCKS = new Blocks();

		@Config.Name("ingots")
		public final Ingots INGOTS = new Ingots();

		@Config.Name("nuggets")
		public final Nuggets NUGGETS = new Nuggets();
	}

	public static class Ingots {
		@Config.Name("Ingot Effects Enabled")
		public boolean INGOT_EFFECTS = true;

		@Config.Name("Ingot Base Amplifier")
		@Config.RangeInt(min = 1, max = 255)
		public int INGOT_BASE_AMPLIFIER = 1;

		@Config.Name("Ingot Base Duration")
		@Config.RangeInt(min = 10, max = 72000)
		public int INGOT_BASE_DURATION = 100;
	}

	public static class Nuggets {
		@Config.Name("Nugget Effects Enabled")
		public boolean NUGGET_EFFECTS = true;

		@Config.Name("Nugget Base Amplifier")
		@Config.RangeInt(min = 1, max = 255)
		public int NUGGET_BASE_AMPLIFIER = 1;

		@Config.Name("Nugget Base Duration")
		@Config.RangeInt(min = 10, max = 72000)
		public int NUGGET_BASE_DURATION = 40;
	}

	public static class Blocks {
		@Config.Name("Block Effects Enabled")
		public boolean BLOCK_EFFECTS = true;

		@Config.Name("Block Base Amplifier")
		@Config.RangeInt(min = 1, max = 255)
		public int BLOCK_BASE_AMPLIFIER = 2;

		@Config.Name("Block Base Duration")
		@Config.RangeInt(min = 10, max = 72000)
		public int BLOCK_BASE_DURATION = 200;

		@Config.Name("Block Walking On Effects Enabled")
		public boolean BLOCK_WALKING_EFFECTS = true;

		@Config.Name("Block Walking On Base Amplifier")
		@Config.RangeInt(min = 1, max = 255)
		public int BLOCK_WALKING_BASE_AMPLIFIER = 3;

		@Config.Name("Block Walking On Base Duration")
		@Config.RangeInt(min = 10, max = 72000)
		public int BLOCK_WALKING_BASE_DURATION = 100;
	}
}