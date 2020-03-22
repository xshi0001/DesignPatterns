package core.uml.sequence;

/**
 * @program: designpatterns
 * @description: device
 * @author: JClearLove
 * @Date: 2020/03/21 08:58
 */
public class Device {
    private int deviceId;

    private String message;

    public Device(int deviceId, String message) {
        this.deviceId = deviceId;
        this.message = message;
    }

    String sayHello() {
        return getMessage() + "    \n hi! world";
    }

    public int getDeviceId() {
        return deviceId;
    }


    public String getMessage() {
        return message;
    }
}

