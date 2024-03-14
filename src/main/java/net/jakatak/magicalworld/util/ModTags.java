package net.jakatak.magicalworld.util;

import net.jakatak.magicalworld.MagicalWorld;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> BASIC_CRUCIBLE_FIRE = tag("basic_crucible_fire");
        public static final TagKey<Block> SOUL_CRUCIBLE_FIRE = tag("soul_crucible_fire");
        public static final TagKey<Block> NEEDS_VINTEUM_TOOL = tag("needs_vinteum_tool");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MagicalWorld.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(MagicalWorld.MOD_ID, name));
        }
    }
}