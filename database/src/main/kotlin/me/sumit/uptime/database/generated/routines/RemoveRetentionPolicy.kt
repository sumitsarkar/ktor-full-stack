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
open class RemoveRetentionPolicy : AbstractRoutine<java.lang.Void>("remove_retention_policy", Public.PUBLIC) {
    companion object {
        @Deprecated(message = "Unknown data type. Please define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val RELATION: Parameter<Any?> = Internal.createParameter("relation", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""), false, false)

        /**
         * The parameter <code>public.remove_retention_policy.if_exists</code>.
         */
        val IF_EXISTS: Parameter<Boolean?> = Internal.createParameter("if_exists", SQLDataType.BOOLEAN.defaultValue(DSL.field("false", SQLDataType.BOOLEAN)), true, false)
    }

    init {
        addInParameter(RELATION)
        addInParameter(IF_EXISTS)
    }

    /**
     * Set the <code>relation</code> parameter IN value to the routine
     */
    fun setRelation(value: Any?) = setValue(RELATION, value)

    /**
     * Set the <code>if_exists</code> parameter IN value to the routine
     */
    fun setIfExists(value: Boolean?) = setValue(IF_EXISTS, value)
}
