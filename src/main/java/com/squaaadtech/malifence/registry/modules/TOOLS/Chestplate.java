package com.squaaadtech.malifence.registry.modules.TOOLS;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;

public class Chestplate extends ArmorItem {
    public Chestplate(ArmorMaterial material, Settings settings) {
        super(material, EquipmentSlot.CHEST, settings);
    }
}
