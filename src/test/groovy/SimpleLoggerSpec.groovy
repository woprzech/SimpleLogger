import pl.kody.ekstremalne.SimpleLogger
import pl.kody.ekstremalne.SimpleLoggerFactory
import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by Wojtek Przechodzen.
 */
class SimpleLoggerSpec extends Specification {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    void setup() {
        System.setOut(new PrintStream(outContent))
    }

    void cleanup() {
        System.setOut(null)

    }

    @Unroll
    def "log info"(String msg, Object parameter, String result) {
        given:
        SimpleLogger logger = SimpleLoggerFactory.getLogger("logger")
        when:
        logger.info(msg, parameter)
        then:
        outContent.toString().contains(result)
        where:
        msg                       | parameter        | result
        "info"                    | null             | "logger [INFO]: info"
        "info with parameter: %s" | "parameterValue" | "logger [INFO]: info with parameter: parameterValue"
    }

    @Unroll
    def "log debug"(String msg, Object parameter, String result) {
        given:
        SimpleLogger logger = SimpleLoggerFactory.getLogger("logger")
        when:
        logger.debug(msg, parameter)
        then:
        outContent.toString().contains(result)
        where:
        msg                        | parameter        | result
        "debug"                    | null             | "logger [DEBUG]: debug"
        "debug with parameter: %s" | "parameterValue" | "logger [DEBUG]: debug with parameter: parameterValue"
    }

    @Unroll
    def "log warn"(String msg, Object parameter, String result) {
        given:
        SimpleLogger logger = SimpleLoggerFactory.getLogger("logger")
        when:
        logger.warn(msg, parameter)
        then:
        outContent.toString().contains(result)
        where:
        msg                          | parameter        | result
        "warning"                    | null             | "logger [WARN]: warning"
        "warning with parameter: %s" | "parameterValue" | "logger [WARN]: warning with parameter: parameterValue"
    }

    @Unroll
    def "log error"(String msg, Object parameter, String result) {
        given:
        SimpleLogger logger = SimpleLoggerFactory.getLogger("logger")
        when:
        logger.error(msg, parameter)
        then:
        outContent.toString().contains(result)
        where:
        msg                        | parameter        | result
        "błąd"                     | null             | "logger [ERROR]: błąd"
        "error with parameter: %s" | "parameterValue" | "logger [ERROR]: error with parameter: parameterValue"

    }
}