// @SOURCE:C:/Users/Brendha/workspace/projeto1/conf/routes
// @HASH:9e46e4e632a85ecfbac4e388f611a3d42370046a
// @DATE:Fri Mar 28 21:39:30 GMT-03:00 2014


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
        

// @LINE:10
private[this] lazy val controllers_Acesso_login1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:11
private[this] lazy val controllers_Acesso_authenticate2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:12
private[this] lazy val controllers_Acesso_cadastraUsuario3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cadastro"))))
        

// @LINE:13
private[this] lazy val controllers_Acesso_criaUsuario4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("criaUsuario"))))
        

// @LINE:14
private[this] lazy val controllers_Acesso_criaUsuario5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("criaUsuario"))))
        

// @LINE:15
private[this] lazy val controllers_Acesso_logout6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:16
private[this] lazy val controllers_Application_planejamentoDeCurso7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("planejamentoDeCurso"))))
        

// @LINE:17
private[this] lazy val controllers_Application_grade8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("grade"))))
        

// @LINE:18
private[this] lazy val controllers_Application_planoNovo9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("planoNovo"))))
        

// @LINE:19
private[this] lazy val controllers_Application_planejamentoDeCursoNovo10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("planejamentoDeCursoNovo"))))
        

// @LINE:20
private[this] lazy val controllers_Application_mostraDisciplinas11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mostraDisciplinas"))))
        

// @LINE:21
private[this] lazy val controllers_Application_criaPeriodo12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("criaPeriodo"))))
        

// @LINE:22
private[this] lazy val controllers_Application_adicionaDisciplinaEmPeriodo13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("adicionaDisciplinaEmPeriodo"))))
        

// @LINE:23
private[this] lazy val controllers_Application_removeDisciplinaPeriodo14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("removeDisciplinaPeriodo"))))
        

// @LINE:24
private[this] lazy val controllers_Application_index15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:27
private[this] lazy val controllers_Application_planejamentoDeCurso16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("planejamentoDeCurso"))))
        

// @LINE:28
private[this] lazy val controllers_Application_grade17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("planejamentoDeCurso/grade"))))
        

// @LINE:29
private[this] lazy val controllers_Application_mostraDisciplinas18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("planejamentoDeCurso/mostraDisciplinas"))))
        

// @LINE:30
private[this] lazy val controllers_Application_criaPeriodo19 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("planejamentoDeCurso/criaPeriodo"))))
        

// @LINE:31
private[this] lazy val controllers_Application_adicionaDisciplinaEmPeriodo20 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("planejamentoDeCurso/adicionaDisciplinaEmPeriodo"))))
        

// @LINE:32
private[this] lazy val controllers_Application_removeDisciplinaPeriodo21 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("planejamentoDeCurso/removeDisciplinaPeriodo"))))
        

