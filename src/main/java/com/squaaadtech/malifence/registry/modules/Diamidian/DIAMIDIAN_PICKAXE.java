package com.squaaadtech.malifence.registry.modules.Diamidian;

import com.squaaadtech.malifence.Malifence;
import com.squaaadtech.malifence.registry.modules.TOOLS.Pickaxe;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class DIAMIDIAN_PICKAXE {

    public static final Item DiamidianPickaxe = new Pickaxe(new DIAMIDIAN(), -2, -1.6F, new Item.Settings().group(ItemGroup.TOOLS).maxCount(1).fireproof());

    public static void doRegister() {
        Registry.register(Registry.ITEM, new Identifier(Malifence.MOD_ID, "diamidian_pickaxe"), DiamidianPickaxe);
    }
}
