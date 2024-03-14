package net.jakatak.magicalworld.datagen;

import net.jakatak.magicalworld.MagicalWorld;
import net.jakatak.magicalworld.block.ModBlocks;
import net.jakatak.magicalworld.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MagicalWorld.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.VINTEUM_DUST);
        simpleItem(ModItems.VINTEUM_INGOT);
        simpleItem(ModItems.MAGICAL_ROD);
        simpleItem(ModItems.WHITE_RUNE_CHALK);
        simpleItem(ModItems.LIGHT_GRAY_RUNE_CHALK);
        simpleItem(ModItems.GRAY_RUNE_CHALK);
        simpleItem(ModItems.BLACK_RUNE_CHALK);
        simpleItem(ModItems.BROWN_RUNE_CHALK);
        simpleItem(ModItems.RED_RUNE_CHALK);
        simpleItem(ModItems.ORANGE_RUNE_CHALK);
        simpleItem(ModItems.YELLOW_RUNE_CHALK);
        simpleItem(ModItems.LIME_RUNE_CHALK);
        simpleItem(ModItems.GREEN_RUNE_CHALK);
        simpleItem(ModItems.CYAN_RUNE_CHALK);
        simpleItem(ModItems.LIGHT_BLUE_RUNE_CHALK);
        simpleItem(ModItems.BLUE_RUNE_CHALK);
        simpleItem(ModItems.PURPLE_RUNE_CHALK);
        simpleItem(ModItems.MAGENTA_RUNE_CHALK);
        simpleItem(ModItems.PINK_RUNE_CHALK);
        simpleItem(ModItems.VINTEUM_DUST_CAP);
        //simpleItem(ModItems.VINTEUM_BOOTS);
        //simpleItem(ModItems.VINTEUM_LEGGING);
        //simpleItem(ModItems.VINTEUM_CHESTPLATE);
        //simpleItem(ModItems.VINTEUM_HELMET);

        handheldItem(ModItems.VINTEUM_SWORD);
        handheldItem(ModItems.VINTEUM_PICKAXE);
        handheldItem(ModItems.VINTEUM_AXE);
        handheldItem(ModItems.VINTEUM_SHOVEL);
        handheldItem(ModItems.VINTEUM_HOE);

        saplingItem(ModBlocks.WITCHWOOD_SAPLING);

        buttonItem(ModBlocks.WITCHWOOD_BUTTON, ModBlocks.WITCHWOOD_PLANKS);
        buttonItem(ModBlocks.WITCHWOOD_PRESSURE_PLATE, ModBlocks.WITCHWOOD_PLANKS);
        fenceItem(ModBlocks.WITCHWOOD_FENCE, ModBlocks.WITCHWOOD_PLANKS);

    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(MagicalWorld.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(MagicalWorld.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }



    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MagicalWorld.MOD_ID,"block/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MagicalWorld.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(MagicalWorld.MOD_ID,"item/" + item.getId().getPath()));
    }
}