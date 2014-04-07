
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[controllers.Planejamento,Form[models.Task],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(sistemaPlanejamento: controllers.Planejamento, formTask:Form[models.Task], message:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 


Seq[Any](format.raw/*1.93*/("""

"""),_display_(Seq[Any](/*4.2*/main("Planejamento de Curso - CCC")/*4.37*/ {_display_(Seq[Any](format.raw/*4.39*/("""

   
<font color="#FFFFFF"> 
	<head>
		<meta charset="utf-8">
		<link rel="stylesheet" href="../public/stylesheets/main.css">
		 
	</head>

	<body>
	<header>
    <a href=""""),_display_(Seq[Any](/*16.15*/routes/*16.21*/.Application.index)),format.raw/*16.39*/("""" id="logo"></a>
    <dl id="user">
        <dt>User</dt>
        <dd>
            <a href=""""),_display_(Seq[Any](/*20.23*/routes/*20.29*/.Acesso.logout())),format.raw/*20.45*/("""">Logout</a>
        </dd>
    </dl>
</header>
	
		<header>
			<h1 id="nome-principal"><strong><u>Planejamento de Curso - CCC</u></strong></h1>
			<h2><small> Você pode manipular as disciplinas, organizá-las e salvá-las da maneira que preferir através de remoção e inserção das mesmas no período desejado. </small></h2>
			<br>
			<br>
				<!--janela de alerta - limite de periodos-->
					"""),_display_(Seq[Any](/*31.7*/if(message != "")/*31.24*/{_display_(Seq[Any](format.raw/*31.25*/("""
						<script language="JavaScript" type="text/javascript">
							alert(""""),_display_(Seq[Any](/*33.16*/message)),format.raw/*33.23*/("""")
						</script>
					""")))})),format.raw/*35.7*/("""   
					
			<div class="addDisciplina"> 
			  """),_display_(Seq[Any](/*38.7*/form(routes.Application.adicionaDisciplinaEmPeriodo())/*38.61*/{_display_(Seq[Any](format.raw/*38.62*/("""
				         <nome>Adicionar Disciplina
				                   <select class="selectpicker" data-live-search="true" name="inputNameDisc" >

				                """),_display_(Seq[Any](/*42.22*/for(disciplina <-  sistemaPlanejamento.getCurriculo().getListaDeDisciplinas()) yield /*42.100*/ {_display_(Seq[Any](format.raw/*42.102*/("""
				                	"""),_display_(Seq[Any](/*43.23*/if(!sistemaPlanejamento.estaAlocada(disciplina))/*43.71*/{_display_(Seq[Any](format.raw/*43.72*/("""
				                     <option value=""""),_display_(Seq[Any](/*44.42*/disciplina/*44.52*/.getNomeDaDisciplina())),format.raw/*44.74*/("""" name="inputNameDisc" >"""),_display_(Seq[Any](/*44.99*/disciplina/*44.109*/.getNomeDaDisciplina())),format.raw/*44.131*/("""</option>
				                     """)))})),format.raw/*45.27*/("""
				                     
				                """)))})),format.raw/*47.22*/("""
				        </select>        no Período    </nome>
				           <select class="selectpicker" data-width="100px" name="idPeriodo" >
				            """),_display_(Seq[Any](/*50.18*/for(periodo <- sistemaPlanejamento.getPeriodos()) yield /*50.67*/ {_display_(Seq[Any](format.raw/*50.69*/("""
								
				                 """),_display_(Seq[Any](/*52.23*/if(sistemaPlanejamento.getPeriodos().indexOf(periodo) >= 0)/*52.82*/ {_display_(Seq[Any](format.raw/*52.84*/("""
				                      <option value="""),_display_(Seq[Any](/*53.42*/(sistemaPlanejamento.getPeriodos().indexOf(periodo)))),format.raw/*53.94*/(""" name="idPeriodo" >"""),_display_(Seq[Any](/*53.114*/(sistemaPlanejamento.getPeriodos().indexOf(periodo)+1))),format.raw/*53.168*/("""</option><br>

				                 """)))})),format.raw/*55.23*/("""
				            """)))})),format.raw/*56.18*/("""
				        </select>
				        <button type="submit" class="btn btn-primary" type="button">Adicionar Disciplina</button>  
				

			  """)))})),format.raw/*61.7*/("""
			  </div><br>
			  
		"""),_display_(Seq[Any](/*64.4*/if(sistemaPlanejamento.getPeriodos().get(0).getListaDeDisciplinas().size() > 0)/*64.83*/{_display_(Seq[Any](format.raw/*64.84*/("""
		<br><div class="removeDisciplina">
		"""),_display_(Seq[Any](/*66.4*/form(routes.Application.removeDisciplinaPeriodo())/*66.54*/{_display_(Seq[Any](format.raw/*66.55*/("""
		    	<nome>Remover disciplina <select class="selectpicker" data-live-search="true" name="inputNameDisc" >
		            """),_display_(Seq[Any](/*68.16*/for(disciplina <- sistemaPlanejamento.getCurriculo().getListaDeDisciplinas()) yield /*68.93*/ {_display_(Seq[Any](format.raw/*68.95*/("""
		                 """),_display_(Seq[Any](/*69.21*/if(sistemaPlanejamento.estaAlocada(disciplina) && sistemaPlanejamento.getCurriculo().getListaDeDisciplinas().contains(disciplina))/*69.151*/{_display_(Seq[Any](format.raw/*69.152*/("""
		        	         </nome><option value=""""),_display_(Seq[Any](/*70.44*/disciplina/*70.54*/.getNomeDaDisciplina())),format.raw/*70.76*/("""" name="inputNameDisc" >"""),_display_(Seq[Any](/*70.101*/disciplina/*70.111*/.getNomeDaDisciplina())),format.raw/*70.133*/("""</option>
			             """)))})),format.raw/*71.18*/("""
		            """)))})),format.raw/*72.16*/("""
		        </select>
		        <button type="submit" class="btn btn-primary" type="button">Remover Disciplina</button>
			""")))})),format.raw/*75.5*/("""</div><br><br>
			
		""")))})),format.raw/*77.4*/("""
	<h2><small>Caso você ache necessário, adicione um novo período no seu planejamento de curso.</small></h2>
	<div class="addPeriodo">
	"""),_display_(Seq[Any](/*80.3*/form(routes.Application.criaPeriodo())/*80.41*/ {_display_(Seq[Any](format.raw/*80.43*/("""
	<button type="submit" class="btn btn-large btn-primary" type="button">Adicionar Período</button><br>
    """)))})),format.raw/*82.6*/("""
	</div>
	<br>
	 <div>
	 <br>
	 """),_display_(Seq[Any](/*87.4*/form(routes.Application.planoNovo())/*87.40*/ {_display_(Seq[Any](format.raw/*87.42*/("""
        	<input type="submit" class="btn btn-primary" value="Nova Grade do Curso">
     """)))})),format.raw/*89.7*/(""" 
	 </div>
	  <br>
	  """),_display_(Seq[Any](/*92.5*/form(routes.Application.planoComum())/*92.42*/ {_display_(Seq[Any](format.raw/*92.44*/("""
        	<input type="submit" class="btn btn-primary" value="Grade Comum do Curso">
     """)))})),format.raw/*94.7*/(""" 
	 </div>
	  <br>
	 <div>
     """),_display_(Seq[Any](/*98.7*/form(routes.Application.grade())/*98.39*/ {_display_(Seq[Any](format.raw/*98.41*/("""
        	<input type="submit" class="btn btn-primary" value="Grade do Curso">
     """)))})),format.raw/*100.7*/(""" 
      </div>
    
     <br>
      <div>
     """),_display_(Seq[Any](/*105.7*/form(routes.Application.mostraDisciplinas())/*105.51*/ {_display_(Seq[Any](format.raw/*105.53*/("""
    <input type="submit" class="btn btn-primary" value="Disciplinas e pré-requisitos">
    """)))})),format.raw/*107.6*/("""
    </div>
   </header>
		<br><section class="planejamento">
			<!-- tabela com as disciplinas e o calculo do total de creditos de qualquer periodo-->
			<div id="colunas" style=" width: 135%;">
				"""),_display_(Seq[Any](/*113.6*/for(periodo <- sistemaPlanejamento.getPeriodos()) yield /*113.55*/{_display_(Seq[Any](format.raw/*113.56*/("""
				<div id="c"""),_display_(Seq[Any](/*114.16*/{sistemaPlanejamento.getPeriodos.indexOf(periodo)+1})),format.raw/*114.68*/("""" class="coluna" style="text-align:center; width:250px; height:525px ">
					<span style="margin-top:50px; color:#000000;"><b>"""),_display_(Seq[Any](/*115.56*/{sistemaPlanejamento.getPeriodos.indexOf(periodo)+1})),format.raw/*115.108*/("""º PERÍODO </b></span>
					<br>
					<p style="text-align: center;">
						</span>
						
						"""),_display_(Seq[Any](/*120.8*/for(disciplina <- sistemaPlanejamento.getDisciplinasDadoPeriodo(sistemaPlanejamento.getPeriodos.indexOf(periodo))) yield /*120.122*/{_display_(Seq[Any](format.raw/*120.123*/("""
							<div class="disciplina" style="position:relative;">
							<tr><td class="disciplina">"""),_display_(Seq[Any](/*122.36*/disciplina/*122.46*/.getNomeDaDisciplina())),format.raw/*122.68*/("""</tr>
							</div>
						""")))})),format.raw/*124.8*/(""" 
						<font color="#000000">
						<tr><td class="numero">Total de Créditos no Período: """),_display_(Seq[Any](/*126.61*/periodo/*126.68*/.calculaTotalDeCreditos())),format.raw/*126.93*/("""</tr></td>
						"""),_display_(Seq[Any](/*127.8*/if(sistemaPlanejamento.getCreditosDeUmPeriodo(sistemaPlanejamento.getPeriodos.indexOf(periodo)) < sistemaPlanejamento.minimoDeCreditos())/*127.145*/{_display_(Seq[Any](format.raw/*127.146*/("""
							<tr><td class="numero">Creditos desse periodo estao abaixo do minimo de creditos.</tr></td>
						""")))})),format.raw/*129.8*/("""
						</font>
			</div>
		</section> 
		<br>
		<br>
		""")))})),format.raw/*135.4*/("""
	</body>
</font>
""")))})),format.raw/*138.2*/("""

"""))}
    }
    
    def render(sistemaPlanejamento:controllers.Planejamento,formTask:Form[models.Task],message:String): play.api.templates.HtmlFormat.Appendable = apply(sistemaPlanejamento,formTask,message)
    
    def f:((controllers.Planejamento,Form[models.Task],String) => play.api.templates.HtmlFormat.Appendable) = (sistemaPlanejamento,formTask,message) => apply(sistemaPlanejamento,formTask,message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 07 14:15:26 GMT-03:00 2014
                    SOURCE: C:/Users/Brendha/workspace/Novo/app/views/index.scala.html
                    HASH: e1fd26173e5e7ed0ec268f97c52470c295c47931
                    MATRIX: 817->1|1020->92|1059->116|1102->151|1141->153|1362->338|1377->344|1417->362|1550->459|1565->465|1603->481|2040->883|2066->900|2105->901|2219->979|2248->986|2306->1013|2392->1064|2455->1118|2494->1119|2696->1285|2791->1363|2832->1365|2892->1389|2949->1437|2988->1438|3067->1481|3086->1491|3130->1513|3191->1538|3211->1548|3256->1570|3325->1607|3407->1657|3597->1811|3662->1860|3702->1862|3772->1896|3840->1955|3880->1957|3959->2000|4033->2052|4090->2072|4167->2126|4238->2165|4289->2184|4464->2328|4528->2357|4616->2436|4655->2437|4733->2480|4792->2530|4831->2531|4993->2657|5086->2734|5126->2736|5184->2758|5324->2888|5364->2889|5445->2934|5464->2944|5508->2966|5570->2991|5590->3001|5635->3023|5695->3051|5744->3068|5901->3194|5956->3218|6130->3357|6177->3395|6217->3397|6358->3507|6431->3545|6476->3581|6516->3583|6639->3675|6700->3701|6746->3738|6786->3740|6910->3833|6982->3870|7023->3902|7063->3904|7182->3991|7271->4044|7325->4088|7366->4090|7493->4185|7736->4392|7802->4441|7842->4442|7896->4459|7971->4511|8136->4639|8212->4691|8350->4793|8482->4907|8523->4908|8657->5005|8677->5015|8722->5037|8783->5066|8913->5159|8930->5166|8978->5191|9033->5210|9181->5347|9222->5348|9363->5457|9457->5519|9511->5541
                    LINES: 26->1|30->1|32->4|32->4|32->4|44->16|44->16|44->16|48->20|48->20|48->20|59->31|59->31|59->31|61->33|61->33|63->35|66->38|66->38|66->38|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|72->44|72->44|72->44|73->45|75->47|78->50|78->50|78->50|80->52|80->52|80->52|81->53|81->53|81->53|81->53|83->55|84->56|89->61|92->64|92->64|92->64|94->66|94->66|94->66|96->68|96->68|96->68|97->69|97->69|97->69|98->70|98->70|98->70|98->70|98->70|98->70|99->71|100->72|103->75|105->77|108->80|108->80|108->80|110->82|115->87|115->87|115->87|117->89|120->92|120->92|120->92|122->94|126->98|126->98|126->98|128->100|133->105|133->105|133->105|135->107|141->113|141->113|141->113|142->114|142->114|143->115|143->115|148->120|148->120|148->120|150->122|150->122|150->122|152->124|154->126|154->126|154->126|155->127|155->127|155->127|157->129|163->135|166->138
                    -- GENERATED --
                */
            