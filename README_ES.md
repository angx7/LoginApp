# LoginApp

Aplicación Android desarrollada con **Kotlin** y **Jetpack Compose**, centrada en la creación de una interfaz moderna de **inicio de sesión y registro de usuario**.  
El propósito de este proyecto es establecer una base sólida de arquitectura y diseño de UI/UX para futuras integraciones de autenticación real.

---

## 📱 Descripción general

**LoginApp** proporciona una estructura base de autenticación, que incluye:

- Pantalla de **Login** con campos personalizados y control de visibilidad de contraseña.
- Pantalla de **Registro** para crear cuentas nuevas.
- Componentes reutilizables (TextField, Button, PasswordField).
- Navegación fluida entre pantallas mediante **Compose Navigation**.
- Tipografía y paleta de colores personalizadas.
- Centralización de cadenas en `strings.xml` para facilitar la localización y mantenimiento.

> Actualmente la app no realiza autenticación real; está enfocada en la implementación visual y estructural.

---

## ⚙️ Tecnologías utilizadas

| Tecnología | Descripción |
|-------------|-------------|
| **Kotlin** | Lenguaje principal de desarrollo |
| **Jetpack Compose** | Framework declarativo moderno de UI |
| **Compose Navigation** | Manejo de rutas y navegación entre pantallas |
| **Material Design 3** | Sistema de diseño y componentes UI |
| **kotlinx-serialization-json** | Manejo de serialización JSON |

---

## 🗂️ Estructura del proyecto

```
.
├── app
│   ├── build.gradle.kts
│   ├── proguard-rules.pro
│   └── src
│       ├── main
│       │   ├── AndroidManifest.xml
│       │   ├── java/com/example/loginapp/
│       │   │   ├── components/      
│       │   │   ├── screens/         
│       │   │   ├── navigation/      
│       │   │   ├── ui/theme/        
│       │   │   └── MainActivity.kt  
│       │   └── res/
│       │       ├── drawable/        
│       │       ├── font/            
│       │       └── values/          
│       └── test/java/
├── build.gradle.kts
├── gradle/
│   ├── libs.versions.toml
│   └── wrapper/
├── gradle.properties
├── gradlew / gradlew.bat
├── local.properties
└── settings.gradle.kts
```

---

## 🧭 Rutas de navegación

| Pantalla | Ruta | Descripción |
|-----------|------|-------------|
| **LoginScreen** | `login_screen` | Pantalla principal de inicio de sesión. |
| **RegisterScreen** | `register_screen` | Formulario de registro de usuario. |

```kotlin
NavHost(navController, startDestination = Routes.LoginScreen.route) {
    composable(Routes.LoginScreen.route) { LoginScreen(navController) }
    composable(Routes.RegisterScreen.route) { RegisterScreen(navController) }
}
```

---

## 🚀 Ejecución del proyecto

1. Abre el proyecto en **Android Studio Giraffe o superior**.
2. Sincroniza las dependencias con **Gradle Sync**.
3. Ejecuta el proyecto en un **emulador o dispositivo físico** con Android 8.0 o superior.

---

## 🧠 Próximas mejoras

- Validación de formularios con mensajes de error.
- Integración con servicios de autenticación (Firebase / API REST).
- Persistencia de sesión con ViewModel + DataStore.
- Modo claro y oscuro dinámico.
- Animaciones de transición entre pantallas.

---

## 📄 Licencia

Proyecto bajo licencia **MIT**.  
Puedes usarlo, modificarlo y distribuirlo libremente con atribución.

---

**Autor:** [Angel Becerra Rojas](https://github.com/angx7)  
*Desarrollado con Kotlin y Jetpack Compose.*
