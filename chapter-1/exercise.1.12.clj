; Write a procedure that computes elements of Pascal's triangle  by means a recursive process.

;            1
;          1   1
;        1   2   1
;       1  3   3  1
;      1  4  6  4  1
;      ..............


(defn print-pascal-triangle 
    [finish-line, line]
    ; to-do
)      

; the iterative style was my first attempt. There is a big messy here, but it's working!!! :)
(defn pascal-triangle
    [line-number current-line current-line-number]
    (cond (= current-line-number 1) (pascal-triangle line-number [0 1 0] (+ current-line-number 1))
          (= current-line-number (+ line-number 1)) current-line
          (= current-line-number 2) (pascal-triangle line-number (get-current-line current-line) (+ current-line-number 1))
      :else (pascal-triangle line-number (cons 1 (concat (get-current-line current-line) [1])) (+ current-line-number 1)))
)

(defn get-current-line
  [line]     
  (map (fn [n] (+ (first n) (last n))) (partition 2 1 line)))


; this is a property of pascal triangle where it's possible to get all values necessary for one line, 
; only using the line number and the column number.
1 = 1 * 1/1 = 1
2 = 1 * 2/1 = 2 -> 2 * 1/2 = 1
3 = 1 * 3/1 = 3 -> 3 * 2/2 = 3 -> 3 * 1/3 = 1
4 = 1 * 4/1 = 4 -> 4 * 3/2 = 6 -> 3 * 4/3 = 8 ->
5 = 1 * 5/1 = 5 -> 5 * 4/2 = 10 -> 10 * 3/3 = 10 -> 10 * 2/4 = 5 -> 5 * 1/5 =1
6 = 1 * 6/1 = 6 -> 
; I tried to implement this, but i had a habit of making a solution using an iterative implementation, and my attempts didn't work. 

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1

; this is a recursive implementation of a pascal triangle. This implementation was based
; on an idea found on the web-site

(defn recursive-triangle 
    [row col]
    (cond (< row col) (print "error")
          (or (= col 0) (= row col)) 1
          :else (+ (recursive-triangle (- row 1) col)
                   (recursive-triangle (- row 1) (- col 1)))))
