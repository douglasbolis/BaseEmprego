
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
object update extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[models.forms.DetalheForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form : play.data.Form[models.forms.DetalheForm]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*3.1*/("""<ol class="breadcrumb">
    <li><a href="/anuncio">Mestre</a></li>
    <li class="active"><a href="#">Alterar Benefício</a></li>
</ol>


"""),_display_(/*9.2*/main("Alterar benefício")/*9.27*/ {_display_(Seq[Any](format.raw/*9.29*/("""

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
                  SOURCE: /Volumes/xDevel/xdevelsistemas/play/grupo/BaseEmprego/app/views/Beneficio/update.scala.html
                  HASH: e6a79b99cffdee268d806df94fc2ebc4705ef57e
                  MATRIX: 768->1|905->50|933->52|1096->190|1129->215|1168->217|1197->219|1248->244|1262->250|1330->309|1370->311|1403->317|1471->358|1492->370|1519->376|1601->431|1616->437|1798->598|1830->603|1996->739|2024->740
                  LINES: 26->1|29->1|31->3|37->9|37->9|37->9|39->11|40->12|40->12|40->12|40->12|42->14|42->14|42->14|42->14|44->16|44->16|49->21|50->22|55->27|56->28
                  -- GENERATED --
              */
          