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

(defn aplica-desconto
  "Retorna o valor com desconto de 10%"
  [valor-bruto]
  (let [taxa-de-desconto (/ 10 100)
        desconto         (* valor-bruto taxa-de-desconto)]
    (println "Calculando desconto de " desconto)
    (- valor-bruto desconto)))

(defn aplica-desconto
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100"
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [taxa-de-desconto (/ 10 100)
        desconto         (* valor-bruto taxa-de-desconto)]
      (println "Calculando desconto de " desconto)
      (- valor-bruto desconto))
    valor-bruto))

(aplica-desconto 100)


(> 500 100) <- uso de cond
(if (> 500 100)
  (println "Maior") <- true
  (println "Menor ou igual")) <- false