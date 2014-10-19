package org.w3.banana.plantain

import org.w3.banana._
import org.w3.banana.io.TurtleTestSuite
import org.w3.banana.isomorphism._
import org.w3.banana.isomorphism.{ GraphIsomorphismTest, IsomorphismTests, SimpleClassifyTest }
import org.w3.banana.plantain.PlantainOps._

class PlantainTurtleTest extends TurtleTestSuite[Plantain]

class PlantainGraphTest extends GraphTest[Plantain]

class PlantainGraphUnionTest extends GraphUnionTest[Plantain]

class PlantainPointedGraphTest extends PointedGraphTester[Plantain]

import org.w3.banana.diesel._

class PlantainDieselGraphConstructTest extends DieselGraphConstructTest[Plantain]

class PlantainDieselGraphExplorationTest extends DieselGraphExplorationTest[Plantain]

import org.w3.banana.binder._

class PlantainCommonBindersTest extends CommonBindersTest[Plantain]

class PlantainRecordBinderTest extends RecordBinderTest[Plantain]

import org.w3.banana.syntax._

class PlantainUriSyntaxTest extends UriSyntaxTest[Plantain]

class PlantainSimpleClassifyTest() extends SimpleClassifyTest[Plantain](
  new SimpleMappingGenerator[Plantain](_))

class PlantainIsoGraphTest extends GraphIsomorphismTest[Plantain]((vtg: () => VerticeCBuilder[Plantain]) =>
  new GraphIsomorphism[Plantain](new SimpleMappingGenerator[Plantain](vtg)))

class PlantainIsoTest() extends IsomorphismTests[Plantain]

// New shared tests

class PlantainGraphUnionJvmTest extends GraphUnionJvmTest[Plantain]