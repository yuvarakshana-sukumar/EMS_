pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn install'
            }
        }
         stage('Build Docker image') {
            steps {
                 bat 'docker build . -t yuvarakshanas/ems_trimble'
            }
         }
    }
}
