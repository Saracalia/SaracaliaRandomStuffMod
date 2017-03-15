package saracalia.SaracaliaRandomStuffMod.blocks;

import net.minecraft.block.Block;
import saracalia.SaracaliaRandomStuffMod.models.ModelDumpMaster;
import saracalia.SaracaliaRandomStuffMod.register.RegistryContainer;
import saracalia.SaracaliaRandomStuffMod.tileentities.DumpMasterTE;

public class BlockDumpMaster {

	public static void register(){
		RegistryContainer.addBlock("DumpMaster", DumpMasterTE.DumpMaster.class, new ModelDumpMaster(), 2);
	}
    
	public static Block getBlock(String blockname){
		return RegistryContainer.getBlock(blockname);
	}

}