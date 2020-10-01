package grails.dirtycheckingbug

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class DBListSpec extends Specification implements DomainUnitTest<DBList> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
