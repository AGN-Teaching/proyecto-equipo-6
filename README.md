# Proyecto POO: Servicio de venta de boletos

**UNIVERSIDAD AUTONOMA METROPOLITANA** 

Viernes 13 de Octubre del 2023

**Equipo**: 6

**Integrantes del equipo** : 

- Sánchez Ortiz Estefany Harisvet  22130280278

- Candelaria Rivera Emiliano  2223068382

- Ramírez Abad Gamaliel  2223028619



**Profesor**: Abel García Nájera 

**Materia**: Programacion orientada a objetos 



## Objetivo

Desarrollar un proyecto que cumpla como un servicio de venta de boletos. Diseñarlo e implementarlo como un modelo orientado a objetos. 

## Antecedentes

Un servicio de venta de boletos para eventos tiene convenio con varios foros deportivos y culturales. Para poder comprar boletos, los clientes deben darse de alta en el sistema y proporcionar su nombre, dirección de correo electrónico y los datos de una o más tarjetas de crédito en donde se hará el cargo por las compras.

Una tarjeta de crédito tiene un número único, una fecha de vencimiento y el valor de verificación de la tarjeta (CVV).

Un evento se lleva a cabo en una fecha, hora y lugar determinados. Si un evento es clasificado como Premium, el cliente sólo podrá comprar cuatro boletos. El servicio tiene un costo del 10% del costo del evento.


## Análisis del problema

### Descripcion del problema

El proyecto se centra en la venta de boletos para eventos en alguna plataforma. Los eventos pueden ser de dos tipos, deportivos o culturales, y la plataforma debe permitir a los clientes comprar boletos para estos eventos. 

1. **Eventos Deportivos y culturales**: Cada tipo de vento tiene sus propias caracterisiticas. Por ejemplo, los eventos deportivos pueden tener equipos y tipo de deporte que asociado al evento, mientras que los eventos culturales tienen que tipo de vento cultural es y el artista que se presentara en el evento. 
2. **Venta de Boletos**: La aplicaicon debe permitir al cliente comprar boletos para eventos. La venta de boletos puede estar sujeta a ciertas restricciones, como un limite de compra para eventos "Premium".
3. **Gestión de Eventos**: La aplicacion debe permitir a los administradores agregar, eliminar, mostrar, cargar y guardar eventos. Esto implica una gestión de eventos que almacena informacion sobre los eventos, como nombre, fecha, lugar, costo y disponibilidad de boletos. 
4. **Clientes y Tarjetas de Crédito**: El cliente debe poder crear su cuenta con sus datos personales y asociar una o mas tarjetas de credito a su cuenta. Esto es escencial para comprar boletos.
5. **Seguridad y Acceso del Administrador**: La aplicacion garantiza seguridad al administrador pidiendo una contraseña. 

### Solución propuesta
Se ha desarrollado una aplicación en java que consta de varias clases y metodos. La estructura general de la solución es la siguiente:

- **Clase 'SistemaVentaBoletos'**: Esta clase es la aprte central de la aplicion y maneja la logica del negocio. Contiene metodos para agregar, eliminar, mostrar, cargar y guardar eventos, asi como para comprar boletos y gestionar tarjetas de credito. 
- **Clases 'EventoDeportivo' y 'EventoCultural'**: Estas clases heredan de una clase **'Evento'** y representan eventos deportivos y culturales respectivamente. CAda una tiene atributos especifico para su tipo de evento. 
- **Clases 'Cleinte' y 'TarjetaCredito'**: Esatas clsaes representan a lso clientes y sus tarjetas de credito. Los clientes pueden crear cuentas y asociar tarjetas de credito.
- **Interfaces 'IAdministrador' e 'ICliente': Definen los metodos que deben ser implementados por las clases que actuan como administradores o clientes.

### Flujo de la Aplicación: 
El flujo de la aplicación es la siguiente:

