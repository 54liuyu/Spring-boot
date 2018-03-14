pipeline {

  agent any

  stages {
    stage('build') {
      steps {
        sh 'chmod 700 ./gradlew'
        sh './gradlew build'
        sh 'mkdir log'
      }
    }

    stage('deploy') {
      steps {
        sh 'nohup java -jar ./build/libs/*.war > ./log/nohup.out 2>&1 &'
      }
    }
  }
}