package saracalia.SaracaliaRandomStuffMod.blocks;

import net.minecraft.block.Block;
import saracalia.SaracaliaRandomStuffMod.models.ModelBusStopSign;
import saracalia.SaracaliaRandomStuffMod.register.RegistryContainer;
import saracalia.SaracaliaRandomStuffMod.tileentities.BusStopSignTE;

public class BlockBusStopSign {

	public static void register(){
		RegistryContainer.addBlock("BusStopSign", BusStopSignTE.BusStopSign.class, new ModelBusStopSign(), 2);
	}
    
	public static Block getBlock(String blockname){
		return RegistryContainer.getBlock(blockname);
	}

}