def getCommandOutput(cmd) {
       stdout = bat(returnStdout:true , script: 'bat mvn install').trim()    
       println(stdout)
}
