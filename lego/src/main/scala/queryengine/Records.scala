package ch.epfl.data
package legobase
package queryengine

import pardis.annotations.{ deep, needs }
import pardis.shallow.{ CaseClassRecord, OptimalString }

@deep case class AGGRecord[B](
  val key: B,
  val aggs: Array[Double]) extends CaseClassRecord

@deep case class WindowRecord[B, C](
  val key: B,
  val wnd: C) extends CaseClassRecord

@deep case class GroupByClass(val L_RETURNFLAG: Char, val L_LINESTATUS: Char) extends CaseClassRecord

@deep case class Q3GRPRecord(
  val L_ORDERKEY: Int,
  val O_ORDERDATE: Int,
  val O_SHIPPRIORITY: Int) extends CaseClassRecord

@needs[OptimalString] @deep case class Q7GRPRecord(
  val SUPP_NATION: LBString,
  val CUST_NATION: LBString,
  val L_YEAR: Int) extends CaseClassRecord

@needs[OptimalString] @deep case class Q9GRPRecord(
  val NATION: LBString,
  val O_YEAR: Int) extends CaseClassRecord

@needs[OptimalString] @deep case class Q10GRPRecord(
  val C_CUSTKEY: Int,
  val C_NAME: LBString,
  val C_ACCTBAL: Double,
  val C_PHONE: LBString,
  val N_NAME: LBString,
  val C_ADDRESS: LBString,
  val C_COMMENT: LBString) extends CaseClassRecord

@needs[OptimalString] @deep case class Q16GRPRecord1(
  val P_BRAND: LBString,
  val P_TYPE: LBString,
  val P_SIZE: Int,
  val PS_SUPPKEY: Int) extends CaseClassRecord

@needs[OptimalString] @deep case class Q16GRPRecord2(
  val P_BRAND: LBString,
  val P_TYPE: LBString,
  val P_SIZE: Int) extends CaseClassRecord

@needs[OptimalString] @deep case class Q18GRPRecord(
  val C_NAME: LBString,
  val C_CUSTKEY: Int,
  val O_ORDERKEY: Int,
  val O_ORDERDATE: Int,
  val O_TOTALPRICE: Double) extends CaseClassRecord

@deep case class Q20GRPRecord(
  val PS_PARTKEY: Int,
  val PS_SUPPKEY: Int,
  val PS_AVAILQTY: Int) extends CaseClassRecord
