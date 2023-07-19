package net.thep2wking.oedldoedlresources.content.item.ingot;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.player.PlayerContainerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.api.item.ModItemBase;
import net.thep2wking.oedldoedlcore.config.CoreConfig;
import net.thep2wking.oedldoedlcore.util.ModTooltips;

@SuppressWarnings("null")
@Mod.EventBusSubscriber
public class ItemUnstableIngotItem extends ModItemBase {
	public ItemUnstableIngotItem(String modid, String name, CreativeTabs tab, EnumRarity rarity, boolean hasEffect,
			int tooltipLines, int annotationLines) {
		super(modid, name, tab, rarity, hasEffect, tooltipLines, annotationLines);
	}

	@SubscribeEvent
	public static void playertick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.START)
			return;
		Container container = event.player.openContainer;
		World world = event.player.world;

		if (world.isRemote)
			return;
		boolean explode = false;

		List<Slot> inventorySlots = container.inventorySlots;
		for (Slot slot : inventorySlots) {
			ItemStack stack = slot.getStack();
			if (!(stack.getItem() instanceof ItemUnstableIngotItem) || !stack.hasTagCompound()
					|| slot instanceof SlotCrafting)
				continue;
			int Timer = stack.getTagCompound().getInteger("Timer");
			if (Timer <= 0) {
				slot.putStack(ItemStack.EMPTY);
				explode = true;
				continue;
			}
			stack.getTagCompound().setInteger("Timer", --Timer);
		}

		if (!explode)
			return;
		EntityPlayer p = event.player;
		if (!p.isCreative() && !p.isSpectator()) {
			world.createExplosion(p, p.posX, p.posY, p.posZ, 4, false);
			p.attackEntityFrom(DamageSource.OUT_OF_WORLD, 1000);
		}
	}

	@SubscribeEvent
	public static void onContainerClose(PlayerContainerEvent.Close event) {
		EntityPlayer p = event.getEntityPlayer();
		Container c = event.getContainer();
		boolean explode = false;
		for (Slot slot : c.inventorySlots) {
			if (!p.isCreative() && !p.isSpectator()) {
				ItemStack stack = slot.getStack();
				if (!checkExplosion(stack) || slot instanceof SlotCrafting)
					continue;
				slot.putStack(ItemStack.EMPTY);
				explode = true;
			}
		}

		if (!explode)
			return;
		if (!p.isCreative() && !p.isSpectator()) {
			p.world.createExplosion(p, p.posX, p.posY, p.posZ, 4, false);
			p.attackEntityFrom(DamageSource.OUT_OF_WORLD, 1000);
		}
	}

	public static boolean checkExplosion(ItemStack stack) {
		return stack.hasTagCompound() && stack.getItem() instanceof ItemUnstableIngotItem
				&& stack.getTagCompound().getInteger("Timer") > 0;
	}

	@SubscribeEvent
	public static void onItemDrop(ItemTossEvent e) {
		EntityPlayer p = e.getPlayer();
		EntityItem entityItem = e.getEntityItem();
		ItemStack stack = entityItem.getItem();
		if (check(stack) && !p.isCreative() && !p.isSpectator()) {
			p.world.createExplosion(e.getPlayer(), e.getPlayer().posX, e.getPlayer().posY,
					e.getPlayer().posZ, 10, false);
			p.attackEntityFrom(DamageSource.OUT_OF_WORLD, 1000);
			e.setCanceled(true);
		}
	}

	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		int Timer = 200;
		stack.getTagCompound().setInteger("Timer", --Timer);
	}

	public static boolean check(ItemStack stack) {
		return stack.getItem() instanceof ItemUnstableIngotItem;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if (ModTooltips.showAnnotationTip()) {
			int Timer = stack.getOrCreateSubCompound("Timer").getInteger("Timer");
			tooltip.add(CoreConfig.TOOLTIPS.COLORS.INFORMATION_ANNOTATION_FORMATTING.getColor()
					+ I18n.format(this.getUnlocalizedName() + ".annotation1") + " " + ModTooltips.getEffectColor(true)
					+ Timer);
		}
		if (ModTooltips.showInfoTip()) {
			for (int i = 1; i <= tooltipLines; ++i) {
				ModTooltips.addInformation(tooltip, this.getUnlocalizedName(), i);
			}
		} else if (ModTooltips.showInfoTipKey() && !(tooltipLines == 0)) {
			ModTooltips.addKey(tooltip, ModTooltips.KEY_INFO);
		}
	}
}