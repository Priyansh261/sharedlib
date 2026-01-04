def call(String giturl) {
    git branch: 'master',
        url: $giturl
}

