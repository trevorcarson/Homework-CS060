#lang racket
(provide indivisible)
#|
Removes all elements of a list that are divisible by e.
Input: L, a list and e, a number
Outpit: L
Side Effects: All elements of L that are divisible by e have been removed.
|#
(define (indivisible e L)
  (filter (lambda (x) (not (equal? 0 (modulo x e)))) L))