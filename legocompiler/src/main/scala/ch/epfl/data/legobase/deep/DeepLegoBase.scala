package ch.epfl.data
package legobase
package deep

import pardis.ir._
import pardis.types.PardisTypeImplicits._
import pardis.deep._
import pardis.deep.scalalib._
import pardis.deep.scalalib.collection._
import pardis.deep.scalalib.io._
import legobase.deep.queryengine._
import legobase.deep.storagemanager._

trait DeepDSL extends queryengine.push.OperatorsComponent
  with AGGRecordComponent
  with WindowRecordComponent
  with CharComponent
  with DoubleComponent
  with IntComponent
  with LongComponent
  with BooleanComponent
  with DoublePartialEvaluation
  with IntPartialEvaluation
  with LongPartialEvaluation
  with BooleanPartialEvaluation
  with ArrayComponent
  with SeqComponent
  with PrintStreamComponent
  with GroupByClassComponent
  with Q3GRPRecordComponent
  with Q7GRPRecordComponent
  with Q9GRPRecordComponent
  with Q10GRPRecordComponent
  with Q16GRPRecord1Component
  with Q16GRPRecord2Component
  with Q18GRPRecordComponent
  with Q20GRPRecordComponent
  with GenericEngineComponent
  with LINEITEMRecordComponent
  with SUPPLIERRecordComponent
  with PARTSUPPRecordComponent
  with REGIONRecordComponent
  with NATIONRecordComponent
  with PARTRecordComponent
  with CUSTOMERRecordComponent
  with ORDERSRecordComponent
  with OptimalStringComponent
  with LoaderComponent
  with K2DBScannerComponent
  with IntegerComponent
  with HashMapComponent
  with SetComponent
  with TreeSetComponent
  with ArrayBufferComponent
  with ManualLiftedLegoBase
  with QueryComponent
  with Tuple2Component
  with MultiMapComponent
  with OptionComponent

