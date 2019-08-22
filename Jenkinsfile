node{
stage ('SCM Checkout'){  
git 'https://github.com/Jhum0407/simple-java-maven-app'
}
stage('Compile-Package'){
def mvnHome = tool tool name: 'Maven 3.6.1', type: 'maven'
  sh "${mvnHome}/bin/mvn package"
}
}
