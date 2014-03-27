
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
object logado extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[Acesso.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(formUser: play.data.Form[Acesso.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 


Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*4.1*/("""

"""),_display_(Seq[Any](/*6.2*/main("Planejamento de Curso")/*6.31*/{_display_(Seq[Any](format.raw/*6.32*/("""

<meta charset="utf-8">
		<link rel="stylesheet" href="../public/stylesheets/main.css">

    
<h1>Planejamento de Curso</h1>
<div id="main">
    
	<br><br>
	<h3>Faça o login ou cadastre-se</h3><br>	
 		
	<form class="form-signin" role="form" action=""""),_display_(Seq[Any](/*18.49*/routes/*18.55*/.Acesso.authenticate())),format.raw/*18.77*/("""" method="post">
		<div class="textBox">
			<input type="email" class="form-control" name="email" placeholder="e-mail" value=""""),_display_(Seq[Any](/*20.87*/formUser("email")/*20.104*/.value)),format.raw/*20.110*/("""" required>
			<input type="password" class="form-control" name="password" placeholder="senha" required><br>
			<button type="submit" class="btn btn-primary">Entrar</button>
			<button type="button" class="btn" onclick="location.href ='"""),_display_(Seq[Any](/*23.64*/routes/*23.70*/.Acesso.cadastraUsuario())),format.raw/*23.95*/("""';">Cadastrar</button>

		</div>
	</form>

		<div class="form-actions">
			"""),_display_(Seq[Any](/*29.5*/if(flash.containsKey("erro"))/*29.34*/{_display_(Seq[Any](format.raw/*29.35*/("""
				<div class="alert alert-erro container">
					"""),_display_(Seq[Any](/*31.7*/flash/*31.12*/.get("erro"))),format.raw/*31.24*/("""
				</div>
			""")))})),format.raw/*33.5*/("""
			"""),_display_(Seq[Any](/*34.5*/if(flash.containsKey("success"))/*34.37*/{_display_(Seq[Any](format.raw/*34.38*/("""
				<div class="alert alert-success container">
					"""),_display_(Seq[Any](/*36.7*/flash/*36.12*/.get("success"))),format.raw/*36.27*/("""
				</div>
			""")))})),format.raw/*38.5*/("""
		</div>
""")))})),format.raw/*40.2*/("""

"""))}
    }
    
    def render(formUser:play.data.Form[Acesso.Login]): play.api.templates.HtmlFormat.Appendable = apply(formUser)
    
    def f:((play.data.Form[Acesso.Login]) => play.api.templates.HtmlFormat.Appendable) = (formUser) => apply(formUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 26 20:23:58 GMT-03:00 2014
                    SOURCE: C:/Users/Brendha/workspace/projeto/app/views/logado.scala.html
                    HASH: 5cabe1aa1a0ad3646ba0fe5509c31580705c2536
                    MATRIX: 797->1|949->41|979->64|1018->69|1055->98|1093->99|1393->363|1408->369|1452->391|1617->520|1644->537|1673->543|1949->783|1964->789|2011->814|2128->896|2166->925|2205->926|2294->980|2308->985|2342->997|2391->1015|2432->1021|2473->1053|2512->1054|2604->1111|2618->1116|2655->1131|2704->1149|2748->1162
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|46->18|46->18|46->18|48->20|48->20|48->20|51->23|51->23|51->23|57->29|57->29|57->29|59->31|59->31|59->31|61->33|62->34|62->34|62->34|64->36|64->36|64->36|66->38|68->40
                    -- GENERATED --
                */
            