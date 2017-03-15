// Model: CashRegister
// Model Creator: 
// Created on: 13.01.2017 - 13:36:23
// Last changed on: 13.01.2017 - 13:36:23

package saracalia.SaracaliaRandomStuffMod.models; //Path where the model is located

import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelRendererTurbo;
import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelVehicle;

public class ModelCashRegister extends ModelVehicle //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelCashRegister() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[6];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 11, 3, 16, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-7F, 7F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[1].setRotationPoint(5F, -1F, 3F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 6, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[2].setRotationPoint(4F, 4F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[3].setRotationPoint(-7.5F, 7.5F, -7.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[4].setRotationPoint(4F, 1F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[5].setRotationPoint(5F, 1F, 5F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}