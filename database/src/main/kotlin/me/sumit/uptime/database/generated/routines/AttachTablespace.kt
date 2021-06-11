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
open class AttachTablespace : AbstractRoutine<java.lang.Void>("attach_tablespace", Public.PUBLIC) {
    companion object {

        /**
         * The parameter <code>public.attach_tablespace.tablespace</code>.
         */
        val TABLESPACE: Parameter<String?> = Internal.createParameter("tablespace", SQLDataType.VARCHAR, false, false)
        @Deprecated(message = "Unknown data type. Please define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val HYPERTABLE: Parameter<Any?> = Internal.createParameter("hypertable", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""), false, false)

        /**
         * The parameter <code>public.attach_tablespace.if_not_attached</code>.
         */
        val IF_NOT_ATTACHED: Parameter<Boolean?> = Internal.createParameter("if_not_attached", SQLDataType.BOOLEAN.defaultValue(DSL.field("false", SQLDataType.BOOLEAN)), true, false)
    }

    init {
        addInParameter(TABLESPACE)
        addInParameter(HYPERTABLE)
        addInParameter(IF_NOT_ATTACHED)
    }

    /**
     * Set the <code>tablespace</code> parameter IN value to the routine
     */
    fun setTablespace(value: String?) = setValue(TABLESPACE, value)

    /**
     * Set the <code>hypertable</code> parameter IN value to the routine
     */
    fun setHypertable(value: Any?) = setValue(HYPERTABLE, value)

    /**
     * Set the <code>if_not_attached</code> parameter IN value to the routine
     */
    fun setIfNotAttached(value: Boolean?) = setValue(IF_NOT_ATTACHED, value)
}