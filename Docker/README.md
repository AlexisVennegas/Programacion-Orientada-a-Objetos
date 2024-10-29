El comando `docker run -t "nombreDisco"` este comando se utiliza para ejecutar un contenedor Docker con un nombre de disco especificado. 
La opción `-t` asigna una pseudo-terminal al contenedor, lo que permite la interacción con el mismo.
El comando `docker ps -a` se utiliza para listar todos los contenedores de Docker en el sistema, incluyendo aquellos que están detenidos. Aquí hay una explicación detallada de cada parte del comando:

- `docker ps`: Este es el comando principal de Docker para listar contenedores en ejecución.
- `-a`: Esta opción muestra todos los contenedores, no solo los que están en ejecución.

En resumen, el comando `docker ps -a` proporciona una lista completa de todos los contenedores de Docker, permitiendo ver tanto los contenedores activos como los inactivos.

- `docker images ps -a` Este comando se utiliza para listar todas las imágenes de Docker en el sistema, incluyendo las imágenes intermedias que no están etiquetadas. 