/*
 * This file is generated by jOOQ.
 */
package me.sumit.uptime.database.generated.tables.pojos


import java.io.Serializable


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class AttachDataNode(
    var hypertableId: Int? = null, 
    var nodeHypertableId: Int? = null, 
    var nodeName: String? = null
): Serializable {


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other === null)
            return false
        if (this::class != other::class)
            return false
        val o: AttachDataNode = other as AttachDataNode
        if (hypertableId === null) {
            if (o.hypertableId !== null)
                return false
        }
        else if (hypertableId != o.hypertableId)
            return false
        if (nodeHypertableId === null) {
            if (o.nodeHypertableId !== null)
                return false
        }
        else if (nodeHypertableId != o.nodeHypertableId)
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
        result = prime * result + (if (this.hypertableId === null) 0 else this.hypertableId.hashCode())
        result = prime * result + (if (this.nodeHypertableId === null) 0 else this.nodeHypertableId.hashCode())
        result = prime * result + (if (this.nodeName === null) 0 else this.nodeName.hashCode())
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("AttachDataNode (")

        sb.append(hypertableId)
        sb.append(", ").append(nodeHypertableId)
        sb.append(", ").append(nodeName)

        sb.append(")")
        return sb.toString()
    }
}
