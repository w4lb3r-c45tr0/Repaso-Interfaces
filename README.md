<<<<<<< HEAD
# Clase 1 — Repaso OOP + Interfaces (primer contacto)

Sábado 11 de julio de 2026.

## Cómo ejecutar

**Eclipse:** File > Import > Existing Projects into Workspace, seleccionar
esta carpeta. Ejecutar `Main.java` como Java Application.

**Terminal:**
```bash
cd src
javac -d ../bin edu/umg/programacion2/clase01/**/*.java edu/umg/programacion2/clase01/*.java
java -cp ../bin edu.umg.programacion2.clase01.Main
```

## Contenido

| Paquete | Qué muestra |
|---|---|
| `repaso` | Herencia, clase abstracta y polimorfismo (lo ya visto en Prog 1) |
| `interfaces` | Diferencia entre clase abstracta (identidad) e interface (contrato); una clase con una sola clase padre pero varios contratos |
| `pagos` | Laboratorio en clase: `Pagable` + `Notificable`, procesados de forma polimórfica sin conocer el tipo real |
| `ejercicios` | Ejercicios de práctica con `TODO` para completar en casa o en clase |

## Idea clave de la clase

- **Clase abstracta = "es un tipo de"** (herencia de identidad, Java solo permite una).
- **Interface = "sabe hacer algo"** (contrato de comportamiento, se pueden implementar varias a la vez).

## Ejercicios de práctica incluidos

1. **Empleados con beneficios** (`ejercicios/beneficios`): completar
   `Vendedor.calcularBono()` y `Gerente.calcularBono()` según las reglas
   descritas en los comentarios de cada clase.
2. **Reproductor multimedia** (`ejercicios/multimedia`): completar
   `Cancion` y `Video` para que cumplan el contrato `Reproducible`.

Ambos siguen el mismo patrón que el laboratorio de pagos: una lista del
tipo interface, procesada sin conocer la clase concreta de cada elemento.

## Tarea para la siguiente clase

Tomar una clase del proyecto Swing de Prog 1 y agregar al menos **dos
interfaces** que describan comportamientos que esa clase ya tiene (por
ejemplo, si tenía `mostrar()`, crear una interface `Displayable` con ese
método e implementarla). Subir al repositorio Git.
=======
# Interfaces
>>>>>>> 698cc6090ef721f6d441045db1c2f76308ae0d1c
