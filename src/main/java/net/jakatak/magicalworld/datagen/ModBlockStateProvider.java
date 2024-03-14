package net.jakatak.magicalworld.datagen;

import net.jakatak.magicalworld.MagicalWorld;
import net.jakatak.magicalworld.block.ModBlocks;
import net.jakatak.magicalworld.block.custom.RitualStoneBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MagicalWorld.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.VINTEUM_BLOCK);
        blockWithItem(ModBlocks.VINTEUM_DUST_BLOCK);
        blockWithItem(ModBlocks.BLANK_RUNE_STONE);
        blockWithItem(ModBlocks.WHITE_RUNE_STONE);
        blockWithItem(ModBlocks.LIGHT_GRAY_RUNE_STONE);
        blockWithItem(ModBlocks.GRAY_RUNE_STONE);
        blockWithItem(ModBlocks.BLACK_RUNE_STONE);
        blockWithItem(ModBlocks.BROWN_RUNE_STONE);
        blockWithItem(ModBlocks.RED_RUNE_STONE);
        blockWithItem(ModBlocks.ORANGE_RUNE_STONE);
        blockWithItem(ModBlocks.YELLOW_RUNE_STONE);
        blockWithItem(ModBlocks.LIME_RUNE_STONE);
        blockWithItem(ModBlocks.GREEN_RUNE_STONE);
        blockWithItem(ModBlocks.CYAN_RUNE_STONE);
        blockWithItem(ModBlocks.LIGHT_BLUE_RUNE_STONE);
        blockWithItem(ModBlocks.BLUE_RUNE_STONE);
        blockWithItem(ModBlocks.PURPLE_RUNE_STONE);
        blockWithItem(ModBlocks.MAGENTA_RUNE_STONE);
        blockWithItem(ModBlocks.PINK_RUNE_STONE);

        blockWithItem(ModBlocks.VINTEUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_VINTEUM_ORE);
        blockWithItem(ModBlocks.MAGICAL_STONE);
        blockWithItem(ModBlocks.ETHEREAL_STONE);

        logBlock(((RotatedPillarBlock) ModBlocks.WITCHWOOD_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.WITCHWOOD_WOOD.get()), blockTexture(ModBlocks.WITCHWOOD_LOG.get()), blockTexture(ModBlocks.WITCHWOOD_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_WITCHWOOD_LOG.get(), new ResourceLocation(MagicalWorld.MOD_ID, "block/stripped_witchwood_log"),
                new ResourceLocation(MagicalWorld.MOD_ID, "block/stripped_witchwood_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_WITCHWOOD_WOOD.get(), new ResourceLocation(MagicalWorld.MOD_ID, "block/stripped_witchwood_log"),
                new ResourceLocation(MagicalWorld.MOD_ID, "block/stripped_witchwood_log"));

        blockItem(ModBlocks.WITCHWOOD_LOG);
        blockItem(ModBlocks.WITCHWOOD_WOOD);
        blockItem(ModBlocks.STRIPPED_WITCHWOOD_LOG);
        blockItem(ModBlocks.STRIPPED_WITCHWOOD_WOOD);

        blockWithItem(ModBlocks.WITCHWOOD_PLANKS);

        leavesBlock(ModBlocks.WITCHWOOD_LEAVES);
        saplingBlock(ModBlocks.WITCHWOOD_SAPLING);

        stairsBlock((StairBlock) ModBlocks.WITCHWOOD_STAIRS.get(), blockTexture(ModBlocks.WITCHWOOD_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.WITCHWOOD_SLAB.get()), blockTexture(ModBlocks.WITCHWOOD_PLANKS.get()), blockTexture(ModBlocks.WITCHWOOD_PLANKS.get()));

        blockItem(ModBlocks.WITCHWOOD_STAIRS);
        blockItem(ModBlocks.WITCHWOOD_SLAB);

        buttonBlock((ButtonBlock) ModBlocks.WITCHWOOD_BUTTON.get(), blockTexture(ModBlocks.WITCHWOOD_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.WITCHWOOD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.WITCHWOOD_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.WITCHWOOD_FENCE.get(), blockTexture(ModBlocks.WITCHWOOD_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.WITCHWOOD_FENCE_GATE.get(), blockTexture(ModBlocks.WITCHWOOD_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock)ModBlocks.WITCHWOOD_DOOR.get(), modLoc("block/witchwood_door_bottom"), modLoc("block/witchwood_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.WITCHWOOD_TRAPDOOR.get(), modLoc("block/witchwood_trapdoor"), true, "cutout");

        blockItem(ModBlocks.WITCHWOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.WITCHWOOD_FENCE_GATE);
        blockItem(ModBlocks.WITCHWOOD_TRAPDOOR, "_bottom");

        simpleBlockWithItem(ModBlocks.PEDESTAL.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/pedestal")));


    }


    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().cubeAll(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }


    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("magicalworld:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
        }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("magicalworld:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
        }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}