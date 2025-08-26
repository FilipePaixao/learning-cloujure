(ns strings.strings-methods ;; no namespace oque vem a esquerda deve ser o nome do diretorio e a direita o nome do arquivo
  (:require [clojure.string :as str]))

(def myName "filipe" )
(def spacedString "      Teste trim method")
(def myCompleteName "Filipe,Paixão")


(defn splitStrings [params]
(println(str/split params #","))) ;; Separa dois caracters por virgula e transforma em um array.
;; #"," é uma regex que serve para definir qual o parametro da separação do caracteres

(def myNameCapitalize
(str/capitalize myName)) ;; Transforma o primeiro caracter em upper case

(def normalizeString
(str/trim spacedString))

(def upper-case-example
  (str/upper-case myName))

 (def lower-case-example
 (str/lower-case myName)) 

(def concat 
(str "My name is " myNameCapitalize))



(defn -main []
  (println upper-case-example)
  (println lower-case-example)
  (println concat)
  (println normalizeString)
  (splitStrings myCompleteName)
  )
