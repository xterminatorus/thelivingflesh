package net.magik.flesh.item;

import com.sun.jna.platform.win32.Psapi;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.magik.flesh.item.custom.ChiselItem;
import net.magik.flesh.modid.TheLivingFlesh;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item LIVING_FLESH = registerItem("living_flesh", new Item(new Item.Settings()));
    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(320)));
    public static final Item CRESCENT_EDGE = registerItem("crescent_edge", new SwordItem( ModToolMaterials.LIVING_FLESH, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.LIVING_FLESH,5,-2.6f))));




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