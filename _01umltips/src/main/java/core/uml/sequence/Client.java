package core.uml.sequence;

/**
 * @program: designpatterns
 * @description: 客户端
 * @author: JClearLove
 * @Date: 2020/03/21 08:59
 */
public class Client {
    private Server server;

    private Integer clientId;


    Client(Server server) {
        this.server = server;
    }

    void work() {
        server.open();
        String s = server.connectToServer(clientId);
        System.out.println(s);
        server.close();

    }

    public Server getServer() {
        return server;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

}

