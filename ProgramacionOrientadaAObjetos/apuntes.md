# Programacion Orientada a Objetos

Aunque teoricamente con las estructuras de control estudiadas anteriormente podemos codear cualquier programa que se nos ocurra, al crecer el tamaño de los programas, no es suficiente este tipo de paradigma para pode desarrollar codigo legible.

El fin de la POO busca ordenar el codigo y organizarlo en clases. Se centra en la creacion de objetos que interactuan entre si para realizar una tarea.

Nos centramos en ver al mundo en base a las jerarquias, centrandonos en las 'cosas' que hay en el mundo, y no tanto en las acciones.

## Class

Una clase es una entidad heterogenea de atributos, que pueden ser variables, constantes o colecciones, u otros objetos.

La sintaxis es --> *public* Class 'NombreDeLaClase' {}. El public hace referencia a que esa clase se puede acceder en otros packages.

Es una unidad de informacion, esta contiene informacion que se relaciona con nuestro problema.

Es una estructura recursiva, son estructuras que llaman a otras clases

Una clase debe respetar los principios de:
 - Alta cohesion
 - Bajo acoplamiento
 - Pequeño tamaño de noseque modular.

## Objeto

El objeto se crea a partir de la clase. la clase es el molde, nos dice que caracteristicas debe tener el objeto, mientras que el objeto es algo concreto.

lo creamo de la siguiente manera: new <NombreClase>([<expresiones>])

el operador new es...

## Atributos

Informacio contenida en clases que representa caracteristicas del objeto. 

<clasificador> 

### encapsulamiento

encapsular algo es una tecnica que permite 'ocultar' la informacion, de tal forma que solo la misma clase pueda acceder a ella. el clasificador *private* se utiliza con este objetivo, permitiendo resguardar la informacion y la psobilidad de editarla.

### metodos

son operaciones o funcionalidad de una clase. el resultado de la ejecucion de un metodo es el cambio de estado de un objeto.