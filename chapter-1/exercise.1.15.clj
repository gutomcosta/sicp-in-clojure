;the sine of an angle (specified in radians) can be computed by making use of the approximation sin x ~ x if 
; x is sufficiently small, and the trigonometric identity: 

; sin x = 3 sin x/3 - 4 sin^3 x/3

; to reduce the size of the argument of sin. (For purposes of this exercise an angle is considered "sufficiently
;small" if its magnitude is not greater than 0.1 radians.)
; These ideas are incorporated in the following procedures:
(ns sicp.chapter1
      (:use k)))

(defn cube
    [x]
    (* x x x))
    
(defn p
    [x]
    (- (* 3 x) (* 4 (cube x))))

(defn sine 
    [angle]
    (if (not (> (abs angle) 0.1)) 
        angle
        (p (sine (/ angle 3.0)))))
        
        
; a) how many times is the procedure p applied when (sine 12.15) is evaluated?

(sine 12.15)
(p (sine (/ 12.15 3.0)))
(p (sine 4.16))
(p (p (sine (/ 4.16 3.0))))
(p (p (sine 1.38)))
(p (p (p (sine (/ 1.38 3)))))
(p (p (p (sine 0.46))))
(p (p (p (p (sine (/ 0.46 3))))))
(p (p (p (p (sine 0.15)))))
(p (p (p (p (p (sine (/ 0.15 3)))))))
(p (p (p (p (p (sine 0.05))))))
(p (p (p (p (p 0.5)))))
(....)

; the procedure p is applied  5 times.


;b) What is the order of growth in space and number of steps (as a function of a) used by the process
; generated by the sine procedure when (sine a) is evaluated?
;O(n)
; the correct answer is O(log n). Why???
