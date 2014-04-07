
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
					
			<nome>Informe seu período
				<select class="selectpicker" data-width="100px" name="idPeriodo" >
				"""),_display_(Seq[Any](/*39.6*/for(periodo <- sistemaPlanejamento.getPeriodos()) yield /*39.55*/ {_display_(Seq[Any](format.raw/*39.57*/("""								
				                 """),_display_(Seq[Any](/*40.23*/if(sistemaPlanejamento.getPeriodos().indexOf(periodo) >= 0)/*40.82*/ {_display_(Seq[Any](format.raw/*40.84*/("""
				                      <option value="""),_display_(Seq[Any](/*41.42*/(sistemaPlanejamento.getPeriodos().indexOf(periodo)))),format.raw/*41.94*/(""" name="idPeriodo" >"""),_display_(Seq[Any](/*41.114*/(sistemaPlanejamento.getPeriodos().indexOf(periodo)+1))),format.raw/*41.168*/("""</option><br>
								
				                 """)))})),format.raw/*43.23*/("""
				            """)))})),format.raw/*44.18*/("""
				        </select>
				        <button type="submit" class="btn btn-primary" type="button">Ok</button>  		
					
					
			<div class="addDisciplina"> 
			  """),_display_(Seq[Any](/*50.7*/form(routes.Application.adicionaDisciplinaEmPeriodo())/*50.61*/{_display_(Seq[Any](format.raw/*50.62*/("""
				         <nome>Adicionar Disciplina
				                   <select class="selectpicker" data-live-search="true" name="inputNameDisc" >

				                """),_display_(Seq[Any](/*54.22*/for(disciplina <-  sistemaPlanejamento.getCurriculo().getListaDeDisciplinas()) yield /*54.100*/ {_display_(Seq[Any](format.raw/*54.102*/("""
				                	"""),_display_(Seq[Any](/*55.23*/if(!sistemaPlanejamento.estaAlocada(disciplina))/*55.71*/{_display_(Seq[Any](format.raw/*55.72*/("""
				                     <option value=""""),_display_(Seq[Any](/*56.42*/disciplina/*56.52*/.getNomeDaDisciplina())),format.raw/*56.74*/("""" name="inputNameDisc" >"""),_display_(Seq[Any](/*56.99*/disciplina/*56.109*/.getNomeDaDisciplina())),format.raw/*56.131*/("""</option>
				                     """)))})),format.raw/*57.27*/("""
				                     
				                """)))})),format.raw/*59.22*/("""
				        </select>        no Período    </nome>
				           <select class="selectpicker" data-width="100px" name="idPeriodo" >
				            """),_display_(Seq[Any](/*62.18*/for(periodo <- sistemaPlanejamento.getPeriodos()) yield /*62.67*/ {_display_(Seq[Any](format.raw/*62.69*/("""
								
				                 """),_display_(Seq[Any](/*64.23*/if(sistemaPlanejamento.getPeriodos().indexOf(periodo) >= 0)/*64.82*/ {_display_(Seq[Any](format.raw/*64.84*/("""
				                      <option value="""),_display_(Seq[Any](/*65.42*/(sistemaPlanejamento.getPeriodos().indexOf(periodo)))),format.raw/*65.94*/(""" name="idPeriodo" >"""),_display_(Seq[Any](/*65.114*/(sistemaPlanejamento.getPeriodos().indexOf(periodo)+1))),format.raw/*65.168*/("""</option><br>

				                 """)))})),format.raw/*67.23*/("""
				            """)))})),format.raw/*68.18*/("""
				        </select>
				        <button type="submit" class="btn btn-primary" type="button">Adicionar Disciplina</button>  
				

			  """)))})),format.raw/*73.7*/("""
			  </div><br>
			  
		"""),_display_(Seq[Any](/*76.4*/if(sistemaPlanejamento.getPeriodos().get(0).getListaDeDisciplinas().size() > 0)/*76.83*/{_display_(Seq[Any](format.raw/*76.84*/("""
		<br><div class="removeDisciplina">
		"""),_display_(Seq[Any](/*78.4*/form(routes.Application.removeDisciplinaPeriodo())/*78.54*/{_display_(Seq[Any](format.raw/*78.55*/("""
		    	<nome>Remover disciplina <select class="selectpicker" data-live-search="true" name="inputNameDisc" >
		            """),_display_(Seq[Any](/*80.16*/for(disciplina <- sistemaPlanejamento.getCurriculo().getListaDeDisciplinas()) yield /*80.93*/ {_display_(Seq[Any](format.raw/*80.95*/("""
		                 """),_display_(Seq[Any](/*81.21*/if(sistemaPlanejamento.estaAlocada(disciplina) && sistemaPlanejamento.getCurriculo().getListaDeDisciplinas().contains(disciplina))/*81.151*/{_display_(Seq[Any](format.raw/*81.152*/("""
		        	         </nome><option value=""""),_display_(Seq[Any](/*82.44*/disciplina/*82.54*/.getNomeDaDisciplina())),format.raw/*82.76*/("""" name="inputNameDisc" >"""),_display_(Seq[Any](/*82.101*/disciplina/*82.111*/.getNomeDaDisciplina())),format.raw/*82.133*/("""</option>
			             """)))})),format.raw/*83.18*/("""
		            """)))})),format.raw/*84.16*/("""
		        </select>
		        <button type="submit" class="btn btn-primary" type="button">Remover Disciplina</button>
			""")))})),format.raw/*87.5*/("""</div><br><br>
			
		""")))})),format.raw/*89.4*/("""
	<h2><small>Caso você ache necessário, adicione um novo período no seu planejamento de curso.</small></h2>
	<div class="addPeriodo">
	"""),_display_(Seq[Any](/*92.3*/form(routes.Application.criaPeriodo())/*92.41*/ {_display_(Seq[Any](format.raw/*92.43*/("""
	<button type="submit" class="btn btn-large btn-primary" type="button">Adicionar Período</button><br>
    """)))})),format.raw/*94.6*/("""
	</div>
	<br>
	 <div>
	 <br>
	 """),_display_(Seq[Any](/*99.4*/form(routes.Application.planoNovo())/*99.40*/ {_display_(Seq[Any](format.raw/*99.42*/("""
        	<input type="submit" class="btn btn-primary" value="Nova Grade do Curso">
     """)))})),format.raw/*101.7*/(""" 
	 </div>
	  <br>
	  """),_display_(Seq[Any](/*104.5*/form(routes.Application.planoComum())/*104.42*/ {_display_(Seq[Any](format.raw/*104.44*/("""
        	<input type="submit" class="btn btn-primary" value="Grade Comum do Curso">
     """)))})),format.raw/*106.7*/(""" 
	 </div>
	  <br>
	 <div>
     """),_display_(Seq[Any](/*110.7*/form(routes.Application.grade())/*110.39*/ {_display_(Seq[Any](format.raw/*110.41*/("""
        	<input type="submit" class="btn btn-primary" value="Grade do Curso">
     """)))})),format.raw/*112.7*/(""" 
      </div>
    
     <br>
      <div>
     """),_display_(Seq[Any](/*117.7*/form(routes.Application.mostraDisciplinas())/*117.51*/ {_display_(Seq[Any](format.raw/*117.53*/("""
    <input type="submit" class="btn btn-primary" value="Disciplinas e pré-requisitos">
    """)))})),format.raw/*119.6*/("""
    </div>
   </header>
		<br><section class="planejamento">
			<!-- tabela com as disciplinas e o calculo do total de creditos de qualquer periodo-->
			<div id="colunas" style=" width: 135%;">
				"""),_display_(Seq[Any](/*125.6*/for(periodo <- sistemaPlanejamento.getPeriodos()) yield /*125.55*/{_display_(Seq[Any](format.raw/*125.56*/("""
				<div id="c"""),_display_(Seq[Any](/*126.16*/{sistemaPlanejamento.getPeriodos.indexOf(periodo)+1})),format.raw/*126.68*/("""" class="coluna" style="text-align:center; width:250px; height:525px ">
					<span style="margin-top:50px; color:#000000;"><b>"""),_display_(Seq[Any](/*127.56*/{sistemaPlanejamento.getPeriodos.indexOf(periodo)+1})),format.raw/*127.108*/("""º PERÍODO </b></span>
					<br>
					<p style="text-align: center;">
						</span>
						
						"""),_display_(Seq[Any](/*132.8*/for(disciplina <- sistemaPlanejamento.getDisciplinasDadoPeriodo(sistemaPlanejamento.getPeriodos.indexOf(periodo))) yield /*132.122*/{_display_(Seq[Any](format.raw/*132.123*/("""
							<div class="disciplina" style="position:relative;">
							<tr><td class="disciplina">"""),_display_(Seq[Any](/*134.36*/disciplina/*134.46*/.getNomeDaDisciplina())),format.raw/*134.68*/("""</tr>
							</div>
						""")))})),format.raw/*136.8*/(""" 
						<font color="#000000">
						<tr><td class="numero">Total de Créditos no Período: """),_display_(Seq[Any](/*138.61*/periodo/*138.68*/.calculaTotalDeCreditos())),format.raw/*138.93*/("""</tr></td>
						"""),_display_(Seq[Any](/*139.8*/if(sistemaPlanejamento.getCreditosDeUmPeriodo(sistemaPlanejamento.getPeriodos.indexOf(periodo)) < sistemaPlanejamento.minimoDeCreditos())/*139.145*/{_display_(Seq[Any](format.raw/*139.146*/("""
							<tr><td class="numero">Creditos desse periodo estao abaixo do minimo de creditos.</tr></td>
						""")))})),format.raw/*141.8*/("""
						</font>
			</div>
		</section> 
		<br>
		<br>
		""")))})),format.raw/*147.4*/("""
	</body>
</font>
""")))})),format.raw/*150.2*/("""

"""))}
    }
    
    def render(sistemaPlanejamento:controllers.Planejamento,formTask:Form[models.Task],message:String): play.api.templates.HtmlFormat.Appendable = apply(sistemaPlanejamento,formTask,message)
    
    def f:((controllers.Planejamento,Form[models.Task],String) => play.api.templates.HtmlFormat.Appendable) = (sistemaPlanejamento,formTask,message) => apply(sistemaPlanejamento,formTask,message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 07 14:59:43 GMT-03:00 2014
                    SOURCE: C:/Users/Brendha/workspace/Novo/app/views/index.scala.html
                    HASH: 82a9b62ff99a05add65b4efa59157edb7d4d54e3
                    MATRIX: 817->1|1020->92|1059->116|1102->151|1141->153|1362->338|1377->344|1417->362|1550->459|1565->465|1603->481|2040->883|2066->900|2105->901|2219->979|2248->986|2306->1013|2460->1132|2525->1181|2565->1183|2633->1215|2701->1274|2741->1276|2820->1319|2894->1371|2951->1391|3028->1445|3107->1492|3158->1511|3360->1678|3423->1732|3462->1733|3664->1899|3759->1977|3800->1979|3860->2003|3917->2051|3956->2052|4035->2095|4054->2105|4098->2127|4159->2152|4179->2162|4224->2184|4293->2221|4375->2271|4565->2425|4630->2474|4670->2476|4740->2510|4808->2569|4848->2571|4927->2614|5001->2666|5058->2686|5135->2740|5206->2779|5257->2798|5432->2942|5496->2971|5584->3050|5623->3051|5701->3094|5760->3144|5799->3145|5961->3271|6054->3348|6094->3350|6152->3372|6292->3502|6332->3503|6413->3548|6432->3558|6476->3580|6538->3605|6558->3615|6603->3637|6663->3665|6712->3682|6869->3808|6924->3832|7098->3971|7145->4009|7185->4011|7326->4121|7399->4159|7444->4195|7484->4197|7608->4289|7670->4315|7717->4352|7758->4354|7883->4447|7956->4484|7998->4516|8039->4518|8158->4605|8247->4658|8301->4702|8342->4704|8469->4799|8712->5006|8778->5055|8818->5056|8872->5073|8947->5125|9112->5253|9188->5305|9326->5407|9458->5521|9499->5522|9633->5619|9653->5629|9698->5651|9759->5680|9889->5773|9906->5780|9954->5805|10009->5824|10157->5961|10198->5962|10339->6071|10433->6133|10487->6155
                    LINES: 26->1|30->1|32->4|32->4|32->4|44->16|44->16|44->16|48->20|48->20|48->20|59->31|59->31|59->31|61->33|61->33|63->35|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|69->41|71->43|72->44|78->50|78->50|78->50|82->54|82->54|82->54|83->55|83->55|83->55|84->56|84->56|84->56|84->56|84->56|84->56|85->57|87->59|90->62|90->62|90->62|92->64|92->64|92->64|93->65|93->65|93->65|93->65|95->67|96->68|101->73|104->76|104->76|104->76|106->78|106->78|106->78|108->80|108->80|108->80|109->81|109->81|109->81|110->82|110->82|110->82|110->82|110->82|110->82|111->83|112->84|115->87|117->89|120->92|120->92|120->92|122->94|127->99|127->99|127->99|129->101|132->104|132->104|132->104|134->106|138->110|138->110|138->110|140->112|145->117|145->117|145->117|147->119|153->125|153->125|153->125|154->126|154->126|155->127|155->127|160->132|160->132|160->132|162->134|162->134|162->134|164->136|166->138|166->138|166->138|167->139|167->139|167->139|169->141|175->147|178->150
                    -- GENERATED --
                */
            