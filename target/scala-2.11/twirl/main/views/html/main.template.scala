
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.at("css/bootstrap-theme.min.css")),format.raw/*8.101*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.at("css/bootstrap.min.css")),format.raw/*9.95*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.at("css/callout.css")),format.raw/*10.89*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png")),format.raw/*11.97*/("""">
    </head>
    <body class="container col-sm-12">
        """),_display_(/*14.10*/content),format.raw/*14.17*/("""
    """),format.raw/*15.5*/("""</body>
    <script type="application/javascript" src=""""),_display_(/*16.49*/routes/*16.55*/.Assets.at("js/jquery-1.11.1.min.js")),format.raw/*16.92*/(""""></script>
    <script type="application/javascript" src=""""),_display_(/*17.49*/routes/*17.55*/.Assets.at("js/bootstrap.min.js")),format.raw/*17.88*/(""""></script>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Nov 11 13:37:36 BRST 2014
                  SOURCE: /Volumes/xDevel/xdevelsistemas/play/grupo/BaseEmprego/app/views/main.scala.html
                  HASH: c87bc3af0abfadaf96798ada51b1097fd1f2a6fa
                  MATRIX: 727->1|845->31|873->33|950->84|975->89|1063->151|1077->157|1139->198|1221->254|1235->260|1290->295|1373->351|1388->357|1438->386|1526->447|1541->453|1594->485|1684->548|1712->555|1744->560|1827->616|1842->622|1900->659|1987->719|2002->725|2056->758
                  LINES: 26->1|29->1|31->3|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|42->14|42->14|43->15|44->16|44->16|44->16|45->17|45->17|45->17
                  -- GENERATED --
              */
          