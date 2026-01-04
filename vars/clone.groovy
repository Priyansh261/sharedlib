def call(String giturl) {
    echo "url is ${giturl}"
    git branch: 'master',
        url: giturl
}
