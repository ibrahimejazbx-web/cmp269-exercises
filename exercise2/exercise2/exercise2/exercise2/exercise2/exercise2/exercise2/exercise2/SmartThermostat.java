public class SmartThermostat extends SmartDevice implements Adjustable {
    private int temperature;

    public SmartThermostat(String deviceName) {
        super(deviceName);
        this.temperature = 70;
    }

    @Override
    public void turnOn() {
        System.out.println("HVAC System Starting...");
        super.turnOn();
    }

    @Override
    public void setLevel(int level) {
        if (level >= 60 && level <= 80) {
            temperature = level;
        }
    }

    @Override
    void performSelfDiagnostic() {
        System.out.println("Running thermostat diagnostics...");
    }
}
