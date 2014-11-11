
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main("Principal")/*1.19*/ {_display_(Seq[Any](format.raw/*1.21*/("""
    """),format.raw/*2.5*/("""<div>
        <h1 class="col-sm-12 centered" >Projeto de Ensino em Play com Java</h1>
        <div class="bs-callout bs-callout-info">
            <h4>Cadastro Unificado de Ofertas</h4>
            <p>
                Exemplo Java Mestre/Detalhe com forms em template do próprio play
            </p>
            <a class="btn btn-primary" href="/anuncio">Entrar</a>
        </div>
    </div>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Nov 11 13:37:36 BRST 2014
                  SOURCE: /Volumes/xDevel/xdevelsistemas/play/grupo/BaseEmprego/app/views/index.scala.html
                  HASH: 6014d7e29959526dfc09d141db3834c7caa82e16
                  MATRIX: 798->1|823->18|862->20|893->25
                  LINES: 29->1|29->1|29->1|30->2
                  -- GENERATED --
              */
          