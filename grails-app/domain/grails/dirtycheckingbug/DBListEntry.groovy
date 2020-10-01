package grails.dirtycheckingbug
import grails.gorm.dirty.checking.DirtyCheck

@DirtyCheck
class DBListEntry {

    String value

    static constraints = {
    }
}
