// @SOURCE:C:/Users/Brendha/workspace/Novo/conf/routes
// @HASH:619a8d5fddae0b85780631882ac50b6e52fa07af
// @DATE:Mon Apr 07 14:59:39 GMT-03:00 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Acesso_login1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:11
private[this] lazy val controllers_Acesso_login2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:12
private[this] lazy val controllers_Acesso_authenticate3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:13
private[this] lazy val controllers_Acesso_cadastraUsuario4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cadastro"))))
        

// @LINE:14
private[this] lazy val controllers_Acesso_criaUsuario5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("criaUsuario"))))
        

// @LINE:15
private[this] lazy val controllers_Acesso_criaUsuario6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("criaUsuario"))))
        

// @LINE:16
private[this] lazy val controllers_Acesso_logout7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:17
private[this] lazy val controllers_Application_planejamentoDeCurso8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("planejamentoDeCurso"))))
        

// @LINE:18
private[this] lazy val controllers_Application_planoNovo9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("planoNovo"))))
        

// @LINE:19
private[this] lazy val controllers_Application_planejamentoDeCursoNovo10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("planejamentoDeCursoNovo"))))
        

// @LINE:20
private[this] lazy val controllers_Application_planoComum11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("planoComum"))))
        

// @LINE:21
private[this] lazy val controllers_Application_planejamentoDeCursoComum12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("planejamentoDeCursoComum"))))
        

// @LINE:22
private[this] lazy val controllers_Application_grade13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("grade"))))
        

// @LINE:23
private[this] lazy val controllers_Application_mostraDisciplinas14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mostraDisciplinas"))))
        

// @LINE:24
private[this] lazy val controllers_Application_criaPeriodo15 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("criaPeriodo"))))
        

// @LINE:25
private[this] lazy val controllers_Application_adicionaDisciplinaEmPeriodo16 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("adicionaDisciplinaEmPeriodo"))))
        

// @LINE:26
private[this] lazy val controllers_Application_removeDisciplinaPeriodo17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("removeDisciplinaPeriodo"))))
        

// @LINE:27
private[this] lazy val controllers_Application_index18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:30
private[this] lazy val controllers_Application_planejamentoDeCurso19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("planejamentoDeCurso"))))
        

// @LINE:31
private[this] lazy val controllers_Application_grade20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("planejamentoDeCurso/grade"))))
        

// @LINE:32
private[this] lazy val controllers_Application_mostraDisciplinas21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("planejamentoDeCurso/mostraDisciplinas"))))
        

// @LINE:33
private[this] lazy val controllers_Application_criaPeriodo22 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("planejamentoDeCurso/criaPeriodo"))))
        

// @LINE:34
private[this] lazy val controllers_Application_adicionaDisciplinaEmPeriodo23 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("planejamentoDeCurso/adicionaDisciplinaEmPeriodo"))))
        

// @LINE:35
private[this] lazy val controllers_Application_removeDisciplinaPeriodo24 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("planejamentoDeCurso/removeDisciplinaPeriodo"))))
        

