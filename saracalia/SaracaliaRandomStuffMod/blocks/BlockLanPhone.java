package saracalia.SaracaliaRandomStuffMod.blocks;

import net.minecraft.block.Block;
import saracalia.SaracaliaRandomStuffMod.models.ModelLanPhone;
import saracalia.SaracaliaRandomStuffMod.register.RegistryContainer;
import saracalia.SaracaliaRandomStuffMod.tileentities.LanPhoneTE;

public class BlockLanPhone {

	public static void register(){
		RegistryContainer.addBlock("LanPhone", LanPhoneTE.LanPhone.class, new ModelLanPhone(), 2);
	}
    
	public static Block getBlock(String blockname){
		return RegistryContainer.getBlock(blockname);
	}

}