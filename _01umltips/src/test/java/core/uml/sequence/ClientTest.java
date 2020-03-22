package core.uml.sequence;

import org.junit.Test;

/**
 * @Description:
 * @Author: JClearLove
 * @Date: 2020/03/21 09:06
 */
public class ClientTest {

    @Test
    public void work() {

        Device device = new Device(7, "I am a useful device");
        device.sayHello();
        Server server = new Server();
        server.setDevice(device);
        Client client = new Client(server);
        client.setClientId(3);
        client.work();
    }
}