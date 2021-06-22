pipeline {
    agent any

    stages {
        stage('GIT PULL') {
            steps {
                git branch: "master", url: 'https://github.com/Sheikh92857/pipelline2'
            }
        }
        // stage('TEST') {
        //     steps {
        //         sh 'flutter test'
        //     }
        // }
        stage('BUILD') {
            steps {
                sh '''
                  #!/bin/sh
                  flutter build apk --debug
                  '''
            }
        }
        // stage('DISTRIBUTE') {
        //     steps {
        //         appCenter apiToken: 'b5bf5ef5307d32c0ea47da2257d2634443b66f4a',
        //                 ownerName: 'hassan57928@gmail.com',
        //                 appName: 'pipeline_test',
        //                 pathToApp: 'build/app/outputs/apk/debug/app-debug.apk',
        //                 distributionGroups: 'AlphaTester'
        //     }
        // }
    }
}