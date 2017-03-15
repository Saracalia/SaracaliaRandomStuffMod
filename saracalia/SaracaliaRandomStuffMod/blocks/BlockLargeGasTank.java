package saracalia.SaracaliaRandomStuffMod.blocks;

import net.minecraft.block.Block;
import saracalia.SaracaliaRandomStuffMod.models.ModelLargeGasTank;
import saracalia.SaracaliaRandomStuffMod.register.RegistryContainer;
import saracalia.SaracaliaRandomStuffMod.tileentities.LargeGasTankTE;

public class BlockLargeGasTank {

	public static void register(){
		RegistryContainer.addBlock("LargeGasTank", LargeGasTankTE.LargeGasTank.class, new ModelLargeGasTank(), 2);
	}
    
	public static Block getBlock(String blockname){
		return RegistryContainer.getBlock(blockname);
	}

}