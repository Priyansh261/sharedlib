def call(){
archiveArtifacts artifacts: 'gitleaks-report.json,target/*.war',
                                 fingerprint: true,
                                 allowEmptyArchive: true

}
