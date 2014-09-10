(ns notifier.core
    (:require [compojure.core :refer :all]
            [compojure.route :as route]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn get_msgs [inc_id]
  (str "TODO: list of messages for incident " inc_id))

(defn get_incs []
  "TODO: list of incidents")

(defn r [text]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body text})


(defroutes app
  (GET "/incidents" [] (r (get_incs)))
  (GET "/messages" [] (r (get_msgs 1)))
  (route/not-found "<h1>Page not found</h1>"))
