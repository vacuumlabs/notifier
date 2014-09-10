(ns notifier.core)

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

(defn handler [req]
  (let [uri (:uri req)]
    (cond
      (= uri "/incidents") (r (get_incs))
      (= uri "/messages") (r (get_msgs 1))
      :else (r uri))))
