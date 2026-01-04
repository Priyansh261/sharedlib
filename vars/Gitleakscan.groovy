def call() {
    sh '''
        gitleaks detect \
          --source . \
          --report-format json \
          --report-path gitleaks-report.json \
          --no-git || true
    '''
}
