package com.blbd.prehistoricrestoration.util;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(PrehistoricRestoration.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> FOSSILIZED_ITEMS = createTag("fossilized_items");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.Item, Identifier.of(PrehistoricRestoration.MOD_ID, name));
        }
    }
}