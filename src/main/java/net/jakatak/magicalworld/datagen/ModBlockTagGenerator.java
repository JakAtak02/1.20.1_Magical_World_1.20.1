package net.jakatak.magicalworld.datagen;

import net.jakatak.magicalworld.MagicalWorld;
import net.jakatak.magicalworld.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
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
                        ModBlocks.MAGIC_CRUCIBLE_BLOCK.get()
                );


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.VINTEUM_BLOCK.get(),
                        ModBlocks.VINTEUM_DUST_BLOCK.get(),
                        ModBlocks.VINTEUM_ORE.get(),
                        ModBlocks.DEEPSLATE_VINTEUM_ORE.get(),
                        ModBlocks.MAGIC_CRUCIBLE_BLOCK.get()
                );



    }
}