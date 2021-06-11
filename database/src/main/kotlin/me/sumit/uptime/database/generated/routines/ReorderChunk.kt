/*
 * This file is generated by jOOQ.
 */
package me.sumit.uptime.database.generated.routines


import me.sumit.uptime.database.generated.Public

import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ReorderChunk : AbstractRoutine<java.lang.Void>("reorder_chunk", Public.PUBLIC) {
    companion object {
        @Deprecated(message = "Unknown data type. Please define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val CHUNK: Parameter<Any?> = Internal.createParameter("chunk", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""), false, false)
        @Deprecated(message = "Unknown data type. Please define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val INDEX: Parameter<Any?> = Internal.createParameter("index", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\"").defaultValue(DSL.field("NULL::regclass", org.jooq.impl.SQLDataType.OTHER) as Any?), true, false)

        /**
         * The parameter <code>public.reorder_chunk.verbose</code>.
         */
        val VERBOSE: Parameter<Boolean?> = Internal.createParameter("verbose", SQLDataType.BOOLEAN.defaultValue(DSL.field("false", SQLDataType.BOOLEAN)), true, false)
    }

    init {
        addInParameter(CHUNK)
        addInParameter(INDEX)
        addInParameter(VERBOSE)
    }

    /**
     * Set the <code>chunk</code> parameter IN value to the routine
     */
    fun setChunk(value: Any?) = setValue(CHUNK, value)

    /**
     * Set the <code>index</code> parameter IN value to the routine
     */
    fun setIndex(value: Any?) = setValue(INDEX, value)

    /**
     * Set the <code>verbose</code> parameter IN value to the routine
     */
    fun setVerbose(value: Boolean?) = setValue(VERBOSE, value)
}
