// @SOURCE:/Volumes/xDevel/xdevelsistemas/play/grupo/BaseEmprego/conf/routes
// @HASH:38fc494595846868b08c5b8bf3dc5e3f4946a59b
// @DATE:Tue Nov 11 13:37:35 BRST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:30
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
package controllers {

// @LINE:30
class ReverseAssets {


// @LINE:30
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
class ReversePreRequisitoController {


// @LINE:18
def addHandler(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "prerequisito/add")
}
                        

// @LINE:16
def delete(uuid:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "prerequisito/delete/" + implicitly[PathBindable[String]].unbind("uuid", dynamicString(uuid)))
}
                        

// @LINE:17
def add(mestre_uuid:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "prerequisito/add/" + implicitly[PathBindable[String]].unbind("mestre_uuid", dynamicString(mestre_uuid)))
}
                        

// @LINE:19
def updateHandler(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "prerequisito/update")
}
                        

// @LINE:15
def update(uuid:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "prerequisito/update/" + implicitly[PathBindable[String]].unbind("uuid", dynamicString(uuid)))
}
                        

}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
class ReverseAnuncioController {


// @LINE:12
def addHandler(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "anuncio/add")
}
                        

// @LINE:11
def add(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "anuncio/add")
}
                        

// @LINE:10
def delete(uuid:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "anuncio/delete/" + implicitly[PathBindable[String]].unbind("uuid", dynamicString(uuid)))
}
                        

// @LINE:13
def updateHandler(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "anuncio/update")
}
                        

// @LINE:9
def update(uuid:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "anuncio/update/" + implicitly[PathBindable[String]].unbind("uuid", dynamicString(uuid)))
}
                        

// @LINE:7
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "anuncio")
}
                        

}
                          

// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
class ReverseBeneficioController {


// @LINE:24
def addHandler(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "beneficio/add")
}
                        

// @LINE:22
def delete(uuid:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "beneficio/delete/" + implicitly[PathBindable[String]].unbind("uuid", dynamicString(uuid)))
}
                        

// @LINE:23
def add(mestre_uuid:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "beneficio/add/" + implicitly[PathBindable[String]].unbind("mestre_uuid", dynamicString(mestre_uuid)))
}
                        

// @LINE:25
def updateHandler(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "beneficio/update")
}
                        

// @LINE:21
def update(uuid:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "beneficio/update/" + implicitly[PathBindable[String]].unbind("uuid", dynamicString(uuid)))
}
                        

}
                          
}
                  


// @LINE:30
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:30
class ReverseAssets {


// @LINE:30
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
class ReversePreRequisitoController {


// @LINE:18
def addHandler : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PreRequisitoController.addHandler",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "prerequisito/add"})
      }
   """
)
                        

// @LINE:16
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PreRequisitoController.delete",
   """
      function(uuid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "prerequisito/delete/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("uuid", encodeURIComponent(uuid))})
      }
   """
)
                        

// @LINE:17
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PreRequisitoController.add",
   """
      function(mestre_uuid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "prerequisito/add/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("mestre_uuid", encodeURIComponent(mestre_uuid))})
      }
   """
)
                        

// @LINE:19
def updateHandler : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PreRequisitoController.updateHandler",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "prerequisito/update"})
      }
   """
)
                        

// @LINE:15
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PreRequisitoController.update",
   """
      function(uuid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "prerequisito/update/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("uuid", encodeURIComponent(uuid))})
      }
   """
)
                        

}
              

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
class ReverseAnuncioController {


// @LINE:12
def addHandler : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnuncioController.addHandler",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "anuncio/add"})
      }
   """
)
                        

// @LINE:11
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnuncioController.add",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "anuncio/add"})
      }
   """
)
                        

// @LINE:10
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnuncioController.delete",
   """
      function(uuid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "anuncio/delete/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("uuid", encodeURIComponent(uuid))})
      }
   """
)
                        

// @LINE:13
def updateHandler : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnuncioController.updateHandler",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "anuncio/update"})
      }
   """
)
                        

// @LINE:9
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnuncioController.update",
   """
      function(uuid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "anuncio/update/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("uuid", encodeURIComponent(uuid))})
      }
   """
)
                        

// @LINE:7
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnuncioController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "anuncio"})
      }
   """
)
                        

}
              

