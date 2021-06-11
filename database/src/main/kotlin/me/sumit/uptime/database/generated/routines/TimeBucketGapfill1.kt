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
open class TimeBucketGapfill1 : AbstractRoutine<Short>("time_bucket_gapfill", Public.PUBLIC, SQLDataType.SMALLINT) {
    companion object {

        /**
         * The parameter <code>public.time_bucket_gapfill.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Short?> = Internal.createParameter("RETURN_VALUE", SQLDataType.SMALLINT, false, false)

        /**
         * The parameter <code>public.time_bucket_gapfill.bucket_width</code>.
         */
        val BUCKET_WIDTH: Parameter<Short?> = Internal.createParameter("bucket_width", SQLDataType.SMALLINT, false, false)

        /**
         * The parameter <code>public.time_bucket_gapfill.ts</code>.
         */
        val TS: Parameter<Short?> = Internal.createParameter("ts", SQLDataType.SMALLINT, false, false)

        /**
         * The parameter <code>public.time_bucket_gapfill.start</code>.
         */
        val START: Parameter<Short?> = Internal.createParameter("start", SQLDataType.SMALLINT.defaultValue(DSL.field("NULL::smallint", SQLDataType.SMALLINT)), true, false)

        /**
         * The parameter <code>public.time_bucket_gapfill.finish</code>.
         */
        val FINISH: Parameter<Short?> = Internal.createParameter("finish", SQLDataType.SMALLINT.defaultValue(DSL.field("NULL::smallint", SQLDataType.SMALLINT)), true, false)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(BUCKET_WIDTH)
        addInParameter(TS)
        addInParameter(START)
        addInParameter(FINISH)
        setOverloaded(true)
    }

    /**
     * Set the <code>bucket_width</code> parameter IN value to the routine
     */
    fun setBucketWidth(value: Short?) = setValue(BUCKET_WIDTH, value)

    /**
     * Set the <code>bucket_width</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    fun setBucketWidth(field: Field<Short?>): Unit {
        setField(BUCKET_WIDTH, field)
    }

    /**
     * Set the <code>ts</code> parameter IN value to the routine
     */
    fun setTs(value: Short?) = setValue(TS, value)

    /**
     * Set the <code>ts</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    fun setTs(field: Field<Short?>): Unit {
        setField(TS, field)
    }

    /**
     * Set the <code>start</code> parameter IN value to the routine
     */
    fun setStart(value: Short?) = setValue(START, value)

    /**
     * Set the <code>start</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    fun setStart(field: Field<Short?>): Unit {
        setField(START, field)
    }

    /**
     * Set the <code>finish</code> parameter IN value to the routine
     */
    fun setFinish(value: Short?) = setValue(FINISH, value)

    /**
     * Set the <code>finish</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    fun setFinish(field: Field<Short?>): Unit {
        setField(FINISH, field)
    }
}
