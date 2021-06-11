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
open class DetachDataNode : AbstractRoutine<Int>("detach_data_node", Public.PUBLIC, SQLDataType.INTEGER) {
    companion object {

        /**
         * The parameter <code>public.detach_data_node.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Int?> = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false)

        /**
         * The parameter <code>public.detach_data_node.node_name</code>.
         */
        val NODE_NAME: Parameter<String?> = Internal.createParameter("node_name", SQLDataType.VARCHAR, false, false)
        @Deprecated(message = "Unknown data type. Please define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val HYPERTABLE: Parameter<Any?> = Internal.createParameter("hypertable", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\"").defaultValue(DSL.field("NULL::regclass", org.jooq.impl.SQLDataType.OTHER) as Any?), true, false)

        /**
         * The parameter <code>public.detach_data_node.if_attached</code>.
         */
        val IF_ATTACHED: Parameter<Boolean?> = Internal.createParameter("if_attached", SQLDataType.BOOLEAN.defaultValue(DSL.field("false", SQLDataType.BOOLEAN)), true, false)

        /**
         * The parameter <code>public.detach_data_node.force</code>.
         */
        val FORCE: Parameter<Boolean?> = Internal.createParameter("force", SQLDataType.BOOLEAN.defaultValue(DSL.field("false", SQLDataType.BOOLEAN)), true, false)

        /**
         * The parameter <code>public.detach_data_node.repartition</code>.
         */
        val REPARTITION: Parameter<Boolean?> = Internal.createParameter("repartition", SQLDataType.BOOLEAN.defaultValue(DSL.field("true", SQLDataType.BOOLEAN)), true, false)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(NODE_NAME)
        addInParameter(HYPERTABLE)
        addInParameter(IF_ATTACHED)
        addInParameter(FORCE)
        addInParameter(REPARTITION)
    }

    /**
     * Set the <code>node_name</code> parameter IN value to the routine
     */
    fun setNodeName(value: String?) = setValue(NODE_NAME, value)

    /**
     * Set the <code>node_name</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    fun setNodeName(field: Field<String?>): Unit {
        setField(NODE_NAME, field)
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

    /**
     * Set the <code>force</code> parameter IN value to the routine
     */
    fun setForce(value: Boolean?) = setValue(FORCE, value)

    /**
     * Set the <code>force</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    fun setForce(field: Field<Boolean?>): Unit {
        setField(FORCE, field)
    }

    /**
     * Set the <code>repartition</code> parameter IN value to the routine
     */
    fun setRepartition(value: Boolean?) = setValue(REPARTITION, value)

    /**
     * Set the <code>repartition</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    fun setRepartition(field: Field<Boolean?>): Unit {
        setField(REPARTITION, field)
    }
}