pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        log.info "Hello World!"
        sleep 10
      }
    }
    stage('Test') {
      steps {
        echo "testing"
        sleep 30
      }
    }
    stage('Deploy') {
      steps {
        echo "deploying"
      }
    }
  }
}
