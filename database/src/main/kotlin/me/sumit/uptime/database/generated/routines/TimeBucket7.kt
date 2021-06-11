/*
 * This file is generated by jOOQ.
 */
package me.sumit.uptime.database.generated.routines


import me.sumit.uptime.database.generated.Public

import org.jooq.Field
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class TimeBucket7 : AbstractRoutine<Short>("time_bucket", Public.PUBLIC, SQLDataType.SMALLINT) {
    companion object {

        /**
         * The parameter <code>public.time_bucket.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Short?> = Internal.createParameter("RETURN_VALUE", SQLDataType.SMALLINT, false, false)

        /**
         * The parameter <code>public.time_bucket.bucket_width</code>.
         */
        val BUCKET_WIDTH: Parameter<Short?> = Internal.createParameter("bucket_width", SQLDataType.SMALLINT, false, false)

        /**
         * The parameter <code>public.time_bucket.ts</code>.
         */
        val TS: Parameter<Short?> = Internal.createParameter("ts", SQLDataType.SMALLINT, false, false)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(BUCKET_WIDTH)
        addInParameter(TS)
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
}
