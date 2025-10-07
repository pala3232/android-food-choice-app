FROM cimg/android:2023.12.1

USER circleci

WORKDIR /home/circleci/project

COPY --chown=circleci:circleci . .

RUN bash ./gradlew build

