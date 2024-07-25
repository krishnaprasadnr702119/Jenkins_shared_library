def call() {
    sh 'trivy image krishnaprasadnr/youtube:latest > trivyimage.txt'
}