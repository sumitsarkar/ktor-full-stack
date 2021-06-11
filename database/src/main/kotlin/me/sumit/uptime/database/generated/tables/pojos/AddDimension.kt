/*
 * This file is generated by jOOQ.
 */
package me.sumit.uptime.database.generated.tables.pojos


import java.io.Serializable


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class AddDimension(
    var dimensionId: Int? = null, 
    var schemaName: String? = null, 
    var tableName: String? = null, 
    var columnName: String? = null, 
    var created: Boolean? = null
): Serializable {


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other === null)
            return false
        if (this::class != other::class)
            return false
        val o: AddDimension = other as AddDimension
        if (dimensionId === null) {
            if (o.dimensionId !== null)
                return false
        }
        else if (dimensionId != o.dimensionId)
            return false
        if (schemaName === null) {
            if (o.schemaName !== null)
                return false
        }
        else if (schemaName != o.schemaName)
            return false
        if (tableName === null) {
            if (o.tableName !== null)
                return false
        }
        else if (tableName != o.tableName)
            return false
        if (columnName === null) {
            if (o.columnName !== null)
                return false
        }
        else if (columnName != o.columnName)
            return false
        if (created === null) {
            if (o.created !== null)
                return false
        }
        else if (created != o.created)
            return false
        return true
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + (if (this.dimensionId === null) 0 else this.dimensionId.hashCode())
        result = prime * result + (if (this.schemaName === null) 0 else this.schemaName.hashCode())
        result = prime * result + (if (this.tableName === null) 0 else this.tableName.hashCode())
        result = prime * result + (if (this.columnName === null) 0 else this.columnName.hashCode())
        result = prime * result + (if (this.created === null) 0 else this.created.hashCode())
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("AddDimension (")

        sb.append(dimensionId)
        sb.append(", ").append(schemaName)
        sb.append(", ").append(tableName)
        sb.append(", ").append(columnName)
        sb.append(", ").append(created)

        sb.append(")")
        return sb.toString()
    }
}