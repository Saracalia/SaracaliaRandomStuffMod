package saracalia.SaracaliaRandomStuffMod.blocks;

import net.minecraft.block.Block;
import saracalia.SaracaliaRandomStuffMod.models.ModelCashRegister;
import saracalia.SaracaliaRandomStuffMod.register.RegistryContainer;
import saracalia.SaracaliaRandomStuffMod.tileentities.CashRegisterTE;

public class BlockCashRegister {

	public static void register(){
		RegistryContainer.addBlock("CashRegister", CashRegisterTE.CashRegister.class, new ModelCashRegister(), 2);
	}
    
	public static Block getBlock(String blockname){
		return RegistryContainer.getBlock(blockname);
	}

}