
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html style="height: 100%;">
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        
        <!-- begin bootstrap css -->
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.54*/routes/*11.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*11.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.54*/routes/*12.60*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*12.103*/("""">
       	<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*13.54*/routes/*13.60*/.Assets.at("stylesheets/bootstrap-theme.min.css"))),format.raw/*13.109*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*14.54*/routes/*14.60*/.Assets.at("stylesheets/bootstrap-theme.css"))),format.raw/*14.105*/("""">
        <!-- end bootstrap css -->
        
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*17.59*/routes/*17.65*/.Assets.at("images/favicon.png"))),format.raw/*17.97*/("""">
        <script src=""""),_display_(Seq[Any](/*18.23*/routes/*18.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*18.74*/("""" type="text/javascript"></script>
        
        <!-- begin bootstrap js -->
        <script src=""""),_display_(Seq[Any](/*21.23*/routes/*21.29*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*21.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*22.23*/routes/*22.29*/.Assets.at("javascripts/bootstrap.js"))),format.raw/*22.67*/("""" type="text/javascript"></script>
        <!-- begin bootstrap js -->
    </head>
    <body class="body-back" style="height: 100%;">
		"""),_display_(Seq[Any](/*26.4*/content)),format.raw/*26.11*/("""
	</body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 26 20:23:58 GMT-03:00 2014
                    SOURCE: C:/Users/Brendha/workspace/projeto/app/views/main.scala.html
                    HASH: 233bf1f320159c6c243860b1bdda7a28f607a171
                    MATRIX: 778->1|902->31|1018->112|1044->117|1142->180|1156->186|1211->220|1352->325|1367->331|1428->370|1521->427|1536->433|1602->476|1695->533|1710->539|1782->588|1875->645|1890->651|1958->696|2102->804|2117->810|2171->842|2233->868|2248->874|2315->919|2456->1024|2471->1030|2535->1072|2629->1130|2644->1136|2704->1174|2880->1315|2909->1322
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|45->17|45->17|45->17|46->18|46->18|46->18|49->21|49->21|49->21|50->22|50->22|50->22|54->26|54->26
                    -- GENERATED --
                */
            