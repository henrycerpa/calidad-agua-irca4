# JAVA BASICO 
## PRACTICA 4
## Lector del nivel de la calidad del agua en el Atlántico

En el año 2015, los líderes mundiales adoptaron un conjunto de objetivos globales para erradicar la pobreza, proteger el planeta y asegurar la prosperidad para todos como parte de una nueva agenda de desarrollo sostenible. Cada objetivo tiene metas específicas que deben alcanzarse en los próximos 15 años.

El departamento del Atlántico se ha comprometido con esta causa y por ello ha decidido adoptar estos retos, se lista uno de los principales relacionados con el agua potable:

De aquí a 2030, se busca lograr el acceso universal y equitativo al agua potable a un precio asequible para todos.

Algunas ONG’s se atribuyeron la tarea de poder diseñar un dispositivo para analizar la calidad del agua de poblaciones apartadas. Para comenzar, requieren que el dispositivo cuente con un lector de la calidad del agua. Después de la lectura, el dispositivo nos entrega el índice de riesgo de la calidad del agua, IRCA, y según este resultado debe indicar el nivel de riesgo.


| Clasificación IRCA (%) | Nivel de riesgo | Entidades a notificar | Entidades a tomar acciones |
| --- | --- | --- | --- |
| 80.1 - 100 | INVIABLE SANITARIAMENTE | Persona prestadora, COVE, Alcaldía, Gobernación, Contraloría General, Procuraduría General | Gobernación |
| 35.1 - 80 | ALTO | Persona prestadora, COVE, Alcaldía, Gobernación, SSPD | Alcaldía | 
| 14.1 - 35 | MEDIO | Persona prestadora, COVE, Alcaldía, Gobernación	| Persona prestadora |
| 5.1 - 14	| BAJO	| Persona prestadora, COVE	| Persona prestadora |
| 0 - 5	| SIN RIESGO	| Continuar el control y la vigilancia | Continuar vigilancia	| 

Se requiere que usted desarrolle un programa que debe realizar lo siguiente:

Leer y almacenar en base de datos:
- El nombre de cada cuerpo de agua
- Número con el que se identifica (llave primaria)
- El municipio del que forma parte 
- Tipo de cuerpo de agua
- Tipo de agua
- La clasificación IRCA

La base de datos debe contener una tabla con los datos del cuerpo de agua. El programa debe manejar las operaciones de CRUD
 
Con todos los registros de la tabla el programa deberá:
- Indicar el nivel de riesgo de cada cuerpo de agua y su respectivo nombre.
- Indicar cuántos cuerpos de agua no requieren la acción de la ALCALDIA.
- Indicar la calificación IRCA de los cuerpos de agua que tienen un nivel de riesgo SIN RIESGO separados por espacio, en caso de no haber ninguno devolver NA.
- Indicar la clasificación IRCA promedio entre de todos los cuerpos de agua ingresados.

En cuanto al diseño del programa se debe realizar lo siguiente:
- Implementar POO creando una super clase llamada ObjetoGeografico.
- Implementar POO creando una subclase llamada CuerpoDeAgua que extienda de ObjetoGeografico.
- Implementar un método dentro de la clase CuerpoDeAgua llamado nivel que calcule el nivel de riesgo de un cuerpo de agua de acuerdo con los valores de la instancia. 
- Manejar base de datos con SQLite.
- Diseñar una interfaz de usuario grafica por medio de la cual se ingresen los datos al programa.
- Implementar un botón de búsqueda por ID del cuerpo de agua.

Ejemplo de posible interfaz:

![Image text](https://raw.githubusercontent.com/henrycerpam/java-exercise4/main/img/01.png)

En esta vista el botón ingresar captura los valores de los campos y procede a guardarlos en la base de datos.

![Image text](https://raw.githubusercontent.com/henrycerpam/java-exercise4/main/img/02.png)

En esta vista el botón “Obtener datos” obtiene todos los registros de la base de datos y los presenta en el TextArea de la izquierda. El botón “Procesar datos” realiza las operaciones y muestra las salidas esperadas según las preguntas en el TextArea de la derecha.

![Image text](https://raw.githubusercontent.com/henrycerpam/java-exercise4/main/img/03.png)

En esta vista se realiza la búsqueda por id del cuerpo de agua y se presenta la información en los campos respectivos. Acá se puede eliminar el registro presionando el botón eliminar y también se puede cambiar alguno de los campos y guardarlos con el botón editar. 
