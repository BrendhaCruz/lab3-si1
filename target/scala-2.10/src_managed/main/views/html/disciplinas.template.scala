
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
object disciplinas extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[controllers.Planejamento,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(sistemaPlanejamento: controllers.Planejamento):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 


Seq[Any](format.raw/*1.49*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Planejamento de Curso - CCC")/*5.37*/ {_display_(Seq[Any](format.raw/*5.39*/("""

<font color="#FFFFFF"> 
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="../public/stylesheets/main.css">

<h1><u>Planejamento de Curso - CCC </u></h1>
<h2><small>Disciplinas e Pré-requisitos - CCC </h2></small>
</head>

<body>

 """),_display_(Seq[Any](/*18.3*/form(routes.Application.index())/*18.35*/ {_display_(Seq[Any](format.raw/*18.37*/("""
     <input type="submit" class="btn btn-primary" value="Voltar para página inicial">
    """)))})),format.raw/*20.6*/("""
<br>
<table>
		<footer class="curriculo">	
			<!-- mostra lista todas as disciplinas e seus respectivos creditos -->
			<table class="table table-bordered">
				<TH> Nome da disciplina</TH><TH> Créditos </TH> <TH> Pré-Requisitos</TH>
				"""),_display_(Seq[Any](/*27.6*/for(disciplina <- sistemaPlanejamento.getCurriculo().getListaDeDisciplinas()) yield /*27.83*/{_display_(Seq[Any](format.raw/*27.84*/("""	
					<TR><TD>"""),_display_(Seq[Any](/*28.15*/disciplina/*28.25*/.getNomeDaDisciplina())),format.raw/*28.47*/("""</td><td> """),_display_(Seq[Any](/*28.58*/disciplina/*28.68*/.getCreditos())),format.raw/*28.82*/("""</td><td>"""),_display_(Seq[Any](/*28.92*/disciplina/*28.102*/.preRequisitos())),format.raw/*28.118*/("""</TD></TR> 

			""")))})),format.raw/*30.5*/("""       
		   	</table>
		</footer>   
<br>
</body>
</font>

""")))})))}
    }
    
    def render(sistemaPlanejamento:controllers.Planejamento): play.api.templates.HtmlFormat.Appendable = apply(sistemaPlanejamento)
    
    def f:((controllers.Planejamento) => play.api.templates.HtmlFormat.Appendable) = (sistemaPlanejamento) => apply(sistemaPlanejamento)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 07 14:59:42 GMT-03:00 2014
                    SOURCE: C:/Users/Brendha/workspace/Novo/app/views/disciplinas.scala.html
                    HASH: 4fc065fb20fc7ea4a380556b894208db0ac2cbcc
                    MATRIX: 798->1|957->48|987->71|1024->74|1067->109|1106->111|1397->367|1438->399|1478->401|1603->495|1885->742|1978->819|2017->820|2070->837|2089->847|2133->869|2180->880|2199->890|2235->904|2281->914|2301->924|2340->940|2390->959
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|46->18|46->18|46->18|48->20|55->27|55->27|55->27|56->28|56->28|56->28|56->28|56->28|56->28|56->28|56->28|56->28|58->30
                    -- GENERATED --
                */
            