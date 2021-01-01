package com.squaaadtech.malifence.registry.modules.Items;

import com.squaaadtech.malifence.Malifence;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DIRTY_STAR {

    public static final Item DIRTY_STAR = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(8).fireproof());

    public static void doRegister() {
        Registry.register(Registry.ITEM, new Identifier(Malifence.MOD_ID, "dirty_star"), DIRTY_STAR);
    }
}
