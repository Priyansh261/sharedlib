def call(){
 sh '''
 echo "Compiling Source Code"
 mvn clean compile

 echo "Running Unit Tests"
 mvn test
 '''
}
