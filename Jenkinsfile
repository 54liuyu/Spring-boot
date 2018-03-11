pipeline {
  agent any

  tiggers {
    pollSCM('* * * * *')
  }

  stages {
    stage('build') {
      steps {
        sh './gradlew build'
        sh './gradlew bootRun'
      }
    }
  }
}