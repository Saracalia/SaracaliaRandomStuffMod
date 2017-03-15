package saracalia.SaracaliaRandomStuffMod.blocks;

import net.minecraft.block.Block;
import saracalia.SaracaliaRandomStuffMod.models.ModelFuelPump;
import saracalia.SaracaliaRandomStuffMod.register.RegistryContainer;
import saracalia.SaracaliaRandomStuffMod.tileentities.FuelPumpTE;

public class BlockFuelPump {

	public static void register(){
		RegistryContainer.addBlock("FuelPump", FuelPumpTE.FuelPump.class, new ModelFuelPump(), 2);
	}
    
	public static Block getBlock(String blockname){
		return RegistryContainer.getBlock(blockname);
	}

}