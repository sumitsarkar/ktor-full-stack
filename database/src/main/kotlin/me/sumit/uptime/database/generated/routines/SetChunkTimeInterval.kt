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
open class SetChunkTimeInterval : AbstractRoutine<java.lang.Void>("set_chunk_time_interval", Public.PUBLIC) {
    companion object {
        @Deprecated(message = "Unknown data type. Please define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val HYPERTABLE: Parameter<Any?> = Internal.createParameter("hypertable", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""), false, false)
        @Deprecated(message = "Unknown data type. Please define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val CHUNK_TIME_INTERVAL: Parameter<Any?> = Internal.createParameter("chunk_time_interval", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyelement\""), false, false)

        /**
         * The parameter <code>public.set_chunk_time_interval.dimension_name</code>.
         */
        val DIMENSION_NAME: Parameter<String?> = Internal.createParameter("dimension_name", SQLDataType.VARCHAR.defaultValue(DSL.field("NULL::name", SQLDataType.VARCHAR)), true, false)
    }

    init {
        addInParameter(HYPERTABLE)
        addInParameter(CHUNK_TIME_INTERVAL)
        addInParameter(DIMENSION_NAME)
    }

    /**
     * Set the <code>hypertable</code> parameter IN value to the routine
     */
    fun setHypertable(value: Any?) = setValue(HYPERTABLE, value)

    /**
     * Set the <code>chunk_time_interval</code> parameter IN value to the routine
     */
    fun setChunkTimeInterval(value: Any?) = setValue(CHUNK_TIME_INTERVAL, value)

    /**
     * Set the <code>dimension_name</code> parameter IN value to the routine
     */
    fun setDimensionName(value: String?) = setValue(DIMENSION_NAME, value)
}