package com.squaaadtech.malifence.registry.modules.TOOLS;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;

public class Helmet extends ArmorItem {
    public Helmet(ArmorMaterial material, Settings settings) {
        super(material, EquipmentSlot.HEAD, settings);
    }
}
