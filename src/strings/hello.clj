;; str é a função que declara o tipo de uma função
(ns strings.hello)

;; def é como se fosse a declaração de uma variavel, porem com o valor imutavel
(def saudacoes ;; Como se fosse uma variavel, mas declaro como uma funcao
(str "Olá, " "Mundo")) ;; str é usado para concatena e converte para string
;; str seria comparavel ao toString em java



(defn -main [] ;; função main que é executada assim que  rodarmos clj -M -m strings.core          
( println saudacoes )) ;; println chama a função saudacoes e imprime seu valor

