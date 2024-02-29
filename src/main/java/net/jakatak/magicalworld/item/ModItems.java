package net.jakatak.magicalworld.item;

import net.jakatak.magicalworld.MagicalWorld;
import net.jakatak.magicalworld.item.custom.MagicalRodItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MagicalWorld.MOD_ID);

    public static final RegistryObject<Item> VINTEUM_DUST = ITEMS.register("vinteum_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VINTEUM_INGOT = ITEMS.register("vinteum_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MAGICAL_ROD = ITEMS.register("magical_rod",
            () -> new MagicalRodItem(new Item.Properties().durability(10)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}