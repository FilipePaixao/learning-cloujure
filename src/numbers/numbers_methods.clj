(ns numbers.numbers-methods)

(def number 4)
(def number2 2)

(defn sum [a b]
(+ a b))

(defn multiply [a b]
(* a b))



(defn -main []
(println(sum number number2))
(println (multiply number2 number))
)