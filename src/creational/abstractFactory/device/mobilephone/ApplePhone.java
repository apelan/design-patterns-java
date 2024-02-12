package creational.abstractFactory.device.mobilephone;

public class ApplePhone implements MobilePhone {
    @Override
    public String name() {
        return "IPhone";
    }

    @Override
    public String operatingSystem() {
        return "iOS";
    }
}
