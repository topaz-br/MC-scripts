//VERSION 4
artifactory('art1'){
   localRepository("docker-local") {
     packageType "docker"
     description "My local Docker registry"
   }
}
