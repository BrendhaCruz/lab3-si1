// @SOURCE:C:/Users/Brendha/workspace/projeto/conf/routes
// @HASH:20885232f584dc7de7f643a8b88c4ad11fa746b1
// @DATE:Sat Mar 22 10:46:25 GMT-03:00 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
package controllers {

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseAcesso {
    

// @LINE:14
// @LINE:13
def criaUsuario(): Call = {
   () match {
// @LINE:13
case () if true => Call("GET", _prefix + { _defaultPrefix } + "criaUsuario")
                                                        
// @LINE:14
case () if true => Call("POST", _prefix + { _defaultPrefix } + "criaUsuario")
                                                        
   }
}
                                                

// @LINE:15
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:12
def cadastraUsuario(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "cadastro")
}
                                                

// @LINE:11
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:10
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:24
class ReverseAssets {
    

// @LINE:24
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:6
class ReverseApplication {
    

// @LINE:16
def planejamentoDeCurso(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "planejamentoDeCurso")
}
                                                

// @LINE:19
def criaPeriodo(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "criaPeriodo")
}
                                                

// @LINE:17
def grade(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "grade")
}
                                                

// @LINE:21
def removeDisciplinaPeriodo(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "removeDisciplinaPeriodo")
}
                                                

// @LINE:20
def adicionaDisciplinaEmPeriodo(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "adicionaDisciplinaEmPeriodo")
}
                                                

// @LINE:18
def mostraDisciplinas(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "mostraDisciplinas")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
package controllers.javascript {

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseAcesso {
    

// @LINE:14
// @LINE:13
def criaUsuario : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Acesso.criaUsuario",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "criaUsuario"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "criaUsuario"})
      }
      }
   """
)
                        

// @LINE:15
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Acesso.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:12
def cadastraUsuario : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Acesso.cadastraUsuario",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastro"})
      }
   """
)
                        

// @LINE:11
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Acesso.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:10
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Acesso.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:24
class ReverseAssets {
    

// @LINE:24
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:6
class ReverseApplication {
    

// @LINE:16
def planejamentoDeCurso : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.planejamentoDeCurso",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "planejamentoDeCurso"})
      }
   """
)
                        

// @LINE:19
def criaPeriodo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.criaPeriodo",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "criaPeriodo"})
      }
   """
)
                        

// @LINE:17
def grade : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.grade",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "grade"})
      }
   """
)
                        

// @LINE:21
def removeDisciplinaPeriodo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.removeDisciplinaPeriodo",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "removeDisciplinaPeriodo"})
      }
   """
)
                        

// @LINE:20
def adicionaDisciplinaEmPeriodo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.adicionaDisciplinaEmPeriodo",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "adicionaDisciplinaEmPeriodo"})
      }
   """
)
                        

// @LINE:18
def mostraDisciplinas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.mostraDisciplinas",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mostraDisciplinas"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
package controllers.ref {


// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseAcesso {
    

// @LINE:13
def criaUsuario(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Acesso.criaUsuario(), HandlerDef(this, "controllers.Acesso", "criaUsuario", Seq(), "GET", """""", _prefix + """criaUsuario""")
)
                      

// @LINE:15
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Acesso.logout(), HandlerDef(this, "controllers.Acesso", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:12
def cadastraUsuario(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Acesso.cadastraUsuario(), HandlerDef(this, "controllers.Acesso", "cadastraUsuario", Seq(), "GET", """""", _prefix + """cadastro""")
)
                      

// @LINE:11
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Acesso.authenticate(), HandlerDef(this, "controllers.Acesso", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:10
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Acesso.login(), HandlerDef(this, "controllers.Acesso", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:24
class ReverseAssets {
    

// @LINE:24
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:6
class ReverseApplication {
    

// @LINE:16
def planejamentoDeCurso(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.planejamentoDeCurso(), HandlerDef(this, "controllers.Application", "planejamentoDeCurso", Seq(), "GET", """""", _prefix + """planejamentoDeCurso""")
)
                      

// @LINE:19
def criaPeriodo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.criaPeriodo(), HandlerDef(this, "controllers.Application", "criaPeriodo", Seq(), "POST", """""", _prefix + """criaPeriodo""")
)
                      

// @LINE:17
def grade(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.grade(), HandlerDef(this, "controllers.Application", "grade", Seq(), "GET", """""", _prefix + """grade""")
)
                      

// @LINE:21
def removeDisciplinaPeriodo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.removeDisciplinaPeriodo(), HandlerDef(this, "controllers.Application", "removeDisciplinaPeriodo", Seq(), "POST", """""", _prefix + """removeDisciplinaPeriodo""")
)
                      

// @LINE:20
def adicionaDisciplinaEmPeriodo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.adicionaDisciplinaEmPeriodo(), HandlerDef(this, "controllers.Application", "adicionaDisciplinaEmPeriodo", Seq(), "POST", """""", _prefix + """adicionaDisciplinaEmPeriodo""")
)
                      

// @LINE:18
def mostraDisciplinas(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.mostraDisciplinas(), HandlerDef(this, "controllers.Application", "mostraDisciplinas", Seq(), "GET", """""", _prefix + """mostraDisciplinas""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    