1. El administrador inicia la aplicación y proporciona una contraseña para acceder a las funciones de administrador.
2. El administrador puede agregar, eliminar, mostrar, cargar y guardar eventos. 
3. El cliente inicia la aplicación y eliege mostrar eventos o comprar boletos.
4. Si el cliente decide comprar boletos, selecciona un evento, la cantidad de boletos y realiza la compra, que incluye calculos de costo.
5. Durante el proceso de compra, el cliente debe asociar una tarjeta de credito a su cuenta.
6. Tanto el administrador como el cliente pueden salir de la aplicación en cualquier momento.


## Diseño de diagrama UML y su explicación

En el siguiente diagrama UML se muestra la relacion de clases y como se organizan para representar eventos, clientes y tarjetas de credito. Las relaciones de asociación, composición, agregación y herencia son fundamentales para enteder como interactuan las clases en el proyecto.

!()[*]

### Relaciones de clases:

A continuación, se describen las relaciones entre las clases en el diseño UML:

1. **Asociación** entre **'SitemaVentaBoletos'** y las clases de entos: La clase **'SitemaVentaBoletos'** tiene una relación de composición con las clases de eventos. ESto significa que el sistema contiene eventos y los administra.
2. **Asociación** entre  **'SitemaVentaBoletos'** y **'Cliente'**: El sistema puede gestionar un cliente, lo que significa que el cliente puede crear comprar boletos.
3. **Agregación** entre **'Cliente'** y **'TarjetaCredito'**: Un cliente puede tener una o mas tarjetas de credito asociadas a su cuenta. Esta es una relacion de agregación, ya que las tarjetas de crédito existen de forma independiente y pueden asociarse a un cliente.
4. **Herencia** entre **'Evento'**, **'Deportivo'** y **'Cultural'**: **'Deportivo'** y **'Cultural'** heredan de la clase base **'Evento'**. Esto permite representar los diferentes tipos de eventos con atributos especificos para cada tipo.


## Aplicacion de Progrmación Orientada a Objetos en el proyecto:

- Clases y Objetos: Se han definido múltiples clases, como Evento, Deportivo, Cultural, Cliente, TarjetaCredito, e SistemaVentaBoletos. Cada una de estas clases representa un concepto en el sistema y encapsula sus atributos y comportamientos relacionados.

- Encapsulación: Los atributos de las clases se han declarado como privados y se acceden a través de métodos getter y setter, asegurando el encapsulamiento y el control de acceso a los datos.

- Herencia: Se ha utilizado la herencia para crear subclases Deportivo y Cultural que heredan atributos y métodos de la clase base Evento, permitiendo la reutilización de código y representando la jerarquía de eventos.

- Polimorfismo: Se ha aplicado el polimorfismo al tratar los eventos (ya sean deportivos o culturales) de manera uniforme en la lista de eventos y al mostrar información detallada de los mismos.

- Abstracción: Cada clase encapsula la funcionalidad necesaria y expone una interfaz de métodos para interactuar con objetos de esa clase, lo que simplifica su uso y oculta los detalles de implementación.

- Interfaz: Se han definido interfaces IAdministrador e ICliente, lo que permite definir un conjunto de operaciones que los administradores y los clientes deben implementar en sus respectivas clases. Esto facilita la adición de nuevas funcionalidades y el cumplimiento de contratos específicos.

- Modularidad: La aplicación se ha dividido en módulos con responsabilidades específicas. Por ejemplo, la gestión de eventos y clientes se encuentra en diferentes clases, lo que facilita el mantenimiento y la expansión del sistema.


## Manejo de errores 

El código del sistema de venta de boletos se encarga de lidiar con situaciones inesperadas al interactuar con archivos y la entrada del usuario. Para ello, se utiliza una técnica llamada "manejo de excepciones". Esto significa que el código está preparado para reaccionar de forma adecuada cuando algo no sale como se esperaba.

