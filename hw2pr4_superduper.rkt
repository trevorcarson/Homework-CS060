#lang racket
(provide superreverse)
(provide duperreverse)
(define (superreverse L)
  #|
  reverses the elements of a list, including lists within a list
  |#
  (if (empty? L) '()
  (append (list(reverse (first L))) (superreverse (rest L)))))


(define (duperreverse L)
  1)
  #|
  (cond
    ((null? L) '())           ; Base case: empty list, return empty list
    ((list? (reverse L))          ; If the first element is a list, reverse it and proceed
     (cons (duperreverse (reverse L)) (duperreverse (reverse L))))
    (else                     ; If the first element is not a list, proceed without reversal
     (cons (reverse L) (duperreverse (reverse L)))))) - I commented this out because I could
      not figure it out and still wanted to get autograder credit for superreverse :(
      |#

      
        
             
      