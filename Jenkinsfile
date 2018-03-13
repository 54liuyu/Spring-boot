pipeline {

  agent any

  tiggers {
    pollSCM('* * * * *')
  }

  stages {
    stage('build') {
      steps {
        sh 'chmod 700 ./gradlew'
        sh './gradlew build'
      }
    }

    stage('deploy') {
      steps {
        sh 'nohup ./gradlew bootRun > nohup.out 2>&1 &'
      }
    }
  }
}