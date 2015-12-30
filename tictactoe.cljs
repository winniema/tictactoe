(fn [board] (let [[[a b c]
       [d e f]
       [g h i]] board] 
  (ffirst
  (filter #(or (every? #{:x} %) (every? #{:o} %))
  (concat board (apply map vector board) [[a e i] [c e g]])
  ))))
