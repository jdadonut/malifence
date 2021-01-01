package com.squaaadtech.malifence.registry.modules.Dirty_Star;

import com.squaaadtech.malifence.registry.modules.Items.BEDROCK_DUST;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class DIRTY_STAR implements ToolMaterial {
    @Override
    public int getDurability() {
        return 7564;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 20.8F;
    }

    @Override
    public float getAttackDamage() {
        return 10.5F;
    }

    @Override
    public int getMiningLevel() {
        return 6;
    }

    @Override
    public int getEnchantability() {
        return 18;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.NETHER_STAR, BEDROCK_DUST.BEDROCK_DUST);
    }

}
