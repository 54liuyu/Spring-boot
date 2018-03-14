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
        sh 'OLD_BUILD_ID=$BUILD_ID'
        sh 'echo $OLD_BUILD_ID'
        sh 'BUILD_ID=dontKillMe'
        sh 'nohup java -jar ./build/libs/*.war  > ./nohup.out 2>&1 &'
        sh 'BUILD_ID=$OLD_BUILD_ID'
        sh 'echo $BUILD_ID'
      }
    }
  }
}