public class SmartLight extends SmartDevice implements Adjustable {
    private int brightness;

    public SmartLight(String deviceName) {
        super(deviceName);
        this.brightness = 0;
    }

    @Override
    public void setLevel(int level) {
        if (!isOn) {
            System.out.println("Cannot adjust: Device is OFF.");
            return;
        }

        if (level >= 0 && level <= 100) {
            brightness = level;
        }
    }

    @Override
    void performSelfDiagnostic() {
        System.out.println("Checking LED health...");
    }
}
