#lang racket

(provide superreverse)


;; superreverse: Reverses the top-level list.
;;   input:  ( (1 2 3) (4 5 6 (7 8) 9 ) )
;;   output: ( (3 2 1) (9 (7 8) 6 5 4) )
;; Use higher-order functions (no recursion!)
(define (superreverse L)
  (map reverse L))
