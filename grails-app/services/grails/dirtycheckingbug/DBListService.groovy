package grails.dirtycheckingbug

import grails.gorm.services.Service

@Service(DBList)
interface DBListService {

    DBList get(Serializable id)

    List<DBList> list(Map args)

    Long count()

    void delete(Serializable id)

    DBList save(DBList DBList)

}