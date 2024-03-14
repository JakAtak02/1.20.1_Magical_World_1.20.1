package net.jakatak.magicalworld.item;

import net.jakatak.magicalworld.MagicalWorld;
import net.jakatak.magicalworld.item.custom.*;
import net.minecraft.world.item.*;
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
    public static final RegistryObject<Item> VINTEUM_DUST_CAP = ITEMS.register("vinteum_dust_cap",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MAGICAL_ROD = ITEMS.register("magical_rod",
            () -> new MagicalRodItem(new Item.Properties().durability(10)));
    public static final RegistryObject<Item> WHITE_RUNE_CHALK = ITEMS.register("white_rune_chalk",
            () -> new WhiteRuneChalkItem(new Item.Properties().durability(32)));
    public static final RegistryObject<Item> LIGHT_GRAY_RUNE_CHALK = ITEMS.register("light_gray_rune_chalk",
            () -> new LightGrayRuneChalkItem(new Item.Properties().durability(32)));

    public static final RegistryObject<Item> GRAY_RUNE_CHALK = ITEMS.register("gray_rune_chalk",
            () -> new GrayRuneChalkItem(new Item.Properties().durability(32)));
    public static final RegistryObject<Item> BLACK_RUNE_CHALK = ITEMS.register("black_rune_chalk",
            () -> new BlackRuneChalkItem(new Item.Properties().durability(32)));
    public static final RegistryObject<Item> BROWN_RUNE_CHALK = ITEMS.register("brown_rune_chalk",
            () -> new BrownRuneChalkItem(new Item.Properties().durability(32)));
    public static final RegistryObject<Item> GREEN_RUNE_CHALK = ITEMS.register("green_rune_chalk",
            () -> new GreenRuneChalkItem(new Item.Properties().durability(32)));
    public static final RegistryObject<Item> RED_RUNE_CHALK = ITEMS.register("red_rune_chalk",
            () -> new RedRuneChalkItem(new Item.Properties().durability(32)));
    public static final RegistryObject<Item> ORANGE_RUNE_CHALK = ITEMS.register("orange_rune_chalk",
            () -> new OrangeRuneChalkItem(new Item.Properties().durability(32)));
    public static final RegistryObject<Item> YELLOW_RUNE_CHALK = ITEMS.register("yellow_rune_chalk",
            () -> new YellowRuneChalkItem(new Item.Properties().durability(32)));
    public static final RegistryObject<Item> LIME_RUNE_CHALK = ITEMS.register("lime_rune_chalk",
            () -> new LimeRuneChalkItem(new Item.Properties().durability(32)));
    public static final RegistryObject<Item> CYAN_RUNE_CHALK = ITEMS.register("cyan_rune_chalk",
            () -> new CyanRuneChalkItem(new Item.Properties().durability(32)));
    public static final RegistryObject<Item> LIGHT_BLUE_RUNE_CHALK = ITEMS.register("light_blue_rune_chalk",
            () -> new LightBlueRuneChalkItem(new Item.Properties().durability(32)));

    public static final RegistryObject<Item> BLUE_RUNE_CHALK = ITEMS.register("blue_rune_chalk",
            () -> new BlueRuneChalkItem(new Item.Properties().durability(32)));
    public static final RegistryObject<Item> PURPLE_RUNE_CHALK = ITEMS.register("purple_rune_chalk",
            () -> new PurpleRuneChalkItem(new Item.Properties().durability(32)));
    public static final RegistryObject<Item> MAGENTA_RUNE_CHALK = ITEMS.register("magenta_rune_chalk",
            () -> new MagentaRuneChalkItem(new Item.Properties().durability(32)));
    public static final RegistryObject<Item> PINK_RUNE_CHALK = ITEMS.register("pink_rune_chalk",
            () -> new PinkRuneChalkItem(new Item.Properties().durability(32)));


    public static final RegistryObject<Item> VINTEUM_SWORD = ITEMS.register("vinteum_sword",
            () -> new SwordItem(ModToolTiers.VINTEUM, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> VINTEUM_PICKAXE = ITEMS.register("vinteum_pickaxe",
            () -> new PickaxeItem(ModToolTiers.VINTEUM, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> VINTEUM_AXE = ITEMS.register("vinteum_axe",
            () -> new AxeItem(ModToolTiers.VINTEUM, 6, -3.1F, new Item.Properties()));
    public static final RegistryObject<Item> VINTEUM_SHOVEL = ITEMS.register("vinteum_shovel",
            () -> new ShovelItem(ModToolTiers.VINTEUM, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> VINTEUM_HOE = ITEMS.register("vinteum_hoe",
            () -> new HoeItem(ModToolTiers.VINTEUM, -2, -1.0F, new Item.Properties()));

    public static final RegistryObject<Item> VINTEUM_HELMET = ITEMS.register("vinteum_helmet",
            () -> new ArmorItem(ModArmorMaterials.VINTEUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> VINTEUM_CHESTPLATE = ITEMS.register("vinteum_chestplate",
            () -> new ArmorItem(ModArmorMaterials.VINTEUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> VINTEUM_LEGGING = ITEMS.register("vinteum_leggings",
            () -> new ArmorItem(ModArmorMaterials.VINTEUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> VINTEUM_BOOTS = ITEMS.register("vinteum_boots",
            () -> new ArmorItem(ModArmorMaterials.VINTEUM, ArmorItem.Type.BOOTS, new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}