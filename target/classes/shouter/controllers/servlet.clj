(do (clojure.core/ns shouter.controllers.servlet (:require ring.util.servlet shouter.controllers.shouts) (:gen-class :extends javax.servlet.http.HttpServlet)) (ring.util.servlet/defservice (clojure.core/fn [request__1548__auto__] (shouter.controllers.shouts/app (clojure.core/assoc request__1548__auto__ :path-info (.getPathInfo (:servlet-request request__1548__auto__)) :context (.getContextPath (:servlet-request request__1548__auto__)))))))
