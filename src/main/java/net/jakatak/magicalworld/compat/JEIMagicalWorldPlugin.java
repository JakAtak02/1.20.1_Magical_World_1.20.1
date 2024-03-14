package net.jakatak.magicalworld.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.jakatak.magicalworld.MagicalWorld;
import net.jakatak.magicalworld.recipe.MagicCrucibleRecipe;
import net.jakatak.magicalworld.screen.MagicCrucibleBlockScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;

public class JEIMagicalWorldPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(MagicalWorld.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new MagicCrucibleRecipeCatagory(
                registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();
        List<MagicCrucibleRecipe> empoweringRecipes = recipeManager.getAllRecipesFor(MagicCrucibleRecipe.Type.INSTANCE);
        registration.addRecipes(MagicCrucibleRecipeCatagory.MAGIC_CRUCIBLE_RECIPE_RECIPE_TYPE, empoweringRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(MagicCrucibleBlockScreen.class, 60, 30, 20, 30,
                MagicCrucibleRecipeCatagory.MAGIC_CRUCIBLE_RECIPE_RECIPE_TYPE);
    }
}