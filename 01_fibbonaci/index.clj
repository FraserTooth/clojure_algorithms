; #(take % ...all fib numbers.)

; (fn fibo
;   ([] (fib 1 1))
;   ([a b] (+ a b)))


(defn add [a b]
  (+ a b))

(def penultimate
  (comp second reverse))

(defn fib [n]
  (nth
   (iterate #(conj % (+ (last %) (penultimate %))) [1 1])
   (- n 2)))

(println (= (fib 3) '(1 1 2)))
(println (= (fib 6) '(1 1 2 3 5 8)))
(println (= (fib 8) '(1 1 2 3 5 8 13 21)))