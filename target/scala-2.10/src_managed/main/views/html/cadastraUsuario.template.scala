
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
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
object cadastraUsuario extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[Acesso.Cadastro],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(formUser: play.data.Form[Acesso.Cadastro]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 


Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Cadastro")/*5.18*/ {_display_(Seq[Any](format.raw/*5.20*/("""

<meta charset="utf-8">

<a href="/login"><div id="botao">Entrar</div></a>

<h1>Planejamento de Curso</h1>
<div id="main">

	<br><br>
	<h3>Preencha os campos abaixo para fazer o cadastro</h3>
<form class="form-signin" role="form" action=""""),_display_(Seq[Any](/*16.48*/routes/*16.54*/.Acesso.criaUsuario())),format.raw/*16.75*/("""" method="post">
 		<br><br>
		<div class="textBox">
			<input type="email" class="form-control" name="email" placeholder="e-mail" required>
			<br>
			<input type="nome" class="form-control" name="nome" placeholder="nome de usuário" value=""""),_display_(Seq[Any](/*21.94*/formUser("email")/*21.111*/.value)),format.raw/*21.117*/("""" required>
			<br>
			<input type="password" class="form-control" name="password" placeholder="senha" required>
			<br>
			<button type="submit" class="btn  btn-primary">Cadastrar</button>
		</div>
	</form>
      		 
      <div class="form-actions">
			"""),_display_(Seq[Any](/*30.5*/if(flash.containsKey("erro"))/*30.34*/{_display_(Seq[Any](format.raw/*30.35*/("""
				<div class="alert alert-erro container">
					"""),_display_(Seq[Any](/*32.7*/flash/*32.12*/.get("erro"))),format.raw/*32.24*/("""
				</div>
			""")))})),format.raw/*34.5*/("""
			"""),_display_(Seq[Any](/*35.5*/if(flash.containsKey("success"))/*35.37*/{_display_(Seq[Any](format.raw/*35.38*/("""
				<div class="alert alert-success container">
					"""),_display_(Seq[Any](/*37.7*/flash/*37.12*/.get("success"))),format.raw/*37.27*/("""
				</div>
			""")))})),format.raw/*39.5*/("""
		</div>
       </p>
    """)))})),format.raw/*42.6*/("""

"""))}
    }
    
    def render(formUser:play.data.Form[Acesso.Cadastro]): play.api.templates.HtmlFormat.Appendable = apply(formUser)
    
    def f:((play.data.Form[Acesso.Cadastro]) => play.api.templates.HtmlFormat.Appendable) = (formUser) => apply(formUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Mar 28 21:28:08 GMT-03:00 2014
                    SOURCE: C:/Users/Brendha/workspace/projeto1/app/views/cadastraUsuario.scala.html
                    HASH: 6bdae294226f425123130fa6fe49dd7f33b58c93
                    MATRIX: 809->1|964->44|994->67|1031->70|1055->86|1094->88|1381->339|1396->345|1439->366|1722->613|1749->630|1778->636|2077->900|2115->929|2154->930|2243->984|2257->989|2291->1001|2340->1019|2381->1025|2422->1057|2461->1058|2553->1115|2567->1120|2604->1135|2653->1153|2714->1183
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|44->16|44->16|44->16|49->21|49->21|49->21|58->30|58->30|58->30|60->32|60->32|60->32|62->34|63->35|63->35|63->35|65->37|65->37|65->37|67->39|70->42
                    -- GENERATED --
                */
            