import java.net.ServerSocket
/**
 * Created by alberto on 3/25/15.
 */
class Server {
    static String getDate(){
        return new Date().toString()
    }

    static void main(String []args){
        def port = 8000
        ServerSocket socketServer = new ServerSocket(port)
        while(true){
            Socket clientSocket = socketServer.accept()
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream())
            writer.print(getDate())
            writer.close()
            clientSocket.close()
        }
    }
}