Específicamente, el código se asegura de que los problemas que puedan surgir al leer y escribir archivos se traten de manera adecuada. Si algo sale mal al manipular estos archivos, como no poder encontrar un archivo o leer datos incomprensibles, el código captura esos problemas y toma medidas para resolverlos.

También, el código está atento a los errores que los usuarios pueden cometer al comprar boletos, como ingresar una cantidad incorrecta de boletos o no proporcionar números válidos. En estos casos, el código informa al usuario de lo que hizo mal y le proporciona una guía para solucionar el error.


El código del sistema de venta de boletos hace uso de ciertas bibliotecas y maneja varios tipos de excepciones:

Bibliotecas Utilizadas: El código se apoya en bibliotecas estándar de Java, como java.io para manejar la entrada/salida de archivos y java.util para trabajar con excepciones específicas.

Excepciones Manejadas: El código maneja principalmente las siguientes excepciones:

IOException: Esta excepción se utiliza para controlar problemas relacionados con la lectura y escritura de archivos. Si, por ejemplo, el programa no puede encontrar un archivo o tiene dificultades para escribir en uno, se captura y se toman medidas para lidiar con ella.

ClassNotFoundException: Esta excepción se usa en la carga de eventos, y se encarga de manejar situaciones donde el programa no puede encontrar una clase necesaria. Se captura y se gestiona adecuadamente.

InputMismatchException: En el contexto de la entrada del usuario, se maneja esta excepción para asegurarse de que los datos ingresados sean del tipo esperado. Si el usuario introduce caracteres en lugar de números, por ejemplo, el código lo detecta y ofrece un mensaje de error al usuario.

Manejo de Excepciones: Para gestionar estas excepciones, el código emplea la estructura try-catch. Esto significa que intenta realizar una operación que podría causar una excepción y, si esta ocurre, se ejecuta el código en la sección catch correspondiente. En esta sección, se toman medidas para manejar el problema, como mostrar un mensaje de error al usuario o realizar alguna acción para resolver la situación.

En resumen, el código del sistema de venta de boletos es menos suceptible a errores al tratar con situaciones inesperadas tanto en la interacción con archivos como en las entradas de los usuarios. Esto evita que el programa se bloquee o deje de funcionar de manera inesperada en caso de problemas.

## Pruebas de funcionamiento 



## Conclusiones individuales 

- Ramírez Abad Gamaliel:

El proyecto de Sistema de Venta de Boletos es un ejemplo sólido de cómo se aplica la Programación Orientada a Objetos (POO) para crear una aplicación modular y eficiente que satisface las necesidades tanto de los administradores como de los clientes en la gestión de eventos y boletos. A lo largo del proyecto, se han implementado los principios de POO, lo que ha llevado a un diseño limpio y bien estructurado.

- Sánchez Ortiz Estefany Harisvet

Esta solución se destaca por su enfoque integral y eficiente para abordar los requisitos clave del problema. La planificación y el diseño cuidadosos de clases y componentes respaldan la implementación exitosa de un servicio de venta de boletos para eventos culturales y deportivos. Esta solución promete una experiencia satisfactoria para los clientes y una gestión efectiva de eventos y cuentas.
La Programación Orientada a Objetos ha desempeñado un papel fundamental en la solución de este problema, al proporcionar una estructura coherente y modular que facilita la gestión de datos y la interacción de los usuarios. Esta metodología ha enriquecido la eficiencia y la organización del sistema de venta de boletos para eventos culturales y deportivos.

- Candelaria Rivera Emiliano

El modelado de objetos en POO es util para representar de manera eficientes onjetos del mundo real en un sistema de software. En este proyecto, se modelan eventos, clientes, tarjetas de credito como objetos, lo que permite una representación clar y estructurada de los datos y comportmientos relacionados. 

Este proyecto de venta de boletos en Java muestra cómo aplicar los principios de POO para crear un sistema organizado. Con POO mostramos la representación clara y modular de los objetos y sus relaciones, lo que simplifica el desarrollo y el mantenimiento del software. 
