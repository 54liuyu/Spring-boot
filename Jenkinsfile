pipeline {

  agent any

  stages {
    stage('build') {
      steps {
        sh './gradlew build'
        sh './gradlew bootRun'
      }
    }
  }
}