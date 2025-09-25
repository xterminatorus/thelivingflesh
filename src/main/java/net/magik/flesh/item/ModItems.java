package net.magik.flesh.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.magik.flesh.modid.TheLivingFlesh;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item LIVING_FLESH = registerItem("living_flesh", new Item(new Item.Settings()));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TheLivingFlesh.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TheLivingFlesh.LOGGER.info("Registering Mod Items for" + TheLivingFlesh.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(LIVING_FLESH);
        });
    }
}