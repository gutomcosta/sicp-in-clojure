;the following multiplication procedure (in which it is assumed that our language can only add, not multiply)
;is analalogous to expt procedure.

(defn *
    [a b]
    (if (= b 0 ) 0
        (+ a (* a (- b 1)))))
        
; this algorithm takes a number of steps that is linear in b. Now suppose we include, together with addition,
; operations double, which doubles an integer, and halve, which divides an (even) integer by 2. Using these,
; design a multiplication procedure analogous to fast-expt that uses a logarithmic number of steps.

; i'm not sure if i understand the exercise. 


(defn multiply-iterative
    [a b c]
    ()  
    
    
    )