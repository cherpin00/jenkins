//import mi300c_4P

pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo "building"
        script {
          log.info "Hello World!"
        }
      }
    }
    stage('Test') {
      steps {
        echo "testing"
      }
    }
    stage('Deploy') {
      steps {
        echo "deploying"
      }
    }
    stage('Call Class'){
      steps{
        script{
          def testPlatform = new mi300c_4P('releaseType','testType','platformType')
          print(testPlatform.releaseType)
        }
      }
    }
  }
}
