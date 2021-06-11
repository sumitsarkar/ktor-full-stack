/*
 * This file is generated by jOOQ.
 */
package me.sumit.uptime.database.generated.routines


import me.sumit.uptime.database.generated.Public

import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class SetReplicationFactor : AbstractRoutine<java.lang.Void>("set_replication_factor", Public.PUBLIC) {
    companion object {
        @Deprecated(message = "Unknown data type. Please define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val HYPERTABLE: Parameter<Any?> = Internal.createParameter("hypertable", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""), false, false)

        /**
         * The parameter <code>public.set_replication_factor.replication_factor</code>.
         */
        val REPLICATION_FACTOR: Parameter<Int?> = Internal.createParameter("replication_factor", SQLDataType.INTEGER, false, false)
    }

    init {
        addInParameter(HYPERTABLE)
        addInParameter(REPLICATION_FACTOR)
    }

    /**
     * Set the <code>hypertable</code> parameter IN value to the routine
     */
    fun setHypertable(value: Any?) = setValue(HYPERTABLE, value)

    /**
     * Set the <code>replication_factor</code> parameter IN value to the routine
     */
    fun setReplicationFactor(value: Int?) = setValue(REPLICATION_FACTOR, value)
}