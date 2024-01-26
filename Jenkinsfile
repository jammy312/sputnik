pipeline {
    agent any
    tools{
        gradle '6.7.1'
    }
    stages {
        stage('Checkout') {
            steps {
                // Cette étape permet de récupérer le code depuis votre référentiel
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Cette étape utilise Gradle pour construire votre projet
                script {
                    sh './gradlew clean build'
                }
            }
        }

        stage('Test') {
            steps {
                // Cette étape utilise Gradle pour exécuter les tests
                script {
                    // Étape de test avec Gradle
                    sh './gradlew test'
                }
            }
        }
    }

    post {
        success {
            // Cette section sera exécutée si le pipeline réussit
            echo 'Build and test succeeded!'

            // Vous pouvez ajouter d'autres actions post-réussite ici
        }

        failure {
            // Cette section sera exécutée si le pipeline échoue
            echo 'Build or test failed!'

            // Vous pouvez ajouter d'autres actions post-échec ici
        }
    }
}
