#!groovy​
stage 'Checkout'
node{
   checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '1ab09c9e-36aa-4285-b73c-7e4d36675372', url: 'https://github.com/hpai1990/demo/']]])
}
stage 'Build'
node{
   sh 'chmod a+x gradlew'
   sh './gradlew'
}
stage 'Build & publish Docker image'
node{
   step([$class: 'DockerBuilderPublisher', cleanImages: false, cleanupWithJenkinsJobDelete: false, cloud: 'Docker Colony 2', dockerFileDirectory: '', pullCredentialsId: '', pushCredentialsId: '', pushOnSuccess: false, tagsString: 'realpipeline:latest'])
}