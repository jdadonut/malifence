package com.squaaadtech.malifence.registry.modules.TOOLS;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;


public class Sword extends SwordItem {
    public Sword(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }


}