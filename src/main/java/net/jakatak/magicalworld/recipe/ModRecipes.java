package net.jakatak.magicalworld.recipe;

import net.jakatak.magicalworld.MagicalWorld;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, MagicalWorld.MOD_ID);

    public static  final RegistryObject<RecipeSerializer<MagicCrucibleRecipe>> MAGIC_CRUCIBLE_SERIALIZER =
            SERIALIZERS.register("magic_crucible",() -> MagicCrucibleRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
