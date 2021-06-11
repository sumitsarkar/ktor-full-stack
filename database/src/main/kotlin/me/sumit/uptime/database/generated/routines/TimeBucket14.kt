/*
 * This file is generated by jOOQ.
 */
package me.sumit.uptime.database.generated.routines


import java.time.OffsetDateTime

import me.sumit.uptime.database.generated.Public

import org.jooq.Field
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.types.YearToSecond


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class TimeBucket14 : AbstractRoutine<OffsetDateTime>("time_bucket", Public.PUBLIC, SQLDataType.TIMESTAMPWITHTIMEZONE) {
    companion object {

        /**
         * The parameter <code>public.time_bucket.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<OffsetDateTime?> = Internal.createParameter("RETURN_VALUE", SQLDataType.TIMESTAMPWITHTIMEZONE, false, false)

        /**
         * The parameter <code>public.time_bucket.bucket_width</code>.
         */
        val BUCKET_WIDTH: Parameter<YearToSecond?> = Internal.createParameter("bucket_width", SQLDataType.INTERVAL, false, false)

        /**
         * The parameter <code>public.time_bucket.ts</code>.
         */
        val TS: Parameter<OffsetDateTime?> = Internal.createParameter("ts", SQLDataType.TIMESTAMPWITHTIMEZONE, false, false)

        /**
         * The parameter <code>public.time_bucket.offset</code>.
         */
        val OFFSET: Parameter<YearToSecond?> = Internal.createParameter("offset", SQLDataType.INTERVAL, false, false)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(BUCKET_WIDTH)
        addInParameter(TS)
        addInParameter(OFFSET)
        setOverloaded(true)
    }

    /**
     * Set the <code>bucket_width</code> parameter IN value to the routine
     */
    fun setBucketWidth(value: YearToSecond?) = setValue(BUCKET_WIDTH, value)

    /**
     * Set the <code>bucket_width</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    fun setBucketWidth(field: Field<YearToSecond?>): Unit {
        setField(BUCKET_WIDTH, field)
    }

    /**
     * Set the <code>ts</code> parameter IN value to the routine
     */
    fun setTs(value: OffsetDateTime?) = setValue(TS, value)

    /**
     * Set the <code>ts</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    fun setTs(field: Field<OffsetDateTime?>): Unit {
        setField(TS, field)
    }

    /**
     * Set the <code>offset</code> parameter IN value to the routine
     */
    fun setOffset(value: YearToSecond?) = setValue(OFFSET, value)

    /**
     * Set the <code>offset</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    fun setOffset(field: Field<YearToSecond?>): Unit {
        setField(OFFSET, field)
    }
}