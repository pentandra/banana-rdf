package org.w3.rdf.simple

import org.w3.rdf._

object SimpleGraphUnion extends GraphUnion[SimpleRDF] {
  
  def union(left: SimpleRDF#Graph, right: SimpleRDF#Graph): SimpleRDF#Graph = left ++ right
  
}