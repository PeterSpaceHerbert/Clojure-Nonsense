(type 'a)   ;Makes a bindable
(def a "This") ;binds This to a
(println a) ;prints a
a ;shows the value of a

(type 'add) ;Makes add bindable
(defn add [num1 num2] (+ num1 num2)) ;declares add as a function that adds 2 numbers
;uses 2 arguments, num1 and num2, decleration happens in the square box

(add 5 10) ;add in action

;Editing is tedious, it seems as if all work needs to be erased before rewriting.
;I keep getting errors where functions I define are use old versions of themselves until I erase them all and redefine them.

(type 'numbers)
(def numbers [1 2 3 4 5 6 7 8 9]) ;Defines numbers as a list of numbers
(conj numbers(add (get numbers 0) (get numbers 8)))

(defn fact [n] ;Defines fact as a function
 (if (== n 1)  ;Checks if n is = to 1
  n            ;returns n if true
  (* n (fact (- n 1)))))  ;recurses if false

(fact 5)