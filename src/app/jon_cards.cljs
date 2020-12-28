(ns app.jon-cards
  (:require [reagent.core :as r]
            [devcards.core :as dc :refer [defcard deftest]]
            [app.hello :refer [click-counter hello]]))

(defcard hello-card
  (dc/reagent hello))
