# Diseño y Arquitectura de Sistemas de Computacion - UNTREF 2019
Repositorio con trabajos practicos y tareas de la materia Diseño y Arquitectura de Sistemas de Computacion - UNTREF 2019

## Entrega de Fibo 3
#### Consideraciones y decisiones de diseño
Partiendo de Fibo2 se intento dividir las responsabilidades de la solucion en distintas clases. 
<br>
Se creo una clase llamada LectorDeParametros para lograr una mejor gestion de los parametros ingresados sin importar el orden de los mismos. <br>
Se creo una clase para el manejo de impresion de la secuencia en sus distintas formas.<br>
Se creo una clase para el manejo de guardado en archivos independiente de las otras clases.<br>
Se quito logica de impresion en la clase de fibonacci y solo se lo dejo con el calculo de su secuencia.