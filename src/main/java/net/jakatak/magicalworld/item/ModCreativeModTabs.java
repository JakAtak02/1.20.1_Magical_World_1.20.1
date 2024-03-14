package net.jakatak.magicalworld.item;

import net.jakatak.magicalworld.MagicalWorld;
import net.jakatak.magicalworld.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MagicalWorld.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MAGICALWORLDTAB = CREATIVE_MODE_TABS.register("magicalworld_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.VINTEUM_DUST.get()))
                    .title(Component.translatable("creativetab.magicalworld_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.VINTEUM_DUST.get());
                        pOutput.accept(ModItems.VINTEUM_INGOT.get());
                        pOutput.accept(ModBlocks.VINTEUM_DUST_BLOCK.get());
                        pOutput.accept(ModBlocks.VINTEUM_BLOCK.get());
                        pOutput.accept(ModBlocks.VINTEUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_VINTEUM_ORE.get());
                        pOutput.accept(ModItems.MAGICAL_ROD.get());
                        pOutput.accept((ModBlocks.MAGIC_CRUCIBLE_BLOCK.get()));
                        pOutput.accept(ModItems.VINTEUM_DUST_CAP.get());
                        pOutput.accept(ModItems.VINTEUM_SWORD.get());
                        pOutput.accept(ModItems.VINTEUM_AXE.get());
                        pOutput.accept(ModItems.VINTEUM_PICKAXE.get());
                        pOutput.accept(ModItems.VINTEUM_SHOVEL.get());
                        pOutput.accept(ModItems.VINTEUM_HOE.get());
                        pOutput.accept(ModItems.VINTEUM_HELMET.get());
                        pOutput.accept(ModItems.VINTEUM_CHESTPLATE.get());
                        pOutput.accept(ModItems.VINTEUM_LEGGING.get());
                        pOutput.accept(ModItems.VINTEUM_BOOTS.get());
                        pOutput.accept(ModBlocks.NITOR_BLOCK.get());
                        pOutput.accept(ModBlocks.SOUL_NITOR_BLOCK.get());
                        pOutput.accept(ModBlocks.WITCHWOOD_LOG.get());
                        pOutput.accept(ModBlocks.WITCHWOOD_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_WITCHWOOD_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_WITCHWOOD_WOOD.get());
                        pOutput.accept(ModBlocks.WITCHWOOD_PLANKS.get());
                        pOutput.accept(ModBlocks.WITCHWOOD_SAPLING.get());
                        pOutput.accept(ModBlocks.WITCHWOOD_LEAVES.get());
                        pOutput.accept(ModBlocks.WITCHWOOD_STAIRS.get());
                        pOutput.accept(ModBlocks.WITCHWOOD_SLAB.get());
                        pOutput.accept(ModBlocks.WITCHWOOD_BUTTON.get());
                        pOutput.accept(ModBlocks.WITCHWOOD_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.WITCHWOOD_FENCE.get());
                        pOutput.accept(ModBlocks.WITCHWOOD_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.WITCHWOOD_DOOR.get());
                        pOutput.accept(ModBlocks.WITCHWOOD_TRAPDOOR.get());
                        pOutput.accept(ModItems.WHITE_RUNE_CHALK.get());
                        pOutput.accept(ModItems.LIGHT_GRAY_RUNE_CHALK.get());
                        pOutput.accept(ModItems.GRAY_RUNE_CHALK.get());
                        pOutput.accept(ModItems.BLACK_RUNE_CHALK.get());
                        pOutput.accept(ModItems.BROWN_RUNE_CHALK.get());
                        pOutput.accept(ModItems.RED_RUNE_CHALK.get());
                        pOutput.accept(ModItems.ORANGE_RUNE_CHALK.get());
                        pOutput.accept(ModItems.YELLOW_RUNE_CHALK.get());
                        pOutput.accept(ModItems.LIME_RUNE_CHALK.get());
                        pOutput.accept(ModItems.GREEN_RUNE_CHALK.get());
                        pOutput.accept(ModItems.GRAY_RUNE_CHALK.get());
                        pOutput.accept(ModItems.CYAN_RUNE_CHALK.get());
                        pOutput.accept(ModItems.LIGHT_BLUE_RUNE_CHALK.get());
                        pOutput.accept(ModItems.BLUE_RUNE_CHALK.get());
                        pOutput.accept(ModItems.PURPLE_RUNE_CHALK.get());
                        pOutput.accept(ModItems.MAGENTA_RUNE_CHALK.get());
                        pOutput.accept(ModItems.PINK_RUNE_CHALK.get());
                        pOutput.accept(ModBlocks.BLANK_RUNE_STONE.get());
                        pOutput.accept(ModBlocks.WHITE_RUNE_STONE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_RUNE_STONE.get());
                        pOutput.accept(ModBlocks.GRAY_RUNE_STONE.get());
                        pOutput.accept(ModBlocks.BLACK_RUNE_STONE.get());
                        pOutput.accept(ModBlocks.BROWN_RUNE_STONE.get());
                        pOutput.accept(ModBlocks.RED_RUNE_STONE.get());
                        pOutput.accept(ModBlocks.ORANGE_RUNE_STONE.get());
                        pOutput.accept(ModBlocks.YELLOW_RUNE_STONE.get());
                        pOutput.accept(ModBlocks.LIME_RUNE_STONE.get());
                        pOutput.accept(ModBlocks.GREEN_RUNE_STONE.get());
                        pOutput.accept(ModBlocks.CYAN_RUNE_STONE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_RUNE_STONE.get());
                        pOutput.accept(ModBlocks.BLUE_RUNE_STONE.get());
                        pOutput.accept(ModBlocks.PURPLE_RUNE_STONE.get());
                        pOutput.accept(ModBlocks.MAGENTA_RUNE_STONE.get());
                        pOutput.accept(ModBlocks.PINK_RUNE_STONE.get());
                        pOutput.accept(ModBlocks.MAGICAL_STONE.get());
                        pOutput.accept(ModBlocks.ETHEREAL_STONE.get());
                        pOutput.accept(ModBlocks.RITUAL_STONE.get());
                        pOutput.accept(ModBlocks.PEDESTAL.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}