package com.squaaadtech.malifence.registry.modules.TOOLS;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;

public class Boots extends ArmorItem {
    public Boots(ArmorMaterial material, Settings settings) {
        super(material, EquipmentSlot.FEET, settings);
    }
}
