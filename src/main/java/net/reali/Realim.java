package net.reali;

import net.fabricmc.api.ModInitializer;
import net.reali.items.RealimsItem;

public class Realim implements ModInitializer {

    public static final String MOD_ID = "realim";

    @Override
    public void onInitialize() {
        RealimsItem.registerItems();
    }
}