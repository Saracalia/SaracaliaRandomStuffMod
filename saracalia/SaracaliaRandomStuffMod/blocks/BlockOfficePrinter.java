package saracalia.SaracaliaRandomStuffMod.blocks;

import net.minecraft.block.Block;
import saracalia.SaracaliaRandomStuffMod.models.ModelOfficePrinter;
import saracalia.SaracaliaRandomStuffMod.register.RegistryContainer;
import saracalia.SaracaliaRandomStuffMod.tileentities.OfficePrinterTE;

public class BlockOfficePrinter {

	public static void register(){
		RegistryContainer.addBlock("OfficePrinter", OfficePrinterTE.OfficePrinter.class, new ModelOfficePrinter(), 2);
	}
    
	public static Block getBlock(String blockname){
		return RegistryContainer.getBlock(blockname);
	}

}