package exercises.EX3

/**
 * Created by alberto on 4/15/15.
 */
class Server extends Thread {
    static final int port = 6666
    ServerSocket serverSocket;

    public Servidor() {
        init()
        start();
    }

    def init() {
        serverSocket = new ServerSocket(this.port)
        println "Working!"
    }

    @Override
    public void run() {
        try {
            for (; ;) {
                println "ok"
            }
        } catch (Exception e) {

        }
    }
}
