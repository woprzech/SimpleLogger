import pl.kody.ekstremalne.SimpleLogger
import pl.kody.ekstremalne.SimpleLoggerFactory
import spock.lang.Specification

/**
 * Created by Wojtek Przechodzen.
 */
class SimpleLoggerFactorySpec extends Specification {

    def "create logger with name"() {
        given:
        SimpleLogger logger = SimpleLoggerFactory.getLogger("name")
        expect:
        logger.getName() == "name"
    }

    def "two loggers with same name are the same object"() {
        given:
        SimpleLogger firstLogger = SimpleLoggerFactory.getLogger("name")
        when:
        SimpleLogger secondLogger = SimpleLoggerFactory.getLogger("name")
        then:
        secondLogger == firstLogger
    }
}