package net.thep2wking.oedldoedlresources.registry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.thep2wking.oedldoedlcore.OedldoedlCore;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.ModRecipeHelper;
import net.thep2wking.oedldoedlresources.init.ModBlocks;
import net.thep2wking.oedldoedlresources.init.ModItems;

public class ModRecipes {
	public static void registerOreDict() {
		ModLogger.registeredOreDictLogger(OedldoedlCore.MODID);

		ModRecipeHelper.addOreDict("randomiteDrop", Items.COAL, 0);
		ModRecipeHelper.addOreDict("randomiteDrop", Items.DYE, 4);
		ModRecipeHelper.addOreDict("randomiteDrop", Items.REDSTONE, 0);
		ModRecipeHelper.addOreDict("randomiteDrop", Items.QUARTZ, 0);
		ModRecipeHelper.addOreDict("randomiteDrop", Items.DIAMOND, 0);
		ModRecipeHelper.addOreDict("randomiteDrop", Items.EMERALD, 0);
		ModRecipeHelper.addOreDict("randomiteDrop", Blocks.IRON_ORE, 0);
		ModRecipeHelper.addOreDict("randomiteDrop", Blocks.GOLD_ORE, 0);
		ModRecipeHelper.addOreDict("randomiteDrop", Items.EGG, 0);
		ModRecipeHelper.addOreDict("randomiteDrop", Items.SLIME_BALL, 0);
		ModRecipeHelper.addOreDict("randomiteDrop", Items.PRISMARINE_CRYSTALS, 0);
		ModRecipeHelper.addOreDict("randomiteDrop", Items.PRISMARINE_SHARD, 0);
		ModRecipeHelper.addOreDict("randomiteDrop", Items.CLAY_BALL, 0);
		ModRecipeHelper.addOreDict("randomiteDrop", Items.GUNPOWDER, 0);
		ModRecipeHelper.addOreDict("randomiteDrop", ModItems.ENDER_DUST, 0);
		ModRecipeHelper.addOreDict("randomiteDrop", ModItems.SALT_DUST, 0);
		ModRecipeHelper.addOreDict("randomiteDrop", ModBlocks.BASE_ORE, 0);
		ModRecipeHelper.addOreDict("randomiteDrop", ModBlocks.OEDLDOEDL_ORE, 0);
	}
}