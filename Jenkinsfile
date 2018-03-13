pipeline {

  agent any

  stages {
    stage('build') {
      steps {
        sh 'su - root'
        sh 'chmod 700 ./gradlew'
        sh './gradlew build'
      }
    }

    stage('deploy') {
      steps {
        sh './gradlew bootRun'
      }
    }
  }
}