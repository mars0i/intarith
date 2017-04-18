(ns intarith.imprecise 
  (:require [imprecise.core :as i]
            [clojure.algo.generic.arithmetic :refer :all]
            [clojure.algo.generic.math-functions :refer :all]))

;; Illustrations:

(defn print-equation 
  [op-str x y r]
  (println x op-str y "=" r))

(def a (i/->AInterval 0.5 0.75))
(def b (i/->AInterval 0.1 0.5))

(print-equation "+" a b (+ a b))

(print-equation "/" a b (/ a b))

(def wt (i/->AInterval 79.5 80.5))
(def ht (i/->AInterval 1.795 1.805))
(def bmi (/ wt (sqr ht)))

(print-equation "/bmi/" wt ht bmi)

