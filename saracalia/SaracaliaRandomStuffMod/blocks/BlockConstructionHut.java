package saracalia.SaracaliaRandomStuffMod.blocks;

import net.minecraft.block.Block;
import saracalia.SaracaliaRandomStuffMod.models.ModelConstructionHut;
import saracalia.SaracaliaRandomStuffMod.register.RegistryContainer;
import saracalia.SaracaliaRandomStuffMod.tileentities.ConstructionHutTE;

public class BlockConstructionHut {

	public static void register(){
		RegistryContainer.addBlock("ConstructionHut", ConstructionHutTE.ConstructionHut.class, new ModelConstructionHut(), 2);
	}
    
	public static Block getBlock(String blockname){
		return RegistryContainer.getBlock(blockname);
	}

}