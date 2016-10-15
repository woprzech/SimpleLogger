import pl.kody.ekstremalne.SimpleLogger
import pl.kody.ekstremalne.SimpleLoggerFactory
import spock.lang.Specification

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

    def "log info"() {
        given:
        SimpleLogger logger = SimpleLoggerFactory.getLogger("logger")
        when:
        logger.info("informuje")
        then:
        outContent.toString().contains("logger [INFO]: informuje")
    }

    def "log debug"() {
        given:
        SimpleLogger logger = SimpleLoggerFactory.getLogger("logger")
        when:
        logger.debug("debuguje")
        then:
        outContent.toString().contains("logger [DEBUG]: debuguje")
    }


    def "log warn"() {
        given:
        SimpleLogger logger = SimpleLoggerFactory.getLogger("logger")
        when:
        logger.warn("ostrzeżenie")
        then:
        outContent.toString().contains("logger [WARN]: ostrzeżenie")
    }

    def "log error"() {
        given:
        SimpleLogger logger = SimpleLoggerFactory.getLogger("logger")
        when:
        logger.error("błąd")
        then:
        outContent.toString().contains("logger [ERROR]: błąd")
    }
}