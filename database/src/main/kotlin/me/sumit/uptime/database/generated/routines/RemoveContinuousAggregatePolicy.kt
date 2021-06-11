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
open class RemoveContinuousAggregatePolicy : AbstractRoutine<java.lang.Void>("remove_continuous_aggregate_policy", Public.PUBLIC) {
    companion object {
        @Deprecated(message = "Unknown data type. Please define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val CONTINUOUS_AGGREGATE: Parameter<Any?> = Internal.createParameter("continuous_aggregate", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""), false, false)

        /**
         * The parameter <code>public.remove_continuous_aggregate_policy.if_not_exists</code>.
         */
        val IF_NOT_EXISTS: Parameter<Boolean?> = Internal.createParameter("if_not_exists", SQLDataType.BOOLEAN.defaultValue(DSL.field("false", SQLDataType.BOOLEAN)), true, false)
    }

    init {
        addInParameter(CONTINUOUS_AGGREGATE)
        addInParameter(IF_NOT_EXISTS)
    }

    /**
     * Set the <code>continuous_aggregate</code> parameter IN value to the routine
     */
    fun setContinuousAggregate(value: Any?) = setValue(CONTINUOUS_AGGREGATE, value)

    /**
     * Set the <code>if_not_exists</code> parameter IN value to the routine
     */
    fun setIfNotExists(value: Boolean?) = setValue(IF_NOT_EXISTS, value)
}