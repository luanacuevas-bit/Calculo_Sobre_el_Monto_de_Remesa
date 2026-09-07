# Calculo_Sobre_el_Monto_de_Remesa

Algoritmo en Kotlin para calcular el monto de remesa (mr) a partir del monto total (T), considerando el Impuesto a las Transacciones Financieras (ITF) y una comisión escalonada.

## Problema

Dado el monto total T, se desea hallar el monto de remesa (mr), sabiendo que:

- ITF = 0.005% de mr
- La comisión C(mr) depende del monto:
  - C = 5 (fijo), si mr <= 1000
  - C = 0.5% * mr, si 1000 < mr <= 10001
  - C = 1.5% * mr, si mr > 10001

Y que: **T = mr + ITF + C(mr)**

## Solución

Como C depende de la misma incógnita mr, se despeja mr para cada uno de los tres casos por separado y se valida en qué rango cae el resultado obtenido:

- Caso 1: `mr = (T - 5) / (1 + 0.00005)`
- Caso 2: `mr = T / (1 + 0.00005 + 0.005)`
- Caso 3: `mr = T / (1 + 0.00005 + 0.015)`

## Archivo

- `DBP_CALCULO_MR.kt`: contiene las funciones `getITF()`, `getComision()` y `getMontoRemesa()`, además de un `main()` con un monto total de ejemplo.

## Cómo ejecutar

```bash
kotlinc DBP_CALCULO_MR.kt -include-runtime -d MontoRemesa.jar
java -jar MontoRemesa.jar
```

## Autor

Angheli Luana Cuevas Yucra — Código: 251078
Ingeniería de Sistemas - UNAP Puno
Curso: Desarrollo Basado en Plataforma II
