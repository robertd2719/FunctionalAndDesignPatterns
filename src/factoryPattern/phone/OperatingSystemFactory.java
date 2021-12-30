package factoryPattern.phone;

import java.util.Locale;

public class OperatingSystemFactory {
    public OS getInstance(String str){
        if (str.toLowerCase().equals("open")){
            return new Android();
        } else if (str.toLowerCase().equals("closed")){
            return new IOS();
        } else return new Widows();
    }
}
