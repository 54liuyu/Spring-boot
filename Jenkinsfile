pipeline {

  agent any

  stages {
    stage('build') {
      steps {
        sh 'chmod 700 ./gradlew'
        sh './gradlew clean build'
      }
    }

    stage('test') {
      steps {
        sh './gradlew test'
      }
    }

    stage('deploy') {
      steps {
        sh 'scp ./build/libs/*.war root@node2:/root/deploy_war'
        sh 'ssh -l root node2 "nohup java -jar /root/deploy_war/*.war > /root/deploy_war/nohup.out 2>&1 &"'
      }
    }
  }
}