// @LINE:6
class ReverseApplication {


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
              

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
class ReverseBeneficioController {


// @LINE:24
def addHandler : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BeneficioController.addHandler",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "beneficio/add"})
      }
   """
)
                        

// @LINE:22
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BeneficioController.delete",
   """
      function(uuid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "beneficio/delete/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("uuid", encodeURIComponent(uuid))})
      }
   """
)
                        

// @LINE:23
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BeneficioController.add",
   """
      function(mestre_uuid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "beneficio/add/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("mestre_uuid", encodeURIComponent(mestre_uuid))})
      }
   """
)
                        

// @LINE:25
def updateHandler : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BeneficioController.updateHandler",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "beneficio/update"})
      }
   """
)
                        

// @LINE:21
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BeneficioController.update",
   """
      function(uuid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "beneficio/update/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("uuid", encodeURIComponent(uuid))})
      }
   """
)
                        

}
              
}
        


// @LINE:30
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:30
class ReverseAssets {


// @LINE:30
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
class ReversePreRequisitoController {


// @LINE:18
def addHandler(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PreRequisitoController.addHandler(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PreRequisitoController", "addHandler", Seq(), "POST", """""", _prefix + """prerequisito/add""")
)
                      

// @LINE:16
def delete(uuid:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PreRequisitoController.delete(uuid), HandlerDef(this.getClass.getClassLoader, "", "controllers.PreRequisitoController", "delete", Seq(classOf[String]), "GET", """""", _prefix + """prerequisito/delete/$uuid<[^/]+>""")
)
                      

// @LINE:17
def add(mestre_uuid:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PreRequisitoController.add(mestre_uuid), HandlerDef(this.getClass.getClassLoader, "", "controllers.PreRequisitoController", "add", Seq(classOf[String]), "GET", """""", _prefix + """prerequisito/add/$mestre_uuid<[^/]+>""")
)
                      

// @LINE:19
def updateHandler(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PreRequisitoController.updateHandler(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PreRequisitoController", "updateHandler", Seq(), "POST", """""", _prefix + """prerequisito/update""")
)
                      

// @LINE:15
def update(uuid:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PreRequisitoController.update(uuid), HandlerDef(this.getClass.getClassLoader, "", "controllers.PreRequisitoController", "update", Seq(classOf[String]), "GET", """ prerequisito""", _prefix + """prerequisito/update/$uuid<[^/]+>""")
)
                      

}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
class ReverseAnuncioController {


// @LINE:12
def addHandler(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnuncioController.addHandler(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnuncioController", "addHandler", Seq(), "POST", """""", _prefix + """anuncio/add""")
)
                      

// @LINE:11
def add(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnuncioController.add(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnuncioController", "add", Seq(), "GET", """""", _prefix + """anuncio/add""")
)
                      

// @LINE:10
def delete(uuid:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnuncioController.delete(uuid), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnuncioController", "delete", Seq(classOf[String]), "GET", """""", _prefix + """anuncio/delete/$uuid<[^/]+>""")
)
                      

// @LINE:13
def updateHandler(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnuncioController.updateHandler(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnuncioController", "updateHandler", Seq(), "POST", """""", _prefix + """anuncio/update""")
)
                      

// @LINE:9
def update(uuid:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnuncioController.update(uuid), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnuncioController", "update", Seq(classOf[String]), "GET", """ mestre""", _prefix + """anuncio/update/$uuid<[^/]+>""")
)
                      

// @LINE:7
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnuncioController.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnuncioController", "index", Seq(), "GET", """""", _prefix + """anuncio""")
)
                      

}
                          

// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
class ReverseBeneficioController {


// @LINE:24
def addHandler(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BeneficioController.addHandler(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BeneficioController", "addHandler", Seq(), "POST", """""", _prefix + """beneficio/add""")
)
                      

// @LINE:22
def delete(uuid:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BeneficioController.delete(uuid), HandlerDef(this.getClass.getClassLoader, "", "controllers.BeneficioController", "delete", Seq(classOf[String]), "GET", """""", _prefix + """beneficio/delete/$uuid<[^/]+>""")
)
                      

// @LINE:23
def add(mestre_uuid:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BeneficioController.add(mestre_uuid), HandlerDef(this.getClass.getClassLoader, "", "controllers.BeneficioController", "add", Seq(classOf[String]), "GET", """""", _prefix + """beneficio/add/$mestre_uuid<[^/]+>""")
)
                      

// @LINE:25
def updateHandler(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BeneficioController.updateHandler(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BeneficioController", "updateHandler", Seq(), "POST", """""", _prefix + """beneficio/update""")
)
                      

// @LINE:21
def update(uuid:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BeneficioController.update(uuid), HandlerDef(this.getClass.getClassLoader, "", "controllers.BeneficioController", "update", Seq(classOf[String]), "GET", """ beneficio""", _prefix + """beneficio/update/$uuid<[^/]+>""")
)
                      

}
                          
}
        
    