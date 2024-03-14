package net.jakatak.magicalworld.datagen;

import net.jakatak.magicalworld.MagicalWorld;
import net.jakatak.magicalworld.block.ModBlocks;
import net.jakatak.magicalworld.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future,
                               CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, completableFuture, MagicalWorld.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        // Add Item Tags here
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.VINTEUM_HELMET.get(),
                        ModItems.VINTEUM_CHESTPLATE.get(),
                        ModItems.VINTEUM_LEGGING.get(),
                        ModItems.VINTEUM_BOOTS.get());
        

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.WITCHWOOD_LOG.get().asItem())
                .add(ModBlocks.WITCHWOOD_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_WITCHWOOD_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_WITCHWOOD_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.WITCHWOOD_PLANKS.get().asItem());
        this.tag(ItemTags.WOODEN_STAIRS)
                .add(ModBlocks.WITCHWOOD_STAIRS.get().asItem());
        this.tag(ItemTags.WOODEN_SLABS)
                .add(ModBlocks.WITCHWOOD_SLAB.get().asItem());
        this.tag(ItemTags.WOODEN_FENCES)
                .add(ModBlocks.WITCHWOOD_FENCE.get().asItem());
        this.tag(ItemTags.FENCE_GATES)
                .add(ModBlocks.WITCHWOOD_FENCE_GATE.get().asItem());
        this.tag(ItemTags.WOODEN_DOORS)
                .add(ModBlocks.WITCHWOOD_DOOR.get().asItem());
        this.tag(ItemTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.WITCHWOOD_TRAPDOOR.get().asItem());
    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}