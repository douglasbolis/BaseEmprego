
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
object update extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[models.forms.DetalheForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form : play.data.Form[models.forms.DetalheForm]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*3.1*/("""<ol class="breadcrumb">
    <li><a href="/mestre">Anuncio</a></li>
    <li class="active"><a href="#">Alterar Pre-requisito</a></li>
</ol>


"""),_display_(/*9.2*/main("Alterar pre-requisito")/*9.31*/ {_display_(Seq[Any](format.raw/*9.33*/("""

"""),format.raw/*11.1*/("""<div class="col-sm-12">
"""),_display_(/*12.2*/helper/*12.8*/.form(action = routes.BeneficioController.updateHandler() )/*12.67*/ {_display_(Seq[Any](format.raw/*12.69*/("""

    """),format.raw/*14.5*/("""<input type="hidden" name="uuid" value='"""),_display_(/*14.46*/form("uuid")/*14.58*/.value),format.raw/*14.64*/("""'>
    <div class="col-sm-4 col-sm-offset-4">
        """),_display_(/*16.10*/helper/*16.16*/.inputText(
            form("nome"),
            '_value->form("nome").value(),
            '_label->"Nome",
            'placeholder->"Digite o nome"
        )),format.raw/*21.10*/("""
    """),format.raw/*22.5*/("""</div>
    <div class="col-sm-4 col-sm-offset-4">
        <input type="submit" class="btn btn-default" value="Salvar">
    </div>

    """)))}),format.raw/*27.6*/("""
"""),format.raw/*28.1*/("""</div>








""")))}))}
  }

  def render(form:play.data.Form[models.forms.DetalheForm]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((play.data.Form[models.forms.DetalheForm]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Nov 11 13:37:36 BRST 2014
                  SOURCE: /Volumes/xDevel/xdevelsistemas/play/grupo/BaseEmprego/app/views/PreRequisito/update.scala.html
                  HASH: fd125ac945b8eb58d1c4e034ae583e9141818993
                  MATRIX: 771->1|908->50|936->52|1103->194|1140->223|1179->225|1208->227|1259->252|1273->258|1341->317|1381->319|1414->325|1482->366|1503->378|1530->384|1612->439|1627->445|1809->606|1841->611|2007->747|2035->748
                  LINES: 26->1|29->1|31->3|37->9|37->9|37->9|39->11|40->12|40->12|40->12|40->12|42->14|42->14|42->14|42->14|44->16|44->16|49->21|50->22|55->27|56->28
                  -- GENERATED --
              */
          