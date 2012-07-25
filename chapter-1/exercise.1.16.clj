;Design a procedure that evolves an iterative exponentiation process that uses successive squaring and 
;uses a logarithmic number of steps, as does fast-expt. (Hint: Using the observation that (b^n/2)ˆ2 = (bˆ2) ˆn/2),
;keep, along with the exponent n and the base b, an aditional state variable a, and define the state transformation,
;in such a way that the product abˆn is unchanged from state to state. At the beginning of the process a is taken to
;be 1, and the answer is given by the value of a at the end process. In general, the technique of defining an 
; invariant quantity that remains unchanged from state to state is a powerful way to think about design of 
; iterative algorithms.)

; I'm not sure what's is "invariant quantity".

; First attempt: Create a procedure that resolves the even cases of exponentiations.

(defn expt
 [b n]
    (expt-iterative b n 1))
    
(defn expt-iterative
    [b n a]
    (cond (= n 1) a
          (= a 1) (expt-iterative b (/ n 2) (square b))
          :else   (expt-iterative b (/ n 2) (square a))))
          

(defn square
    [b]
    (* b b))
    
    
; this algorithm work's fine for power of 2

(expt-iterative 6 4 1)
(expt-iterative 6 (/ 4 2) (square 6))
(expt-iterative 6 2 36)
(expt-iterative 6 (/ 2 2) (square 36))
(expt-iterative 6 1 1296)
1296


; change to works with non power of 2 values

(defn expt-iterative
    [b n a]
    (cond (= n 1) a
          (= a 1)   (expt-iterative b (/ n 2) (square b))
          (even? n) (expt-iterative b (/ n 2) (square a)))
          :else (* b (expt-iterative b (- n 1) a)))
          
(expt-iterative 5 12 1)
(expt-iterative 5 (/ 12 2) (square 5))
(expt-iterative 5 6 25)
(expt-iterative 5 (/ 6 2) (square 25))
(expt-iterative 5 3 625)
(* 5 (expt-iterative 5 2 625))
(* 5 (expt-iterative 5 1 390625))
(* 5 390625)

; it doesn't works. :(

; second attempt

(defn expt-iterative
    [b n a]
    (cond (= n 0) a
          (even? n) (expt-iterative square(b) (/ n 2) a))
          :else (expt-iterative b (- n 1) (* a b)))
          

(expt-iterative 5 12 1)
(expt-iterative square(5) (/ 12 2) 1)
(expt-iterative 25 6 1)
(expt-iterative square(25) (/ 6 2) 1)
(expt-iterative 625 3 1)
(expt-iterative 625 (- 3 1) (* 1 625))
(expt-iterative 625 2 625)
(expt-iterative (square 625) (/ 2 2) 625)
(expt-iterative 390625 1 625)
(expt-iterative 390625 (- 1 1) (* 625 390625))
(expt-iterative 390625 0 244140625)
244140625

;i change the algorithm based on an answer found in web-site 
;http://www.billthelizard.com/2010/01/sicp-exercise-116-fast-exponentiation.html

; my mistake was to use the (b^n/2) ^2 instead of (bˆ2)n/2.
