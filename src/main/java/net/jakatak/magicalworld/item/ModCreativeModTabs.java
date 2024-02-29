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

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}