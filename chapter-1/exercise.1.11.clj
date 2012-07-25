;A function f is defined by the rule that 
 ;   f(n) = n if n < 3 
 ;   f(n) = f(n - 1) + 2.f(n - 2) + 3.f(n - 3) if n >= 3
    
; Write a procedure that computes f by means of a recursive process. 
; Write a procedure that computes f by means of an iterative process.

(defn recursive-f
  [n]
  (if (< n 3) n
      (+ (recursive-f (- n 1)) (* 2 (recursive-f (- n 2))) (* 3 (recursive-f (- n 3))))))
      

; This is a substitution model of a recursive process:
      
 (recursive-f 3)
 (+ (recursive-f (- 3 1)) (* 2 (recursive-f (- 3 2)) (* 3 (recursive-f (- 3 3))) ))
 (+ (recursive-f (- 3 1)) (* 2 (recursive-f (-3 2))) (* 3 (recursive-f 0))))
 (+ (recursive-f (- 3 1)) (* 2 (recursive-f (-3 2))) (* 3 0)))
 (+ (recursive-f (- 3 1)) (* 2 (recursive-f (-3 2))) 0))
 (+ (recursive-f (- 3 1)) (* 2 (recursive-f 1) 0))
 (+ (recursive-f (- 3 1)) (* 2 1 ) 0))
 (+ (recursive-f (- 3 1)) 2 0))
 (+ (recursive-f 2) 2 0)
 (+ 2 2 0)
 4

 (recursive-f 4)
 (+ (recursive-f (- 4 1)) (* 2 (recursive-f (- 4 2)) (* 3 (recursive-f (- 4 3))) ))
 (+ (recursive-f 3)) (* 2 (recursive-f 2) (* 3 (recursive-f 1)) ))
 (+ (+ (recursive-f (- 3 1)) (* 2 (recursive-f (- 3 2))) (* 3 (recursive-f (- 3 3)))) (* 2 2) (* 3 1))
 (+ (+ (recursive-f 2)) (* 2 (recursive-f 1)) (* 3 (recursive-f 0)) 4 3)
 (+ (+ 2 (* 2 1) (* 3 0)) 4 3)
 (+ (+ 2 2 0) 4 3)
 (+ 4 4 3)
 11


===========================

(defn iterative-f
 [n]
 (+ (iter-f n 1 n) (* 2 (iter-f n 2 n)) (* 3 (iter-f n 3 n))))

(defn iter-f 
 [n factor sum]
 (if (< n 3) sum
     (iter-f (- n factor) factor (+ (- n factor) sum))))


; This is a substitution model of an iterative process:
 
(iterative-f 3)
(+ (iter-f 3 1 3) (* 2 (iter-f 3 2 3)) (* 3 (iter-f 3 3 3)))
(+ (iter-f (- 3 1) 1 (+ (- 3 1) 2)) (* 2 (iter-f (- 3 2) 2 (+ (- 3 2) 2))) (* 3 iter-f (-3 3) 3 (+ (-3 3) 3))  ) 
(+ (iter-f 2 1 (+ 2 2)) (* 2 (iter-f 1 2 (+ 1 2))) (* 3 (iter-f 0 3 (+ 0 3))))
(+ (iter-f 2 1 4) (* 2 (iter-f 1 2 3)))