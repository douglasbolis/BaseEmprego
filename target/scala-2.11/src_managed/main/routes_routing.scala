// @SOURCE:/Volumes/xDevel/xdevelsistemas/play/grupo/BaseEmprego/conf/routes
// @HASH:38fc494595846868b08c5b8bf3dc5e3f4946a59b
// @DATE:Tue Nov 11 13:37:35 BRST 2014


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

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
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_AnuncioController_index1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("anuncio"))))
private[this] lazy val controllers_AnuncioController_index1_invoker = createInvoker(
controllers.AnuncioController.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnuncioController", "index", Nil,"GET", """""", Routes.prefix + """anuncio"""))
        

// @LINE:9
private[this] lazy val controllers_AnuncioController_update2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("anuncio/update/"),DynamicPart("uuid", """[^/]+""",true))))
private[this] lazy val controllers_AnuncioController_update2_invoker = createInvoker(
controllers.AnuncioController.update(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnuncioController", "update", Seq(classOf[String]),"GET", """ mestre""", Routes.prefix + """anuncio/update/$uuid<[^/]+>"""))
        

// @LINE:10
private[this] lazy val controllers_AnuncioController_delete3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("anuncio/delete/"),DynamicPart("uuid", """[^/]+""",true))))
private[this] lazy val controllers_AnuncioController_delete3_invoker = createInvoker(
controllers.AnuncioController.delete(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnuncioController", "delete", Seq(classOf[String]),"GET", """""", Routes.prefix + """anuncio/delete/$uuid<[^/]+>"""))
        

// @LINE:11
private[this] lazy val controllers_AnuncioController_add4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("anuncio/add"))))
private[this] lazy val controllers_AnuncioController_add4_invoker = createInvoker(
controllers.AnuncioController.add(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnuncioController", "add", Nil,"GET", """""", Routes.prefix + """anuncio/add"""))
        

// @LINE:12
private[this] lazy val controllers_AnuncioController_addHandler5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("anuncio/add"))))
private[this] lazy val controllers_AnuncioController_addHandler5_invoker = createInvoker(
controllers.AnuncioController.addHandler(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnuncioController", "addHandler", Nil,"POST", """""", Routes.prefix + """anuncio/add"""))
        

// @LINE:13
private[this] lazy val controllers_AnuncioController_updateHandler6_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("anuncio/update"))))
private[this] lazy val controllers_AnuncioController_updateHandler6_invoker = createInvoker(
controllers.AnuncioController.updateHandler(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnuncioController", "updateHandler", Nil,"POST", """""", Routes.prefix + """anuncio/update"""))
        

// @LINE:15
private[this] lazy val controllers_PreRequisitoController_update7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("prerequisito/update/"),DynamicPart("uuid", """[^/]+""",true))))
private[this] lazy val controllers_PreRequisitoController_update7_invoker = createInvoker(
controllers.PreRequisitoController.update(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PreRequisitoController", "update", Seq(classOf[String]),"GET", """ prerequisito""", Routes.prefix + """prerequisito/update/$uuid<[^/]+>"""))
        

// @LINE:16
private[this] lazy val controllers_PreRequisitoController_delete8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("prerequisito/delete/"),DynamicPart("uuid", """[^/]+""",true))))
private[this] lazy val controllers_PreRequisitoController_delete8_invoker = createInvoker(
controllers.PreRequisitoController.delete(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PreRequisitoController", "delete", Seq(classOf[String]),"GET", """""", Routes.prefix + """prerequisito/delete/$uuid<[^/]+>"""))
        

// @LINE:17
private[this] lazy val controllers_PreRequisitoController_add9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("prerequisito/add/"),DynamicPart("mestre_uuid", """[^/]+""",true))))
private[this] lazy val controllers_PreRequisitoController_add9_invoker = createInvoker(
controllers.PreRequisitoController.add(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PreRequisitoController", "add", Seq(classOf[String]),"GET", """""", Routes.prefix + """prerequisito/add/$mestre_uuid<[^/]+>"""))
        

// @LINE:18
private[this] lazy val controllers_PreRequisitoController_addHandler10_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("prerequisito/add"))))
private[this] lazy val controllers_PreRequisitoController_addHandler10_invoker = createInvoker(
controllers.PreRequisitoController.addHandler(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PreRequisitoController", "addHandler", Nil,"POST", """""", Routes.prefix + """prerequisito/add"""))
        

// @LINE:19
private[this] lazy val controllers_PreRequisitoController_updateHandler11_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("prerequisito/update"))))
private[this] lazy val controllers_PreRequisitoController_updateHandler11_invoker = createInvoker(
controllers.PreRequisitoController.updateHandler(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PreRequisitoController", "updateHandler", Nil,"POST", """""", Routes.prefix + """prerequisito/update"""))
        

// @LINE:21
private[this] lazy val controllers_BeneficioController_update12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("beneficio/update/"),DynamicPart("uuid", """[^/]+""",true))))
private[this] lazy val controllers_BeneficioController_update12_invoker = createInvoker(
controllers.BeneficioController.update(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BeneficioController", "update", Seq(classOf[String]),"GET", """ beneficio""", Routes.prefix + """beneficio/update/$uuid<[^/]+>"""))
        

// @LINE:22
private[this] lazy val controllers_BeneficioController_delete13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("beneficio/delete/"),DynamicPart("uuid", """[^/]+""",true))))
private[this] lazy val controllers_BeneficioController_delete13_invoker = createInvoker(
controllers.BeneficioController.delete(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BeneficioController", "delete", Seq(classOf[String]),"GET", """""", Routes.prefix + """beneficio/delete/$uuid<[^/]+>"""))
        

// @LINE:23
private[this] lazy val controllers_BeneficioController_add14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("beneficio/add/"),DynamicPart("mestre_uuid", """[^/]+""",true))))
private[this] lazy val controllers_BeneficioController_add14_invoker = createInvoker(
controllers.BeneficioController.add(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BeneficioController", "add", Seq(classOf[String]),"GET", """""", Routes.prefix + """beneficio/add/$mestre_uuid<[^/]+>"""))
        

// @LINE:24
private[this] lazy val controllers_BeneficioController_addHandler15_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("beneficio/add"))))
private[this] lazy val controllers_BeneficioController_addHandler15_invoker = createInvoker(
controllers.BeneficioController.addHandler(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BeneficioController", "addHandler", Nil,"POST", """""", Routes.prefix + """beneficio/add"""))
        

// @LINE:25
private[this] lazy val controllers_BeneficioController_updateHandler16_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("beneficio/update"))))
private[this] lazy val controllers_BeneficioController_updateHandler16_invoker = createInvoker(
controllers.BeneficioController.updateHandler(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BeneficioController", "updateHandler", Nil,"POST", """""", Routes.prefix + """beneficio/update"""))
        

// @LINE:30
private[this] lazy val controllers_Assets_at17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at17_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """anuncio""","""controllers.AnuncioController.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """anuncio/update/$uuid<[^/]+>""","""controllers.AnuncioController.update(uuid:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """anuncio/delete/$uuid<[^/]+>""","""controllers.AnuncioController.delete(uuid:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """anuncio/add""","""controllers.AnuncioController.add()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """anuncio/add""","""controllers.AnuncioController.addHandler()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """anuncio/update""","""controllers.AnuncioController.updateHandler()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """prerequisito/update/$uuid<[^/]+>""","""controllers.PreRequisitoController.update(uuid:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """prerequisito/delete/$uuid<[^/]+>""","""controllers.PreRequisitoController.delete(uuid:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """prerequisito/add/$mestre_uuid<[^/]+>""","""controllers.PreRequisitoController.add(mestre_uuid:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """prerequisito/add""","""controllers.PreRequisitoController.addHandler()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """prerequisito/update""","""controllers.PreRequisitoController.updateHandler()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """beneficio/update/$uuid<[^/]+>""","""controllers.BeneficioController.update(uuid:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """beneficio/delete/$uuid<[^/]+>""","""controllers.BeneficioController.delete(uuid:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """beneficio/add/$mestre_uuid<[^/]+>""","""controllers.BeneficioController.add(mestre_uuid:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """beneficio/add""","""controllers.BeneficioController.addHandler()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """beneficio/update""","""controllers.BeneficioController.updateHandler()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:7
case controllers_AnuncioController_index1_route(params) => {
   call { 
        controllers_AnuncioController_index1_invoker.call(controllers.AnuncioController.index())
   }
}
        

// @LINE:9
case controllers_AnuncioController_update2_route(params) => {
   call(params.fromPath[String]("uuid", None)) { (uuid) =>
        controllers_AnuncioController_update2_invoker.call(controllers.AnuncioController.update(uuid))
   }
}
        

// @LINE:10
case controllers_AnuncioController_delete3_route(params) => {
   call(params.fromPath[String]("uuid", None)) { (uuid) =>
        controllers_AnuncioController_delete3_invoker.call(controllers.AnuncioController.delete(uuid))
   }
}
        

// @LINE:11
case controllers_AnuncioController_add4_route(params) => {
   call { 
        controllers_AnuncioController_add4_invoker.call(controllers.AnuncioController.add())
   }
}
        

// @LINE:12
case controllers_AnuncioController_addHandler5_route(params) => {
   call { 
        controllers_AnuncioController_addHandler5_invoker.call(controllers.AnuncioController.addHandler())
   }
}
        

// @LINE:13
case controllers_AnuncioController_updateHandler6_route(params) => {
   call { 
        controllers_AnuncioController_updateHandler6_invoker.call(controllers.AnuncioController.updateHandler())
   }
}
        

// @LINE:15
case controllers_PreRequisitoController_update7_route(params) => {
   call(params.fromPath[String]("uuid", None)) { (uuid) =>
        controllers_PreRequisitoController_update7_invoker.call(controllers.PreRequisitoController.update(uuid))
   }
}
        

// @LINE:16
case controllers_PreRequisitoController_delete8_route(params) => {
   call(params.fromPath[String]("uuid", None)) { (uuid) =>
        controllers_PreRequisitoController_delete8_invoker.call(controllers.PreRequisitoController.delete(uuid))
   }
}
        

// @LINE:17
case controllers_PreRequisitoController_add9_route(params) => {
   call(params.fromPath[String]("mestre_uuid", None)) { (mestre_uuid) =>
        controllers_PreRequisitoController_add9_invoker.call(controllers.PreRequisitoController.add(mestre_uuid))
   }
}
        

// @LINE:18
case controllers_PreRequisitoController_addHandler10_route(params) => {
   call { 
        controllers_PreRequisitoController_addHandler10_invoker.call(controllers.PreRequisitoController.addHandler())
   }
}
        

// @LINE:19
case controllers_PreRequisitoController_updateHandler11_route(params) => {
   call { 
        controllers_PreRequisitoController_updateHandler11_invoker.call(controllers.PreRequisitoController.updateHandler())
   }
}
        

// @LINE:21
case controllers_BeneficioController_update12_route(params) => {
   call(params.fromPath[String]("uuid", None)) { (uuid) =>
        controllers_BeneficioController_update12_invoker.call(controllers.BeneficioController.update(uuid))
   }
}
        

// @LINE:22
case controllers_BeneficioController_delete13_route(params) => {
   call(params.fromPath[String]("uuid", None)) { (uuid) =>
        controllers_BeneficioController_delete13_invoker.call(controllers.BeneficioController.delete(uuid))
   }
}
        

// @LINE:23
case controllers_BeneficioController_add14_route(params) => {
   call(params.fromPath[String]("mestre_uuid", None)) { (mestre_uuid) =>
        controllers_BeneficioController_add14_invoker.call(controllers.BeneficioController.add(mestre_uuid))
   }
}
        

// @LINE:24
case controllers_BeneficioController_addHandler15_route(params) => {
   call { 
        controllers_BeneficioController_addHandler15_invoker.call(controllers.BeneficioController.addHandler())
   }
}
        

// @LINE:25
case controllers_BeneficioController_updateHandler16_route(params) => {
   call { 
        controllers_BeneficioController_updateHandler16_invoker.call(controllers.BeneficioController.updateHandler())
   }
}
        

// @LINE:30
case controllers_Assets_at17_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at17_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     