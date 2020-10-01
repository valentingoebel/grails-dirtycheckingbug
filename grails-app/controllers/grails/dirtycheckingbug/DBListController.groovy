package grails.dirtycheckingbug

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class DBListController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        def dblist = DBList.list()[0]

        dblist.entries.each { it ->
            it.value = it.value + "1"
            render "DBListEntry: This should be dirty but it isn't: ${it.listDirtyPropertyNames()}<br>"
        }

        render "DBList: This is not dirty (optional bug): ${dblist.listDirtyPropertyNames()}<br><br>"

        dblist.entries.each { it ->
            it.trackChanges()
        }

        dblist.entries.each { it ->
            it.value = it.value + "2"
            render "DBListEntry: It works!: ${it.listDirtyPropertyNames()}<br>"
        }

        render "DBList: This is not dirty (optional bug): ${dblist.listDirtyPropertyNames()}<br><br>"

        render "Output: ${dblist.entries*.value}<br>"
    }
}
