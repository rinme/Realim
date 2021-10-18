package net.reali.items;

import net.reali.Realim;
import net.reali.abilitys.RealimsBookAbility;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class RealimsItem {

    public static final Item REALIMS_BOOK = new RealimsBookAbility(new Item.Settings().group(ItemGroup.MISC));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Realim.MOD_ID, "realims_book"), REALIMS_BOOK);
    }
}