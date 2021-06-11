/*
 * This file is generated by jOOQ.
 */
package me.sumit.uptime.database.generated.tables.pojos


import java.io.Serializable


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class HypertableDetailedSize(
    var tableBytes: Long? = null, 
    var indexBytes: Long? = null, 
    var toastBytes: Long? = null, 
    var totalBytes: Long? = null, 
    var nodeName: String? = null
): Serializable {


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other === null)
            return false
        if (this::class != other::class)
            return false
        val o: HypertableDetailedSize = other as HypertableDetailedSize
        if (tableBytes === null) {
            if (o.tableBytes !== null)
                return false
        }
        else if (tableBytes != o.tableBytes)
            return false
        if (indexBytes === null) {
            if (o.indexBytes !== null)
                return false
        }
        else if (indexBytes != o.indexBytes)
            return false
        if (toastBytes === null) {
            if (o.toastBytes !== null)
                return false
        }
        else if (toastBytes != o.toastBytes)
            return false
        if (totalBytes === null) {
            if (o.totalBytes !== null)
                return false
        }
        else if (totalBytes != o.totalBytes)
            return false
        if (nodeName === null) {
            if (o.nodeName !== null)
                return false
        }
        else if (nodeName != o.nodeName)
            return false
        return true
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + (if (this.tableBytes === null) 0 else this.tableBytes.hashCode())
        result = prime * result + (if (this.indexBytes === null) 0 else this.indexBytes.hashCode())
        result = prime * result + (if (this.toastBytes === null) 0 else this.toastBytes.hashCode())
        result = prime * result + (if (this.totalBytes === null) 0 else this.totalBytes.hashCode())
        result = prime * result + (if (this.nodeName === null) 0 else this.nodeName.hashCode())
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("HypertableDetailedSize (")

        sb.append(tableBytes)
        sb.append(", ").append(indexBytes)
        sb.append(", ").append(toastBytes)
        sb.append(", ").append(totalBytes)
        sb.append(", ").append(nodeName)

        sb.append(")")
        return sb.toString()
    }
}
