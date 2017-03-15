package saracalia.SaracaliaRandomStuffMod.models; //Path where the model is located

import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelRendererTurbo;
import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelVehicle;

public class ModelBusStopRight extends ModelVehicle //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelBusStopRight() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[9];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import Box0
		bodyModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		bodyModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		bodyModel[4] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Import Box0
		bodyModel[5] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import Box0
		bodyModel[6] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import Box0
		bodyModel[7] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import Box0
		bodyModel[8] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Import Box0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 32, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[0].setRotationPoint(6F, -22F, 7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 16, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[1].setRotationPoint(-8F, -23F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 32, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[2].setRotationPoint(6F, -22F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 32, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[3].setRotationPoint(-8F, -22F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[4].setRotationPoint(-6F, -8F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[5].setRotationPoint(6F, -8F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[6].setRotationPoint(-6F, -3F, -6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[7].setRotationPoint(-6F, -2F, 7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 9, 14, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[8].setRotationPoint(4F, -12F, -6F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}