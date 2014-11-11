
package views.html.PreRequisito

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
    <li><a href="/mestre">Anuncio</a></li>
    <li class="active"><a href="#">Adicionar Pre-requisito</a></li>
</ol>




"""),_display_(/*11.2*/main("Adicionar Pre-requisito")/*11.33*/ {_display_(Seq[Any](format.raw/*11.35*/("""

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
                  SOURCE: /Volumes/xDevel/xdevelsistemas/play/grupo/BaseEmprego/app/views/PreRequisito/add.scala.html
                  HASH: ddf3b40d9e1798a98ff7ce48bc9db4011bfd5698
                  MATRIX: 768->1|905->50|933->52|1105->198|1145->229|1185->231|1214->233|1265->258|1279->264|1344->320|1384->322|1416->327|1491->375|1519->394|1546->400|1628->455|1643->461|1770->567|1802->572|1967->707|1995->708
                  LINES: 26->1|29->1|31->3|39->11|39->11|39->11|41->13|42->14|42->14|42->14|42->14|43->15|43->15|43->15|43->15|45->17|45->17|48->20|49->21|53->25|54->26
                  -- GENERATED --
              */
          