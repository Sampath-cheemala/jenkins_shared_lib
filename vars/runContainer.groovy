def call(){
    sh "docker run -d --name javapp -p 3000:3000 yesdan5/javapp:latest"
}
