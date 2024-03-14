package net.jakatak.magicalworld.block;



import net.jakatak.magicalworld.MagicalWorld;
import net.jakatak.magicalworld.block.custom.MagicCrucibleBlock;
import net.jakatak.magicalworld.block.custom.ModFlammableRotatedPillarBlock;
import net.jakatak.magicalworld.block.custom.PedestalBlock;
import net.jakatak.magicalworld.block.custom.RitualStoneBlock;
import net.jakatak.magicalworld.item.ModItems;
import net.jakatak.magicalworld.worldgen.tree.WitchwoodTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MagicalWorld.MOD_ID);

    public static final RegistryObject<Block> VINTEUM_DUST_BLOCK = registerBlock("vinteum_dust_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SAND).sound(SoundType.SAND)));
    public static final RegistryObject<Block> VINTEUM_BLOCK = registerBlock("vinteum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));

    public static final RegistryObject<Block> MAGICAL_STONE = registerBlock("magical_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> PEDESTAL = registerBlock("pedestal",
            () -> new PedestalBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).noOcclusion()));

    public static final RegistryObject<Block> ETHEREAL_STONE = registerBlock("ethereal_stone",
            () -> new HalfTransparentBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.STONE).noOcclusion()));

    public static final RegistryObject<Block> WITCHWOOD_LOG = registerBlock("witchwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WITCHWOOD_WOOD = registerBlock("witchwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_WITCHWOOD_LOG = registerBlock("stripped_witchwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_WITCHWOOD_WOOD = registerBlock("stripped_witchwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> WITCHWOOD_PLANKS = registerBlock("witchwood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> WITCHWOOD_LEAVES = registerBlock("witchwood_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    public static final RegistryObject<Block> WITCHWOOD_SAPLING = registerBlock("witchwood_sapling",
            () -> new SaplingBlock(new WitchwoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));


    public static final RegistryObject<Block> WITCHWOOD_STAIRS = registerBlock("witchwood_stairs",
            () -> new StairBlock(() -> ModBlocks.WITCHWOOD_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });
    public static final RegistryObject<Block> WITCHWOOD_SLAB = registerBlock("witchwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> WITCHWOOD_PRESSURE_PLATE = registerBlock("witchwood_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD), BlockSetType.OAK){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });
    public static final RegistryObject<Block> WITCHWOOD_BUTTON = registerBlock("witchwood_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD), BlockSetType.OAK, 30, true){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> WITCHWOOD_FENCE = registerBlock("witchwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });
    public static final RegistryObject<Block> WITCHWOOD_FENCE_GATE = registerBlock("witchwood_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE)
            {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> WITCHWOOD_DOOR = registerBlock("witchwood_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK)
            {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });
    public static final RegistryObject<Block> WITCHWOOD_TRAPDOOR = registerBlock("witchwood_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });



    public static final RegistryObject<Block> VINTEUM_ORE = registerBlock("vinteum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE)
                    .sound(SoundType.STONE), UniformInt.of(3, 6)));
    public static final RegistryObject<Block> DEEPSLATE_VINTEUM_ORE = registerBlock("deepslate_vinteum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE)
                    .sound(SoundType.STONE), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> NITOR_BLOCK = registerBlock("nitor_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE)
                    .sound(SoundType.AMETHYST_CLUSTER).lightLevel(blockState -> 15)));

    public static final RegistryObject<Block> SOUL_NITOR_BLOCK = registerBlock("soul_nitor_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE)
                    .sound(SoundType.AMETHYST_CLUSTER).lightLevel(blockState -> 15)));


    public static final RegistryObject<Block> MAGIC_CRUCIBLE_BLOCK = registerBlock("magic_crucible_block",
            () -> new MagicCrucibleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> BLANK_RUNE_STONE = registerBlock("blank_rune_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WHITE_RUNE_STONE = registerBlock("white_rune_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIGHT_GRAY_RUNE_STONE = registerBlock("light_gray_rune_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRAY_RUNE_STONE = registerBlock("gray_rune_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BLACK_RUNE_STONE = registerBlock("black_rune_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BROWN_RUNE_STONE = registerBlock("brown_rune_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RED_RUNE_STONE = registerBlock("red_rune_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ORANGE_RUNE_STONE = registerBlock("orange_rune_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> YELLOW_RUNE_STONE = registerBlock("yellow_rune_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIME_RUNE_STONE = registerBlock("lime_rune_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GREEN_RUNE_STONE = registerBlock("green_rune_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CYAN_RUNE_STONE = registerBlock("cyan_rune_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIGHT_BLUE_RUNE_STONE = registerBlock("light_blue_rune_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLUE_RUNE_STONE = registerBlock("blue_rune_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> PURPLE_RUNE_STONE = registerBlock("purple_rune_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MAGENTA_RUNE_STONE = registerBlock("magenta_rune_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PINK_RUNE_STONE = registerBlock("pink_rune_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RITUAL_STONE = registerBlock("ritual_stone",
            () -> new RitualStoneBlock(BlockBehaviour.Properties.of().sound(SoundType.STONE)
                    .lightLevel(state -> state.getValue(RitualStoneBlock.LIT) ? 1 : 0)));





    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}