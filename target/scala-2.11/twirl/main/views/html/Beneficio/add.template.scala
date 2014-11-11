
package views.html.Beneficio

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
object add extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[models.forms.DetalheForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form : play.data.Form[models.forms.DetalheForm]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*3.1*/("""<ol class="breadcrumb">
    <li><a href="/anuncio">Mestre</a></li>
    <li class="active"><a href="#">Adicionar Beneficio</a></li>
</ol>




"""),_display_(/*11.2*/main("Adicionar Benefício")/*11.29*/ {_display_(Seq[Any](format.raw/*11.31*/("""

"""),format.raw/*13.1*/("""<div class="col-sm-12">
"""),_display_(/*14.2*/helper/*14.8*/.form(action = routes.BeneficioController.addHandler() )/*14.64*/ {_display_(Seq[Any](format.raw/*14.66*/("""
    """),format.raw/*15.5*/("""<input type="hidden" name="mestre_uuid" value='"""),_display_(/*15.53*/form("mestre_uuid")/*15.72*/.value),format.raw/*15.78*/("""'>
    <div class="col-sm-4 col-sm-offset-4">
        """),_display_(/*17.10*/helper/*17.16*/.inputText(
            form("nome"),
            '_label->"Nome", 'placeholder->"Digite o nome"
        )),format.raw/*20.10*/("""
    """),format.raw/*21.5*/("""</div>
    <div class="col-sm-4 col-sm-offset-4">
        <input type="submit" class="btn btn-default" value="Salvar">
    </div>
    """)))}),format.raw/*25.6*/("""
"""),format.raw/*26.1*/("""</div>








""")))}))}
  }

  def render(form:play.data.Form[models.forms.DetalheForm]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((play.data.Form[models.forms.DetalheForm]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Nov 11 13:37:36 BRST 2014
                  SOURCE: /Volumes/xDevel/xdevelsistemas/play/grupo/BaseEmprego/app/views/Beneficio/add.scala.html
                  HASH: b1162559bfa1307becf1ab28406fc05a865bd8f5
                  MATRIX: 765->1|902->50|930->52|1098->194|1134->221|1174->223|1203->225|1254->250|1268->256|1333->312|1373->314|1405->319|1480->367|1508->386|1535->392|1617->447|1632->453|1759->559|1791->564|1956->699|1984->700
                  LINES: 26->1|29->1|31->3|39->11|39->11|39->11|41->13|42->14|42->14|42->14|42->14|43->15|43->15|43->15|43->15|45->17|45->17|48->20|49->21|53->25|54->26
                  -- GENERATED --
              */
          