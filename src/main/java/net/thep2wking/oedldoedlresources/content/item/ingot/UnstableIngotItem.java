package net.thep2wking.oedldoedlresources.content.item.ingot;

import java.util.List;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.CraftingResultSlot;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.player.PlayerContainerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.thep2wking.oedldoedlcore.base.ModItemBase;
import net.thep2wking.oedldoedlcore.config.CoreConfig;
import net.thep2wking.oedldoedlcore.util.TipLines;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;
import net.thep2wking.oedldoedlresources.util.ModDamageSources;

@Mod.EventBusSubscriber
public class UnstableIngotItem extends ModItemBase
{
	public boolean isDebuff;
	
    public UnstableIngotItem(Rarity rarity, boolean hasEffect, boolean fireImmunity, boolean isDebuff, TipLines lines, boolean hasAnnotation, Properties properties) 
    {
		super(rarity, hasEffect, fireImmunity, lines, hasAnnotation, properties);
		this.isDebuff = isDebuff;
	}
	
	@SubscribeEvent
	public static void playertick(TickEvent.PlayerTickEvent event) 
	{
		if (event.phase == TickEvent.Phase.START) return;
	    Container container = event.player.openContainer;
	    World world = event.player.world;

	    if (world.isRemote)return;
	    boolean explode = false;

    	if (ResourcesConfig.enable_unstable_explosion.get())
    	{
		    List<Slot> inventorySlots = container.inventorySlots;
		    for (Slot slot : inventorySlots) 
		    {
		    	ItemStack stack = slot.getStack();
			    if (!(stack.getItem() instanceof UnstableIngotItem) || !stack.hasTag() || slot instanceof CraftingResultSlot) continue;
			    int Timer = stack.getTag().getInt("Timer");
			    if (Timer <= 0) 
			    {
			    	slot.putStack(ItemStack.EMPTY);
				    explode = true;
				    continue;
			    }
			    stack.getTag().putInt("Timer", --Timer);
		    }
    	}

	    if (!explode) return;
	    PlayerEntity p = event.player;
	    if (ResourcesConfig.enable_unstable_explosion.get() && !p.isCreative() && !p.isSpectator())
	    {
		    world.createExplosion(p, p.getPosX(), p.getPosY(), p.getPosZ(), 4, Explosion.Mode.NONE);
		    p.attackEntityFrom(ModDamageSources.UNSTABLE, 1000);
	    }
	}

	@SubscribeEvent
	public static void onContainerClose(PlayerContainerEvent.Close event) 
	{
	    PlayerEntity p = event.getPlayer();
	    Container c = event.getContainer();
	    boolean explode = false;
	    for (Slot slot : c.inventorySlots) 
	    {
	    	if (ResourcesConfig.enable_unstable_explosion.get() && !p.isCreative() && !p.isSpectator())
	    	{
		    	ItemStack stack = slot.getStack();
		    	if (!checkExplosion(stack) || slot instanceof CraftingResultSlot) continue;
		    	slot.putStack(ItemStack.EMPTY);
		    	explode = true;
	    	}
	    }
	    
	    if (!explode) return;
	    if (ResourcesConfig.enable_unstable_explosion.get() && !p.isCreative() && !p.isSpectator()) 
	    {
		    p.world.createExplosion(p, p.getPosX(), p.getPosY(), p.getPosZ(), 4, Explosion.Mode.NONE);
		    p.attackEntityFrom(ModDamageSources.UNSTABLE, 1000);
	    }
	}

	public static boolean checkExplosion(ItemStack stack) 
	{
	    return stack.hasTag() && stack.getItem() instanceof UnstableIngotItem && stack.getTag().getInt("Timer") > 0;
	}

	@SubscribeEvent
	public static void onItemDrop(ItemTossEvent e) 
	{  
	    PlayerEntity p = e.getPlayer();
	    ItemEntity entityItem = e.getEntityItem();
	    ItemStack stack = entityItem.getItem();
	    if (check(stack) && ResourcesConfig.enable_unstable_explosion.get() && !p.isCreative() && !p.isSpectator()) 
	    {
		    p.world.createExplosion(e.getPlayer(), e.getPlayer().getPosX(), e.getPlayer().getPosY(), e.getPlayer().getPosZ(), 10, Explosion.Mode.NONE);
		    p.attackEntityFrom(ModDamageSources.UNSTABLE, 1000);
		    e.setCanceled(true);
	    }
	}
	
	public static boolean check(ItemStack stack) 
	{
		return stack.getItem() instanceof UnstableIngotItem;
	}
	
	public TextFormatting effectColor()
	{
		if(isDebuff)
		{
			return CoreConfig.effects_negative_formatting.get();
		}
		return CoreConfig.effects_positive_formatting.get();
	}
	  
	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) 
    {
		if (Screen.hasShiftDown() && CoreConfig.information_tooltip.get())
		{   
			if(hasAnnotation)
			{
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".annotation").mergeStyle(CoreConfig.information_annotation_formatting.get()));
			}
			
			if(lines == TipLines.DISABLED)
			{
				//no tooltip
			}
			if(lines == TipLines.ONE)
			{
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip").mergeStyle(CoreConfig.information_formatting.get()));
			}
			if(lines == TipLines.TWO)
			{
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip2").mergeStyle(CoreConfig.information_formatting.get()));
			}
			if(lines == TipLines.THREE)
			{
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip2").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip3").mergeStyle(CoreConfig.information_formatting.get()));
			}
			if(lines == TipLines.FOUR)
			{
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip2").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip3").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip4").mergeStyle(CoreConfig.information_formatting.get()));
			}
			if(lines == TipLines.FIVE)
			{
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip2").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip3").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip4").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip5").mergeStyle(CoreConfig.information_formatting.get()));
			}
		}
		else if (CoreConfig.information_tooltip.get() && CoreConfig.information_tooltip_key.get() && !(lines == TipLines.DISABLED))
		{
			tooltip.add(new TranslationTextComponent("core.oedldoedl.info.key").mergeStyle(TextFormatting.GRAY));
		}
		
		if (Screen.hasControlDown() && CoreConfig.effects_tooltip.get() && ResourcesConfig.enable_unstable_explosion.get())
		{
			int Timer = stack.getOrCreateTag().getInt("Timer");
			tooltip.add(new TranslationTextComponent("core.oedldoedl.effects.tip").mergeStyle(CoreConfig.effects_annotation_formatting.get()));
			tooltip.add(new StringTextComponent("- Timer " + effectColor() + TextFormatting.ITALIC + "(" + Timer + ") (Ticks left)")
					.mergeStyle(CoreConfig.effects_formatting.get()).mergeStyle(TextFormatting.ITALIC));
		}
		else if (CoreConfig.effects_tooltip.get() && CoreConfig.effects_tooltip_key.get() && ResourcesConfig.enable_unstable_explosion.get())
		{
			tooltip.add(new TranslationTextComponent("core.oedldoedl.effects.key").mergeStyle(TextFormatting.GRAY));
		}
    }
}