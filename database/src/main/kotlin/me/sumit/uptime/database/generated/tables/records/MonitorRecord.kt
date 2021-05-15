/*
 * This file is generated by jOOQ.
 */
package me.sumit.uptime.database.generated.tables.records


import java.time.OffsetDateTime

import me.sumit.uptime.database.generated.tables.Monitor

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record8
import org.jooq.Row8
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class MonitorRecord() : UpdatableRecordImpl<MonitorRecord>(Monitor.MONITOR), Record8<Long?, String?, String?, Long?, OffsetDateTime?, OffsetDateTime?, String?, String?> {

    var id: Long?
        set(value) = set(0, value)
        get() = get(0) as Long?

    var name: String?
        set(value) = set(1, value)
        get() = get(1) as String?

    var endpoint: String?
        set(value) = set(2, value)
        get() = get(2) as String?

    var monitorType: Long?
        set(value) = set(3, value)
        get() = get(3) as Long?

    var createdAt: OffsetDateTime?
        set(value) = set(4, value)
        get() = get(4) as OffsetDateTime?

    var modifiedAt: OffsetDateTime?
        set(value) = set(5, value)
        get() = get(5) as OffsetDateTime?

    var createdBy: String?
        set(value) = set(6, value)
        get() = get(6) as String?

    var modifiedBy: String?
        set(value) = set(7, value)
        get() = get(7) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row8<Long?, String?, String?, Long?, OffsetDateTime?, OffsetDateTime?, String?, String?> = super.fieldsRow() as Row8<Long?, String?, String?, Long?, OffsetDateTime?, OffsetDateTime?, String?, String?>
    override fun valuesRow(): Row8<Long?, String?, String?, Long?, OffsetDateTime?, OffsetDateTime?, String?, String?> = super.valuesRow() as Row8<Long?, String?, String?, Long?, OffsetDateTime?, OffsetDateTime?, String?, String?>
    override fun field1(): Field<Long?> = Monitor.MONITOR.ID
    override fun field2(): Field<String?> = Monitor.MONITOR.NAME
    override fun field3(): Field<String?> = Monitor.MONITOR.ENDPOINT
    override fun field4(): Field<Long?> = Monitor.MONITOR.MONITOR_TYPE
    override fun field5(): Field<OffsetDateTime?> = Monitor.MONITOR.CREATED_AT
    override fun field6(): Field<OffsetDateTime?> = Monitor.MONITOR.MODIFIED_AT
    override fun field7(): Field<String?> = Monitor.MONITOR.CREATED_BY
    override fun field8(): Field<String?> = Monitor.MONITOR.MODIFIED_BY
    override fun component1(): Long? = id
    override fun component2(): String? = name
    override fun component3(): String? = endpoint
    override fun component4(): Long? = monitorType
    override fun component5(): OffsetDateTime? = createdAt
    override fun component6(): OffsetDateTime? = modifiedAt
    override fun component7(): String? = createdBy
    override fun component8(): String? = modifiedBy
    override fun value1(): Long? = id
    override fun value2(): String? = name
    override fun value3(): String? = endpoint
    override fun value4(): Long? = monitorType
    override fun value5(): OffsetDateTime? = createdAt
    override fun value6(): OffsetDateTime? = modifiedAt
    override fun value7(): String? = createdBy
    override fun value8(): String? = modifiedBy

    override fun value1(value: Long?): MonitorRecord {
        this.id = value
        return this
    }

    override fun value2(value: String?): MonitorRecord {
        this.name = value
        return this
    }

    override fun value3(value: String?): MonitorRecord {
        this.endpoint = value
        return this
    }

    override fun value4(value: Long?): MonitorRecord {
        this.monitorType = value
        return this
    }

    override fun value5(value: OffsetDateTime?): MonitorRecord {
        this.createdAt = value
        return this
    }

    override fun value6(value: OffsetDateTime?): MonitorRecord {
        this.modifiedAt = value
        return this
    }

    override fun value7(value: String?): MonitorRecord {
        this.createdBy = value
        return this
    }

    override fun value8(value: String?): MonitorRecord {
        this.modifiedBy = value
        return this
    }

    override fun values(value1: Long?, value2: String?, value3: String?, value4: Long?, value5: OffsetDateTime?, value6: OffsetDateTime?, value7: String?, value8: String?): MonitorRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        this.value8(value8)
        return this
    }

    /**
     * Create a detached, initialised MonitorRecord
     */
    constructor(id: Long? = null, name: String? = null, endpoint: String? = null, monitorType: Long? = null, createdAt: OffsetDateTime? = null, modifiedAt: OffsetDateTime? = null, createdBy: String? = null, modifiedBy: String? = null): this() {
        this.id = id
        this.name = name
        this.endpoint = endpoint
        this.monitorType = monitorType
        this.createdAt = createdAt
        this.modifiedAt = modifiedAt
        this.createdBy = createdBy
        this.modifiedBy = modifiedBy
    }
}
