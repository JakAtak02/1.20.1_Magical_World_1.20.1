package net.jakatak.magicalworld.compat;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.jakatak.magicalworld.MagicalWorld;
import net.jakatak.magicalworld.block.ModBlocks;
import net.jakatak.magicalworld.recipe.MagicCrucibleRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class MagicCrucibleRecipeCatagory implements IRecipeCategory<MagicCrucibleRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(MagicalWorld.MOD_ID, "magic_crucible");
    public static final ResourceLocation TEXTURE = new ResourceLocation(MagicalWorld.MOD_ID,
            "textures/gui/magic_crucible_gui.png");

    public static final RecipeType<MagicCrucibleRecipe> MAGIC_CRUCIBLE_RECIPE_RECIPE_TYPE =
            new RecipeType<>(UID, MagicCrucibleRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public MagicCrucibleRecipeCatagory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.MAGIC_CRUCIBLE_BLOCK.get()));
    }


    @Override
    public RecipeType<MagicCrucibleRecipe> getRecipeType() {
        return MAGIC_CRUCIBLE_RECIPE_RECIPE_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.literal("Magic Crucible");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, MagicCrucibleRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 50, 12).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 110, 12).addIngredients(recipe.getIngredients().get(1));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 26, 55).addItemStack(recipe.getResultItem(null));
    }
}