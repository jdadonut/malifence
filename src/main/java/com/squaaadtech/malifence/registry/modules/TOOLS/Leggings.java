package com.squaaadtech.malifence.registry.modules.TOOLS;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;

public class Leggings extends ArmorItem {
    public Leggings(ArmorMaterial material, Settings settings) {
        super(material, EquipmentSlot.LEGS, settings);
    }
}
