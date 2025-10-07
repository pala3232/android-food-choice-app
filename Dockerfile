FROM cimg/android:2023.12.1

workdir /app

COPY . .

RUN chmod +x gradlew
RUN ./gradlew build

