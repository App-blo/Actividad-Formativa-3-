![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Actividad Formativa 3 : Construyendo una lista de objetos desde archivo

## 👤 Autor del proyecto
- **Nombre completo:** [Pablo Ibacache]
- **Carrera:** [Analista programador]
- **Sede:** [Campus Virtual]

---

## 📘 Descripción general del sistema
Aplicación Java que gestiona el catálogo de tours de la agencia Llanquihue Tour, ubicada en la Región de Los Lagos. Lee los tours desde un archivo .txt, los instancia como objetos Java y permite recorrerlos, filtrarlos y buscarlos.


---

## 🧱 Estructura general del proyecto

```plaintext
LlanquihueTourApp/
├── src/
│   ├── model/
│   │   └── Tour.java          # Clase que representa un tour
│   ├── data/
│   │   └── GestorDatos.java   # Lee el archivo y crea objetos Tour
│   └── ui/
│       └── Main.java          # Clase principal con recorrido y filtros
├── resources/
│   └── data.txt               # Archivo con los datos de los tours
└── README.md


````

---



## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/App-blo/Actividad-Sumativa-1.git
```
2. Asegúrate de que la carpeta `resources/` esté marcada como Resources Root.
3. Ejecuta la clase `Main` ubicada en `src/ui/Main.java`.
4. La salida en consola mostrará:
   El catálogo completo de tours.
   Tours filtrados con valor menor a $30.000.
   Resultado de búsqueda del tour "Premium".
---

**Repositorio GitHub:** \[https://github.com/App-blo/Actividad-Formativa-3-.git]
**Fecha de entrega:** \[15/06/2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Actividad Formativa 3




