/*
 * This file is generated by jOOQ.
 */
package me.sumit.uptime.database.generated.tables.records


import me.sumit.uptime.database.generated.tables.AttachDataNode

import org.jooq.Field
import org.jooq.Record3
import org.jooq.Row3
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class AttachDataNodeRecord() : TableRecordImpl<AttachDataNodeRecord>(AttachDataNode.ATTACH_DATA_NODE), Record3<Int?, Int?, String?> {

    var hypertableId: Int?
        set(value) = set(0, value)
        get() = get(0) as Int?

    var nodeHypertableId: Int?
        set(value) = set(1, value)
        get() = get(1) as Int?

    var nodeName: String?
        set(value) = set(2, value)
        get() = get(2) as String?

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row3<Int?, Int?, String?> = super.fieldsRow() as Row3<Int?, Int?, String?>
    override fun valuesRow(): Row3<Int?, Int?, String?> = super.valuesRow() as Row3<Int?, Int?, String?>
    override fun field1(): Field<Int?> = AttachDataNode.ATTACH_DATA_NODE.HYPERTABLE_ID
    override fun field2(): Field<Int?> = AttachDataNode.ATTACH_DATA_NODE.NODE_HYPERTABLE_ID
    override fun field3(): Field<String?> = AttachDataNode.ATTACH_DATA_NODE.NODE_NAME
    override fun component1(): Int? = hypertableId
    override fun component2(): Int? = nodeHypertableId
    override fun component3(): String? = nodeName
    override fun value1(): Int? = hypertableId
    override fun value2(): Int? = nodeHypertableId
    override fun value3(): String? = nodeName

    override fun value1(value: Int?): AttachDataNodeRecord {
        this.hypertableId = value
        return this
    }

    override fun value2(value: Int?): AttachDataNodeRecord {
        this.nodeHypertableId = value
        return this
    }

    override fun value3(value: String?): AttachDataNodeRecord {
        this.nodeName = value
        return this
    }

    override fun values(value1: Int?, value2: Int?, value3: String?): AttachDataNodeRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        return this
    }

    /**
     * Create a detached, initialised AttachDataNodeRecord
     */
    constructor(hypertableId: Int? = null, nodeHypertableId: Int? = null, nodeName: String? = null): this() {
        this.hypertableId = hypertableId
        this.nodeHypertableId = nodeHypertableId
        this.nodeName = nodeName
    }
}
