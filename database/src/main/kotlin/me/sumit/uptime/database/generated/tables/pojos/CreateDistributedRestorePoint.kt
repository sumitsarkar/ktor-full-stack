/*
 * This file is generated by jOOQ.
 */
package me.sumit.uptime.database.generated.tables.pojos


import java.io.Serializable


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class CreateDistributedRestorePoint(
    var nodeName: String? = null, 
    var nodeType: String? = null, 
    var restorePoint: Any? = null
): Serializable {


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other === null)
            return false
        if (this::class != other::class)
            return false
        val o: CreateDistributedRestorePoint = other as CreateDistributedRestorePoint
        if (nodeName === null) {
            if (o.nodeName !== null)
                return false
        }
        else if (nodeName != o.nodeName)
            return false
        if (nodeType === null) {
            if (o.nodeType !== null)
                return false
        }
        else if (nodeType != o.nodeType)
            return false
        if (restorePoint === null) {
            if (o.restorePoint !== null)
                return false
        }
        else if (restorePoint != o.restorePoint)
            return false
        return true
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + (if (this.nodeName === null) 0 else this.nodeName.hashCode())
        result = prime * result + (if (this.nodeType === null) 0 else this.nodeType.hashCode())
        result = prime * result + (if (this.restorePoint === null) 0 else this.restorePoint.hashCode())
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("CreateDistributedRestorePoint (")

        sb.append(nodeName)
        sb.append(", ").append(nodeType)
        sb.append(", ").append(restorePoint)

        sb.append(")")
        return sb.toString()
    }
}
