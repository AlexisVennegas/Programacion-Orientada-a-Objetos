El comando `docker run -t "nombreDisco"` este comando se utiliza para ejecutar un contenedor Docker con un nombre de disco especificado. 
La opción `-t` asigna una pseudo-terminal al contenedor, lo que permite la interacción con el mismo.
El comando `docker ps -a` se utiliza para listar todos los contenedores de Docker en el sistema, incluyendo aquellos que están detenidos. Aquí hay una explicación detallada de cada parte del comando:

- `docker ps`: Este es el comando principal de Docker para listar contenedores en ejecución.
- `-a`: Esta opción muestra todos los contenedores, no solo los que están en ejecución.

En resumen, el comando `docker ps -a` proporciona una lista completa de todos los contenedores de Docker, permitiendo ver tanto los contenedores activos como los inactivos.

- `docker images ps -a` Este comando se utiliza para listar todas las imágenes de Docker en el sistema, incluyendo las imágenes intermedias que no están etiquetadas. 

- `docker pull [nombreImagen]`: Este comando se utiliza para descargar una imagen de Docker desde un repositorio, como Docker Hub, a tu sistema local.

- `docker build -t [nombreImagen] .`: Este comando se utiliza para construir una nueva imagen de Docker a partir de un Dockerfile en el directorio actual. La opción `-t` permite etiquetar la imagen con un nombre específico.

- `docker stop [idContenedor]`: Este comando se utiliza para detener un contenedor en ejecución. Debes proporcionar el ID o nombre del contenedor que deseas detener.

- `docker rm [idContenedor]`: Este comando se utiliza para eliminar un contenedor detenido. Debes proporcionar el ID o nombre del contenedor que deseas eliminar.

- `docker rmi [idImagen]`: Este comando se utiliza para eliminar una imagen de Docker de tu sistema local. Debes proporcionar el ID o nombre de la imagen que deseas eliminar.

- `docker exec -it [idContenedor] [comando]`: Este comando se utiliza para ejecutar un comando dentro de un contenedor en ejecución. La opción `-it` permite la interacción con el contenedor a través de una terminal.

- `docker attach [idContenedor]`: Este comando se utiliza para volver a conectar tu terminal a un contenedor en ejecución. Debes proporcionar el ID o nombre del contenedor al que deseas adjuntar.