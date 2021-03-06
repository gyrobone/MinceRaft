package com.waylon.minceraft.init;

import com.waylon.minceraft.blocks.BlockAluminumOre;
import com.waylon.minceraft.blocks.BlockCheeseCube;
import com.waylon.minceraft.blocks.BlockJalapeno;
import com.waylon.minceraft.items.ItemCheese;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block cheesecube;
	public static Block jalapeno;
	public static Block aluminumore;
	
	public static void init() {
		cheesecube = new BlockCheeseCube();
		//jalapenoplant = new BlockJalapenoPlant(null);
		aluminumore = new BlockAluminumOre();
		jalapeno = new BlockJalapeno();
		
	}
	
	public static void register() {
		registerBlock(cheesecube);
		//registerBlock(jalapenoplant);
		registerBlock(aluminumore);
		GameRegistry.register(jalapeno);
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(cheesecube);
		//registerRender(jalapenoplant);
		registerRender(aluminumore);
	}

	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
