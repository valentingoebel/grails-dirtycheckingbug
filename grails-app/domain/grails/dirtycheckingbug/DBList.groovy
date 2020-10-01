package grails.dirtycheckingbug
import grails.gorm.dirty.checking.DirtyCheck

@DirtyCheck
class DBList {

    static constraints = {
    }

    List<DBListEntry> entries = []
    static embedded = ['entries']

    static hasMany = [
        entries: DBListEntry
    ]
}
