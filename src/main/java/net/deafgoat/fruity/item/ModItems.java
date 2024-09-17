package net.deafgoat.fruity.item;

import net.deafgoat.fruity.Fruity;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



public class ModItems {

    public static final Item ORANGE = registerItem("orange", new Item(new FabricItemSettings().food(ModFoodComponents.ORANGE)));





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Fruity.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Fruity.LOGGER.info("Registering Mod Items for " + Fruity.MOD_ID);

    }
}
