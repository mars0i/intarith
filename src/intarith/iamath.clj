(ns intarith.iamath
  (:import [net.sourceforge.interval.ia_math RealInterval IAMath]))

;; convenience wrappers

(defn make-interval
  [lo hi]
  (RealInterval. lo hi))

;; also:
;; (.lo interval)
;; (.hi interval)

(defn add
  [interval1 interval2]
  (IAMath/add interval1 interval2))

(defn sub
  [interval1 interval2]
  (IAMath/sub interval1 interval2))

(defn mul
  [interval1 interval2]
  (IAMath/mul interval1 interval2))

(defn div
  [interval1 interval2]
  (IAMath/div interval1 interval2))

(defn intersection
  [interval1 interval2]
  (IAMath/intersect interval1 interval2))
