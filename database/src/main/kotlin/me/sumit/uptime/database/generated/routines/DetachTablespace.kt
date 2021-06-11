/*
 * This file is generated by jOOQ.
 */
package me.sumit.uptime.database.generated.routines


import me.sumit.uptime.database.generated.Public

import org.jooq.Field
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class DetachTablespace : AbstractRoutine<Int>("detach_tablespace", Public.PUBLIC, SQLDataType.INTEGER) {
    companion object {

        /**
         * The parameter <code>public.detach_tablespace.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Int?> = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false)

        /**
         * The parameter <code>public.detach_tablespace.tablespace</code>.
         */
        val TABLESPACE: Parameter<String?> = Internal.createParameter("tablespace", SQLDataType.VARCHAR, false, false)
        @Deprecated(message = "Unknown data type. Please define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val HYPERTABLE: Parameter<Any?> = Internal.createParameter("hypertable", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\"").defaultValue(DSL.field("NULL::regclass", org.jooq.impl.SQLDataType.OTHER) as Any?), true, false)

        /**
         * The parameter <code>public.detach_tablespace.if_attached</code>.
         */
        val IF_ATTACHED: Parameter<Boolean?> = Internal.createParameter("if_attached", SQLDataType.BOOLEAN.defaultValue(DSL.field("false", SQLDataType.BOOLEAN)), true, false)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(TABLESPACE)
        addInParameter(HYPERTABLE)
        addInParameter(IF_ATTACHED)
    }

    /**
     * Set the <code>tablespace</code> parameter IN value to the routine
     */
    fun setTablespace(value: String?) = setValue(TABLESPACE, value)

    /**
     * Set the <code>tablespace</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    fun setTablespace(field: Field<String?>): Unit {
        setField(TABLESPACE, field)
    }

    /**
     * Set the <code>hypertable</code> parameter IN value to the routine
     */
    fun setHypertable(value: Any?) = setValue(HYPERTABLE, value)

    /**
     * Set the <code>hypertable</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    fun setHypertable(field: Field<Any?>): Unit {
        setField(HYPERTABLE, field)
    }

    /**
     * Set the <code>if_attached</code> parameter IN value to the routine
     */
    fun setIfAttached(value: Boolean?) = setValue(IF_ATTACHED, value)

    /**
     * Set the <code>if_attached</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    fun setIfAttached(field: Field<Boolean?>): Unit {
        setField(IF_ATTACHED, field)
    }
}
