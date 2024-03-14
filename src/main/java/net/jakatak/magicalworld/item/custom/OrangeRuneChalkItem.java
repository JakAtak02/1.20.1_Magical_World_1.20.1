package net.jakatak.magicalworld.item.custom;

import net.jakatak.magicalworld.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class OrangeRuneChalkItem extends Item {
    public OrangeRuneChalkItem(Properties properties) {
        super(properties);
    }
    @Override
    public @NotNull InteractionResult useOn(UseOnContext pContext) {
        Level world = pContext.getLevel();
        BlockPos positionClicked = pContext.getClickedPos();
        BlockState state = world.getBlockState(positionClicked);
        BlockPos pos = pContext.getClickedPos();
        Player player0 = pContext.getPlayer();

        if (!world.isClientSide && !player0.isShiftKeyDown()) {

            if (state.is(ModBlocks.BLANK_RUNE_STONE.get())) {
                world.setBlock(positionClicked, ModBlocks.ORANGE_RUNE_STONE.get().defaultBlockState(), 3);
                if (world instanceof ServerLevel serverWorld) {
                    serverWorld.sendParticles(ParticleTypes.CLOUD, positionClicked.getX() + 0.5, positionClicked.getY() + 1, positionClicked.getZ() + 0.5, 10, 0.25, 0.25, 0.25, 0.0);
                    world.playSound(null, pos, SoundEvents.SAND_STEP, SoundSource.BLOCKS, 1.0F, 1.0F);
                }



                pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),
                        player -> player.broadcastBreakEvent(player.getUsedItemHand()));

                return InteractionResult.SUCCESS;
            }




        }
        return super.useOn(pContext);
    }


}