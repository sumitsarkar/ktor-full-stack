/*
 * This file is generated by jOOQ.
 */
package me.sumit.uptime.database.generated.tables


import me.sumit.uptime.database.generated.Public
import me.sumit.uptime.database.generated.tables.records.HypertableDetailedSizeRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row5
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class HypertableDetailedSize(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, HypertableDetailedSizeRecord>?,
    aliased: Table<HypertableDetailedSizeRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<HypertableDetailedSizeRecord>(
    alias,
    Public.PUBLIC,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.function()
) {
    companion object {

        /**
         * The reference instance of <code>public.hypertable_detailed_size</code>
         */
        val HYPERTABLE_DETAILED_SIZE = HypertableDetailedSize()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<HypertableDetailedSizeRecord> = HypertableDetailedSizeRecord::class.java

    /**
     * The column <code>public.hypertable_detailed_size.table_bytes</code>.
     */
    val TABLE_BYTES: TableField<HypertableDetailedSizeRecord, Long?> = createField(DSL.name("table_bytes"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.hypertable_detailed_size.index_bytes</code>.
     */
    val INDEX_BYTES: TableField<HypertableDetailedSizeRecord, Long?> = createField(DSL.name("index_bytes"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.hypertable_detailed_size.toast_bytes</code>.
     */
    val TOAST_BYTES: TableField<HypertableDetailedSizeRecord, Long?> = createField(DSL.name("toast_bytes"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.hypertable_detailed_size.total_bytes</code>.
     */
    val TOTAL_BYTES: TableField<HypertableDetailedSizeRecord, Long?> = createField(DSL.name("total_bytes"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.hypertable_detailed_size.node_name</code>.
     */
    val NODE_NAME: TableField<HypertableDetailedSizeRecord, String?> = createField(DSL.name("node_name"), SQLDataType.VARCHAR, this, "")

    private constructor(alias: Name, aliased: Table<HypertableDetailedSizeRecord>?): this(alias, null, null, aliased, arrayOf())
    private constructor(alias: Name, aliased: Table<HypertableDetailedSizeRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.hypertable_detailed_size</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.hypertable_detailed_size</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.hypertable_detailed_size</code> table reference
     */
    constructor(): this(DSL.name("hypertable_detailed_size"), null)
    override fun getSchema(): Schema = Public.PUBLIC
    override fun `as`(alias: String): HypertableDetailedSize = HypertableDetailedSize(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): HypertableDetailedSize = HypertableDetailedSize(alias, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): HypertableDetailedSize = HypertableDetailedSize(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): HypertableDetailedSize = HypertableDetailedSize(name, null, parameters)

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row5<Long?, Long?, Long?, Long?, String?> = super.fieldsRow() as Row5<Long?, Long?, Long?, Long?, String?>

    /**
     * Call this table-valued function
     */
    fun call(
          hypertable: Any?
    ): HypertableDetailedSize = HypertableDetailedSize(DSL.name("hypertable_detailed_size"), null, arrayOf(
          DSL.value(hypertable, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""))
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          hypertable: Field<Any?>
    ): HypertableDetailedSize = HypertableDetailedSize(DSL.name("hypertable_detailed_size"), null, arrayOf(
          hypertable
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}
