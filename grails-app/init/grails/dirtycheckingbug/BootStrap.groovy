package grails.dirtycheckingbug

class BootStrap {

    def init = { servletContext ->
        DBList.list().each { it.delete() }
        def dblist = new DBList()
        dblist.entries.add(new DBListEntry(value: 'A'))
        dblist.entries.add(new DBListEntry(value: 'B'))
        dblist.entries.add(new DBListEntry(value: 'C'))
        dblist.save(flush: true, failOnError: true)
    }
    def destroy = {
    }
}
