# Ejercicio "Una más por favor" de Luis Miguel Urbez

## Repositorio: https://github.com/LuisMi01/UnaMas_LuisMiguelUrbez_TecProgramacion/tree/main

## Ejercicio a realizar:

### Ejercicio 1:
  __Dado el codigo en c:__<br>
  <br>a) ¿Qué calcula la llamada a la función recursiva bisect(0,N)? Si cambiamos el valor de N, ¿qué estaríamos calculando? ¿Y si cambiásemos la función f(x)?<br>
  <br>-La funcion bisect(0,N) esta calculando en un principio la media de los dos numero que le damos por parametro. En caso de cambiar el valor de N, nos estariamos dirigiendo directamente a la funcion f(x), cambiando el resultado de su operacion principal, haciendo mas grande o pequeña. En caso de cambiar la funcion f(x), los casos en la funcion bisect(0, N) se verian alterados (los resultados), ya que estariamos cambiando los parametros que usan para funcionar, llegando al caso de que no funconesn correctamente por un mal uso de estos parametros o al crear otr funcion.<br>  
  b) Implemente un algoritmo iterativo equivalente.<br>
  
### Ejercicio 2:

<br>__Dado el siguiente algoritmo recursivo:__<br>
  <br>void f(int num, int div){
    if (num>1) {
    if ((num%div) == 0) { System.out.println(div); f(num/div,div);
  } else {
    f(num,div+1); }
   } }<br>
   
<br>a) Dado un número cualquiera x, ¿qué nos muestra por pantalla la llamada a la función recursiva f(x,2)? ¿Cuál sería un nombre más adecuado para la función f?
<br>b) Implemente un algoritmo iterativo y uno implementado mediante expresiones lambda equivalentes.
