package net.jakatak.magicalworld.item;

import net.jakatak.magicalworld.MagicalWorld;
import net.jakatak.magicalworld.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier VINTEUM = TierSortingRegistry.registerTier(
            new ForgeTier(2, 300, 7f, 2.0f, 26,
                    ModTags.Blocks.NEEDS_VINTEUM_TOOL, () -> Ingredient.of(ModItems.VINTEUM_INGOT.get())),
            new ResourceLocation(MagicalWorld.MOD_ID, "vinteum_ingot"), List.of(Tiers.IRON), List.of());
}
