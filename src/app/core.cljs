(ns app.core
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]))


(defn header
      []
      [:div
       [:h1 "A template for reagent apps"]])

(defn app []
      [:div
       [header]])

(defn ^:dev/after-load renderApp
      []
      (rdom/render [app]
                   (.getElementById js/document "app")))

(defn ^:export init
      []
      (renderApp))
