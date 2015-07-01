package exercises.RestCalc

import groovy.servlet.GroovyServlet
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.ServletContextHandler

/**
 * Created by alberto on 1/07/15.
 */
class Main {
    static main(def args) {
        def server = new Server(9090)
        def context = new ServletContextHandler(server, "/", ServletContextHandler.SESSIONS)
        context.contextPath = "/holaMundo"
        context.resourceBase = "src/main/groovy/exercises/RestCalc/groovlets"
        context.addServlet(GroovyServlet, "*.groovy")
        server.handler = context
        server.start()
    }
}
