package saracalia.SaracaliaRandomStuffMod.register;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;
import saracalia.SaracaliaRandomStuffMod.blocks.tileentity.SRSMBB;
import saracalia.SaracaliaRandomStuffMod.models.ModelPhoneBox;
import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelVehicle;

public class RegistryContainer {
	
	private static ArrayList<String> names = new ArrayList<String>();
	private static Map<String, Block> blocks = new HashMap<String, Block>();
	private static Map<String, Class> tileentities = new HashMap<String, Class>();
	private static Map<String, ModelVehicle> models = new HashMap<String, ModelVehicle>();
	private static Map<String, Integer> modelYfix = new HashMap<String, Integer>();
	
	/**
	 * Method which will store the block, tileentity and model into hashmaps,
	 * from which automated registry methods will retrieve them and register.
	 * @param blockname
	 * @param tile
	 * @param modelPhoneBox
	 * @param pixel_YAxis_adjustment
	 */
	public static void addBlock(String blockname, Class tile, ModelVehicle modelPhoneBox, int pixel_YAxis_adjustment){
		SRSMBB block = new SRSMBB(blockname, tile);
		blocks.put(blockname, block);
		tileentities.put(blockname, tile);
		models.put(blockname, modelPhoneBox);
		modelYfix.put(blockname, pixel_YAxis_adjustment);
		names.add(blockname);
	}
	
	/**
	 * Method to register all currently stored Blocks and TileEntities.
	 */
	public static void register(){
		for(Entry<String, Block> entry : blocks.entrySet()){
			GameRegistry.registerBlock(entry.getValue(), entry.getKey());
		}
		for(Entry<String, Class> entry : tileentities.entrySet()){
			GameRegistry.registerTileEntity(entry.getValue(), entry.getKey());
		}
	}
	
	public static ArrayList<String> getNameList(){
		return names;
	}
	
	public static ModelVehicle getModel(String string){
		return models.get(string);
	}
	
	public static Block getBlock(String string){
		return blocks.get(string);
	}
	
	public static Class getTilEntityClass(String string){
		return tileentities.get(string);
	}
	
	public static int getY(String string){
		return modelYfix.get(string);
	}
	
}