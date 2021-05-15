/*
 * This file is generated by jOOQ.
 */
package me.sumit.uptime.database.generated.tables.records


import me.sumit.uptime.database.generated.enums.MonitorType
import me.sumit.uptime.database.generated.tables.MonitorTypes

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record2
import org.jooq.Row2
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class MonitorTypesRecord() : UpdatableRecordImpl<MonitorTypesRecord>(MonitorTypes.MONITOR_TYPES), Record2<Long?, MonitorType?> {

    var id: Long?
        set(value) = set(0, value)
        get() = get(0) as Long?

    var type: MonitorType?
        set(value) = set(1, value)
        get() = get(1) as MonitorType?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row2<Long?, MonitorType?> = super.fieldsRow() as Row2<Long?, MonitorType?>
    override fun valuesRow(): Row2<Long?, MonitorType?> = super.valuesRow() as Row2<Long?, MonitorType?>
    override fun field1(): Field<Long?> = MonitorTypes.MONITOR_TYPES.ID
    override fun field2(): Field<MonitorType?> = MonitorTypes.MONITOR_TYPES.TYPE
    override fun component1(): Long? = id
    override fun component2(): MonitorType? = type
    override fun value1(): Long? = id
    override fun value2(): MonitorType? = type

    override fun value1(value: Long?): MonitorTypesRecord {
        this.id = value
        return this
    }

    override fun value2(value: MonitorType?): MonitorTypesRecord {
        this.type = value
        return this
    }

    override fun values(value1: Long?, value2: MonitorType?): MonitorTypesRecord {
        this.value1(value1)
        this.value2(value2)
        return this
    }

    /**
     * Create a detached, initialised MonitorTypesRecord
     */
    constructor(id: Long? = null, type: MonitorType? = null): this() {
        this.id = id
        this.type = type
    }
}