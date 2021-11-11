# Sistema de Guardado de una Librería Web
El objetivo de este ejercicio consiste en el desarrollo de un sistema web de guardado de
libros en JAVA utilizando una base de datos MySQL, JPA Repository para persistir
objetos y Spring Boot como framework de desarrollo web.
# Diagrama entidad-relacion
![alt text](https://cdn.discordapp.com/attachments/905954770672554037/905954865526755368/ulm.PNG)

# Resultado
## Autor
### Listado de Autores
![alt text](https://cdn.discordapp.com/attachments/905954770672554037/905956848274923530/autorlist.PNG)
### Nuevo Autor
![alt text](https://cdn.discordapp.com/attachments/905954770672554037/905957386974552075/nuevoautor.PNG)
### Modificar Autor
![alt text](https://cdn.discordapp.com/attachments/905954770672554037/905957962927984651/modificarA.PNG)

## Editorial
### Listado de Editoriales
![alt text]()
### Nuevo Editorial
![alt text]()
### Modificar Editorial
![alt text]()

## Libros
### Listado de Libros
![alt text](https://cdn.discordapp.com/attachments/905954770672554037/905959849228111872/as.PNG)
### Nuevo Libro
![alt text](https://cdn.discordapp.com/attachments/905954770672554037/905960084138520626/a.PNG)
### Modificar Libro
![alt text](https://cdn.discordapp.com/attachments/905954770672554037/905960329723392090/asd.PNG)

## Prueba del Ejercicio
### Creacion de la DB
CREATE DATABASE libreria;
### Requerimientos
-Instalar JDK 11
```
https://jdk.java.net/archive/
```
-Instalar Maven
```
https://maven.apache.org/download.cgi
```
### Configuracion de application.properties
>/src/main/resources/application.properties
#### Cambiar direccion del servidor sql
  > spring.datasource.url=jdbc:mysql://localhost:3306/libreria?serverTimezone=UTC
#### Cambiar usuario del servidor sql
  > spring.datasource.username=root
#### Cambiar password del servidor sql
  > spring.datasource.password=root





Resumen



cd
Sirve para moverse entre directorios.
● cd / (Directorio raíz)
● cd .. (Directorio anterior)
● cd (Directorio raíz)
● cd /IES (Directorio específico)
pwd
Sirve para mostrar el directorio actual de trabajo.
● pwd (Muestra directorio actual de trabajo)
● pwd -L (Muestra directorio actual de trabajo)
● pwd -P (Muestra directorio físico sin enlaces simbólicos)
ls
Muestra los archivos y/o directorios dentro del directorio actual.
● ls -l (Muestra los archivos con un formato largo, con más detalles)
● ls -l | less (Muestra el resultado por partes, manejandolo con “Repág” y “AvPág”)
● ls -a (Muestra todos los archivos, inclusive los ocultos)
● ls -r (Muestra los archivos pero en orden al revés)
● ls ?[a-cm]? (Muestra archivos de 3 letras que comiencen con una letra(?), luego
una letra desde a hasta c, o m, y luego una letra cualquiera(?))
● ls [!c-t]* (Lista todos los archivos menos los que empiecen entre c y t)
cat
Crea, fusiona, imprime archivos en la pantalla de salida estándar o en otro archivo
entre otras cosas.
● cat > index.html (Crea un archivo, y te permite escribir en el. Si se escribe devuelta
el mismo comando el nuevo contenido del archivo modifica al anterior)
● cat index.html (Muestra el contenido del archivo creado en pantalla)
cp
Sirve para copiar un archivo y pegarlo en otro directorio.
● cp index.hml ~/resumen_s_o/jero/
mv
Mueve un archivo/carpeta a otro directorio
● mv *.* ~/resumen_s_o/jero (Forma normal)
● mv -b *.* ~/resumen_s_o/jero (crea una copia de seguridad antes de borrar)
● mv index.html ~/resumen_s_o/jero/hola.html (Mueve el archivo y le cambia el
nombre al mismo)
mkdir
Sirve para crear directorios, si no existen ya.
● mkdir jero_alvarez (Forma normal)
rm
Sirve para borrar archivos y directorios.
● rm jero.txt (Borra el archivo jero.txt)
● rm -r * (Borra todos los archivos y directorios y sub directorio de la localización)
● rm -f (Borra sin preguntar)
● rm -d (Remueve directorios vacíos)
● rm -v (Muestra que está siendo borrado)
touch
Actualiza la fecha de creación y de modificación de un directorio/archivo a la actual.
● touch jero_alvarez (cambia la fecha de creacion a la actual)
● touch -a jero_alvarez (Cambia solamente la fecha de acceso a la actual)
● touch -m jero_alvarez (Cambia solamente la fecha de acceso)
locate
Busca archivos y directorios ingresados en un base de datos
● sudo updatedb (Actualiza la base de datos)
● locate diff.txt (Busca el archivo dentro de la bd)
find
Busca un archivo o directorio en el sistema.
● find ~/ -name hola.html (Buscar desde ~/ por nombre el archivo hola.html)
● find . -name hola.html (Buscar desde (directorio actual) por nombre el archivo
hola.html)
● find . -iname hola.html (Buscar desde (directorio actual) por nombre el archivo(sin
distinción de mayúsculas) hola.html)
● find ~/ -atime 1 (Busca por fecha de acceso desde la fecha hasta hace un día atrás)
● find ~/ -mtime 1 (Busca por fecha de modificación desde la fecha hasta hace un día
atrás)
● find ~/ -ctime -1 (Busca archivos/carpetas que se cambiaron hace menos de un día)
grep
Busca un caracter o cadena en un archivo de texto
● grep -i h hola.html (Busca (sin tener distinción entre mayúsculas y minúsculas) la
letra “h” en hola.html)
● grep -n -i h hola.html (Busca (sin tener distinción entre mayúsculas y minúsculas) la
letra “h” en hola.html y además te dice la línea en la cual se encuentra)
● grep -i -c h hola.html (Busca (sin tener distinción entre mayúsculas y minúsculas)
(da como resultado el número de coincidencias) la letra “h” en hola.html)
sudo
Permite al usuario ejecutar comandos con permisos de administrador.
IVESTIGAR
df
Muestra el espacio que hay en el disco.
● df (Da espacio en disco en kb)
● df -h (da espacio en disco en gb, mg, kb, dependiendo del tamaño)
du
Muestra el espacio en disco que ocupa ciertos archivos.
● du hola.html (Da espacio que ocupa en kb)
● du -h hola.html (Da espacio que ocupa en gb, mg, kb, dependiendo del tamaño)
head
Sirve para ver contenido dentro de un archivo desde la cabecera
● head hola.html (Muestra las primeras 10 líneas del archivo)
● head -n 2 hola.html (Muestra las primeras 2 lineas del archivo)
● head -c 10 hola.html (Muestra los primero 10 bytes del archivo)
tail
Sirve para ver el contenido de un archivo desde el final
● tail hola.html (Muestra las últimas 10 líneas desde el final)
● tail -n 3 hola.html (Muestra las ultimas 3 lineas desde el final)
diff
Muestra la diferencia en el contenido entre dos archivos de texto
● diff hola.html jero.html (Muestra diferencia entre el primer archivo con el segundo)
● diff -q hola.html jero.html (solo indica si los fichero son diferentes o no)
tar
Sirve para comprimir y descomprimir archivos
c – crear un nuevo archivo .tar
v – muestra una descripción detallada del progreso de la compresión
f – nombre del archivo
x – descomprimir archivo .tar
● tar -cvf jero.tar ~/resumen_s_o/jero (Comprime la carpeta jero)
● tar -xvf jero.tar (Descomprime en la carpeta actual)
● tar- xvf jero.tar -C ~/resumen_s_o/jero (Descomprime en la carpeta indicada)
● tar- tf jero.tar (Muestra el contenido del archivo .tar)
chmod
Sirve para dar permisos de archivos a usuarios
Usuarios:
u: usuario y dueño del fichero
g: grupo de usuarios del dueño del fichero
o: todos los otros usuarios
a: todos los tipos de usuarios
Permisos:
r: lectura
w: escritura
x: ejecución
● chmod *=* hola.html (Le la todos los permisos a todos los usuarios)
● chmod u=wr (Le da permiso al usuario y dueño del fichero de escritura y ejecución)
chown
Sirve para cambiar la propiedad de un archivo al nombre del usuario especificado
● chown jeroalvarez1 jero (Cambia la propiedad de usuario de la carpeta jero a
jeroalvarez1)
● chown -h jeroalvarez1 enlace.ddfdf.com (Cambia la propiedad de usuario del
enlace a jeroalvarez1)
jobs
Muestran los procesos que se están ejecutando actualmente, un trabajo es un
proceso iniciado por el shell.
-l : Muestra el IDs además de la información anterior.
-p : Solo muestra el IDs de los trabajos
-r : Solo muestra los trabajos que están en estado de ejecución.
-s : Solo muestra los trabajos que están en estado de detenido.
● jobs -l (Muestra los ids de los trabajo y toda la información)
kill
Sirve para cerrar procesos en la CPU, con top podemos ver los numeros de PID
● kill 38467 (en este caso estoy cerrando el code)
ping
Sirve para verificar estado de conectividad con el servidor
● ping google.com (Consulta la conectividad hasta que se cancele el proceso)
● ping -c 3 google.com (Consulta la conectividad 3 veces)
● ping -a google.com (Consulta la conectividad hasta que se cancele el proceso,
pero emitiendo un pitido cuando la conectividad sea correcta)
wget
Sirve para descargar archivos de internet mediante un enlace
● wget -i exaple.txt (Devuelve los enlaces del archivo de texto)
● wget ~/resumen_s_o/jero
https://download2390.mediafire.com/herhmvrhqcvg/3jmby6un4ddxzlk/micro_G
+14+Sep+ByKalitos117.apk --no-check-certificate (Descarga en la carpeta jero el
archvio y admite descarga de funten no certifucadas)
uname
Sirve para dar información sobre el sistema Linux, como el nombre de la máquina,
sistema operativo, núcleo, etc.
● uname (muestra el sistema operativo)
● uname -a (muestra todos los datos básicos sobre el dispositivo)
top
Devuelve un administrador de tareas
● top (devuelve el admin de tareas basico)
history
Devuelve un historial en consola de los comando ingresados por el usuario
● history -c (borra el historial)
● history (muestra los últimos x cantidad de comandos por default)
● history 34 (muestra muestra los últimos 34 comandos)
man
Devuelve un manual sobre un comando
● man ls (devuelve el manual del comando ls)
echo
Sirve para mostrar información en pantalla
● echo Hola mi nombre es Jerónimo Alvarez (Muestra por terminal el texto)
zip
Sirve para comprimir archivos a .zip
● zip jerohola.zip hola.txt jero.txt (Crea un .zip y mete dentro hola.txt y jero.txt)
● zip -d jerohola.zip hola.txt (Borra el archivo hola.txt del zip)
● zip -u jerohola.zip hola.txt (Mete el archivo hola.txt en un zip ya creado
anteriormente)
● zip -r jeropepe.zip ~/resumen_s_o/jero (Comprime la carpeta jero entera)
unzip
Sirve para descomprimir archivos .zip
● unzip jeropepe.zip (Descomprime el archivo .zip en el directorio actual)
● unzip jeropepe.zip -d ~/resumen_s_o/jero/pepe/ (Descomprime el archivo zip en
el directorio especificado)
hostname
Sirve para saber cual es el nombre del dispositivo
● hostname (Da como resultado el nombre del dispositivo)
useradd
Sirve para crear nuevos usuarios al S.O
● sudo useradd pepe (Crea un usuario llamado pepe)
● sudo passwd pepe (Le da una contraseña al usuario)
● sudo useradd -d ~/resumen_s_o/jero/pepe/userpepe/ userpepe (crea un usario
en una direccion especifica)
date
xxxxxxxxxxxxxxxxxxxx
who
Da como resultado el nombre del usuario actual.
Teoría
Modos
Modo Kernel
Es el sistema operativo en sí, el encargado de administrar los
recursos de hardware de las computadoras dándoles un rendimiento
óptimo, tiene la capacidad de llevar a cabo cualquier cosa que la
computadora sea capaz de ejecutar.
Modo usuario
Es más restringido que el kernel, es quien se encarga directamente
de interactuar con el usuario de la computadora, a este modo solo le
es permitido realizar restringidas operaciones.
Shell y GUI
Están en la parte más baja del modo usuario, y se encargan de interactuar
con el usuario.
Shell
Comando de texto plano.
GUI
Visuales y lógicamente más atractivas, y prácticas para el usuario.
Para toda GUI existe una Shell.
Funciones principales de un S.O
1-Proporcionar un conjunto de recursos abstractos amigables para que al
usuario le sea más fácil trabajar, ya que el software básico de la máquina en
sí es muy complicado de entender, mal diseñado, engorroso y confuso.
2-Administrar los recursos de hardware, su tarea principal es llevar un
registro de que se está utilizando, qué recursos de otorgar las peticiones de
recursos, de contabilizar su uso y de mediar las peticiones en conflicto
provenientes de distintos programas y usuarios. Las aplicaciones o partes del
s.o necesitan usar los recursos de hardware para funcionar, entonces esta es
la función que se encarga de proveer recursos de hardware a estos software,
otorga recursos de dos métodos en tiempo y/o espacio, el tiempo da un
tiempo de uso de los recursos hardware al software y el espacio particiona
los recursos hardware y se comparten entre los distintos softwares.
