pipeline {

  agent any

  stages {
    stage('build') {
      steps {
        sh 'chmod 700 ./gradlew'
        sh './gradlew build'
      }
    }

    stage('deploy') {
      steps {
        sh 'BUILD_ID=dontKillMe'
        sh 'nohup java -jar ./build/libs/*.war  > ./nohup.out 2>&1 &'
      }
    }
  }
}