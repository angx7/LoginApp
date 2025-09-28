# LoginApp

Android application built with **Kotlin** and **Jetpack Compose**, focused on implementing a modern **login and registration interface**.  
This project serves as a solid UI/UX and architecture foundation for future real authentication integrations.

---

## 📱 Overview

**LoginApp** provides a basic authentication structure including:

- **Login screen** with custom password visibility toggle.  
- **Register screen** for new user creation.  
- Reusable components (TextField, Button, PasswordField).  
- Smooth navigation between screens using **Compose Navigation**.  
- Custom typography and color palette.  
- Centralized string management via `strings.xml`.  

> The app currently does not perform real authentication; it focuses on visual and structural implementation.

---

## ⚙️ Tech Stack

| Technology | Description |
|-------------|-------------|
| **Kotlin** | Primary development language |
| **Jetpack Compose** | Modern declarative UI framework |
| **Compose Navigation** | Route and screen navigation handling |
| **Material Design 3** | Design system and UI components |
| **kotlinx-serialization-json** | JSON serialization handling |

---

## 🗂️ Project Structure

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

## 🧭 Navigation Routes

| Screen | Route | Description |
|---------|--------|-------------|
| **LoginScreen** | `login_screen` | Main login screen. |
| **RegisterScreen** | `register_screen` | User registration form. |

```kotlin
NavHost(navController, startDestination = Routes.LoginScreen.route) {
    composable(Routes.LoginScreen.route) { LoginScreen(navController) }
    composable(Routes.RegisterScreen.route) { RegisterScreen(navController) }
}
```

---

## 🚀 Running the Project

1. Open the project in **Android Studio Giraffe or later**.  
2. Sync dependencies with **Gradle Sync**.  
3. Run on an **emulator or physical device** with Android 8.0+.

---

## 🧠 Future Improvements

- Add form validation and error states.
- Integrate real authentication (Firebase / REST API).
- Persist session using ViewModel + DataStore.
- Implement dynamic light/dark theme.
- Add animated screen transitions.

---

## 📄 License

This project is licensed under the **MIT License**.  
You are free to use, modify, and distribute it with attribution.

---

**Author:** [Angel Becerra Rojas](https://github.com/angx7)  
*Built with Kotlin and Jetpack Compose.*
