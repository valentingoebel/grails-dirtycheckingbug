package grails.dirtycheckingbug

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class DBListServiceSpec extends Specification {

    DBListService DBListService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new DBList(...).save(flush: true, failOnError: true)
        //new DBList(...).save(flush: true, failOnError: true)
        //DBList DBList = new DBList(...).save(flush: true, failOnError: true)
        //new DBList(...).save(flush: true, failOnError: true)
        //new DBList(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //DBList.id
    }

    void "test get"() {
        setupData()

        expect:
        DBListService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<DBList> DBListList = DBListService.list(max: 2, offset: 2)

        then:
        DBListList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        DBListService.count() == 5
    }

    void "test delete"() {
        Long DBListId = setupData()

        expect:
        DBListService.count() == 5

        when:
        DBListService.delete(DBListId)
        sessionFactory.currentSession.flush()

        then:
        DBListService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        DBList DBList = new DBList()
        DBListService.save(DBList)

        then:
        DBList.id != null
    }
}
