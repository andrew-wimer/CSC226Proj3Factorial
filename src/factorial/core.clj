;;ANDREW WIMER PROJECT 3 CSC 226 FACTORIAL PROGRAM
;;APRIL 2020

(ns factorial.core
  (:gen-class))
(require '[clojure.edn :as edn])
;;above is the namespace of this program
;;require function loads libraries

;;factorial function.
;;returns 1 if the factorial desired is factorial of 1.
;;if not, the argument is multiplied by each subsequent decremented
;;integer recursively until the argument decrements to 1.
(defn factorial [n]
  (if (= n 1)
    1
    (* n (factorial (- n 1)))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ;;print prompt for an integer
  (println "Enter an integer, 1 or greater. ")

  (def x (read-line))
  ;;x variable value will be user input.
  (println (factorial (edn/read-string x)))
  ;;factorial function is an argument of println function.
  ;;in turn, parse function with argument x is argument of
  ;;factorial function.
  )

