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
open class SetAdaptiveChunking : AbstractRoutine<java.lang.Void>("set_adaptive_chunking", Public.PUBLIC) {
    companion object {
        @Deprecated(message = "Unknown data type. Please define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val HYPERTABLE: Parameter<Any?> = Internal.createParameter("hypertable", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""), false, false)

        /**
         * The parameter <code>public.set_adaptive_chunking.chunk_target_size</code>.
         */
        val CHUNK_TARGET_SIZE2: Parameter<String?> = Internal.createParameter("chunk_target_size", SQLDataType.CLOB, false, false)

        /**
         * The parameter <code>public.set_adaptive_chunking.chunk_sizing_func</code>.
         */
        val CHUNK_SIZING_FUNC: Parameter<String?> = Internal.createParameter("chunk_sizing_func", SQLDataType.VARCHAR.defaultValue(DSL.field("'_timescaledb_internal.calculate_chunk_interval'::regproc", SQLDataType.VARCHAR)), true, false)

        /**
         * The parameter <code>public.set_adaptive_chunking.chunk_target_size</code>.
         */
        val CHUNK_TARGET_SIZE4: Parameter<Long?> = Internal.createParameter("chunk_target_size", SQLDataType.BIGINT, false, false)
    }

    init {
        addInParameter(HYPERTABLE)
        addInOutParameter(CHUNK_TARGET_SIZE2)
        addInOutParameter(CHUNK_SIZING_FUNC)
        addInOutParameter(CHUNK_TARGET_SIZE4)
    }

    /**
     * Set the <code>hypertable</code> parameter IN value to the routine
     */
    fun setHypertable(value: Any?) = setValue(HYPERTABLE, value)

    /**
     * Set the <code>chunk_target_size</code> parameter IN value to the routine
     */
    fun setChunkTargetSize2(value: String?) = setValue(CHUNK_TARGET_SIZE2, value)

    /**
     * Set the <code>chunk_sizing_func</code> parameter IN value to the routine
     */
    fun setChunkSizingFunc(value: String?) = setValue(CHUNK_SIZING_FUNC, value)

    /**
     * Get the <code>chunk_target_size</code> parameter OUT value from the routine
     */
    fun getChunkTargetSize2(): String? = get(CHUNK_TARGET_SIZE2)

    /**
     * Get the <code>chunk_sizing_func</code> parameter OUT value from the routine
     */
    fun getChunkSizingFunc(): String? = get(CHUNK_SIZING_FUNC)

    /**
     * Get the <code>chunk_target_size</code> parameter OUT value from the routine
     */
    fun getChunkTargetSize4(): Long? = get(CHUNK_TARGET_SIZE4)
}
