(ns cljs-app.page
  (:require-macros [hiccups.core :as hiccups :refer [html]])
  (:require [hiccups.runtime :as hiccupsrt]))

(hiccups/defhtml tpl []
  [:div.page
   [:a {:href "waww.io"}]])
