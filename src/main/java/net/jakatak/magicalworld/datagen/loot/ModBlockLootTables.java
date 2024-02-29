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