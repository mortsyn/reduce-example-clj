(ns reduce-example.core)

(defn reduce-sum [total coll]
  (reduce + total coll))

(defn recursive-sum [total coll]
  (loop [sum total
         nums coll]
    (if (empty? nums)
      sum
      (recur (+ sum (first nums)) (rest nums)))))
