(ns conduit.views.auth
  (:require [conduit.views.components :refer [large-input]]))

(defn page []
  (let []
    (fn []
      [:div.auth-page
       [:div.container.page
        [:div.row
         [:div.col-md-6.offset-md-3.col-xs-12
          [:h1.text-xs-center "Log in"]
          [:p.text-xs-center [:a {:href "#/signup"} "Don't have an account?"]]
          [:ul.error-messages
           [:li "Bad credentials"]]
          [:form
           [large-input {:placeholder "Email"}]
           [large-input {:type :password :placeholder "Password"}]
           [:buton.btn.btn-lg.btn-primary.pull-xs-right "Log in"]]]]]])))