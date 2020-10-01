package grails.dirtycheckingbug

class DBList {

    static constraints = {
    }

    List<DBListEntry> entries = []
    static embedded = ['entries']

    static hasMany = [
        entries: DBListEntry
    ]
}
