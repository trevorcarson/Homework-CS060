#lang racket

;; Two functions will be treated as publicly accessible
;;   (so that we can test them)
(provide erdos erdos-count)


;; erdos: the "erdos" function
;;   input: a positive integer, N
;;   output: 3N+1, if N is odd
;;           N/2, if N is even
(define (erdos N)
  (cond [(equal? (modulo N 2) 0)
         (quotient N 2)]
        [else
         (+ 1(* 3 N))]
  )
)

; Note: Delete this note and write a comment for erdos-count
(define (erdos-count N)
  (cond [(equal? N 1)
         0]
        [else
         (let ([x (erdos N)])
           (+ 1(erdos-count x)
           )
         )
        ]
   )        
)
  

