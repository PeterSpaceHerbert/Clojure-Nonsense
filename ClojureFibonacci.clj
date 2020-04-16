;This program allows the user to make their own Psuedo - Fibonacci Sequence

(defn main []
  (print "Please input two numbers to start a psuedo-fibonacci sequence (Input one, then press enter, then input the other.): " )
  (let [num1-string (read-line) num2-string (read-line) num1 (read-string num1-string) num2 (read-string num2-string)]
  ;Gets input from keyboard
  ;Converts input from String to Long
    (fibonacci num1 num2 (conj (conj [] num1) num2))))
    ;(fibonacci num1 num2 (conj (conj '() num1) num2))))
    ;The above also works. The final sequence will just print backwards

;Pre-conditions: num1 & num2 are some Long value
;representing two integer values in a Fibonacci-like sequence
;num-seq is a list or vector containing a Fibonacci-like sequence
(defn fibonacci [num1 num2 num-seq]
  (def sum (+ num1 num2))
  (def fib-list (conj num-seq sum))
  (prompt sum)
  (let [goAgain (read-line)]
    (if (= goAgain "y")
      (recur num2 sum fib-list)
      (output fib-list))))
;Post-conditions: A fibonacci sequence is generated and fills a list/vector
;Nothing is changed as side effects don't exist

;Pre-conditions: value is some Long
(defn prompt [value]
(println "The new value generated is" value)
(println "Generate another value? y/n:"))
;Post-conditions: A prompt to the suer is output asking if they wish to run the program again.

;Pre-conditions: num-seq is some List/Vector containing a psuedo-Fibonacci sequence
(defn output [num-seq]
  (println "Ending program...")
  (print "Psuedo-Fibonacci sequence generated: ")
  (print num-seq))
;Post-conditions: num-seq's contents are printed to the screen.

(main)
