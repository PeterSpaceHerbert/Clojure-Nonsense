;This program allows the user to make their own Fibonacci Sequence

(defn main []
  (println "Please input two numbers to start a psuedo-fibonacci sequence: " )
  (let [num1String (read-line) num2String (read-line) num1 (read-string num1String) num2 (read-string num2String)]
    (fibonacci num1 num2))
    (println "Ending program...")
    (print "Final fibonacci in reverse order: ")
    (print (rest fib-seq))
)

(def fib-seq '())

(defn fibonacci [num1 num2]
  (def sum (+ num1 num2))
  (println "The new value generated is" sum)
  (conj fib-seq :sum)
  (println "Go again? y/n:")
  (let [goAgain (read-line)]
    (if (= goAgain "y")
      (recur num2 sum))))

(main)
