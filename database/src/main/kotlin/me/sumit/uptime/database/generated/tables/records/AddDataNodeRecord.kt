/*
 * This file is generated by jOOQ.
 */
package me.sumit.uptime.database.generated.tables.records


import me.sumit.uptime.database.generated.tables.AddDataNode

import org.jooq.Field
import org.jooq.Record7
import org.jooq.Row7
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class AddDataNodeRecord() : TableRecordImpl<AddDataNodeRecord>(AddDataNode.ADD_DATA_NODE), Record7<String?, String?, Int?, String?, Boolean?, Boolean?, Boolean?> {

    var nodeName: String?
        set(value) = set(0, value)
        get() = get(0) as String?

    var host: String?
        set(value) = set(1, value)
        get() = get(1) as String?

    var port: Int?
        set(value) = set(2, value)
        get() = get(2) as Int?

    var database: String?
        set(value) = set(3, value)
        get() = get(3) as String?

    var nodeCreated: Boolean?
        set(value) = set(4, value)
        get() = get(4) as Boolean?

    var databaseCreated: Boolean?
        set(value) = set(5, value)
        get() = get(5) as Boolean?

    var extensionCreated: Boolean?
        set(value) = set(6, value)
        get() = get(6) as Boolean?

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row7<String?, String?, Int?, String?, Boolean?, Boolean?, Boolean?> = super.fieldsRow() as Row7<String?, String?, Int?, String?, Boolean?, Boolean?, Boolean?>
    override fun valuesRow(): Row7<String?, String?, Int?, String?, Boolean?, Boolean?, Boolean?> = super.valuesRow() as Row7<String?, String?, Int?, String?, Boolean?, Boolean?, Boolean?>
    override fun field1(): Field<String?> = AddDataNode.ADD_DATA_NODE.NODE_NAME
    override fun field2(): Field<String?> = AddDataNode.ADD_DATA_NODE.HOST
    override fun field3(): Field<Int?> = AddDataNode.ADD_DATA_NODE.PORT
    override fun field4(): Field<String?> = AddDataNode.ADD_DATA_NODE.DATABASE
    override fun field5(): Field<Boolean?> = AddDataNode.ADD_DATA_NODE.NODE_CREATED
    override fun field6(): Field<Boolean?> = AddDataNode.ADD_DATA_NODE.DATABASE_CREATED
    override fun field7(): Field<Boolean?> = AddDataNode.ADD_DATA_NODE.EXTENSION_CREATED
    override fun component1(): String? = nodeName
    override fun component2(): String? = host
    override fun component3(): Int? = port
    override fun component4(): String? = database
    override fun component5(): Boolean? = nodeCreated
    override fun component6(): Boolean? = databaseCreated
    override fun component7(): Boolean? = extensionCreated
    override fun value1(): String? = nodeName
    override fun value2(): String? = host
    override fun value3(): Int? = port
    override fun value4(): String? = database
    override fun value5(): Boolean? = nodeCreated
    override fun value6(): Boolean? = databaseCreated
    override fun value7(): Boolean? = extensionCreated

    override fun value1(value: String?): AddDataNodeRecord {
        this.nodeName = value
        return this
    }

    override fun value2(value: String?): AddDataNodeRecord {
        this.host = value
        return this
    }

    override fun value3(value: Int?): AddDataNodeRecord {
        this.port = value
        return this
    }

    override fun value4(value: String?): AddDataNodeRecord {
        this.database = value
        return this
    }

    override fun value5(value: Boolean?): AddDataNodeRecord {
        this.nodeCreated = value
        return this
    }

    override fun value6(value: Boolean?): AddDataNodeRecord {
        this.databaseCreated = value
        return this
    }

    override fun value7(value: Boolean?): AddDataNodeRecord {
        this.extensionCreated = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: Int?, value4: String?, value5: Boolean?, value6: Boolean?, value7: Boolean?): AddDataNodeRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        return this
    }

    /**
     * Create a detached, initialised AddDataNodeRecord
     */
    constructor(nodeName: String? = null, host: String? = null, port: Int? = null, database: String? = null, nodeCreated: Boolean? = null, databaseCreated: Boolean? = null, extensionCreated: Boolean? = null): this() {
        this.nodeName = nodeName
        this.host = host
        this.port = port
        this.database = database
        this.nodeCreated = nodeCreated
        this.databaseCreated = databaseCreated
        this.extensionCreated = extensionCreated
    }
}