;; str é a função que declara o tipo de uma função
(ns strings.core)

;; def é como se fosse a declaração de uma variavel, porem com o valor imutavel
(def saudacoes ;; Como se fosse uma variavel, mas declaro como uma funcao, faço a tipagem e declaro um valor
(str "Olá, " "Mundo"))

(defn -main [] 
( println saudacoes ))