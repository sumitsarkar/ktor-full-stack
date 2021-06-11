/*
 * This file is generated by jOOQ.
 */
package me.sumit.uptime.database.generated.tables


import me.sumit.uptime.database.generated.Public
import me.sumit.uptime.database.generated.tables.records.DropChunksRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row1
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
open class DropChunks(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, DropChunksRecord>?,
    aliased: Table<DropChunksRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<DropChunksRecord>(
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
         * The reference instance of <code>public.drop_chunks</code>
         */
        val DROP_CHUNKS = DropChunks()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<DropChunksRecord> = DropChunksRecord::class.java

    /**
     * The column <code>public.drop_chunks.drop_chunks</code>.
     */
    val DROP_CHUNKS_: TableField<DropChunksRecord, String?> = createField(DSL.name("drop_chunks"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<DropChunksRecord>?): this(alias, null, null, aliased, arrayOf())
    private constructor(alias: Name, aliased: Table<DropChunksRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.drop_chunks</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.drop_chunks</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.drop_chunks</code> table reference
     */
    constructor(): this(DSL.name("drop_chunks"), null)
    override fun getSchema(): Schema = Public.PUBLIC
    override fun `as`(alias: String): DropChunks = DropChunks(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): DropChunks = DropChunks(alias, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): DropChunks = DropChunks(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): DropChunks = DropChunks(name, null, parameters)

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row1<String?> = super.fieldsRow() as Row1<String?>

    /**
     * Call this table-valued function
     */
    fun call(
          relation: Any?
        , olderThan: Any?
        , newerThan: Any?
        , verbose: Boolean?
    ): DropChunks = DropChunks(DSL.name("drop_chunks"), null, arrayOf(
          DSL.value(relation, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""))
        , DSL.value(olderThan, SQLDataType.OTHER.defaultValue(DSL.field("NULL::unknown", SQLDataType.OTHER) as Any?))
        , DSL.value(newerThan, SQLDataType.OTHER.defaultValue(DSL.field("NULL::unknown", SQLDataType.OTHER) as Any?))
        , DSL.value(verbose, SQLDataType.BOOLEAN.defaultValue(DSL.field("false", SQLDataType.BOOLEAN)))
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          relation: Field<Any?>
        , olderThan: Field<Any?>
        , newerThan: Field<Any?>
        , verbose: Field<Boolean?>
    ): DropChunks = DropChunks(DSL.name("drop_chunks"), null, arrayOf(
          relation
        , olderThan
        , newerThan
        , verbose
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}