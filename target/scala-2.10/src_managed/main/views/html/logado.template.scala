
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
			<br>
			<input type="password" class="form-control" name="password" placeholder="senha" required><br>
			
			<button type="submit" class="btn btn-primary">Entrar</button>
			
			<button type="button" class="btn btn-primary" onclick="location.href ='"""),_display_(Seq[Any](/*26.76*/routes/*26.82*/.Acesso.cadastraUsuario())),format.raw/*26.107*/("""';">Cadastrar</button>

		</div>
	</form>

		<div class="form-actions">
			"""),_display_(Seq[Any](/*32.5*/if(flash.containsKey("erro"))/*32.34*/{_display_(Seq[Any](format.raw/*32.35*/("""
				<div class="alert alert-erro container">
					"""),_display_(Seq[Any](/*34.7*/flash/*34.12*/.get("erro"))),format.raw/*34.24*/("""
				</div>
			""")))})),format.raw/*36.5*/("""
			"""),_display_(Seq[Any](/*37.5*/if(flash.containsKey("success"))/*37.37*/{_display_(Seq[Any](format.raw/*37.38*/("""
				<div class="alert alert-success container">
					"""),_display_(Seq[Any](/*39.7*/flash/*39.12*/.get("success"))),format.raw/*39.27*/("""
				</div>
			""")))})),format.raw/*41.5*/("""
		</div>
""")))})),format.raw/*43.2*/("""

"""))}
    }
    
    def render(formUser:play.data.Form[Acesso.Login]): play.api.templates.HtmlFormat.Appendable = apply(formUser)
    
    def f:((play.data.Form[Acesso.Login]) => play.api.templates.HtmlFormat.Appendable) = (formUser) => apply(formUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 07 14:15:27 GMT-03:00 2014
                    SOURCE: C:/Users/Brendha/workspace/Novo/app/views/logado.scala.html
                    HASH: c831a4971a1de2b6b2dbfa506a5f0dbe24cba2d4
                    MATRIX: 797->1|949->41|979->64|1018->69|1055->98|1093->99|1393->363|1408->369|1452->391|1617->520|1644->537|1673->543|1980->814|1995->820|2043->845|2160->927|2198->956|2237->957|2326->1011|2340->1016|2374->1028|2423->1046|2464->1052|2505->1084|2544->1085|2636->1142|2650->1147|2687->1162|2736->1180|2780->1193
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|46->18|46->18|46->18|48->20|48->20|48->20|54->26|54->26|54->26|60->32|60->32|60->32|62->34|62->34|62->34|64->36|65->37|65->37|65->37|67->39|67->39|67->39|69->41|71->43
                    -- GENERATED --
                */
            