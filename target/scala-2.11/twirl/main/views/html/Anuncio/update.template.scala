
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
object update extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[models.forms.MestreForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form : play.data.Form[models.forms.MestreForm]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.50*/("""

"""),format.raw/*3.1*/("""<ol class="breadcrumb">
    <li><a href="/anuncio">Anuncio</a></li>
    <li class="active"><a href="#">Alterar</a></li>
</ol>


"""),_display_(/*9.2*/main("Adicionar anuncio")/*9.27*/ {_display_(Seq[Any](format.raw/*9.29*/("""

"""),format.raw/*11.1*/("""<div class="col-sm-12">
"""),_display_(/*12.2*/helper/*12.8*/.form(action = routes.AnuncioController.updateHandler() )/*12.65*/ {_display_(Seq[Any](format.raw/*12.67*/("""

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

  def render(form:play.data.Form[models.forms.MestreForm]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((play.data.Form[models.forms.MestreForm]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Nov 11 13:37:36 BRST 2014
                  SOURCE: /Volumes/xDevel/xdevelsistemas/play/grupo/BaseEmprego/app/views/Anuncio/update.scala.html
                  HASH: bee7fca386a83f67e90b44d787f45743eee317f3
                  MATRIX: 765->1|901->49|929->51|1083->180|1116->205|1155->207|1184->209|1235->234|1249->240|1315->297|1355->299|1388->305|1456->346|1477->358|1504->364|1586->419|1601->425|1783->586|1815->591|1981->727|2009->728
                  LINES: 26->1|29->1|31->3|37->9|37->9|37->9|39->11|40->12|40->12|40->12|40->12|42->14|42->14|42->14|42->14|44->16|44->16|49->21|50->22|55->27|56->28
                  -- GENERATED --
              */
          