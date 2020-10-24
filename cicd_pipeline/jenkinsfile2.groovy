pipeline {

    agent any
    options {
        disableConcurrentBuilds()
    }

    stages {

        stage('Build') {
            steps {buildApp()}
        }

        stage('Deploy to dev') {
            steps {deploy('dev')}
        }

    }

}

//steps
def buildApp() {
    bat """
        cd c:\\Program Files\\Docker Toolbox\\
        call docker build -t simple-rest-app2  c:\\Temp4\\Jenkins\\simple-rest-app
    """
}

def deploy(environment) {
    def containerName = ''
    def port = ''

    if ("${environment}" == 'dev') {
        containerName = 'simple-rest-app2-cont'
        port = '8082'

    } else {
        echo "Environment not valid"
        System.exit(0)
    }

    bat """
        cd c:\\Program Files\\Docker Toolbox\\
        call docker run -d -p ${port}:${port} --name ${containerName} simple-rest-app2
    """
}