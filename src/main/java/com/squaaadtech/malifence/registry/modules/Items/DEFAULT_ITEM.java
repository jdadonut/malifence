package com.squaaadtech.malifence.registry.modules.Items;

import com.squaaadtech.malifence.Malifence;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class DEFAULT_ITEM {

    public static final Item ITEM_NAME = new Item(new Item.Settings().group(ItemGroup.TOOLS).maxCount(1).fireproof());

    public static void DoRegister() {
        Registry.register(Registry.ITEM, new Identifier(Malifence.MOD_ID, "item_name"), ITEM_NAME);
    }
}
