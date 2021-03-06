package ch.epfl.data
package dblab
package transformers

import scala.language.implicitConversions
import sc.pardis.ir._
import deep.dsls.QueryEngineExp
import reflect.runtime.universe.{ TypeTag, Type }
import sc.pardis.optimization._
import deep._
import sc.pardis.types._
import sc.pardis.types.PardisTypeImplicits._
import sc.pardis.shallow.utils.DefaultValue

/**
 * Fine-grained optimizations for string operations.
 *
 * Example:
 * {{{
 *    string.startsWith("foo")
 * }}}
 * is converted to
 * {{{
 *    string(0) == 'f' && string(1) == 'o' && string(2) == 'o'
 * }}}
 */
class StringOptimization(override val IR: QueryEngineExp) extends RecursiveRuleBasedTransformer[QueryEngineExp](IR) {
  import IR._

  // TODO needs quasi lifting legobase.
  rewrite += rule {
    case OptimalStringStartsWith(str, Def(GenericEngineParseStringObject(Constant(str2: String)))) =>
      str2.toCharArray.zipWithIndex.foldLeft(unit(true))((acc, curr) => acc && (str(unit(curr._2)) __== unit(curr._1)))
  }
}
