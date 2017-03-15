package saracalia.SaracaliaRandomStuffMod.blocks;

import net.minecraft.block.Block;
import saracalia.SaracaliaRandomStuffMod.models.ModelWheelieBin;
import saracalia.SaracaliaRandomStuffMod.register.RegistryContainer;
import saracalia.SaracaliaRandomStuffMod.tileentities.WheelieBinTE;

public class BlockWheelieBin {

	public static void register(){
		RegistryContainer.addBlock("WheelieBin", WheelieBinTE.WheelieBin.class, new ModelWheelieBin(), 2);
	}
    
	public static Block getBlock(String blockname){
		return RegistryContainer.getBlock(blockname);
	}

}