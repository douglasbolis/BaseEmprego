
package views.html.Anuncio

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
object add extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[models.forms.MestreForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form : play.data.Form[models.forms.MestreForm]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.50*/("""

"""),format.raw/*3.1*/("""<ol class="breadcrumb">
    <li><a href="/anuncio">Anuncio</a></li>
    <li class="active"><a href="#">Adicionar</a></li>
</ol>




"""),_display_(/*11.2*/main("Adicionar Anuncio")/*11.27*/ {_display_(Seq[Any](format.raw/*11.29*/("""

"""),format.raw/*13.1*/("""<div class="col-sm-12">
"""),_display_(/*14.2*/helper/*14.8*/.form(action = routes.AnuncioController.addHandler() )/*14.62*/ {_display_(Seq[Any](format.raw/*14.64*/("""
    """),format.raw/*15.5*/("""<div class="col-sm-4 col-sm-offset-4">
        """),_display_(/*16.10*/helper/*16.16*/.inputText(
            form("nome"),
            '_label->"Nome", 'placeholder->"Digite o nome"
        )),format.raw/*19.10*/("""
    """),format.raw/*20.5*/("""</div>
    <div class="col-sm-4 col-sm-offset-4">
        <input type="submit" class="btn btn-default" value="Salvar">
    </div>
    """)))}),format.raw/*24.6*/("""
"""),format.raw/*25.1*/("""</div>








""")))}))}
  }

  def render(form:play.data.Form[models.forms.MestreForm]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((play.data.Form[models.forms.MestreForm]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Nov 11 13:37:36 BRST 2014
                  SOURCE: /Volumes/xDevel/xdevelsistemas/play/grupo/BaseEmprego/app/views/Anuncio/add.scala.html
                  HASH: 5e1afcabb74b405a513ce6422622eacba4e036a3
                  MATRIX: 762->1|898->49|926->51|1085->184|1119->209|1159->211|1188->213|1239->238|1253->244|1316->298|1356->300|1388->305|1463->353|1478->359|1605->465|1637->470|1802->605|1830->606
                  LINES: 26->1|29->1|31->3|39->11|39->11|39->11|41->13|42->14|42->14|42->14|42->14|43->15|44->16|44->16|47->19|48->20|52->24|53->25
                  -- GENERATED --
              */
          