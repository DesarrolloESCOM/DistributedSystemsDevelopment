package exercises.EX2.server

import exercises.EX2.math.Calculator
import groovy.json.JsonSlurper

/**
 * Created by alberto on 4/12/15.
 */
class Server {
    def static void main(String[] args) {

        def server = new ServerSocket(4444)
        def calculator = new Calculator()
        while (true) {
            server.accept { socket ->
                socket.withStreams { input, output ->
                    def reader = input.newReader()
                    def buffer = reader.readLine()
                    //
                    def actions = new JsonSlurper().parseText(buffer)
                    def result
                    if (actions.operation in ['linearSearch', 'binarySearch']) {
                        result = calculator."${actions.operation}"(actions.items, actions.toBeFound)
                    } else {
                        result = calculator."${actions.operation}"(actions.params)
                    }

                    output << "${result}\n"
                }
                println "Waiting for new job request..."
            }
        }
    }
}
