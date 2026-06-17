pipeline{
agent any
tools{
maven 'Maven'
}
stages{
stage('Checkout'){
steps{
git branch : 'main', url : 'https://www.github.com/parsh1002/Selenium.git'
}
}
stage('Build'){
steps{
sh 'mvn clean install'
}
}
stage('Test'){
steps{
sh 'mvn test'
}
}
stage('Check target'){
steps{
sh 'ls -l target'
}
}
stage('Run Application'){
steps{
sh 'mvn exec:java -Dexec.mainClass="com.example.App"'
}
}
}

post{
success{
echo 'build success'
}
failure{
echo 'build fail'
}
}
}