// @LINE:35
private[this] lazy val controllers_Assets_at22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Acesso.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Acesso.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cadastro""","""controllers.Acesso.cadastraUsuario()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """criaUsuario""","""controllers.Acesso.criaUsuario()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """criaUsuario""","""controllers.Acesso.criaUsuario()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Acesso.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """planejamentoDeCurso""","""controllers.Application.planejamentoDeCurso()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """grade""","""controllers.Application.grade()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """planoNovo""","""controllers.Application.planoNovo()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """planejamentoDeCursoNovo""","""controllers.Application.planejamentoDeCursoNovo()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mostraDisciplinas""","""controllers.Application.mostraDisciplinas()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """criaPeriodo""","""controllers.Application.criaPeriodo()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """adicionaDisciplinaEmPeriodo""","""controllers.Application.adicionaDisciplinaEmPeriodo()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """removeDisciplinaPeriodo""","""controllers.Application.removeDisciplinaPeriodo()"""),("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """planejamentoDeCurso""","""controllers.Application.planejamentoDeCurso()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """planejamentoDeCurso/grade""","""controllers.Application.grade()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """planejamentoDeCurso/mostraDisciplinas""","""controllers.Application.mostraDisciplinas()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """planejamentoDeCurso/criaPeriodo""","""controllers.Application.criaPeriodo()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """planejamentoDeCurso/adicionaDisciplinaEmPeriodo""","""controllers.Application.adicionaDisciplinaEmPeriodo()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """planejamentoDeCurso/removeDisciplinaPeriodo""","""controllers.Application.removeDisciplinaPeriodo()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:10
case controllers_Acesso_login1(params) => {
   call { 
        invokeHandler(controllers.Acesso.login(), HandlerDef(this, "controllers.Acesso", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:11
case controllers_Acesso_authenticate2(params) => {
   call { 
        invokeHandler(controllers.Acesso.authenticate(), HandlerDef(this, "controllers.Acesso", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:12
case controllers_Acesso_cadastraUsuario3(params) => {
   call { 
        invokeHandler(controllers.Acesso.cadastraUsuario(), HandlerDef(this, "controllers.Acesso", "cadastraUsuario", Nil,"GET", """""", Routes.prefix + """cadastro"""))
   }
}
        

// @LINE:13
case controllers_Acesso_criaUsuario4(params) => {
   call { 
        invokeHandler(controllers.Acesso.criaUsuario(), HandlerDef(this, "controllers.Acesso", "criaUsuario", Nil,"GET", """""", Routes.prefix + """criaUsuario"""))
   }
}
        

// @LINE:14
case controllers_Acesso_criaUsuario5(params) => {
   call { 
        invokeHandler(controllers.Acesso.criaUsuario(), HandlerDef(this, "controllers.Acesso", "criaUsuario", Nil,"POST", """""", Routes.prefix + """criaUsuario"""))
   }
}
        

// @LINE:15
case controllers_Acesso_logout6(params) => {
   call { 
        invokeHandler(controllers.Acesso.logout(), HandlerDef(this, "controllers.Acesso", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:16
case controllers_Application_planejamentoDeCurso7(params) => {
   call { 
        invokeHandler(controllers.Application.planejamentoDeCurso(), HandlerDef(this, "controllers.Application", "planejamentoDeCurso", Nil,"GET", """""", Routes.prefix + """planejamentoDeCurso"""))
   }
}
        

// @LINE:17
case controllers_Application_grade8(params) => {
   call { 
        invokeHandler(controllers.Application.grade(), HandlerDef(this, "controllers.Application", "grade", Nil,"GET", """""", Routes.prefix + """grade"""))
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
case controllers_Application_mostraDisciplinas11(params) => {
   call { 
        invokeHandler(controllers.Application.mostraDisciplinas(), HandlerDef(this, "controllers.Application", "mostraDisciplinas", Nil,"GET", """""", Routes.prefix + """mostraDisciplinas"""))
   }
}
        

// @LINE:21
case controllers_Application_criaPeriodo12(params) => {
   call { 
        invokeHandler(controllers.Application.criaPeriodo(), HandlerDef(this, "controllers.Application", "criaPeriodo", Nil,"POST", """""", Routes.prefix + """criaPeriodo"""))
   }
}
        

// @LINE:22
case controllers_Application_adicionaDisciplinaEmPeriodo13(params) => {
   call { 
        invokeHandler(controllers.Application.adicionaDisciplinaEmPeriodo(), HandlerDef(this, "controllers.Application", "adicionaDisciplinaEmPeriodo", Nil,"POST", """""", Routes.prefix + """adicionaDisciplinaEmPeriodo"""))
   }
}
        

// @LINE:23
case controllers_Application_removeDisciplinaPeriodo14(params) => {
   call { 
        invokeHandler(controllers.Application.removeDisciplinaPeriodo(), HandlerDef(this, "controllers.Application", "removeDisciplinaPeriodo", Nil,"POST", """""", Routes.prefix + """removeDisciplinaPeriodo"""))
   }
}
        

// @LINE:24
case controllers_Application_index15(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:27
case controllers_Application_planejamentoDeCurso16(params) => {
   call { 
        invokeHandler(controllers.Application.planejamentoDeCurso(), HandlerDef(this, "controllers.Application", "planejamentoDeCurso", Nil,"GET", """ Planejamento""", Routes.prefix + """planejamentoDeCurso"""))
   }
}
        

// @LINE:28
case controllers_Application_grade17(params) => {
   call { 
        invokeHandler(controllers.Application.grade(), HandlerDef(this, "controllers.Application", "grade", Nil,"GET", """""", Routes.prefix + """planejamentoDeCurso/grade"""))
   }
}
        

// @LINE:29
case controllers_Application_mostraDisciplinas18(params) => {
   call { 
        invokeHandler(controllers.Application.mostraDisciplinas(), HandlerDef(this, "controllers.Application", "mostraDisciplinas", Nil,"GET", """""", Routes.prefix + """planejamentoDeCurso/mostraDisciplinas"""))
   }
}
        

// @LINE:30
case controllers_Application_criaPeriodo19(params) => {
   call { 
        invokeHandler(controllers.Application.criaPeriodo(), HandlerDef(this, "controllers.Application", "criaPeriodo", Nil,"POST", """""", Routes.prefix + """planejamentoDeCurso/criaPeriodo"""))
   }
}
        

// @LINE:31
case controllers_Application_adicionaDisciplinaEmPeriodo20(params) => {
   call { 
        invokeHandler(controllers.Application.adicionaDisciplinaEmPeriodo(), HandlerDef(this, "controllers.Application", "adicionaDisciplinaEmPeriodo", Nil,"POST", """""", Routes.prefix + """planejamentoDeCurso/adicionaDisciplinaEmPeriodo"""))
   }
}
        

// @LINE:32
case controllers_Application_removeDisciplinaPeriodo21(params) => {
   call { 
        invokeHandler(controllers.Application.removeDisciplinaPeriodo(), HandlerDef(this, "controllers.Application", "removeDisciplinaPeriodo", Nil,"POST", """""", Routes.prefix + """planejamentoDeCurso/removeDisciplinaPeriodo"""))
   }
}
        

// @LINE:35
case controllers_Assets_at22(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     