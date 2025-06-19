# Memoria de la Práctica de Refactorización

## 1. Información del Repositorio

**URL del repositorio GitHub:** https://github.com/mml1020/refactoring-fowler-example

## 2. Histórico de Versiones y su Relación con las Refactorizaciones

### Commits Realizados

| Commit Hash | Mensaje | Refactorización Aplicada |
|-------------|---------|-------------------------|
| b4ee4e9 | Refactorización: extraer método amountFor para calcular importe de alquiler | Extract Method |
| 1fd3d1a | Refactorización: extraer método getFrequentRenterPoints para calcular puntos de cliente frecuente | Extract Method |
| 8d31507 | Refactorización: mover método de cálculo de importe a clase Rental | Move Method |
| 235ae79 | Refactorización: mover método de cálculo de puntos frecuentes a clase Rental | Move Method |
| 80bcf98 | Refactorización: mover lógica de cálculo de Movie desde Rental | Move Method |
| 9abfff0 | Crear jerarquía de clases Price con implementaciones Regular, NewRelease y Children | Create Type |
| 0ad59a9 | Refactorización: reemplazar tipo código con patrón State/Strategy | Replace Type Code with State/Strategy |
| 529da1c | Añadir interfaz StatementFormatter con implementaciones para texto y HTML | Create Type/Interface |
| f89a23f | Refactorización: usar patrón Template Method para generar informes en múltiples formatos | Extract Method + Template Method |

### Relación entre Versiones y Refactorizaciones

Cada commit representa una refactorización atómica siguiendo el proceso incremental de Fowler:
1. **Fase 1 (Extract Method)**: Se extrajeron métodos para mejorar la legibilidad del código
2. **Fase 2 (Move Method)**: Se movieron métodos para eliminar Feature Envy
3. **Fase 3 (Replace Type Code)**: Se implementó el patrón State/Strategy para eliminar switch statements
4. **Fase 4 (Template Method)**: Se añadió soporte para múltiples formatos sin duplicar código

## 3. Respuestas a las Preguntas de Reflexión

### ¿Cómo has utilizado en la práctica tus conocimientos de defectos de diseño?

He identificado y corregido varios code smells siguiendo el catálogo de Fowler:

- **Long Method**: El método `statement()` tenía 42 líneas. Apliqué Extract Method para dividirlo en métodos más pequeños y cohesivos.
- **Feature Envy**: Customer accedía excesivamente a datos de Rental y Movie. Apliqué Move Method para mover la lógica donde pertenecían los datos.
- **Switch Statement**: Había un switch basado en el tipo de película. Lo reemplacé con polimorfismo usando el patrón State/Strategy.
- **Duplicate Code**: El riesgo de duplicación al añadir formato HTML se evitó usando el patrón Template Method.

### ¿Cómo has utilizado en la práctica tus conocimientos de métricas de código?

- **Complejidad Ciclomática**: Reduje la complejidad del método statement() de 7 a 2
- **Acoplamiento**: Disminuí el acoplamiento entre clases mediante el uso de abstracciones (Price, StatementFormatter)
- **Cohesión**: Aumenté la cohesión moviendo métodos a las clases donde pertenecen los datos
- **Líneas por método**: Ningún método supera ahora las 10 líneas

### ¿Cómo has utilizado en la práctica tus conocimientos de prueba y cobertura de pruebas?

- Mantuve las pruebas existentes ejecutándose correctamente después de cada refactorización
- La cobertura se mantuvo por encina del 80% 
- Cada refactorización fue validada ejecutando las pruebas para garantizar que no se rompia la funcionalidad
- El enfoque TDD no fue necesario ya que las pruebas existentes proporcionaban una red de seguridad adecuada

### ¿Se puede automatizar completamente el proceso de refactorización a través de herramientas?

No completamente. Las herramientas como Eclipse pueden automatizar refactorizaciones mecánicas como:
- Extract Method
- Move Method
- Rename
- Extract Interface

Sin embargo, las decisiones de diseño requieren gente humana para:
- Identificar qué código necesita refactorización
- Decidir qué patrón de diseño aplicar
- Determinar los límites apropiados de los métodos
- Evaluar si la refactorización mejora realmente el diseño

Las herramientas son asistentes valiosos pero no pueden reemplazar el criterio del desarrollador.

### ¿Qué relación encuentras entre el proceso de refactorización y la utilización de sistemas de control de tareas y versiones?

La relación es fundamental y sinérgica:

1. **Control de versiones (Git)**:
   - Permite hacer commits atómicos por cada refactorización
   - Facilita revertir cambios si una refactorización introduce errores
   - Documenta la evolución del diseño mediante mensajes de commit descriptivos
   - Permite trabajar en ramas para refactorizaciones experimentales

2. **Control de tareas**:
   - Cada refactorización puede ser una tarea/issue independiente
   - Ayuda a planificar y priorizar las refactorizaciones
   - Permite asociar commits con tareas específicas
   - Facilita el seguimiento del progreso

En esta práctica, cada commit representó una refactorización completa, creando un histórico claro de la evolución del código. Esto demuestra que el control de versiones no es solo una herramienta de backup, sino una parte integral del proceso de refactorización.

