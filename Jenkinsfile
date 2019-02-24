pipeline {
    agent { label 'docker' }
    
    stages {
        stage('Example Build') {
            agent { docker 'openjdk:8-jre' } 
            steps {
                echo 'Hello java'
                sh 'pwd'
            }
        }
        stage('Example Test') {
            agent { docker 'openjdk:8-jre' } 
            steps {
                echo 'Hello, JDK'
                sh 'java -version'
            }
        }
    }    

}