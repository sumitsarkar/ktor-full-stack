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
open class SetIntegerNowFunc : AbstractRoutine<java.lang.Void>("set_integer_now_func", Public.PUBLIC) {
    companion object {
        @Deprecated(message = "Unknown data type. Please define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val HYPERTABLE: Parameter<Any?> = Internal.createParameter("hypertable", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""), false, false)

        /**
         * The parameter <code>public.set_integer_now_func.integer_now_func</code>.
         */
        val INTEGER_NOW_FUNC: Parameter<String?> = Internal.createParameter("integer_now_func", SQLDataType.VARCHAR, false, false)

        /**
         * The parameter <code>public.set_integer_now_func.replace_if_exists</code>.
         */
        val REPLACE_IF_EXISTS: Parameter<Boolean?> = Internal.createParameter("replace_if_exists", SQLDataType.BOOLEAN.defaultValue(DSL.field("false", SQLDataType.BOOLEAN)), true, false)
    }

    init {
        addInParameter(HYPERTABLE)
        addInParameter(INTEGER_NOW_FUNC)
        addInParameter(REPLACE_IF_EXISTS)
    }

    /**
     * Set the <code>hypertable</code> parameter IN value to the routine
     */
    fun setHypertable(value: Any?) = setValue(HYPERTABLE, value)

    /**
     * Set the <code>integer_now_func</code> parameter IN value to the routine
     */
    fun setIntegerNowFunc(value: String?) = setValue(INTEGER_NOW_FUNC, value)

    /**
     * Set the <code>replace_if_exists</code> parameter IN value to the routine
     */
    fun setReplaceIfExists(value: Boolean?) = setValue(REPLACE_IF_EXISTS, value)
}