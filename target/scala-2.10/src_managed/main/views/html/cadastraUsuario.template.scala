
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
	"""),_display_(Seq[Any](/*16.3*/helper/*16.9*/.form(routes.Acesso.criaUsuario)/*16.41*/ {_display_(Seq[Any](format.raw/*16.43*/("""
 		<br><br>
		<div class="textBox">
	   <input type="email" class="form-control" name="email" placeholder="Email" title="E-mail" required value=""""),_display_(Seq[Any](/*19.111*/formUser("email")/*19.128*/.value)),format.raw/*19.134*/("""">
       <br>
       <input type="nome" class="form-control" name="nome" placeholder="Nome" title="Nome" required value=""""),_display_(Seq[Any](/*21.109*/formUser("nome")/*21.125*/.value)),format.raw/*21.131*/("""">
       <br>
	   <input type="password" class="form-control" name="password" placeholder="Senha" required value=""""),_display_(Seq[Any](/*23.102*/formUser("senha")/*23.119*/.value)),format.raw/*23.125*/("""">
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
    """)))})),format.raw/*41.6*/("""   </p>
""")))})),format.raw/*42.2*/("""

"""))}
    }
    
    def render(formUser:play.data.Form[Acesso.Cadastro]): play.api.templates.HtmlFormat.Appendable = apply(formUser)
    
    def f:((play.data.Form[Acesso.Cadastro]) => play.api.templates.HtmlFormat.Appendable) = (formUser) => apply(formUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 07 14:59:42 GMT-03:00 2014
                    SOURCE: C:/Users/Brendha/workspace/Novo/app/views/cadastraUsuario.scala.html
                    HASH: 19bdba11d262e62193597f6b53fa22a7b6d36b1c
                    MATRIX: 809->1|964->44|994->67|1031->70|1055->86|1094->88|1335->294|1349->300|1390->332|1430->334|1617->484|1644->501|1673->507|1835->632|1861->648|1890->654|2045->772|2072->789|2101->795|2288->947|2326->976|2365->977|2454->1031|2468->1036|2502->1048|2551->1066|2592->1072|2633->1104|2672->1105|2764->1162|2778->1167|2815->1182|2864->1200|2912->1217|2953->1227
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|44->16|44->16|44->16|44->16|47->19|47->19|47->19|49->21|49->21|49->21|51->23|51->23|51->23|58->30|58->30|58->30|60->32|60->32|60->32|62->34|63->35|63->35|63->35|65->37|65->37|65->37|67->39|69->41|70->42
                    -- GENERATED --
                */
            