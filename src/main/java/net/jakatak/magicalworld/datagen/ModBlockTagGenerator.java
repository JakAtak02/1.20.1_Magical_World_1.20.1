package net.jakatak.magicalworld.datagen;

import net.jakatak.magicalworld.MagicalWorld;
import net.jakatak.magicalworld.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MagicalWorld.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.VINTEUM_BLOCK.get(),
                        ModBlocks.VINTEUM_DUST_BLOCK.get(),
                        ModBlocks.VINTEUM_ORE.get(),
                        ModBlocks.DEEPSLATE_VINTEUM_ORE.get(),
                        ModBlocks.MAGIC_CRUCIBLE_BLOCK.get(),
                        ModBlocks.BLANK_RUNE_STONE.get(),
                        ModBlocks.WHITE_RUNE_STONE.get(),
                        ModBlocks.LIGHT_GRAY_RUNE_STONE.get(),
                        ModBlocks.GRAY_RUNE_STONE.get(),
                        ModBlocks.BLACK_RUNE_STONE.get(),
                        ModBlocks.BROWN_RUNE_STONE.get(),
                        ModBlocks.RED_RUNE_STONE.get(),
                        ModBlocks.ORANGE_RUNE_STONE.get(),
                        ModBlocks.YELLOW_RUNE_STONE.get(),
                        ModBlocks.LIME_RUNE_STONE.get(),
                        ModBlocks.GREEN_RUNE_STONE.get(),
                        ModBlocks.CYAN_RUNE_STONE.get(),
                        ModBlocks.LIGHT_BLUE_RUNE_STONE.get(),
                        ModBlocks.BLUE_RUNE_STONE.get(),
                        ModBlocks.PURPLE_RUNE_STONE.get(),
                        ModBlocks.MAGENTA_RUNE_STONE.get(),
                        ModBlocks.PINK_RUNE_STONE.get(),
                        ModBlocks.MAGICAL_STONE.get(),
                        ModBlocks.ETHEREAL_STONE.get(),
                        ModBlocks.RITUAL_STONE.get()
                );


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.VINTEUM_BLOCK.get(),
                        ModBlocks.VINTEUM_DUST_BLOCK.get(),
                        ModBlocks.VINTEUM_ORE.get(),
                        ModBlocks.DEEPSLATE_VINTEUM_ORE.get(),
                        ModBlocks.MAGIC_CRUCIBLE_BLOCK.get(),
                        ModBlocks.MAGICAL_STONE.get(),
                        ModBlocks.ETHEREAL_STONE.get(),
                        ModBlocks.RITUAL_STONE.get()

                );

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.WITCHWOOD_LOG.get())
                .add(ModBlocks.WITCHWOOD_WOOD.get())
                .add(ModBlocks.STRIPPED_WITCHWOOD_LOG.get())
                .add(ModBlocks.STRIPPED_WITCHWOOD_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.WITCHWOOD_PLANKS.get());

        this.tag(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.WITCHWOOD_STAIRS.get());
        this.tag(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.WITCHWOOD_SLAB.get());
        this.tag(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.WITCHWOOD_BUTTON.get());
        this.tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.WITCHWOOD_PRESSURE_PLATE.get());
        this.tag(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.WITCHWOOD_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.WITCHWOOD_FENCE_GATE.get());
        this.tag(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.WITCHWOOD_DOOR.get());
        this.tag(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.WITCHWOOD_TRAPDOOR.get());

        this.tag(BlockTags.MINEABLE_WITH_AXE)
            .add(ModBlocks.WITCHWOOD_PLANKS.get(),
                        ModBlocks.WITCHWOOD_LOG.get(),
                        ModBlocks.WITCHWOOD_FENCE_GATE.get(),
                        ModBlocks.WITCHWOOD_BUTTON.get(),
                        ModBlocks.WITCHWOOD_PRESSURE_PLATE.get(),
                        ModBlocks.WITCHWOOD_FENCE.get(),
                        ModBlocks.WITCHWOOD_STAIRS.get(),
                        ModBlocks.WITCHWOOD_DOOR.get(),
                        ModBlocks.WITCHWOOD_TRAPDOOR.get(),
                        ModBlocks.WITCHWOOD_WOOD.get(),
                        ModBlocks.STRIPPED_WITCHWOOD_WOOD.get(),
                    ModBlocks.STRIPPED_WITCHWOOD_LOG.get()
                );

    }
}