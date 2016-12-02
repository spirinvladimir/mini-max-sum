(println
  (let [five (map #(Integer/parseInt %) (clojure.string/split (read-line) #" "))]
    (loop [a five
           min (first five)
           max (first five)
           sum 0]
      (let [cur (first a)]
        (if (> (count (rest a)) 0)
          (recur
            (rest a)
            (if (< cur min) cur min)
            (if (> cur max) cur max)
            (+ sum cur))
          (str
            (+ sum cur (- 0 (if (> cur max) cur max)))
            " "
            (+ sum cur (- 0 (if (< cur min) cur min)))))))))
