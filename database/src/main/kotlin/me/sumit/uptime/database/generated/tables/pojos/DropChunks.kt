/*
 * This file is generated by jOOQ.
 */
package me.sumit.uptime.database.generated.tables.pojos


import java.io.Serializable


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class DropChunks(
    var dropChunks: String? = null
): Serializable {


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other === null)
            return false
        if (this::class != other::class)
            return false
        val o: DropChunks = other as DropChunks
        if (dropChunks === null) {
            if (o.dropChunks !== null)
                return false
        }
        else if (dropChunks != o.dropChunks)
            return false
        return true
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + (if (this.dropChunks === null) 0 else this.dropChunks.hashCode())
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("DropChunks (")

        sb.append(dropChunks)

        sb.append(")")
        return sb.toString()
    }
}
