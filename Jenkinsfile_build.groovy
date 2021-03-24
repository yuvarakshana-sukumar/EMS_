node('windows') {

    stage('Build'){
        stdout = bat(returnStdout: true, script: 'mvn install')
           return stdout
   }

}
