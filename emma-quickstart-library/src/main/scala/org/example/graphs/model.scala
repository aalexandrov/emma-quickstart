package org.example
package graphs

import org.emmalanguage.api.emma

/** Graph model objects. */
object model {
  case class Edge[V](src: V, dst: V)
  case class LEdge[V, L](@emma.pk src: V, @emma.pk dst: V, label: L)
  case class LVertex[V, L](@emma.pk id: V, label: L)
  case class Triangle[V](x: V, y: V, z: V)
  case class Message[K, V](@emma.pk tgt: K, payload: V)
}