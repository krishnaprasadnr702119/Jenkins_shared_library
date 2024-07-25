def call() {
    sh 'trivy image kp/youtube:latest > trivyimage.txt'
}