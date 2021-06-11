/*
 * This file is generated by jOOQ.
 */
package me.sumit.uptime.database.generated.routines


import java.time.OffsetDateTime

import me.sumit.uptime.database.generated.Public

import org.jooq.Field
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.types.YearToSecond


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class AddJob : AbstractRoutine<Int>("add_job", Public.PUBLIC, SQLDataType.INTEGER) {
    companion object {

        /**
         * The parameter <code>public.add_job.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Int?> = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false)

        /**
         * The parameter <code>public.add_job.proc</code>.
         */
        val PROC: Parameter<String?> = Internal.createParameter("proc", SQLDataType.VARCHAR, false, false)

        /**
         * The parameter <code>public.add_job.schedule_interval</code>.
         */
        val SCHEDULE_INTERVAL: Parameter<YearToSecond?> = Internal.createParameter("schedule_interval", SQLDataType.INTERVAL, false, false)

        /**
         * The parameter <code>public.add_job.config</code>.
         */
        val CONFIG: Parameter<String?> = Internal.createParameter("config", SQLDataType.VARCHAR.defaultValue(DSL.field("NULL::jsonb", SQLDataType.VARCHAR)), true, false)

        /**
         * The parameter <code>public.add_job.initial_start</code>.
         */
        val INITIAL_START: Parameter<OffsetDateTime?> = Internal.createParameter("initial_start", SQLDataType.TIMESTAMPWITHTIMEZONE.defaultValue(DSL.field("NULL::timestamp with time zone", SQLDataType.TIMESTAMPWITHTIMEZONE)), true, false)

        /**
         * The parameter <code>public.add_job.scheduled</code>.
         */
        val SCHEDULED: Parameter<Boolean?> = Internal.createParameter("scheduled", SQLDataType.BOOLEAN.defaultValue(DSL.field("true", SQLDataType.BOOLEAN)), true, false)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(PROC)
        addInParameter(SCHEDULE_INTERVAL)
        addInParameter(CONFIG)
        addInParameter(INITIAL_START)
        addInParameter(SCHEDULED)
    }

    /**
     * Set the <code>proc</code> parameter IN value to the routine
     */
    fun setProc(value: String?) = setValue(PROC, value)

    /**
     * Set the <code>proc</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    fun setProc(field: Field<String?>): Unit {
        setField(PROC, field)
    }

    /**
     * Set the <code>schedule_interval</code> parameter IN value to the routine
     */
    fun setScheduleInterval(value: YearToSecond?) = setValue(SCHEDULE_INTERVAL, value)

    /**
     * Set the <code>schedule_interval</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    fun setScheduleInterval(field: Field<YearToSecond?>): Unit {
        setField(SCHEDULE_INTERVAL, field)
    }

    /**
     * Set the <code>config</code> parameter IN value to the routine
     */
    fun setConfig(value: String?) = setValue(CONFIG, value)

    /**
     * Set the <code>config</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    fun setConfig(field: Field<String?>): Unit {
        setField(CONFIG, field)
    }

    /**
     * Set the <code>initial_start</code> parameter IN value to the routine
     */
    fun setInitialStart(value: OffsetDateTime?) = setValue(INITIAL_START, value)

    /**
     * Set the <code>initial_start</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    fun setInitialStart(field: Field<OffsetDateTime?>): Unit {
        setField(INITIAL_START, field)
    }

    /**
     * Set the <code>scheduled</code> parameter IN value to the routine
     */
    fun setScheduled(value: Boolean?) = setValue(SCHEDULED, value)

    /**
     * Set the <code>scheduled</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    fun setScheduled(field: Field<Boolean?>): Unit {
        setField(SCHEDULED, field)
    }
}