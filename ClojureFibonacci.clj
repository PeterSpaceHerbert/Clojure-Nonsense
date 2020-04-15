;This program allows the user to make their own Fibonacci Sequence

(defn main []
  (println "Please input two numbers to start a psuedo-fibonacci sequence: " )
  (def fib-seq '())
  (let [num1String (read-line) num2String (read-line) num1 (read-string num1String) num2 (read-string num2String)]
    (fibonacci num1 num2 fib-seq)))

(defn fibonacci [num1 num2 num-seq]
  (def sum (+ num1 num2))
  (def fib-list (conj num-seq sum))
  (println "The new value generated is" sum)
  (println "Go again? y/n:")
  (let [goAgain (read-line)]
    (if (= goAgain "y")
      (recur num2 sum fib-list)
      (output fib-list))))

(defn output [num-seq]
  (println "Ending program...")
  (print "Psuedo-Fibonacci sequence generated:")
  (print num-seq))

(main)
