# Examen Parcial - Estructuras de Datos

## Información del Estudiante
- **Nombre:** Herberth Luis Ricardo Ortiz Cruz
- **Carné:** 2010820470101
- **Curso:** Estructuras de Datos
- **Catedrático:** Ing. Brandon Chitay

## Descripción del Proyecto
Este proyecto consiste en la implementación de una lista doblemente enlazada circular en Java.

Una lista doblemente enlazada circular es una estructura de datos en la que cada nodo contiene un dato, una referencia al nodo siguiente y una referencia al nodo anterior. Su característica principal es que el último nodo apunta nuevamente al primero, y el primero apunta al último, formando así una estructura circular.

En este proyecto se implementaron las siguientes operaciones:
- Insertar al inicio
- Insertar al final
- Eliminar al inicio
- Eliminar al final
- Buscar un elemento
- Imprimir la lista
- Menú interactivo para manipular la estructura

## Video Explicativo
Enlace al video: [Ver video explicativo OneDrive](https://universidaddavincid-my.sharepoint.com/:v:/g/personal/herortizc_estudiante_udv_edu_gt/IQC41J_74tBdQI3Ni1_xPPQKAQcQrt-E8-RjhYEIN8DVvzA?nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJPbmVEcml2ZUZvckJ1c2luZXNzIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXciLCJyZWZlcnJhbFZpZXciOiJNeUZpbGVzTGlua0NvcHkifX0&e=YiSo2v)

Enlace al video: [Ver video explicativo Google Drive](https://drive.google.com/file/d/1gNmpSFkAty3lQlUOeTkz-T0cYcKd6E20/view?usp=drive_link)

**Contraseña del video:** `Davinci2026**`

## Instrucciones de Compilación y Ejecución

```bash 
javac Nodo.java ListaDobleCircular.java Main.java
java Main 

```

## Resultados

### Escenario 1: Inserciones y eliminaciones

### Insertar al inicio

```text
========================================
 LISTA DOBLEMENTE ENLAZADA CIRCULAR
========================================
1. Insertar al inicio
2. Insertar al final
3. Eliminar al inicio
4. Eliminar al final
5. Buscar elemento
6. Imprimir lista
7. Salir
========================================
Seleccione una opción: 1
Ingrese el dato a insertar al inicio: 2002
Dato insertado correctamente.
Lista: 2002 <-> (circular -> 2002)
```

## Insertar al final

```text
========================================
 LISTA DOBLEMENTE ENLAZADA CIRCULAR
========================================
1. Insertar al inicio
2. Insertar al final
3. Eliminar al inicio
4. Eliminar al final
5. Buscar elemento
6. Imprimir lista
7. Salir
========================================
Seleccione una opción: 2
Ingrese el dato a insertar al final: 94820
Dato insertado correctamente.
Lista: 2002 <-> 94820 <-> (circular -> 2002)
```

## Eliminar al inicio

```text
========================================
 LISTA DOBLEMENTE ENLAZADA CIRCULAR
========================================
1. Insertar al inicio
2. Insertar al final
3. Eliminar al inicio
4. Eliminar al final
5. Buscar elemento
6. Imprimir lista
7. Salir
========================================
Seleccione una opción: 3
Estado actual de la lista:
Lista: 94820 <-> (circular -> 94820)
```

## Eliminar al final

```text
========================================
 LISTA DOBLEMENTE ENLAZADA CIRCULAR
========================================
1. Insertar al inicio
2. Insertar al final
3. Eliminar al inicio
4. Eliminar al final
5. Buscar elemento
6. Imprimir lista
7. Salir
========================================
Seleccione una opción: 4
Estado actual de la lista:
La lista está vacía
```

## Eliminar al inicio cuando la lista está vacía

```text
========================================
 LISTA DOBLEMENTE ENLAZADA CIRCULAR
========================================
1. Insertar al inicio
2. Insertar al final
3. Eliminar al inicio
4. Eliminar al final
5. Buscar elemento
6. Imprimir lista
7. Salir
========================================
Seleccione una opción: 3
Error: Lista vacía
Estado actual de la lista:
La lista está vacía
```

## Eliminar al final cuando la lista está vacía

```text
========================================
 LISTA DOBLEMENTE ENLAZADA CIRCULAR
========================================
1. Insertar al inicio
2. Insertar al final
3. Eliminar al inicio
4. Eliminar al final
5. Buscar elemento
6. Imprimir lista
7. Salir
========================================
Seleccione una opción: 4
Error: Lista vacía
Estado actual de la lista:
La lista está vacía
```

## Escenario 2: Búsqueda e impresión de la lista

## Nota: Las siguientes pruebas corresponden a otra ejecución del programa, con la lista previamente cargada.

## Buscar elemento encontrado

```text
========================================
 LISTA DOBLEMENTE ENLAZADA CIRCULAR
========================================
1. Insertar al inicio
2. Insertar al final
3. Eliminar al inicio
4. Eliminar al final
5. Buscar elemento
6. Imprimir lista
7. Salir
========================================
Seleccione una opción: 5
Ingrese el elemento a buscar: 242342
Elemento encontrado.
```

## Buscar elemento no encontrado

```text
========================================
 LISTA DOBLEMENTE ENLAZADA CIRCULAR
========================================
1. Insertar al inicio
2. Insertar al final
3. Eliminar al inicio
4. Eliminar al final
5. Buscar elemento
6. Imprimir lista
7. Salir
========================================
Seleccione una opción: 5
Ingrese el elemento a buscar: 23
Elemento no encontrado.
```

## Imprimir lista

```text
========================================
 LISTA DOBLEMENTE ENLAZADA CIRCULAR
========================================
1. Insertar al inicio
2. Insertar al final
3. Eliminar al inicio
4. Eliminar al final
5. Buscar elemento
6. Imprimir lista
7. Salir
========================================
Seleccione una opción: 6
Lista: 32923 <-> 242342 <-> (circular -> 32923)
```

## Salir del programa

```text
========================================
 LISTA DOBLEMENTE ENLAZADA CIRCULAR
========================================
1. Insertar al inicio
2. Insertar al final
3. Eliminar al inicio
4. Eliminar al final
5. Buscar elemento
6. Imprimir lista
7. Salir
========================================
Seleccione una opción: 7
Saliendo del programa...
```

## Estructura del Proyecto

| Archivo | Descripción |
|---------|-------------|
| Nodo.java | Define la estructura del nodo |
| ListaDobleCircular.java | Implementa la lista doblemente enlazada circular |
| Main.java | Contiene el menú interactivo |
| README.md | Documentación del proyecto |
