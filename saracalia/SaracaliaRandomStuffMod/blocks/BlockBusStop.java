package saracalia.SaracaliaRandomStuffMod.blocks;

import net.minecraft.block.Block;
import saracalia.SaracaliaRandomStuffMod.models.ModelBusStopCenter;
import saracalia.SaracaliaRandomStuffMod.models.ModelBusStopLeft;
import saracalia.SaracaliaRandomStuffMod.models.ModelBusStopRight;
import saracalia.SaracaliaRandomStuffMod.register.RegistryContainer;
import saracalia.SaracaliaRandomStuffMod.tileentities.BusStopTE;

public class BlockBusStop {

	public static void register(){
		RegistryContainer.addBlock("BusStopLeft", BusStopTE.BusStopLeft.class, new ModelBusStopLeft(), 2);
		RegistryContainer.addBlock("BusStopCenter", BusStopTE.BusStopCenter.class, new ModelBusStopCenter(), 2);
		RegistryContainer.addBlock("BusStopRight", BusStopTE.BusStopRight.class, new ModelBusStopRight(), 2);
	}
    
	public static Block getBlock(String blockname){
		return RegistryContainer.getBlock(blockname);
	}

}