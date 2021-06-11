/*
 * This file is generated by jOOQ.
 */
package me.sumit.uptime.database.generated.tables.records


import me.sumit.uptime.database.generated.tables.ChunksDetailedSize

import org.jooq.Field
import org.jooq.Record7
import org.jooq.Row7
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ChunksDetailedSizeRecord() : TableRecordImpl<ChunksDetailedSizeRecord>(ChunksDetailedSize.CHUNKS_DETAILED_SIZE), Record7<String?, String?, Long?, Long?, Long?, Long?, String?> {

    var chunkSchema: String?
        set(value) = set(0, value)
        get() = get(0) as String?

    var chunkName: String?
        set(value) = set(1, value)
        get() = get(1) as String?

    var tableBytes: Long?
        set(value) = set(2, value)
        get() = get(2) as Long?

    var indexBytes: Long?
        set(value) = set(3, value)
        get() = get(3) as Long?

    var toastBytes: Long?
        set(value) = set(4, value)
        get() = get(4) as Long?

    var totalBytes: Long?
        set(value) = set(5, value)
        get() = get(5) as Long?

    var nodeName: String?
        set(value) = set(6, value)
        get() = get(6) as String?

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row7<String?, String?, Long?, Long?, Long?, Long?, String?> = super.fieldsRow() as Row7<String?, String?, Long?, Long?, Long?, Long?, String?>
    override fun valuesRow(): Row7<String?, String?, Long?, Long?, Long?, Long?, String?> = super.valuesRow() as Row7<String?, String?, Long?, Long?, Long?, Long?, String?>
    override fun field1(): Field<String?> = ChunksDetailedSize.CHUNKS_DETAILED_SIZE.CHUNK_SCHEMA
    override fun field2(): Field<String?> = ChunksDetailedSize.CHUNKS_DETAILED_SIZE.CHUNK_NAME
    override fun field3(): Field<Long?> = ChunksDetailedSize.CHUNKS_DETAILED_SIZE.TABLE_BYTES
    override fun field4(): Field<Long?> = ChunksDetailedSize.CHUNKS_DETAILED_SIZE.INDEX_BYTES
    override fun field5(): Field<Long?> = ChunksDetailedSize.CHUNKS_DETAILED_SIZE.TOAST_BYTES
    override fun field6(): Field<Long?> = ChunksDetailedSize.CHUNKS_DETAILED_SIZE.TOTAL_BYTES
    override fun field7(): Field<String?> = ChunksDetailedSize.CHUNKS_DETAILED_SIZE.NODE_NAME
    override fun component1(): String? = chunkSchema
    override fun component2(): String? = chunkName
    override fun component3(): Long? = tableBytes
    override fun component4(): Long? = indexBytes
    override fun component5(): Long? = toastBytes
    override fun component6(): Long? = totalBytes
    override fun component7(): String? = nodeName
    override fun value1(): String? = chunkSchema
    override fun value2(): String? = chunkName
    override fun value3(): Long? = tableBytes
    override fun value4(): Long? = indexBytes
    override fun value5(): Long? = toastBytes
    override fun value6(): Long? = totalBytes
    override fun value7(): String? = nodeName

    override fun value1(value: String?): ChunksDetailedSizeRecord {
        this.chunkSchema = value
        return this
    }

    override fun value2(value: String?): ChunksDetailedSizeRecord {
        this.chunkName = value
        return this
    }

    override fun value3(value: Long?): ChunksDetailedSizeRecord {
        this.tableBytes = value
        return this
    }

    override fun value4(value: Long?): ChunksDetailedSizeRecord {
        this.indexBytes = value
        return this
    }

    override fun value5(value: Long?): ChunksDetailedSizeRecord {
        this.toastBytes = value
        return this
    }

    override fun value6(value: Long?): ChunksDetailedSizeRecord {
        this.totalBytes = value
        return this
    }

    override fun value7(value: String?): ChunksDetailedSizeRecord {
        this.nodeName = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: Long?, value4: Long?, value5: Long?, value6: Long?, value7: String?): ChunksDetailedSizeRecord {
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
     * Create a detached, initialised ChunksDetailedSizeRecord
     */
    constructor(chunkSchema: String? = null, chunkName: String? = null, tableBytes: Long? = null, indexBytes: Long? = null, toastBytes: Long? = null, totalBytes: Long? = null, nodeName: String? = null): this() {
        this.chunkSchema = chunkSchema
        this.chunkName = chunkName
        this.tableBytes = tableBytes
        this.indexBytes = indexBytes
        this.toastBytes = toastBytes
        this.totalBytes = totalBytes
        this.nodeName = nodeName
    }
}
