node {

    stage('Build'){
        echo 'I am building now'
        echo 'The job name is '
        echo env.JOB_NAME
    }
    stage('Test'){
        echo 'I am running unit tests now'
    }
    stage('Deploy'){
        echo 'I am deploying now'
    }
}