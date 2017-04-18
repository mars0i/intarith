(ns intarith.propaganda
 (:use [propaganda.intervals.common]))

(defn print-equation 
  [op-str x y r]
  (println x op-str y "=" r))

(def a (->Interval 0.5 0.75))
(def b (->Interval 0.1 0.65))
(print-equation "intersect" a b (intersect-intervals a b))

(def wt (->Interval 79.5 80.5))
(def ht (->Interval 1.795 1.805))
(print-equation "bmi" wt ht (div-interval wt 
                                          (square-interval ht)))

