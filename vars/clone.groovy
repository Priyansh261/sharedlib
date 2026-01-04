def call("string giturl")

stage('Clone Repository') {
            steps {
                git branch: 'master',
                    url: "$giturl"
            }
        }
