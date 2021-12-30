package factoryPattern.factoryMain;

import factoryPattern.phone.OS;
import factoryPattern.phone.OperatingSystemFactory;

public class FactoryMain {
    public static void main(String[] args) {
        // Now that we have defined our factory method all we need do now is invoke it
        // for an instance of each class
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS os = osf.getInstance("other");
        os.spec();
    }
}
