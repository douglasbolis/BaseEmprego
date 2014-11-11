
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[Anuncio],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(lista : java.util.List[Anuncio]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import play.api.mvc.Flash

Seq[Any](format.raw/*1.35*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<ol class="breadcrumb">
    <li class="active"><a href="/anuncio">Anuncio</a></li>
</ol>




"""),_display_(/*11.2*/main("Anuncios")/*11.18*/ {_display_(Seq[Any](format.raw/*11.20*/("""

        """),format.raw/*13.9*/("""<a class="btn btn-primary" href="/anuncio/add">Adicionar Anuncio</a>
        <br/>
        <div class="panel panel-default">
            <div class="panel-heading">Anuncio</div>
            <div class="panel-body">
            """),_display_(/*18.14*/for(itm_mestre <- lista) yield /*18.38*/{_display_(Seq[Any](format.raw/*18.39*/("""
                """),format.raw/*19.17*/("""<div class="panel panel-default">
                    <div class="panel-heading">
                    <a class="" href="/anuncio/update/"""),_display_(/*21.56*/itm_mestre/*21.66*/.uuid),format.raw/*21.71*/("""">"""),_display_(/*21.74*/itm_mestre/*21.84*/.get_nome()),format.raw/*21.95*/("""</a>
                    <a class="btn btn-danger col-sm-offset-11" href="/anuncio/delete/"""),_display_(/*22.87*/itm_mestre/*22.97*/.uuid),format.raw/*22.102*/("""">Excluir</a>
                    </div>
                    <div class="panel-body">
                        <a class="btn btn-primary" href="/beneficio/add/"""),_display_(/*25.74*/itm_mestre/*25.84*/.uuid),format.raw/*25.89*/("""">Adicionar Benefício</a>
                        <ul class="list-group">
                            <div class="panel panel-default">
                                <div class="panel-heading">Detalhes</div>
                                <div class="panel-body">
                                """),_display_(/*30.34*/for(itm_beneficio <- itm_mestre.get_beneficios()) yield /*30.83*/{_display_(Seq[Any](format.raw/*30.84*/("""
                                    """),format.raw/*31.37*/("""<li class="list-group-item">
                                        <a class="col-sm-6" href="/beneficio/update/"""),_display_(/*32.86*/itm_beneficio/*32.99*/.uuid),format.raw/*32.104*/("""">"""),_display_(/*32.107*/itm_beneficio/*32.120*/.get_nome()),format.raw/*32.131*/("""</a>
                                        <a class="btn btn-danger col-sm-offset-5" href="/beneficio/delete/"""),_display_(/*33.108*/itm_beneficio/*33.121*/.uuid),format.raw/*33.126*/("""">Excluir</a>
                                    </li>
                                """)))}),format.raw/*35.34*/("""
                                """),format.raw/*36.33*/("""</div>
                            </div>
                        </ul>
                    </div>
                    <div class="panel-body">
                        <a class="btn btn-primary" href="/beneficio/add/"""),_display_(/*41.74*/itm_mestre/*41.84*/.uuid),format.raw/*41.89*/("""">Adicionar Requisito</a>
                        <ul class="list-group">
                            <div class="panel panel-default">
                                <div class="panel-heading">Detalhes</div>
                                <div class="panel-body">
                                """),_display_(/*46.34*/for(itm_requisito <- itm_mestre.get_prerequisitos()) yield /*46.86*/{_display_(Seq[Any](format.raw/*46.87*/("""
                                    """),format.raw/*47.37*/("""<li class="list-group-item">
                                        <a class="col-sm-6" href="/beneficio/update/"""),_display_(/*48.86*/itm_requisito/*48.99*/.uuid),format.raw/*48.104*/("""">"""),_display_(/*48.107*/itm_requisito/*48.120*/.get_nome()),format.raw/*48.131*/("""</a>
                                        <a class="btn btn-danger col-sm-offset-5" href="/beneficio/delete/"""),_display_(/*49.108*/itm_requisito/*49.121*/.uuid),format.raw/*49.126*/("""">Excluir</a>
                                    </li>
                                """)))}),format.raw/*51.34*/("""
                                """),format.raw/*52.33*/("""</div>
                            </div>
                        </ul>
                    </div>
                </div>
            """)))}),format.raw/*57.14*/("""
            """),format.raw/*58.13*/("""</div>
        </div>


""")))}))}
  }

  def render(lista:java.util.List[Anuncio]): play.twirl.api.HtmlFormat.Appendable = apply(lista)

  def f:((java.util.List[Anuncio]) => play.twirl.api.HtmlFormat.Appendable) = (lista) => apply(lista)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Nov 11 13:37:36 BRST 2014
                  SOURCE: /Volumes/xDevel/xdevelsistemas/play/grupo/BaseEmprego/app/views/Anuncio/index.scala.html
                  HASH: 90a4b27aca1b9a338e5a6f22c4f29e1ee4c6ba35
                  MATRIX: 748->1|894->34|921->62|948->63|1068->157|1093->173|1133->175|1170->185|1425->413|1465->437|1504->438|1549->455|1713->592|1732->602|1758->607|1788->610|1807->620|1839->631|1957->722|1976->732|2003->737|2189->896|2208->906|2234->911|2561->1211|2626->1260|2665->1261|2730->1298|2871->1412|2893->1425|2920->1430|2951->1433|2974->1446|3007->1457|3147->1569|3170->1582|3197->1587|3317->1676|3378->1709|3622->1926|3641->1936|3667->1941|3994->2241|4062->2293|4101->2294|4166->2331|4307->2445|4329->2458|4356->2463|4387->2466|4410->2479|4443->2490|4583->2602|4606->2615|4633->2620|4753->2709|4814->2742|4980->2877|5021->2890
                  LINES: 26->1|29->1|30->3|31->4|38->11|38->11|38->11|40->13|45->18|45->18|45->18|46->19|48->21|48->21|48->21|48->21|48->21|48->21|49->22|49->22|49->22|52->25|52->25|52->25|57->30|57->30|57->30|58->31|59->32|59->32|59->32|59->32|59->32|59->32|60->33|60->33|60->33|62->35|63->36|68->41|68->41|68->41|73->46|73->46|73->46|74->47|75->48|75->48|75->48|75->48|75->48|75->48|76->49|76->49|76->49|78->51|79->52|84->57|85->58
                  -- GENERATED --
              */
          