/**
 * Created by alberto on 3/25/15.
 */
class Client {
    static void main(String []args) throws UnknownHostException, IOException{
        def host = "127.0.0.1"
        def port = 8000
        Socket socket = new Socket(host, port)
        InputStream inputStream =  socket.getInputStream()
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))
        println(bufferedReader.readLine())
        bufferedReader.close()
        socket.close()
    }
}
