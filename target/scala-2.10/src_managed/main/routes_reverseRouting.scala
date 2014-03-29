// @SOURCE:C:/Users/Brendha/workspace/projeto1/conf/routes
// @HASH:9e46e4e632a85ecfbac4e388f611a3d42370046a
// @DATE:Fri Mar 28 21:39:30 GMT-03:00 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
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
                          

// @LINE:35
class ReverseAssets {
    

// @LINE:35
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:6
class ReverseApplication {
    

// @LINE:27
// @LINE:16
def planejamentoDeCurso(): Call = {
   () match {
// @LINE:16
case () if true => Call("GET", _prefix + { _defaultPrefix } + "planejamentoDeCurso")
                                                        
// @LINE:27
case () if true => Call("GET", _prefix + { _defaultPrefix } + "planejamentoDeCurso")
                                                        
   }
}
                                                

// @LINE:30
// @LINE:21
def criaPeriodo(): Call = {
   () match {
// @LINE:21
case () if true => Call("POST", _prefix + { _defaultPrefix } + "criaPeriodo")
                                                        
// @LINE:30
case () if true => Call("POST", _prefix + { _defaultPrefix } + "planejamentoDeCurso/criaPeriodo")
                                                        
   }
}
                                                

// @LINE:28
// @LINE:17
def grade(): Call = {
   () match {
// @LINE:17
case () if true => Call("GET", _prefix + { _defaultPrefix } + "grade")
                                                        
// @LINE:28
case () if true => Call("GET", _prefix + { _defaultPrefix } + "planejamentoDeCurso/grade")
                                                        
   }
}
                                                

// @LINE:32
// @LINE:23
def removeDisciplinaPeriodo(): Call = {
   () match {
// @LINE:23
case () if true => Call("POST", _prefix + { _defaultPrefix } + "removeDisciplinaPeriodo")
                                                        
// @LINE:32
case () if true => Call("POST", _prefix + { _defaultPrefix } + "planejamentoDeCurso/removeDisciplinaPeriodo")
                                                        
   }
}
                                                

// @LINE:31
// @LINE:22
def adicionaDisciplinaEmPeriodo(): Call = {
   () match {
// @LINE:22
case () if true => Call("POST", _prefix + { _defaultPrefix } + "adicionaDisciplinaEmPeriodo")
                                                        
// @LINE:31
case () if true => Call("POST", _prefix + { _defaultPrefix } + "planejamentoDeCurso/adicionaDisciplinaEmPeriodo")
                                                        
   }
}
                                                

// @LINE:29
// @LINE:20
def mostraDisciplinas(): Call = {
   () match {
// @LINE:20
case () if true => Call("GET", _prefix + { _defaultPrefix } + "mostraDisciplinas")
                                                        
// @LINE:29
case () if true => Call("GET", _prefix + { _defaultPrefix } + "planejamentoDeCurso/mostraDisciplinas")
                                                        
   }
}
                                                

// @LINE:19
def planejamentoDeCursoNovo(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "planejamentoDeCursoNovo")
}
                                                

// @LINE:24
// @LINE:6
def index(): Call = {
   () match {
// @LINE:6
case () if true => Call("GET", _prefix)
                                                        
// @LINE:24
case () if true => Call("GET", _prefix)
                                                        
   }
}
                                                

// @LINE:18
def planoNovo(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "planoNovo")
}
                                                
    
}
                          
}
                  


// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
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
              

// @LINE:35
class ReverseAssets {
    

// @LINE:35
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:6
class ReverseApplication {
    

// @LINE:27
// @LINE:16
def planejamentoDeCurso : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.planejamentoDeCurso",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "planejamentoDeCurso"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "planejamentoDeCurso"})
      }
      }
   """
)
                        

// @LINE:30
// @LINE:21
def criaPeriodo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.criaPeriodo",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "criaPeriodo"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "planejamentoDeCurso/criaPeriodo"})
      }
      }
   """
)
                        

// @LINE:28
// @LINE:17
def grade : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.grade",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "grade"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "planejamentoDeCurso/grade"})
      }
      }
   """
)
                        

// @LINE:32
// @LINE:23
def removeDisciplinaPeriodo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.removeDisciplinaPeriodo",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "removeDisciplinaPeriodo"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "planejamentoDeCurso/removeDisciplinaPeriodo"})
      }
      }
   """
)
                        

// @LINE:31
// @LINE:22
def adicionaDisciplinaEmPeriodo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.adicionaDisciplinaEmPeriodo",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "adicionaDisciplinaEmPeriodo"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "planejamentoDeCurso/adicionaDisciplinaEmPeriodo"})
      }
      }
   """
)
                        

// @LINE:29
// @LINE:20
def mostraDisciplinas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.mostraDisciplinas",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mostraDisciplinas"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "planejamentoDeCurso/mostraDisciplinas"})
      }
      }
   """
)
                        

// @LINE:19
def planejamentoDeCursoNovo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.planejamentoDeCursoNovo",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "planejamentoDeCursoNovo"})
      }
   """
)
                        

// @LINE:24
// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      }
   """
)
                        

// @LINE:18
def planoNovo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.planoNovo",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "planoNovo"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
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
                          

// @LINE:35
class ReverseAssets {
    

// @LINE:35
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
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
                      

// @LINE:21
def criaPeriodo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.criaPeriodo(), HandlerDef(this, "controllers.Application", "criaPeriodo", Seq(), "POST", """""", _prefix + """criaPeriodo""")
)
                      

// @LINE:17
def grade(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.grade(), HandlerDef(this, "controllers.Application", "grade", Seq(), "GET", """""", _prefix + """grade""")
)
                      

// @LINE:23
def removeDisciplinaPeriodo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.removeDisciplinaPeriodo(), HandlerDef(this, "controllers.Application", "removeDisciplinaPeriodo", Seq(), "POST", """""", _prefix + """removeDisciplinaPeriodo""")
)
                      

// @LINE:22
def adicionaDisciplinaEmPeriodo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.adicionaDisciplinaEmPeriodo(), HandlerDef(this, "controllers.Application", "adicionaDisciplinaEmPeriodo", Seq(), "POST", """""", _prefix + """adicionaDisciplinaEmPeriodo""")
)
                      

// @LINE:20
def mostraDisciplinas(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.mostraDisciplinas(), HandlerDef(this, "controllers.Application", "mostraDisciplinas", Seq(), "GET", """""", _prefix + """mostraDisciplinas""")
)
                      

// @LINE:19
def planejamentoDeCursoNovo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.planejamentoDeCursoNovo(), HandlerDef(this, "controllers.Application", "planejamentoDeCursoNovo", Seq(), "GET", """""", _prefix + """planejamentoDeCursoNovo""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:18
def planoNovo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.planoNovo(), HandlerDef(this, "controllers.Application", "planoNovo", Seq(), "GET", """""", _prefix + """planoNovo""")
)
                      
    
}
                          
}
        
    