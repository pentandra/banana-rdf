package org.w3.banana.jena

import org.w3.banana._

class JenaTurtleTest extends TurtleTestSuite[Jena] {
  val reader = RDFReader[Jena, Turtle]
  val writer = RDFWriter[Jena, Turtle]
}