// @LINE:38
private[this] lazy val controllers_Assets_at25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Acesso.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Acesso.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Acesso.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cadastro""","""controllers.Acesso.cadastraUsuario()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """criaUsuario""","""controllers.Acesso.criaUsuario()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """criaUsuario""","""controllers.Acesso.criaUsuario()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Acesso.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """planejamentoDeCurso""","""controllers.Application.planejamentoDeCurso()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """planoNovo""","""controllers.Application.planoNovo()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """planejamentoDeCursoNovo""","""controllers.Application.planejamentoDeCursoNovo()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """planoComum""","""controllers.Application.planoComum()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """planejamentoDeCursoComum""","""controllers.Application.planejamentoDeCursoComum()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """grade""","""controllers.Application.grade()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mostraDisciplinas""","""controllers.Application.mostraDisciplinas()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """criaPeriodo""","""controllers.Application.criaPeriodo()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """adicionaDisciplinaEmPeriodo""","""controllers.Application.adicionaDisciplinaEmPeriodo()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """removeDisciplinaPeriodo""","""controllers.Application.removeDisciplinaPeriodo()"""),("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """planejamentoDeCurso""","""controllers.Application.planejamentoDeCurso()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """planejamentoDeCurso/grade""","""controllers.Application.grade()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """planejamentoDeCurso/mostraDisciplinas""","""controllers.Application.mostraDisciplinas()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """planejamentoDeCurso/criaPeriodo""","""controllers.Application.criaPeriodo()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """planejamentoDeCurso/adicionaDisciplinaEmPeriodo""","""controllers.Application.adicionaDisciplinaEmPeriodo()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """planejamentoDeCurso/removeDisciplinaPeriodo""","""controllers.Application.removeDisciplinaPeriodo()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Acesso_login1(params) => {
   call { 
        invokeHandler(controllers.Acesso.login(), HandlerDef(this, "controllers.Acesso", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:11
case controllers_Acesso_login2(params) => {
   call { 
        invokeHandler(controllers.Acesso.login(), HandlerDef(this, "controllers.Acesso", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:12
case controllers_Acesso_authenticate3(params) => {
   call { 
        invokeHandler(controllers.Acesso.authenticate(), HandlerDef(this, "controllers.Acesso", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:13
case controllers_Acesso_cadastraUsuario4(params) => {
   call { 
        invokeHandler(controllers.Acesso.cadastraUsuario(), HandlerDef(this, "controllers.Acesso", "cadastraUsuario", Nil,"GET", """""", Routes.prefix + """cadastro"""))
   }
}
        

// @LINE:14
case controllers_Acesso_criaUsuario5(params) => {
   call { 
        invokeHandler(controllers.Acesso.criaUsuario(), HandlerDef(this, "controllers.Acesso", "criaUsuario", Nil,"GET", """""", Routes.prefix + """criaUsuario"""))
   }
}
        

// @LINE:15
case controllers_Acesso_criaUsuario6(params) => {
   call { 
        invokeHandler(controllers.Acesso.criaUsuario(), HandlerDef(this, "controllers.Acesso", "criaUsuario", Nil,"POST", """""", Routes.prefix + """criaUsuario"""))
   }
}
        

// @LINE:16
case controllers_Acesso_logout7(params) => {
   call { 
        invokeHandler(controllers.Acesso.logout(), HandlerDef(this, "controllers.Acesso", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:17
case controllers_Application_planejamentoDeCurso8(params) => {
   call { 
        invokeHandler(controllers.Application.planejamentoDeCurso(), HandlerDef(this, "controllers.Application", "planejamentoDeCurso", Nil,"GET", """""", Routes.prefix + """planejamentoDeCurso"""))
   }
}
        

// @LINE:18
case controllers_Application_planoNovo9(params) => {
   call { 
        invokeHandler(controllers.Application.planoNovo(), HandlerDef(this, "controllers.Application", "planoNovo", Nil,"GET", """""", Routes.prefix + """planoNovo"""))
   }
}
        

// @LINE:19
case controllers_Application_planejamentoDeCursoNovo10(params) => {
   call { 
        invokeHandler(controllers.Application.planejamentoDeCursoNovo(), HandlerDef(this, "controllers.Application", "planejamentoDeCursoNovo", Nil,"GET", """""", Routes.prefix + """planejamentoDeCursoNovo"""))
   }
}
        

// @LINE:20
case controllers_Application_planoComum11(params) => {
   call { 
        invokeHandler(controllers.Application.planoComum(), HandlerDef(this, "controllers.Application", "planoComum", Nil,"GET", """""", Routes.prefix + """planoComum"""))
   }
}
        

// @LINE:21
case controllers_Application_planejamentoDeCursoComum12(params) => {
   call { 
        invokeHandler(controllers.Application.planejamentoDeCursoComum(), HandlerDef(this, "controllers.Application", "planejamentoDeCursoComum", Nil,"GET", """""", Routes.prefix + """planejamentoDeCursoComum"""))
   }
}
        

// @LINE:22
case controllers_Application_grade13(params) => {
   call { 
        invokeHandler(controllers.Application.grade(), HandlerDef(this, "controllers.Application", "grade", Nil,"GET", """""", Routes.prefix + """grade"""))
   }
}
        

// @LINE:23
case controllers_Application_mostraDisciplinas14(params) => {
   call { 
        invokeHandler(controllers.Application.mostraDisciplinas(), HandlerDef(this, "controllers.Application", "mostraDisciplinas", Nil,"GET", """""", Routes.prefix + """mostraDisciplinas"""))
   }
}
        

// @LINE:24
case controllers_Application_criaPeriodo15(params) => {
   call { 
        invokeHandler(controllers.Application.criaPeriodo(), HandlerDef(this, "controllers.Application", "criaPeriodo", Nil,"POST", """""", Routes.prefix + """criaPeriodo"""))
   }
}
        

// @LINE:25
case controllers_Application_adicionaDisciplinaEmPeriodo16(params) => {
   call { 
        invokeHandler(controllers.Application.adicionaDisciplinaEmPeriodo(), HandlerDef(this, "controllers.Application", "adicionaDisciplinaEmPeriodo", Nil,"POST", """""", Routes.prefix + """adicionaDisciplinaEmPeriodo"""))
   }
}
        

// @LINE:26
case controllers_Application_removeDisciplinaPeriodo17(params) => {
   call { 
        invokeHandler(controllers.Application.removeDisciplinaPeriodo(), HandlerDef(this, "controllers.Application", "removeDisciplinaPeriodo", Nil,"POST", """""", Routes.prefix + """removeDisciplinaPeriodo"""))
   }
}
        

// @LINE:27
case controllers_Application_index18(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:30
case controllers_Application_planejamentoDeCurso19(params) => {
   call { 
        invokeHandler(controllers.Application.planejamentoDeCurso(), HandlerDef(this, "controllers.Application", "planejamentoDeCurso", Nil,"GET", """ Planejamento""", Routes.prefix + """planejamentoDeCurso"""))
   }
}
        

// @LINE:31
case controllers_Application_grade20(params) => {
   call { 
        invokeHandler(controllers.Application.grade(), HandlerDef(this, "controllers.Application", "grade", Nil,"GET", """""", Routes.prefix + """planejamentoDeCurso/grade"""))
   }
}
        

// @LINE:32
case controllers_Application_mostraDisciplinas21(params) => {
   call { 
        invokeHandler(controllers.Application.mostraDisciplinas(), HandlerDef(this, "controllers.Application", "mostraDisciplinas", Nil,"GET", """""", Routes.prefix + """planejamentoDeCurso/mostraDisciplinas"""))
   }
}
        

// @LINE:33
case controllers_Application_criaPeriodo22(params) => {
   call { 
        invokeHandler(controllers.Application.criaPeriodo(), HandlerDef(this, "controllers.Application", "criaPeriodo", Nil,"POST", """""", Routes.prefix + """planejamentoDeCurso/criaPeriodo"""))
   }
}
        

// @LINE:34
case controllers_Application_adicionaDisciplinaEmPeriodo23(params) => {
   call { 
        invokeHandler(controllers.Application.adicionaDisciplinaEmPeriodo(), HandlerDef(this, "controllers.Application", "adicionaDisciplinaEmPeriodo", Nil,"POST", """""", Routes.prefix + """planejamentoDeCurso/adicionaDisciplinaEmPeriodo"""))
   }
}
        

// @LINE:35
case controllers_Application_removeDisciplinaPeriodo24(params) => {
   call { 
        invokeHandler(controllers.Application.removeDisciplinaPeriodo(), HandlerDef(this, "controllers.Application", "removeDisciplinaPeriodo", Nil,"POST", """""", Routes.prefix + """planejamentoDeCurso/removeDisciplinaPeriodo"""))
   }
}
        

// @LINE:38
case controllers_Assets_at25(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     