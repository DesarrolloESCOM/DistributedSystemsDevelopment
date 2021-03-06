package exercises.EX1.server

import java.net.ServerSocket
def server = new ServerSocket(4444)

while(true) {
    server.accept { socket ->
        println "processing new connection..."
        socket.withStreams { input, output ->
            def reader = input.newReader()
            def buffer = reader.readLine()
            println "server received: $buffer"
            now = new Date()
            output << "echo-response($now): " + buffer + "\n"
        }
        println "processing/thread complete."
    }
}