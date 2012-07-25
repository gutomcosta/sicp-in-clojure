;The following procedure  computes a mathematical function called Ackermann's function.

(defn A
[x y]
  (cond (= y 0) 0
        (= x 0) (* 2 y)
        (= y 1) 2
        :else (A (- x 1) (A x (- y 1)))))

;What are the values of the following expressions?

(A 1 10)
(A (- 1 1) (A 1 (- 10 1))))
(A 0 (A 1 9)))
(A 0 (A (- 1 1) (A 1 (- 9 1)))))
(A 0 (A 0 (A 1 8))))
(A 0 (A 0 (A (- 1 1) (A 1 (- 8 1))))))
(A 0 (A 0 (A 0 (A 1 7)))))
(A 0 (A 0 (A 0 (A (- 1 1) (A 1 (- 7 1)))))))
(A 0 (A 0 (A 0 (A 0 (A 1 6))))))
(A 0 (A 0 (A 0 (A 0 (A (-1 1) (A 1 (- 6 1))))))))
(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 1 5))))))))
(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A (-1 1) (A 1 (- 5 1))))))))))
(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 1 4)))))))))
(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A (-1 1) (A 1 (- 4 1)))))))))))
(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 1 3))))))))))
(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A (-1 1) (A 1 (-3 1))))))))))
(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 1 2)))))))))
(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A (-1 1) (A 1 (- 2 1))))))))))
(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 1 1))))))))))
(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (* 2 1))))))))))
(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 2)))))))))
(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (* 2 2)))))))))
(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 4))))))))
(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (* 2 4))))))))
(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 8)))))))
(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (* 2 8)))))))
(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 16))))))
(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (* 2 16)))))))
(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 32))))))
(A 0 (A 0 (A 0 (A 0 (A 0 (* 2 32))))))
(A 0 (A 0 (A 0 (A 0 (A 0 64)))))
(A 0 (A 0 (A 0 (A 0 (* 2 64)))))
(A 0 (A 0 (A 0 (A 0 128))))
(A 0 (A 0 (A 0 (* 2 128))))
(A 0 (A 0 (A 0 256)))
(A 0 (A 0 (* 2 256)))
(A 0 (A 0 512))
(A 0 (* 2 512))
(A 0 1024)
2048 ????


;The correct answer is 1024. I think that something was wrong when i did the substitution model, but i am not understanding why yet.
;What's wrong????

(A 2 4)
(A (- 2 1) (A 2 (- 4 1)))
(A 1 (A 2 3))
(A 1 (A (- 2 1) (A 2 (- 3 1))))
(A 1 (A 1 (A 2 2)))
(A 1 (A 1 (A (- 2 1) (A 2 (- 2 1)))))
(A 1 (A 1 (A 1 (A 2 1))))
(A 1 (A 1 (A 1 2))))
(A 1 (A 1 (A (- 1 1) (A 1 (-2 1)))))
(A 1 (A 1 (A 0 (A 1 1))))
(A 1 (A 1 (A 0 2)))
(A 1 (A 1 (* 2 2)))
(A 1 (A 1 4))
(A 1 (A (- 1 1) (A 1 (- 4 1))))
(A 1 (A 0 (A 1 3)))
(A 1 (A 0 (A (-1 1) (A 1 (- 3 1)))))
(A 1 (A 0 (A 0 (A 1 2))))
(A 1 (A 0 (A 0 (A (-1 1) (A 1 (- 2 1))))))
(A 1 (A 0 (A 0 (A 0 (A 1 1)))))
(A 1 (A 0 (A 0 (A 0 2))))
(A 1 (A 0 (A 0 (* 2 2))))
(A 1 (A 0 (A 0 4)))
(A 1 (A 0 (* 2 4)))
(A 1 (A 0 8))
(A 1 (* 2 8)))
(A 1 16)
(A (-1 1) (A 1 (- 16 1)))
.....
65536

(A 3 3)
65536

;Consider the following procedures, where A is the procedure defined above:

(defn f [n] (A 0 n))
(defn g [n] (A 1 n))
(defn h [n] (A 2 n))
(defn k [n] (* 5 n n))

;Give concise mathematical definitons for the functions computed by the procedures f, g, and h for positive integer
;values of n. For example, (k n) computes 5n^2

;(f n) 
;  for n > 0 computes  2n

;(g n) 
;  for n = 0 computes 0
;  for n > 0 computes 2^n


;(h n)
;  for n = 1 computes 2
;  for n > 1 computes A(2-1,A(2, n-1))

(defn A
[x y]
  (cond (= y 0) 0
        (= x 0) (* 2 y)
        (= y 1) 2
        :else (A (- x 1) (A x (- y 1)))))


