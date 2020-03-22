package core.uml.sequence;

/**
 * @program: designpatterns
 * @description: 服务器
 * @author: JClearLove
 * @Date: 2020/03/21 08:58
 */
public class Server {

    private Device device;

    void open() {

        System.out.println("device is initing.....");

    }

    String connectToServer(int clientId) {
        if (clientId > 0) {
            return device.sayHello() + " ,  will connnect to server";
        } else {
            return device.sayHello() + " ,  not connnect to server";
        }
    }

    void close() {

    }

    void setDevice(Device device) {
        this.device = device;
    }
}

