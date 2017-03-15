// Model: PhoneBox
// Model Creator: 
// Created on: 10.01.2017 - 19:36:32
// Last changed on: 10.01.2017 - 19:36:32

package saracalia.SaracaliaRandomStuffMod.models; //Path where the model is located

import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelVehicle;
import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelRendererTurbo;

public class ModelPhoneBox extends ModelVehicle //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelPhoneBox() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[10];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 16, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-8F, 8F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 30, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[1].setRotationPoint(6F, -22F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 16, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[2].setRotationPoint(-8F, -24F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 14, 4, 14, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[3].setRotationPoint(-7F, -28F, -7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 30, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[4].setRotationPoint(-8F, -22F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 30, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[5].setRotationPoint(-8F, -22F, 6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[6].setRotationPoint(-6F, -8F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[7].setRotationPoint(-6F, -8F, 6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[8].setRotationPoint(2F, -7F, -6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 9, 5, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[9].setRotationPoint(2F, -16F, -6F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}