package kenzie.things.events;

import kenzie.things.KenziesMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(bus=Bus.MOD, modid = KenziesMod.MODID)
public final class CommonEventHandler {
	

	/**
	 *
	 * @param event The Event.
	 */
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
//		event.getRegistry().register(setupBlock(ModBlocks.TNTPumpkin, "tntpumpkin"));

	}

	/**
	 *
	 * @param event The Event.
	 */
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
//		event.getRegistry().register(setupItemBlock(ModBlocks.TNTPumpkin, new Item.Properties().group(SpookyGeek.SpookyTab)));

//		event.getRegistry().register(setupItem(ModItems.HalloweenIngot, "halloweeningot"));
	}

	/**
	 *
	 * @param block The Block.
	 * @param name  The Name.
	 * @return The Block
	 */
	private static Block setupBlock(final Block block, final String name) {
		block.setRegistryName(name);

		return block;
	}

	/**
	 *
	 * @param item The Item.
	 * @param name The Name.
	 * @return The Item.
	 */
	private static Item setupItem(final Item item, final String name) {
		item.setRegistryName(name);

		return item;
	}

	/**
	 *
	 * @param block      The Block.
	 * @param properties
	 * @return The ItemBlock.
	 */
	private static BlockItem setupItemBlock(final Block block, Properties properties) {
		final BlockItem itemBlock = new BlockItem(block, properties);
		final ResourceLocation name = block.getRegistryName();
		itemBlock.setRegistryName(name);

		return itemBlock;
	}

	/**
	 *
	 */
	private CommonEventHandler() {
		//
	}

	/**
	 *
	 * @param event The Event.
	 */
	@SubscribeEvent
	public void onRemapBlock(final RegistryEvent.MissingMappings<Block> event) {
		for (final RegistryEvent.MissingMappings.Mapping<Block> mapping : event.getMappings()) {
			mapping.ignore();
		}
	}

	/**
	 *
	 * @param event The Event.
	 */
	@SubscribeEvent
	public void onRemapItem(final RegistryEvent.MissingMappings<Item> event) {
		for (final RegistryEvent.MissingMappings.Mapping<Item> mapping : event.getMappings()) {
			mapping.ignore();
		}
	}
}