
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
			"""),_display_(Seq[Any](/*30.5*/if(sistemaPlanejamento.getPeriodos.size() >= 0)/*30.52*/ {_display_(Seq[Any](format.raw/*30.54*/("""
				<!--janela de alerta - limite de periodos-->
					"""),_display_(Seq[Any](/*32.7*/if(message != "")/*32.24*/{_display_(Seq[Any](format.raw/*32.25*/("""
						<script language="JavaScript" type="text/javascript">
							alert(""""),_display_(Seq[Any](/*34.16*/message)),format.raw/*34.23*/("""")
						</script>
					""")))})),format.raw/*36.7*/("""   
					
			<div class="addDisciplina"> 
			  """),_display_(Seq[Any](/*39.7*/form(routes.Application.adicionaDisciplinaEmPeriodo())/*39.61*/{_display_(Seq[Any](format.raw/*39.62*/("""
				"""),_display_(Seq[Any](/*40.6*/if(sistemaPlanejamento.getPeriodos.size() >= 0)/*40.53*/ {_display_(Seq[Any](format.raw/*40.55*/("""
				         <nome>Adicionar Disciplina
				                   <select class="selectpicker" data-live-search="true" name="inputNameDisc" >

				                """),_display_(Seq[Any](/*44.22*/for(disciplina <-  sistemaPlanejamento.getCurriculo().getListaDeDisciplinas()) yield /*44.100*/ {_display_(Seq[Any](format.raw/*44.102*/("""
				                	"""),_display_(Seq[Any](/*45.23*/if(!sistemaPlanejamento.estaAlocada(disciplina))/*45.71*/{_display_(Seq[Any](format.raw/*45.72*/("""
				                     <option value=""""),_display_(Seq[Any](/*46.42*/disciplina/*46.52*/.getNomeDaDisciplina())),format.raw/*46.74*/("""" name="inputNameDisc" >"""),_display_(Seq[Any](/*46.99*/disciplina/*46.109*/.getNomeDaDisciplina())),format.raw/*46.131*/("""</option>
				                     """)))})),format.raw/*47.27*/("""
				                     
				                """)))})),format.raw/*49.22*/("""
				        </select>        no Período    </nome>
				           <select class="selectpicker" data-width="100px" name="idPeriodo" >
				            """),_display_(Seq[Any](/*52.18*/for(periodo <- sistemaPlanejamento.getPeriodos()) yield /*52.67*/ {_display_(Seq[Any](format.raw/*52.69*/("""
								
				                 """),_display_(Seq[Any](/*54.23*/if(sistemaPlanejamento.getPeriodos().indexOf(periodo) >= 0)/*54.82*/ {_display_(Seq[Any](format.raw/*54.84*/("""
				                      <option value="""),_display_(Seq[Any](/*55.42*/(sistemaPlanejamento.getPeriodos().indexOf(periodo)))),format.raw/*55.94*/(""" name="idPeriodo" >"""),_display_(Seq[Any](/*55.114*/(sistemaPlanejamento.getPeriodos().indexOf(periodo)+1))),format.raw/*55.168*/("""</option><br>

				                 """)))})),format.raw/*57.23*/("""
				            """)))})),format.raw/*58.18*/("""
				        </select>
				        <button type="submit" class="btn btn-primary" type="button">Adicionar Disciplina</button>  
				 """)))})),format.raw/*61.7*/("""

			  """)))})),format.raw/*63.7*/("""
			  </div><br>
			  
		"""),_display_(Seq[Any](/*66.4*/if(sistemaPlanejamento.getPeriodos().get(0).getListaDeDisciplinas().size() > 0)/*66.83*/{_display_(Seq[Any](format.raw/*66.84*/("""
		<br><div class="removeDisciplina">
		"""),_display_(Seq[Any](/*68.4*/form(routes.Application.removeDisciplinaPeriodo())/*68.54*/{_display_(Seq[Any](format.raw/*68.55*/("""
			"""),_display_(Seq[Any](/*69.5*/if(sistemaPlanejamento.getPeriodos.size() >= 0)/*69.52*/ {_display_(Seq[Any](format.raw/*69.54*/("""
		    	<nome>Remover disciplina <select class="selectpicker" data-live-search="true" name="inputNameDisc" >
		            """),_display_(Seq[Any](/*71.16*/for(disciplina <- sistemaPlanejamento.getCurriculo().getListaDeDisciplinas()) yield /*71.93*/ {_display_(Seq[Any](format.raw/*71.95*/("""
		                 """),_display_(Seq[Any](/*72.21*/if(sistemaPlanejamento.estaAlocada(disciplina) && sistemaPlanejamento.getCurriculo().getListaDeDisciplinas().contains(disciplina))/*72.151*/{_display_(Seq[Any](format.raw/*72.152*/("""
		        	         </nome><option value=""""),_display_(Seq[Any](/*73.44*/disciplina/*73.54*/.getNomeDaDisciplina())),format.raw/*73.76*/("""" name="inputNameDisc" >"""),_display_(Seq[Any](/*73.101*/disciplina/*73.111*/.getNomeDaDisciplina())),format.raw/*73.133*/("""</option>
			             """)))})),format.raw/*74.18*/("""
		            """)))})),format.raw/*75.16*/("""
		        </select>
		        <button type="submit" class="btn btn-primary" type="button">Remover Disciplina</button>
				""")))})),format.raw/*78.6*/("""
			""")))})),format.raw/*79.5*/("""</div><br><br>
			
		""")))})),format.raw/*81.4*/("""
	""")))})),format.raw/*82.3*/("""
	
	<h2><small>Caso você ache necessário, adicione um novo período no seu planejamento de curso.</small></h2>
	<div class="addPeriodo">
	"""),_display_(Seq[Any](/*86.3*/form(routes.Application.criaPeriodo())/*86.41*/ {_display_(Seq[Any](format.raw/*86.43*/("""
	<button type="submit" class="btn btn-large btn-primary" type="button">Adicionar Período</button><br>
    """)))})),format.raw/*88.6*/("""
	</div>
	<br>
	
	 <div>
     """),_display_(Seq[Any](/*93.7*/form(routes.Application.grade())/*93.39*/ {_display_(Seq[Any](format.raw/*93.41*/("""
        	<input type="submit" class="btn btn-primary" value="Grade do Curso">
     """)))})),format.raw/*95.7*/(""" 
      </div>
     <br>
      <div>
     """),_display_(Seq[Any](/*99.7*/form(routes.Application.mostraDisciplinas())/*99.51*/ {_display_(Seq[Any](format.raw/*99.53*/("""
    <input type="submit" class="btn btn-primary" value="Disciplinas e pré-requisitos">
    """)))})),format.raw/*101.6*/("""
    </div>
   </header>
		<br><section class="planejamento">
			<!-- tabela com as disciplinas e o calculo do total de creditos de qualquer periodo-->
			<div id="colunas" style=" width: 135%;">
				"""),_display_(Seq[Any](/*107.6*/for(periodo <- sistemaPlanejamento.getPeriodos()) yield /*107.55*/{_display_(Seq[Any](format.raw/*107.56*/("""
				<div id="c"""),_display_(Seq[Any](/*108.16*/{sistemaPlanejamento.getPeriodos.indexOf(periodo)+1})),format.raw/*108.68*/("""" class="coluna" style="text-align:center; width:250px; height:525px ">
					<span style="margin-top:50px; color:#000000;"><b>"""),_display_(Seq[Any](/*109.56*/{sistemaPlanejamento.getPeriodos.indexOf(periodo)+1})),format.raw/*109.108*/("""º PERÍODO </b></span>
					<br>
					<p style="text-align: center;">
						</span>
						
						"""),_display_(Seq[Any](/*114.8*/for(disciplina <- sistemaPlanejamento.getDisciplinasDadoPeriodo(sistemaPlanejamento.getPeriodos.indexOf(periodo))) yield /*114.122*/{_display_(Seq[Any](format.raw/*114.123*/("""
							<div class="disciplina" style="position:relative;">
							<tr><td class="disciplina">"""),_display_(Seq[Any](/*116.36*/disciplina/*116.46*/.getNomeDaDisciplina())),format.raw/*116.68*/("""</tr>
							</div>
						""")))})),format.raw/*118.8*/(""" 
						<font color="#000000">
						<tr><td class="numero">Total de Créditos no Período: """),_display_(Seq[Any](/*120.61*/periodo/*120.68*/.calculaTotalDeCreditos())),format.raw/*120.93*/("""</tr></td>
						"""),_display_(Seq[Any](/*121.8*/if(sistemaPlanejamento.getCreditosDeUmPeriodo(sistemaPlanejamento.getPeriodos.indexOf(periodo)) < sistemaPlanejamento.minimoDeCreditos())/*121.145*/{_display_(Seq[Any](format.raw/*121.146*/("""
							<tr><td class="numero">Creditos desse periodo estao abaixo do minimo de creditos.</tr></td>
						""")))})),format.raw/*123.8*/("""
						</font>
			</div>
				 """)))})),format.raw/*126.7*/(""" 
		</section> 
		<br>
		<br>
		
	</body>
</font>
""")))})),format.raw/*133.2*/("""

"""))}
    }
    
    def render(sistemaPlanejamento:controllers.Planejamento,formTask:Form[models.Task],message:String): play.api.templates.HtmlFormat.Appendable = apply(sistemaPlanejamento,formTask,message)
    
    def f:((controllers.Planejamento,Form[models.Task],String) => play.api.templates.HtmlFormat.Appendable) = (sistemaPlanejamento,formTask,message) => apply(sistemaPlanejamento,formTask,message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Mar 27 19:02:39 GMT-03:00 2014
                    SOURCE: C:/Users/Brendha/workspace/projeto/app/views/index.scala.html
                    HASH: 62faadaa655d2ec7544b8ceb03efaef44c8f754c
                    MATRIX: 817->1|1020->92|1059->116|1102->151|1141->153|1362->338|1377->344|1417->362|1550->459|1565->465|1603->481|1988->831|2044->878|2084->880|2177->938|2203->955|2242->956|2356->1034|2385->1041|2443->1068|2529->1119|2592->1173|2631->1174|2673->1181|2729->1228|2769->1230|2971->1396|3066->1474|3107->1476|3167->1500|3224->1548|3263->1549|3342->1592|3361->1602|3405->1624|3466->1649|3486->1659|3531->1681|3600->1718|3682->1768|3872->1922|3937->1971|3977->1973|4047->2007|4115->2066|4155->2068|4234->2111|4308->2163|4365->2183|4442->2237|4513->2276|4564->2295|4731->2431|4772->2441|4836->2470|4924->2549|4963->2550|5041->2593|5100->2643|5139->2644|5180->2650|5236->2697|5276->2699|5438->2825|5531->2902|5571->2904|5629->2926|5769->3056|5809->3057|5890->3102|5909->3112|5953->3134|6015->3159|6035->3169|6080->3191|6140->3219|6189->3236|6347->3363|6384->3369|6439->3393|6474->3397|6651->3539|6698->3577|6738->3579|6879->3689|6950->3725|6991->3757|7031->3759|7149->3846|7231->3893|7284->3937|7324->3939|7451->4034|7694->4241|7760->4290|7800->4291|7854->4308|7929->4360|8094->4488|8170->4540|8308->4642|8440->4756|8481->4757|8615->4854|8635->4864|8680->4886|8741->4915|8871->5008|8888->5015|8936->5040|8991->5059|9139->5196|9180->5197|9321->5306|9387->5340|9477->5398
                    LINES: 26->1|30->1|32->4|32->4|32->4|44->16|44->16|44->16|48->20|48->20|48->20|58->30|58->30|58->30|60->32|60->32|60->32|62->34|62->34|64->36|67->39|67->39|67->39|68->40|68->40|68->40|72->44|72->44|72->44|73->45|73->45|73->45|74->46|74->46|74->46|74->46|74->46|74->46|75->47|77->49|80->52|80->52|80->52|82->54|82->54|82->54|83->55|83->55|83->55|83->55|85->57|86->58|89->61|91->63|94->66|94->66|94->66|96->68|96->68|96->68|97->69|97->69|97->69|99->71|99->71|99->71|100->72|100->72|100->72|101->73|101->73|101->73|101->73|101->73|101->73|102->74|103->75|106->78|107->79|109->81|110->82|114->86|114->86|114->86|116->88|121->93|121->93|121->93|123->95|127->99|127->99|127->99|129->101|135->107|135->107|135->107|136->108|136->108|137->109|137->109|142->114|142->114|142->114|144->116|144->116|144->116|146->118|148->120|148->120|148->120|149->121|149->121|149->121|151->123|154->126|161->133
                    -- GENERATED --
                */
            