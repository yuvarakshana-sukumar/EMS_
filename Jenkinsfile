pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn install'
            }
            steps('Build Docker image'){
                bat 'docker build . -t yuvarakshanas/ems_trimble'
                
         }
    }
}
