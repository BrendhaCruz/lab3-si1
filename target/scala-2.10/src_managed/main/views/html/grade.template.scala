
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
object grade extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 


Seq[Any](format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Planejamento de Curso - CCC")/*4.37*/ {_display_(Seq[Any](format.raw/*4.39*/("""

<font color="#FFFFFF"> 
<head>
<meta charset="utf-8">
<h1><u>Planejamento de Curso - CCC </u></h1>
<h2><small>Grade do Curso - CCC </h2></small>
</head>

<body>
  """),_display_(Seq[Any](/*14.4*/form(routes.Application.index())/*14.36*/ {_display_(Seq[Any](format.raw/*14.38*/("""
     <input type="submit" class="btn btn-primary" value="Voltar para página inicial">
    """)))})),format.raw/*16.6*/("""
    <br>
    <img src=""""),_display_(Seq[Any](/*18.16*/routes/*18.22*/.Assets.at("images/Grade.png"))),format.raw/*18.52*/("""" width="2284" height="806" />
   <br>
   <br>
    </font>
</body>

""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Mar 27 19:02:38 GMT-03:00 2014
                    SOURCE: C:/Users/Brendha/workspace/projeto/app/views/grade.scala.html
                    HASH: 03635eb76f1ccdacaee09ac1a5822e93792725f7
                    MATRIX: 873->21|910->24|953->59|992->61|1203->237|1244->269|1284->271|1409->365|1472->392|1487->398|1539->428
                    LINES: 30->3|31->4|31->4|31->4|41->14|41->14|41->14|43->16|45->18|45->18|45->18
                    -- GENERATED --
                */
            