package kenzie.things.init;

import kenzie.things.KenziesMod;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ObjectHolder;

public class ModItems {
	@ObjectHolder("kenziesmod:item1")
	public static final Item HacktoberFestItem1 = new Item(new Item.Properties().group(KenziesMod.KenzieTab));
	
	@ObjectHolder("kenziesmod:item2")
	public static final Item HacktoberFestItem2 = new Item(new Item.Properties().group(KenziesMod.KenzieTab));
	
	@ObjectHolder("kenziesmod:item3")
	public static final Item HacktoberFestItem3 = new Item(new Item.Properties().group(KenziesMod.KenzieTab));
	
	@ObjectHolder("kenziesmod:item4")
	public static final Item HacktoberFestItem4 = new Item(new Item.Properties().group(KenziesMod.KenzieTab));
	
	@ObjectHolder("kenziesmod:item5")
	public static final Item HacktoberFestCheatAdmit = new Item(new Item.Properties().group(KenziesMod.KenzieTab));

}
