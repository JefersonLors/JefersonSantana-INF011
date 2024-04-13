package products;

import products.components.*;
import products.concreteComponentes.Dimension;
import products.concreteComponentes.Position;
import products.concreteComponentes.cords.CarbonFiberCord;
import products.concreteComponentes.cords.FabricCord;

public class OfficeMouse {
    private Dimension dimension;
    private Position position;
    private BluetoothModule bluetoothModule;
    private LightModule lightModule;
    private Scroll scroll;
    private BatteryModule batteryModule;
    private Material material;
    private Sensor sensor;
    private Button rightClickButton;
    private Button leftClickButton;
    private Button powerButton;
    private Button saveEnergyModeButton;

    public OfficeMouse(Dimension dimension, BluetoothModule bluetoothModule,
                       LightModule lightModule, Scroll scroll, BatteryModule batteryModule,
                       Material material, Sensor sensor, Button rightClickButton,
                       Button leftClickButton, Button powerButton, Button saveEnergyModeButton) {
        this.dimension = dimension;
        this.bluetoothModule = bluetoothModule;
        this.lightModule = lightModule;
        this.scroll = scroll;
        this.batteryModule = batteryModule;
        this.material = material;
        this.sensor = sensor;
        this.rightClickButton = rightClickButton;
        this.leftClickButton = leftClickButton;
        this.powerButton = powerButton;
        this.saveEnergyModeButton = saveEnergyModeButton;
    }

    public void pressSaveEnergyModeButton(){
        this.saveEnergyModeButton.click("save energy mode button pressed");
    }
    public void pressPowerButton(){
        this.powerButton.click("power button pressed");
    }
    public void pressLeftClickButton(){
        this.leftClickButton.click("left button pressed");
    }
    public void pressRightClickButton(){
        this.rightClickButton.click("right button pressed");
    }

    public void moveTo(Position position){
        this.position = position;
    }
}
