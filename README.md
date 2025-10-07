# Android Food Choice App

A simple Android application to help users decide what to eat, built with Java and containerized with Docker.

## 📱 Features

- Simple Android app interface
- Food choice recommendation system
- Clean Material Design UI
- Lightweight and fast

## 🏗️ Project Structure

```
android-food-choice-app/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/quepuedocomer/
│   │   │   │   └── MainActivity.java
│   │   │   ├── AndroidManifest.xml
│   │   └── test/
│   │       └── java/com/example/quepuedocomer/
│   │           └── ExampleUnitTest.java
│   └── build.gradle
├── gradle/
│   └── wrapper/
├── build.gradle
├── settings.gradle
├── gradle.properties
├── local.properties
├── Dockerfile
├── .dockerignore
├── .gitignore
└── README.md
```

## 🚀 Getting Started

### Prerequisites

- **Android SDK** (API level 21+)
- **Java 17** or higher
- **Docker** (for containerized builds)
- **Git**

### Local Development Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/pala3232/android-food-choice-app.git
   cd android-food-choice-app
   ```

2. **Set up Android SDK:**
   ```bash
   # Create local.properties file
   echo "sdk.dir=/path/to/your/android/sdk" > local.properties
   ```

3. **Make gradlew executable:**
   ```bash
   chmod +x gradlew
   ```

4. **Build the project:**
   ```bash
   ./gradlew build
   ```

5. **Run tests:**
   ```bash
   ./gradlew test
   ```

## 🐳 Docker Build

Build and run the app in a Docker container:

```bash
# Build Docker image
docker build -t android-food-choice-app .

# Test the Docker image
docker run --rm android-food-choice-app echo "Docker build successful!"
```

### Docker Configuration

- **Base Image:** `cimg/android:2023.12.1`
- **User:** circleci (for proper permissions)
- **Build Tool:** Gradle wrapper with bash

## 🔧 CI/CD Pipeline

The project includes a Jenkins pipeline that:

1. **Clone** - Pulls code from GitHub
2. **Setup** - Configures Android SDK and permissions
3. **Test** - Runs unit tests
4. **Build** - Creates Docker image
5. **Verify** - Tests Docker container functionality

### Jenkins Pipeline Features

- Automated testing with JUnit reports
- Docker image building and testing
- Automatic cleanup of Docker artifacts
- Error handling and proper build status reporting

## 📋 Build Configuration

### Gradle Configuration

- **Target SDK:** 34
- **Minimum SDK:** 21
- **Build Tools:** 33.0.1
- **Java Version:** 8
- **AndroidX:** Enabled

### Dependencies

```gradle
dependencies {
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.10.0'
    testImplementation 'junit:junit:4.13.2'
}
```

## 🧪 Testing

Run the test suite:

```bash
# Run all tests
./gradlew test

# Run specific test
./gradlew testDebugUnitTest

# Generate test reports
./gradlew test --continue
```

Test reports are generated in `app/build/reports/tests/testDebugUnitTest/`.

## 📱 Installation

### Development Build

```bash
# Build debug APK
./gradlew assembleDebug

# Install on connected device
./gradlew installDebug
```

### Release Build

```bash
# Build release APK
./gradlew assembleRelease
```

The APK files are generated in `app/build/outputs/apk/`.

## 🔍 Troubleshooting

### Common Issues

**Permission denied for gradlew:**
```bash
chmod +x gradlew
```

**SDK not found:**
```bash
echo "sdk.dir=/path/to/android/sdk" > local.properties
```

**Docker permission issues:**
- The Dockerfile uses `circleci` user to avoid permission conflicts
- Ensure `.dockerignore` excludes `.gradle/` directory

**Build failures:**
- Check Android SDK licenses: `sdkmanager --licenses`
- Verify Java version compatibility
- Clean build: `./gradlew clean build`

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request
