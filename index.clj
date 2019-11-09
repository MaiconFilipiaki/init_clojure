(defn imprime-mensagem []
  (println "----------------------")
  (println "Bem vindo ao estoque!"))

(defn aplica-desconto [valor-bruto]
  (* valor-bruto 0.9))

(defn valor-descontado
  "Retorna o valor descontado que é 90% do valor bruto"
  [valor-bruto]
  (* valor-bruto 0.9))

(defn aplica-desconto [valor-bruto]
  (* valor-bruto (- 1 0.10)))

(defn aplica-desconto
  "Retorna o valor com desconto de 10%"
  [valor-bruto]
  (* valor-bruto (- 1 0.10)))

(aplica-desconto 100)

(defn aplica-desconto
  "Retorna o valor com desconto de 10%"
  [valor-bruto]
  (def [desconto 0.10]) <- esta colocando como variavel global no workspace
  (* valor-bruto (- 1 desconto)))

(defn aplica-desconto
  "Retorna o valor com desconto de 10%"
  [valor-bruto]
  (let [desconto 0.10]) <- ira funcionar somente dentro desse colchete
  (* valor-bruto (- 1 desconto)))

(defn aplica-desconto
  "Retorna o valor com desconto de 10%"
  [valor-bruto]
  (let [desconto 0.10] <- ira retorna o double
    (println "Calculando desconto de " desconto)
    (* valor-bruto (- 1 desconto))))

(defn aplica-desconto
  "Retorna o valor com desconto de 10%"
  [valor-bruto]
  (let [desconto (/ 10 100)] <- ira retorna um bigInt
    (println "Calculando desconto de " desconto)
    (* valor-bruto (- 1 desconto))))    

(aplica-desconto 100)