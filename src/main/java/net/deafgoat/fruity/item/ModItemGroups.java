package net.deafgoat.fruity.item;

import net.deafgoat.fruity.Fruity;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FRUITY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Fruity.MOD_ID, "orange"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.fruity"))
                    .icon(() -> new ItemStack(ModItems.ORANGE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ORANGE);


                    }).build());

    public static void registerItemGroups() {
        Fruity.LOGGER.info("Registering Item Groups for " + Fruity.MOD_ID);
    }
}
