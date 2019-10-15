package kenzie.things.events;

import kenzie.things.KenziesMod;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(/*value = Side.CLIENT,*/ modid = KenziesMod.MODID)
public final class ClientEventHandler {

	/**
	 *
	 * @param block The Block.
	 * @param fluid The Fluid.
	 */
//	@SideOnly(Side.CLIENT)
//	private static void registerFluidRender(final Block block, final Fluid fluid) {
//		final Item item = block.asItem();
//		final ResourceLocation resourceLocation = new ResourceLocation(RandoGeek.MODID, fluid.getName());
//		final FluidStateMapper mapper = new FluidStateMapper(resourceLocation.getNamespace() + ":" + fluid.getName());
//
//		if (item != null) {
//			ModelBakery.registerItemVariants(item);
//			ModelLoader.setCustomMeshDefinition(item, mapper);
//		}
//		ModelLoader.setCustomStateMapper(block, mapper);
//	}

	/**
	 *
	 * @param item The Item.
	 */
	private static void registerModel(final Item item) {
		ModelLoader.addSpecialModel(new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

	/**
	 *
	 * @param event The Event.
	 */
	@net.minecraftforge.eventbus.api.SubscribeEvent
	public static void registerModels(final ModelRegistryEvent event) {
//		registerModel(ModBlocks.TNTPumpkin.asItem());

//		registerModel(ModItems.HalloweenIngot);

	}

	/**
	 *
	 */
	private ClientEventHandler() {
		//
	}
}
