<img width="415" height="396" alt="image" src="https://github.com/user-attachments/assets/ccfabb0f-584c-449e-8ebf-cc84b607df63" />

Automatización de Exportadores de Datos Financieros

Descripción
Este proyecto consiste en un sistema en Java que permite exportar registros financieros hacia diferentes entidades, como el Banco Central y una agencia tributaria. Cada exportador procesa los datos según sus propias reglas, mientras que la clase abstracta centraliza las validaciones comunes.

Clases
- **ExportadorFinanciero:** clase abstracta que contiene un método concreto para validar los registros y define el método abstracto `exportarDatos(List<String> registros)`.
- **ExportadorBancoCentral:** se encarga de simular la exportación de los registros financieros hacia el Banco Central.
- **ExportadorAgenciaTributaria:** simula la transferencia de los registros financieros hacia una agencia tributaria.

Funcionamiento
En el `main` se crean los exportadores y se prepara una lista de registros financieros. Luego, se invocan sus métodos de exportación para simular la transferencia de información a cada entidad. Finalmente, se muestra por consola el progreso y el resultado de cada operación.

Recorrido del mensaje
1. El programa crea una lista con los registros financieros que se desean exportar.
2. Se instancian los exportadores para las distintas entidades.
3. Se invoca el método `exportarDatos()` del exportador seleccionado.
4. El exportador utiliza el método de validación para comprobar que la lista no esté vacía.
5. Si los registros son válidos, comienza la exportación según el destino correspondiente.
6. Cada exportador muestra por consola los mensajes relacionados con la transferencia.
7. Si la lista está vacía o no contiene registros, el proceso se rechaza y se informa el motivo.

Validaciones
El sistema debe comprobar que la lista de registros exista y no esté vacía antes de iniciar la exportación. Si no hay información para transferir, debe informar el problema y evitar continuar con el proceso.

Objetivo
Practicar el uso de clases abstractas, la herencia, la sobrescritura de métodos y la reutilización de código mediante validaciones comunes, permitiendo agregar nuevos exportadores sin modificar la estructura principal del sistema.
