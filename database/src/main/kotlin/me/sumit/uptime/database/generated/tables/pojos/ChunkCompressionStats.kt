/*
 * This file is generated by jOOQ.
 */
package me.sumit.uptime.database.generated.tables.pojos


import java.io.Serializable


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class ChunkCompressionStats(
    var chunkSchema: String? = null, 
    var chunkName: String? = null, 
    var compressionStatus: String? = null, 
    var beforeCompressionTableBytes: Long? = null, 
    var beforeCompressionIndexBytes: Long? = null, 
    var beforeCompressionToastBytes: Long? = null, 
    var beforeCompressionTotalBytes: Long? = null, 
    var afterCompressionTableBytes: Long? = null, 
    var afterCompressionIndexBytes: Long? = null, 
    var afterCompressionToastBytes: Long? = null, 
    var afterCompressionTotalBytes: Long? = null, 
    var nodeName: String? = null
): Serializable {


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other === null)
            return false
        if (this::class != other::class)
            return false
        val o: ChunkCompressionStats = other as ChunkCompressionStats
        if (chunkSchema === null) {
            if (o.chunkSchema !== null)
                return false
        }
        else if (chunkSchema != o.chunkSchema)
            return false
        if (chunkName === null) {
            if (o.chunkName !== null)
                return false
        }
        else if (chunkName != o.chunkName)
            return false
        if (compressionStatus === null) {
            if (o.compressionStatus !== null)
                return false
        }
        else if (compressionStatus != o.compressionStatus)
            return false
        if (beforeCompressionTableBytes === null) {
            if (o.beforeCompressionTableBytes !== null)
                return false
        }
        else if (beforeCompressionTableBytes != o.beforeCompressionTableBytes)
            return false
        if (beforeCompressionIndexBytes === null) {
            if (o.beforeCompressionIndexBytes !== null)
                return false
        }
        else if (beforeCompressionIndexBytes != o.beforeCompressionIndexBytes)
            return false
        if (beforeCompressionToastBytes === null) {
            if (o.beforeCompressionToastBytes !== null)
                return false
        }
        else if (beforeCompressionToastBytes != o.beforeCompressionToastBytes)
            return false
        if (beforeCompressionTotalBytes === null) {
            if (o.beforeCompressionTotalBytes !== null)
                return false
        }
        else if (beforeCompressionTotalBytes != o.beforeCompressionTotalBytes)
            return false
        if (afterCompressionTableBytes === null) {
            if (o.afterCompressionTableBytes !== null)
                return false
        }
        else if (afterCompressionTableBytes != o.afterCompressionTableBytes)
            return false
        if (afterCompressionIndexBytes === null) {
            if (o.afterCompressionIndexBytes !== null)
                return false
        }
        else if (afterCompressionIndexBytes != o.afterCompressionIndexBytes)
            return false
        if (afterCompressionToastBytes === null) {
            if (o.afterCompressionToastBytes !== null)
                return false
        }
        else if (afterCompressionToastBytes != o.afterCompressionToastBytes)
            return false
        if (afterCompressionTotalBytes === null) {
            if (o.afterCompressionTotalBytes !== null)
                return false
        }
        else if (afterCompressionTotalBytes != o.afterCompressionTotalBytes)
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
        result = prime * result + (if (this.chunkSchema === null) 0 else this.chunkSchema.hashCode())
        result = prime * result + (if (this.chunkName === null) 0 else this.chunkName.hashCode())
        result = prime * result + (if (this.compressionStatus === null) 0 else this.compressionStatus.hashCode())
        result = prime * result + (if (this.beforeCompressionTableBytes === null) 0 else this.beforeCompressionTableBytes.hashCode())
        result = prime * result + (if (this.beforeCompressionIndexBytes === null) 0 else this.beforeCompressionIndexBytes.hashCode())
        result = prime * result + (if (this.beforeCompressionToastBytes === null) 0 else this.beforeCompressionToastBytes.hashCode())
        result = prime * result + (if (this.beforeCompressionTotalBytes === null) 0 else this.beforeCompressionTotalBytes.hashCode())
        result = prime * result + (if (this.afterCompressionTableBytes === null) 0 else this.afterCompressionTableBytes.hashCode())
        result = prime * result + (if (this.afterCompressionIndexBytes === null) 0 else this.afterCompressionIndexBytes.hashCode())
        result = prime * result + (if (this.afterCompressionToastBytes === null) 0 else this.afterCompressionToastBytes.hashCode())
        result = prime * result + (if (this.afterCompressionTotalBytes === null) 0 else this.afterCompressionTotalBytes.hashCode())
        result = prime * result + (if (this.nodeName === null) 0 else this.nodeName.hashCode())
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("ChunkCompressionStats (")

        sb.append(chunkSchema)
        sb.append(", ").append(chunkName)
        sb.append(", ").append(compressionStatus)
        sb.append(", ").append(beforeCompressionTableBytes)
        sb.append(", ").append(beforeCompressionIndexBytes)
        sb.append(", ").append(beforeCompressionToastBytes)
        sb.append(", ").append(beforeCompressionTotalBytes)
        sb.append(", ").append(afterCompressionTableBytes)
        sb.append(", ").append(afterCompressionIndexBytes)
        sb.append(", ").append(afterCompressionToastBytes)
        sb.append(", ").append(afterCompressionTotalBytes)
        sb.append(", ").append(nodeName)

        sb.append(")")
        return sb.toString()
    }
}