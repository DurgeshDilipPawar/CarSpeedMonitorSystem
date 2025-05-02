
## 🧠 Use Case

A rental company sets a speed limit per customer rental. If a renter exceeds this limit:

- The company is notified (mocked with logs / Firebase comment placeholder)
- The user receives a local alert (mocked via logs/console output)

## 🛠️ Tech Stack

| Layer       | Tool/Library            |
|------------|--------------------------|
| Language   | Kotlin                   |
| Architecture | MVVM                    |
| Build Tool | Gradle (KTS)             |
| Notification Channel | Firebase (planned), AWS (placeholder) |
| Testing    | JUnit, Mockito (suggested for interview enhancement) |
| Android SDK | Compile/Target SDK 34   |

## 📚 Features

- Customer-specific speed limit configuration
- Speed limit validation logic
- Alert triggering to renter and backend (mocked)
- Separation of concerns via MVVM
- Commented placeholders for real API integration

## 📁 Directories Breakdown

- **data/** – Models and repository layer
- **domain/** – Business logic (use cases)
- **ui/** – ViewModel and interfaces for UI interaction
- **util/** – Constants and helper classes
- **test/** – JUnit tests

## 🚀 Getting Started

1. Clone the repository
2. Open with Android Studio (Hedgehog or later)
3. Sync Gradle
4. Run the `MainActivity` if created, or test using `SpeedMonitorInterface`

## 🧪 Testing

Unit tests are written for:
- Use Case: `ValidateSpeedUseCaseTest`
- ViewModel: `SpeedMonitorViewModelTest`

Command to run tests:

```bash
./gradlew testDebugUnitTest



###### Folder Structer
SpeedMonitorDemo
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── example/
│   │   │   │           └── speedmonitordemo/
│   │   │   │               ├── data/                # Data-related components
│   │   │   │               │   ├── model/            # Model classes
│   │   │   │               │   └── repository/       # Repository classes
│   │   │   │               ├── ui/                  # UI-related components
│   │   │   │               │   ├── activity/         # Activities
│   │   │   │               │   └── viewmodel/        # ViewModel classes
│   │   │   │               ├── util/                # Utility classes (optional)
│   │   │   │               └── MyFirebaseMessagingService.kt
│   │   │   └── res/        
│   │   │       ├── layout/
│   │   │       │   └── activity_main.xml              # Layout files
│   │   │       ├── values/
│   │   │       │   └── strings.xml                   # Strings
│   │   │       └── mipmap/
│   │   │           └── ic_launcher.png               # App icon
│   └── build.gradle.kts
└── build.gradle.kts



############# Car Rental Speed Limit Monitoring Sequence ##########

Participants:
Fleet Manager
Backend (Firebase/AWS)
Car API Library/ Car IVI System (Android App)
Driver
Notification System


[ Fleet Manager App / Dashboard ]
           |
        (Set speed limit per car)
           |
     [ Firebase / AWS Backend ]
           |
        (Push speed limit config)
           |
   [ Car IVI System (Android App) ]
           |
        (Update speed limit locally)
           |
     <--- Speed Check Loop --->
           |
   [ Car API Library]
           |
   (Fetch vehicle speed continuously)
           |
      |-- If overspeed --|
           ↓
[ Driver UI ]     [ Push Notification Service ]
    (Alert)         (Notify Fleet Manager)
