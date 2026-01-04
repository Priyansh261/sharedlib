def call(){
sh '''
                echo "Packaging application"
                mvn clean package
                '''
}
