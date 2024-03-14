package net.jakatak.magicalworld.datagen.loot;

import net.jakatak.magicalworld.block.ModBlocks;
import net.jakatak.magicalworld.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Map;
import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {


    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.VINTEUM_BLOCK.get());
        this.dropSelf(ModBlocks.VINTEUM_DUST_BLOCK.get());
        this.dropSelf(ModBlocks.MAGIC_CRUCIBLE_BLOCK.get());
        this.dropSelf(ModBlocks.MAGICAL_STONE.get());
        this.dropSelf(ModBlocks.ETHEREAL_STONE.get());
        this.dropSelf(ModBlocks.RITUAL_STONE.get());
        this.dropSelf(ModBlocks.PEDESTAL.get());


        this.dropSelf(ModBlocks.WITCHWOOD_LOG.get());
        this.dropSelf(ModBlocks.WITCHWOOD_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_WITCHWOOD_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_WITCHWOOD_WOOD.get());
        this.dropSelf(ModBlocks.WITCHWOOD_PLANKS.get());
        this.dropSelf(ModBlocks.WITCHWOOD_SAPLING.get());
        this.dropSelf(ModBlocks.NITOR_BLOCK.get());
        this.dropSelf(ModBlocks.SOUL_NITOR_BLOCK.get());
        this.add(ModBlocks.WITCHWOOD_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WITCHWOOD_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.WITCHWOOD_STAIRS.get());
        this.add(ModBlocks.WITCHWOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WITCHWOOD_SLAB.get()));
        this.dropSelf(ModBlocks.WITCHWOOD_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.WITCHWOOD_BUTTON.get());
        this.dropSelf(ModBlocks.WITCHWOOD_FENCE.get());
        this.dropSelf(ModBlocks.WITCHWOOD_FENCE_GATE.get());
        this.dropSelf(ModBlocks.WITCHWOOD_TRAPDOOR.get());
        this.dropSelf(ModBlocks.BLANK_RUNE_STONE.get());
        this.dropSelf(ModBlocks.WHITE_RUNE_STONE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_RUNE_STONE.get());
        this.dropSelf(ModBlocks.GRAY_RUNE_STONE.get());
        this.dropSelf(ModBlocks.BLACK_RUNE_STONE.get());
        this.dropSelf(ModBlocks.BROWN_RUNE_STONE.get());
        this.dropSelf(ModBlocks.RED_RUNE_STONE.get());
        this.dropSelf(ModBlocks.ORANGE_RUNE_STONE.get());
        this.dropSelf(ModBlocks.YELLOW_RUNE_STONE.get());
        this.dropSelf(ModBlocks.LIME_RUNE_STONE.get());
        this.dropSelf(ModBlocks.GREEN_RUNE_STONE.get());
        this.dropSelf(ModBlocks.CYAN_RUNE_STONE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_RUNE_STONE.get());
        this.dropSelf(ModBlocks.BLUE_RUNE_STONE.get());
        this.dropSelf(ModBlocks.PURPLE_RUNE_STONE.get());
        this.dropSelf(ModBlocks.MAGENTA_RUNE_STONE.get());
        this.dropSelf(ModBlocks.PINK_RUNE_STONE.get());

        this.add(ModBlocks.WITCHWOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.WITCHWOOD_DOOR.get()));




        this.add(ModBlocks.VINTEUM_ORE.get(),
        block -> createCopperLikeOreDrops(ModBlocks.VINTEUM_ORE.get(), ModItems.VINTEUM_DUST.get()));
        this.add(ModBlocks.DEEPSLATE_VINTEUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_VINTEUM_ORE.get(), ModItems.VINTEUM_DUST.get()));
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}