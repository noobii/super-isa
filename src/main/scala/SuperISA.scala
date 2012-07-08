import org.jsoup._
import org.jsoup.nodes.Document

import scala.collection.JavaConversions._ 

object SuperISA {

  def main(args: Array[String]): Unit = {
    
    // ww_x_PERIODE_ACAD
    val academicPeriod = Map(
        "2012-2013" -> "123456101",
        "2011-2012" -> "123455150", 
        "2010-2011" -> "39486325", 
        "2009-2010" -> "978195",
        "2008-2009" -> "978187",
        "2007-2008" -> "978181"
    )
    
    // Hiver / ete ww_x_HIVERETE
    val semester = Map(
        "Automne" -> "2936286",
        "Printemps" -> "2936295"
    )
    
    val units = Map(
        "SC" -> "946228"
    )
    
    val sourceLink = "http://isa.epfl.ch/imoniteur_ISAP/!GEDPUBLICREPORTS.filter?ww_i_reportModel=133685247"
    
	val doc = Jsoup.connect(sourceLink).get()
	
	val elements = doc.select("option")
    
	
	for(elem <- elements) {
	  println(elem.attr("abs:href"))
	  println(elem.text())
	}
  }

}