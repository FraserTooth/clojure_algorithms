(defn mapper
  [func seq] (reduce #(conj % (func %2)) [] seq))

(println (= [3 4 5 6 7]
            (mapper inc [2 3 4 5 6])))
(println (= (repeat 10 nil)
            (mapper (fn [_] nil) (range 10))))