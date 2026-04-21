En este trabajo, hacemos un conjunto de pruebas automatizadas para la web SauceDemo, utilizando el patrón de diseño POM. 
El objetivo de este proyecto es validar el flujo de inicio de sesión y ver cómo funciona el carrito de compras

La estructura de las carpetas es esta:

<img width="444" height="364" alt="image" src="https://github.com/user-attachments/assets/05b9d8f8-5206-4dfd-b6fb-0acf12baa8e4" />

En LoginPage, se encuentran los selectores de los campos de usuario, contraseña y el botón de login.

InventoryPage es lo que representa la página principal tras el login.

En LoginTest, comprobamos cuando el logeo se efectúa de forma correcta o incorrecta.

Y en InventoryTest, se valida la adición de un producto al carrtio, la adición de múltiples productos al carrito; y se comprueba que el botón cambie de estado tras la interacción.
