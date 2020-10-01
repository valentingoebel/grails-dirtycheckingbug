package grails.dirtycheckingbug

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class DBListEntrySpec extends Specification implements DomainUnitTest<DBListEntry> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
