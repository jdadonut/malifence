package com.squaaadtech.malifence.registry.modules.Items;

import com.squaaadtech.malifence.Malifence;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BEDROCK_DUST {

    public static final Item BEDROCK_DUST = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(64).fireproof());

    public static void doRegister() {
        Registry.register(Registry.ITEM, new Identifier(Malifence.MOD_ID, "bedrock_dust"), BEDROCK_DUST);
    }
}
