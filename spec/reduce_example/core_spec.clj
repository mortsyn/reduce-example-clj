(ns reduce-example.core-spec
  (:require [speclj.core :refer :all]
            [reduce-example.core :refer :all]))

(describe "reduce"

  (context "built-in"

    (it "sums numbers in a list"
      (should= 15 (reduce-sum 0 [1 2 3 4 5])))

  (context "recursive"

    (it "also sums up numbers in a list"
      (should= 15 (recursive-sum 0 [1 2 3 4 5])))))
