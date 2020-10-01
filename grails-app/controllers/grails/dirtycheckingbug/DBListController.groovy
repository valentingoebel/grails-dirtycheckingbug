package grails.dirtycheckingbug

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class DBListController {

    DBListService DBListService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        def dblist = DBList.list()[0]

        dblist.entries.each { it ->
            it.value = it.value + "1"
            render "DBListEntry: Nothing is dirty: ${it.listDirtyPropertyNames()}<br>"
        }

        render "DBList: Nothing is dirty: ${dblist.listDirtyPropertyNames()}<br><br>"

        dblist.entries.each { it ->
            it.trackChanges()
        }

        dblist.entries.each { it ->
            it.value = it.value + "2"
            render "DBListEntry: It works!: ${it.listDirtyPropertyNames()}<br>"
        }

        render "DBList: Nothing is dirty: ${dblist.listDirtyPropertyNames()}<br><br>"

        render "Output: ${dblist.entries*.value}<br>"
    }
}
